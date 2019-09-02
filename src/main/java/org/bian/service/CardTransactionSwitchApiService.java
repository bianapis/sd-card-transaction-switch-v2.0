/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardTransactionSwitchApiService {

	SDCardTransactionSwitchActivateOutputModel activate(SDCardTransactionSwitchActivateInputModel request);
	
	SDCardTransactionSwitchConfigureOutputModel configure(String sdReferenceId, SDCardTransactionSwitchConfigureInputModel request);
	
	CRCardTransactionSwitchOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCardTransactionSwitchOperatingSessionControlInputModel request);
	
	CRCardTransactionSwitchOperatingSessionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCardTransactionSwitchOperatingSessionExchangeInputModel request);
	
	SDCardTransactionSwitchFeedbackOutputModel feedback(String sdReferenceId, SDCardTransactionSwitchFeedbackInputModel request);
	
	CRCardTransactionSwitchOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRCardTransactionSwitchOperatingSessionInitiateInputModel request);
	
	BQTransactionCaptureInitiateOutputModel initiateTransactioncapture(String sdReferenceId, String crReferenceId, BQTransactionCaptureInitiateInputModel request);
	
	BQTransactionRoutingInitiateOutputModel initiateTransactionrouting(String sdReferenceId, String crReferenceId, BQTransactionRoutingInitiateInputModel request);
	
	CRCardTransactionSwitchOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQTransactionCaptureRetrieveOutputModel retrieveTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTransactionRoutingRetrieveOutputModel retrieveTransactionrouting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCardTransactionSwitchRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCardTransactionSwitchOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardTransactionSwitchOperatingSessionUpdateInputModel request);
	
}
