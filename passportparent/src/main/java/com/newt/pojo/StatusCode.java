
/*
 * Mahender Muthyala
 */
package com.newt.pojo;

import org.springframework.http.HttpStatus;

/**
 * @author haribabu.ka on 14-10-2016.
 */
public enum StatusCode {

    // HTTP COMMON Error codes.
    U200("200", "Success", HttpStatus.OK),
    U202("202", "Invalid User", HttpStatus.OK),
    U203("202", "Invalid Cart Id", HttpStatus.OK),
    U204("202", "Invalid Order Id", HttpStatus.OK),
    U205("204", "No Content", HttpStatus.NO_CONTENT),
    U400("400", "Bad Request", HttpStatus.NOT_FOUND),
    U401("400", "Header is Empty", HttpStatus.NOT_FOUND),
    U402("400", "User Not Found In Database", HttpStatus.NOT_FOUND),
    U403("400", "User Not Logged in", HttpStatus.NOT_FOUND),
    U404("404", "Event Attributes of Broker Event is null", HttpStatus.NOT_FOUND),
    U405("405", "Audit Info of Broker Event is null", HttpStatus.NOT_FOUND),
    U406("406", "User Info not found in Broker Event", HttpStatus.NOT_FOUND),
    U407("407", "Header is Empty", HttpStatus.NOT_FOUND),
    U408("408", "Cart Id already exist for other user", HttpStatus.NOT_FOUND),

    E400("400", "Bad Request", HttpStatus.BAD_REQUEST),


    // Notification Error codes
    N401("400", "Bad Request - Not a valid DeliveryType: Supported formats :  EMAIL and MESSAGE .", HttpStatus.NOT_FOUND),



    C401("400", "Civic Address zipCode Invalid", HttpStatus.BAD_REQUEST),
    C402("400", "Postal Address zipCode Invalid", HttpStatus.BAD_REQUEST),
    C403("400", "Bad Request - Service and Shipping Address Empty", HttpStatus.NOT_FOUND),


    C406("502", "WSDL - Response is Null","Red", HttpStatus.BAD_GATEWAY),
    E401("101-1", "PostalAddressValidationRequest must exist","Red", HttpStatus.NOT_FOUND),
    E402("101-2", "PostalAddressValidationRequest clientId must exist","Red", HttpStatus.NOT_FOUND),
    E403("101-3", "PostalAddressValidationRequest clientId invalid","Red", HttpStatus.NOT_FOUND),
    E404("101-4", "PostalAddressValidationRequest input Address must exist","Red", HttpStatus.NOT_FOUND),
    E405("101-5", "InputAddress address Line1 must exist","Red", HttpStatus.NOT_FOUND),
    E406("101-6", "InputAddress address Line1: Invalid Format or Length","Red", HttpStatus.NOT_FOUND),
    E407("101-7", "InputAddress address Line2: Invalid Format or Length","Red", HttpStatus.NOT_FOUND),
    E408("101-8", "InputAddress locality and InputAddress state Or Province must exist","Red", HttpStatus.NOT_FOUND),
    E409("101-9", "InputAddress locality Invalid Format or Length","Red", HttpStatus.NOT_FOUND),
    E500("500", "Internal Server Error","Red", HttpStatus.INTERNAL_SERVER_ERROR),

  
    E341("300_41", "InvalidEnterPriseId.Enterprise Id does not exist", HttpStatus.BAD_REQUEST),
    E322("300_22", "CreateAccount & AssignAccountToEnterpriseWithLookUp Procsses are Already Done ", HttpStatus.OK),
    E323("300_23", "CreateAccount  Procsses  Already Done for this OrderId ", HttpStatus.OK),
    E324("300_24", "CreateBillingAccount  Procsses Success.But Exception Occured At AssignAccountToEnterpriseWithLookUp Process", HttpStatus.OK);


    private HttpStatus httpStatus;
    private String code;
    private String message;
    private String colourCode;

    /**
     * StatusCode()  code,message, color, httpstatus argument constructor
     * @param code
     * @param message
     * @param colourCode
     * @param httpStatus
     */
    StatusCode(String code, String message, String colourCode, HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.colourCode = colourCode;
        this.httpStatus = httpStatus;

    }

    /**
     * StatusCode()  code,message, httpstatus argument constructor
     * @param code
     * @param message
     * @param httpStatus
     */
    StatusCode(String code, String message, HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.colourCode = colourCode;
        this.httpStatus = httpStatus;

    }

    /**
     * getCode()
     * @return code
     */

    public String getCode() {
        return code;
    }

    /**
     * getMessage() method
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * getHttpStatus()
     * @return httpStatus
     */
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    /**
     * getColourCode ()
     *
     * @return colourCode
     */
    public String getColourCode() { return colourCode; }
}
