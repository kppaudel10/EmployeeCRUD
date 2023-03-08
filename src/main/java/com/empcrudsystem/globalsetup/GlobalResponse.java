package com.empcrudsystem.globalsetup;

/**
 * @auther kul.paudel
 * @created at 2023-02-28
 */
public class GlobalResponse {

    private Object data;

    private String message;

    private Boolean status;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    GlobalResponse(){

    }
    public GlobalResponse(Object data, String message, Boolean status) {
        this.data = data;
        this.message = message;
        this.status = status;
    }
}
