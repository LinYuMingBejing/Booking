package com.items.api.util.pojo;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataResponse<T> {
    boolean status = true;
    String msg = null;
    String error = null;

    T data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static DataResponse success(){
        return new DataResponse();
    }

    public static DataResponse error(String error){
        DataResponse dataResponse = new DataResponse();
        dataResponse.setStatus(false);
        dataResponse.setError(error);
        return dataResponse;
    }

    public static DataResponse data(Object data){
        DataResponse dataResponse = new DataResponse();
        dataResponse.setData(data);
        return dataResponse;
    }


}
