/**
 * (C) Copyright IBM Corp. 2016,2017,2018,2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.persistence.exception;

import javax.ws.rs.core.Response.Status;

import com.ibm.watsonhealth.fhir.exception.FHIRException;

public class FHIRPersistenceException extends FHIRException {
	private static final long serialVersionUID = 1L;
	
	public FHIRPersistenceException() {
	    super();
	}
	public FHIRPersistenceException(String message) {
		super(message);
	}
	
	public FHIRPersistenceException(String message, Throwable cause) {
	    super(message, cause);
	}
    
    public FHIRPersistenceException(String message, Status httpStatus, Throwable cause) {
        super(message, httpStatus, cause);
    }
    
    
    public FHIRPersistenceException(String message, Status httpStatus) {
        super(message, httpStatus);
    }
    public FHIRPersistenceException(Throwable cause) {
        super(cause);
    }
}
