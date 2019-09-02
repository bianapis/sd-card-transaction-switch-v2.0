/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardTransactionSwitchApiServiceImpl implements CardTransactionSwitchApiService {

	public SDCardTransactionSwitchActivateOutputModel activate(SDCardTransactionSwitchActivateInputModel request){
		return JsonReader.read("activate-SDCardTransactionSwitchActivateOutputModel.json",new TypeReference<SDCardTransactionSwitchActivateOutputModel>(){});
	}
	
	public SDCardTransactionSwitchConfigureOutputModel configure(String sdReferenceId, SDCardTransactionSwitchConfigureInputModel request){
		return JsonReader.read("configure-SDCardTransactionSwitchConfigureOutputModel.json",new TypeReference<SDCardTransactionSwitchConfigureOutputModel>(){});
	}
	
	public CRCardTransactionSwitchOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCardTransactionSwitchOperatingSessionControlInputModel request){
		return JsonReader.read("control-CRCardTransactionSwitchOperatingSessionControlOutputModel.json",new TypeReference<CRCardTransactionSwitchOperatingSessionControlOutputModel>(){});
	}
	
	public CRCardTransactionSwitchOperatingSessionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCardTransactionSwitchOperatingSessionExchangeInputModel request){
		return JsonReader.read("exchange-CRCardTransactionSwitchOperatingSessionExchangeOutputModel.json",new TypeReference<CRCardTransactionSwitchOperatingSessionExchangeOutputModel>(){});
	}
	
	public SDCardTransactionSwitchFeedbackOutputModel feedback(String sdReferenceId, SDCardTransactionSwitchFeedbackInputModel request){
		return JsonReader.read("feedback-SDCardTransactionSwitchFeedbackOutputModel.json",new TypeReference<SDCardTransactionSwitchFeedbackOutputModel>(){});
	}
	
	public CRCardTransactionSwitchOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRCardTransactionSwitchOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRCardTransactionSwitchOperatingSessionInitiateOutputModel.json",new TypeReference<CRCardTransactionSwitchOperatingSessionInitiateOutputModel>(){});
	}
	
	public BQTransactionCaptureInitiateOutputModel initiateTransactioncapture(String sdReferenceId, String crReferenceId, BQTransactionCaptureInitiateInputModel request){
		return JsonReader.read("initiate-BQTransactionCaptureInitiateOutputModel.json",new TypeReference<BQTransactionCaptureInitiateOutputModel>(){});
	}
	
	public BQTransactionRoutingInitiateOutputModel initiateTransactionrouting(String sdReferenceId, String crReferenceId, BQTransactionRoutingInitiateInputModel request){
		return JsonReader.read("initiate-BQTransactionRoutingInitiateOutputModel.json",new TypeReference<BQTransactionRoutingInitiateOutputModel>(){});
	}
	
	public CRCardTransactionSwitchOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCardTransactionSwitchOperatingSessionRetrieveOutputModel.json",new TypeReference<CRCardTransactionSwitchOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQTransactionCaptureRetrieveOutputModel retrieveTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTransactionCaptureRetrieveOutputModel.json",new TypeReference<BQTransactionCaptureRetrieveOutputModel>(){});
	}
	
	public BQTransactionRoutingRetrieveOutputModel retrieveTransactionrouting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTransactionRoutingRetrieveOutputModel.json",new TypeReference<BQTransactionRoutingRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCardTransactionSwitchRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCardTransactionSwitchRetrieveOutputModel.json",new TypeReference<SDCardTransactionSwitchRetrieveOutputModel>(){});
	}
	
	public CRCardTransactionSwitchOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCardTransactionSwitchOperatingSessionUpdateInputModel request){
		return JsonReader.read("update-CRCardTransactionSwitchOperatingSessionUpdateOutputModel.json",new TypeReference<CRCardTransactionSwitchOperatingSessionUpdateOutputModel>(){});
	}
	
}
