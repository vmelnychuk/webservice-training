package org.training.wk.webservice.service.impl;

import java.util.ArrayList;
import java.util.Arrays;

import javax.jws.WebService;

import org.training.wk.nbrbservice.client.NbrbClient;
import org.training.wk.webservice.service.ExRateService;
import org.training.wk.webservice.service.GenericException;


@WebService(endpointInterface="org.training.wk.webservice.service.ExRateService")
public class ExRateServiceImpl implements ExRateService {
	public String getExRate(String currency) throws GenericException {
		String result = null;
		NbrbClient client;
		
		
		if ( new ArrayList<String>(Arrays.asList(new String[]{"UAH","USD", "EUR"})).contains( currency) ) {
			   client = new NbrbClient(currency);
			   result = client.getCurrentExRate();
			} else {
				throw new GenericException("This currency do not support");
			}
		return result;
	}
}
