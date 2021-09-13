package no.kristiania.httpclient;

public class QueryString {
    private final String value;

    public QueryString(String querystring){
        int equalPos =  querystring.indexOf('=');
        value = querystring.substring(equalPos+1);
    }

    public String getParameter(String status) {
        return value;
    }
}
