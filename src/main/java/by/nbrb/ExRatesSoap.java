package by.nbrb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-03-31T15:31:30.641+03:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://www.nbrb.by/", name = "ExRatesSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface ExRatesSoap {

    /**
     * Перечень драгоценных металлов, на которые Национальным банком Республики Беларусь устанавливаются учетные цены
     */
    @WebResult(name = "MetalsRefResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "MetalsRef", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.MetalsRef")
    @WebMethod(operationName = "MetalsRef", action = "http://www.nbrb.by/MetalsRef")
    @ResponseWrapper(localName = "MetalsRefResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.MetalsRefResponse")
    public by.nbrb.MetalsRefResponse.MetalsRefResult metalsRef();

    /**
     * Последняя дата установления Национальным банком Республики Беларусь официального курса белорусского рубля по отношению к иностранным валютам на ежедневной основе
     */
    @WebResult(name = "LastDailyExRatesDateResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "LastDailyExRatesDate", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.LastDailyExRatesDate")
    @WebMethod(operationName = "LastDailyExRatesDate", action = "http://www.nbrb.by/LastDailyExRatesDate")
    @ResponseWrapper(localName = "LastDailyExRatesDateResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.LastDailyExRatesDateResponse")
    public javax.xml.datatype.XMLGregorianCalendar lastDailyExRatesDate();

    /**
     * Последняя дата установления Национальным банком Республики Беларусь цен покупки и продажи драгоценных металлов в виде мерных слитков
     */
    @WebResult(name = "IngotsLastDateResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "IngotsLastDate", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.IngotsLastDate")
    @WebMethod(operationName = "IngotsLastDate", action = "http://www.nbrb.by/IngotsLastDate")
    @ResponseWrapper(localName = "IngotsLastDateResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.IngotsLastDateResponse")
    public javax.xml.datatype.XMLGregorianCalendar ingotsLastDate();

    /**
     * Начальная дата установления Национальным банком Республики Беларусь официального курса белорусского рубля по отношению к иностранным валютам
     */
    @WebResult(name = "StartDateResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "StartDate", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.StartDate")
    @WebMethod(operationName = "StartDate", action = "http://www.nbrb.by/StartDate")
    @ResponseWrapper(localName = "StartDateResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.StartDateResponse")
    public javax.xml.datatype.XMLGregorianCalendar startDate(
        @WebParam(name = "Periodicity", targetNamespace = "http://www.nbrb.by/")
        int periodicity
    );

    /**
     * Устаревший метод
     */
    @WebResult(name = "CurrenciesRefMonthlyResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "CurrenciesRefMonthly", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.CurrenciesRefMonthly")
    @WebMethod(operationName = "CurrenciesRefMonthly", action = "http://www.nbrb.by/CurrenciesRefMonthly")
    @ResponseWrapper(localName = "CurrenciesRefMonthlyResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.CurrenciesRefMonthlyResponse")
    public by.nbrb.CurrenciesRefMonthlyResponse.CurrenciesRefMonthlyResult currenciesRefMonthly();

    /**
     * Динамика учетных цен на драгоценные металлы в виде банковских слитков, устанавливаемые Национальным банком Республики Беларусь (не более, чем за 31 день)
     */
    @WebResult(name = "MetalsPricesResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "MetalsPrices", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.MetalsPrices")
    @WebMethod(operationName = "MetalsPrices", action = "http://www.nbrb.by/MetalsPrices")
    @ResponseWrapper(localName = "MetalsPricesResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.MetalsPricesResponse")
    public by.nbrb.MetalsPricesResponse.MetalsPricesResult metalsPrices(
        @WebParam(name = "MetalId", targetNamespace = "http://www.nbrb.by/")
        int metalId,
        @WebParam(name = "fromDate", targetNamespace = "http://www.nbrb.by/")
        javax.xml.datatype.XMLGregorianCalendar fromDate,
        @WebParam(name = "toDate", targetNamespace = "http://www.nbrb.by/")
        javax.xml.datatype.XMLGregorianCalendar toDate
    );

    /**
     * Последняя дата установления Национальным банком Республики Беларусь официального курса белорусского рубля по отношению к иностранным валютам на ежемесячной основе
     */
    @WebResult(name = "LastMonthlyExRatesDateResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "LastMonthlyExRatesDate", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.LastMonthlyExRatesDate")
    @WebMethod(operationName = "LastMonthlyExRatesDate", action = "http://www.nbrb.by/LastMonthlyExRatesDate")
    @ResponseWrapper(localName = "LastMonthlyExRatesDateResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.LastMonthlyExRatesDateResponse")
    public javax.xml.datatype.XMLGregorianCalendar lastMonthlyExRatesDate();

    /**
     * Курс белорусского рубля по отношению к основным иностранным валютам по итогам дополнительной торговой сессии ОАО "Белорусская валютно-фондовая биржа"
     */
    @WebResult(name = "StockAddRatesResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "StockAddRates", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.StockAddRates")
    @WebMethod(operationName = "StockAddRates", action = "http://www.nbrb.by/StockAddRates")
    @ResponseWrapper(localName = "StockAddRatesResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.StockAddRatesResponse")
    public by.nbrb.StockAddRatesResponse.StockAddRatesResult stockAddRates(
        @WebParam(name = "onDate", targetNamespace = "http://www.nbrb.by/")
        javax.xml.datatype.XMLGregorianCalendar onDate
    );

    /**
     * Динамика официального курса белорусского рубля по отношению к заданной иностранной валюте, устанавливаемого Национальным банком Республики Беларусь (не более чем за 365 дней)
     */
    @WebResult(name = "ExRatesDynResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "ExRatesDyn", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.ExRatesDyn")
    @WebMethod(operationName = "ExRatesDyn", action = "http://www.nbrb.by/ExRatesDyn")
    @ResponseWrapper(localName = "ExRatesDynResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.ExRatesDynResponse")
    public by.nbrb.ExRatesDynResponse.ExRatesDynResult exRatesDyn(
        @WebParam(name = "curId", targetNamespace = "http://www.nbrb.by/")
        int curId,
        @WebParam(name = "fromDate", targetNamespace = "http://www.nbrb.by/")
        javax.xml.datatype.XMLGregorianCalendar fromDate,
        @WebParam(name = "toDate", targetNamespace = "http://www.nbrb.by/")
        javax.xml.datatype.XMLGregorianCalendar toDate
    );

    /**
     * Последняя дата установления курса белорусского рубля по отношению к основным иностранным валютам по итогам дополнительной торговой сессии ОАО "Белорусская валютно-фондовая биржа"
     */
    @WebResult(name = "StockAddRatesLastDateResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "StockAddRatesLastDate", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.StockAddRatesLastDate")
    @WebMethod(operationName = "StockAddRatesLastDate", action = "http://www.nbrb.by/StockAddRatesLastDate")
    @ResponseWrapper(localName = "StockAddRatesLastDateResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.StockAddRatesLastDateResponse")
    public javax.xml.datatype.XMLGregorianCalendar stockAddRatesLastDate();

    /**
     * Ставка рефинансирования Национального банка на дату
     */
    @WebResult(name = "RefRateOnDateResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "RefRateOnDate", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.RefRateOnDate")
    @WebMethod(operationName = "RefRateOnDate", action = "http://www.nbrb.by/RefRateOnDate")
    @ResponseWrapper(localName = "RefRateOnDateResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.RefRateOnDateResponse")
    public by.nbrb.RefRateOnDateResponse.RefRateOnDateResult refRateOnDate(
        @WebParam(name = "onDate", targetNamespace = "http://www.nbrb.by/")
        javax.xml.datatype.XMLGregorianCalendar onDate
    );

    /**
     * Полный перечень иностранных валют, к которым официальный курс белорусского рубля устанавливается Национальным банком Республики Беларусь
     */
    @WebResult(name = "CurrenciesRefResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "CurrenciesRef", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.CurrenciesRef")
    @WebMethod(operationName = "CurrenciesRef", action = "http://www.nbrb.by/CurrenciesRef")
    @ResponseWrapper(localName = "CurrenciesRefResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.CurrenciesRefResponse")
    public by.nbrb.CurrenciesRefResponse.CurrenciesRefResult currenciesRef(
        @WebParam(name = "Periodicity", targetNamespace = "http://www.nbrb.by/")
        int periodicity
    );

    /**
     * Устаревший метод
     */
    @WebResult(name = "CurrenciesRefDailyResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "CurrenciesRefDaily", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.CurrenciesRefDaily")
    @WebMethod(operationName = "CurrenciesRefDaily", action = "http://www.nbrb.by/CurrenciesRefDaily")
    @ResponseWrapper(localName = "CurrenciesRefDailyResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.CurrenciesRefDailyResponse")
    public by.nbrb.CurrenciesRefDailyResponse.CurrenciesRefDailyResult currenciesRefDaily();

    /**
     * Цены покупки и продажи Национальным банком Республики Беларусь драгоценных металлов в виде мерных слитков
     */
    @WebResult(name = "IngotsPricesResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "IngotsPrices", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.IngotsPrices")
    @WebMethod(operationName = "IngotsPrices", action = "http://www.nbrb.by/IngotsPrices")
    @ResponseWrapper(localName = "IngotsPricesResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.IngotsPricesResponse")
    public by.nbrb.IngotsPricesResponse.IngotsPricesResult ingotsPrices(
        @WebParam(name = "onDate", targetNamespace = "http://www.nbrb.by/")
        javax.xml.datatype.XMLGregorianCalendar onDate
    );

    /**
     * Официальный курс белорусского рубля по отношению к иностранным валютам, устанавливаемый Национальным банком Республики Беларусь ежедневно, а также до 17.02.1997 г.
     */
    @WebResult(name = "ExRatesDailyResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "ExRatesDaily", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.ExRatesDaily")
    @WebMethod(operationName = "ExRatesDaily", action = "http://www.nbrb.by/ExRatesDaily")
    @ResponseWrapper(localName = "ExRatesDailyResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.ExRatesDailyResponse")
    public by.nbrb.ExRatesDailyResponse.ExRatesDailyResult exRatesDaily(
        @WebParam(name = "onDate", targetNamespace = "http://www.nbrb.by/")
        javax.xml.datatype.XMLGregorianCalendar onDate
    );

    /**
     * Последняя дата установления Национальным банком Республики Беларусь цен на драгоценные металлы в виде банковских слитков
     */
    @WebResult(name = "MetalsLastDateResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "MetalsLastDate", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.MetalsLastDate")
    @WebMethod(operationName = "MetalsLastDate", action = "http://www.nbrb.by/MetalsLastDate")
    @ResponseWrapper(localName = "MetalsLastDateResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.MetalsLastDateResponse")
    public javax.xml.datatype.XMLGregorianCalendar metalsLastDate();

    /**
     * Динамика ставки рефинансирования Национального банка
     */
    @WebResult(name = "RefRateDynResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "RefRateDyn", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.RefRateDyn")
    @WebMethod(operationName = "RefRateDyn", action = "http://www.nbrb.by/RefRateDyn")
    @ResponseWrapper(localName = "RefRateDynResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.RefRateDynResponse")
    public by.nbrb.RefRateDynResponse.RefRateDynResult refRateDyn();

    /**
     * Официальный курс белорусского рубля по отношению к иностранным валютам, устанавливаемый Национальным банком Республики Беларусь ежемесячно
     */
    @WebResult(name = "ExRatesMonthlyResult", targetNamespace = "http://www.nbrb.by/")
    @RequestWrapper(localName = "ExRatesMonthly", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.ExRatesMonthly")
    @WebMethod(operationName = "ExRatesMonthly", action = "http://www.nbrb.by/ExRatesMonthly")
    @ResponseWrapper(localName = "ExRatesMonthlyResponse", targetNamespace = "http://www.nbrb.by/", className = "by.nbrb.ExRatesMonthlyResponse")
    public by.nbrb.ExRatesMonthlyResponse.ExRatesMonthlyResult exRatesMonthly(
        @WebParam(name = "onDate", targetNamespace = "http://www.nbrb.by/")
        javax.xml.datatype.XMLGregorianCalendar onDate
    );
}
