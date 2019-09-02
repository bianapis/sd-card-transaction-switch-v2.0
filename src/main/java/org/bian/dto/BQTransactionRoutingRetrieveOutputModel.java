package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionRoutingRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceRecord;
import org.bian.dto.BQTransactionRoutingRetrieveOutputModelTransactionCaptureInstanceRecord;
import org.bian.dto.BQTransactionRoutingRetrieveOutputModelTransactionRoutingInstanceAnalysis;
import org.bian.dto.BQTransactionRoutingRetrieveOutputModelTransactionRoutingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTransactionRoutingRetrieveOutputModel
 */
public class BQTransactionRoutingRetrieveOutputModel   {
  private BQTransactionRoutingRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord = null;

  private BQTransactionRoutingRetrieveOutputModelTransactionCaptureInstanceRecord transactionCaptureInstanceRecord = null;

  private Object transactionRoutingInstanceRecord = null;

  private String transactionRoutingRetrieveActionTaskReference = null;

  private Object transactionRoutingRetrieveActionTaskRecord = null;

  private String transactionRoutingRetrieveActionResponse = null;

  private BQTransactionRoutingRetrieveOutputModelTransactionRoutingInstanceReport transactionRoutingInstanceReport = null;

  private BQTransactionRoutingRetrieveOutputModelTransactionRoutingInstanceAnalysis transactionRoutingInstanceAnalysis = null;


  /**
   * Get cardTransactionSwitchOperatingSessionInstanceRecord
   * @return cardTransactionSwitchOperatingSessionInstanceRecord
  **/

  public BQTransactionRoutingRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceRecord getCardTransactionSwitchOperatingSessionInstanceRecord() {
    return cardTransactionSwitchOperatingSessionInstanceRecord;
  }

  public void setCardTransactionSwitchOperatingSessionInstanceRecord(BQTransactionRoutingRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceRecord cardTransactionSwitchOperatingSessionInstanceRecord) {
    this.cardTransactionSwitchOperatingSessionInstanceRecord = cardTransactionSwitchOperatingSessionInstanceRecord;
  }


  /**
   * Get transactionCaptureInstanceRecord
   * @return transactionCaptureInstanceRecord
  **/

  public BQTransactionRoutingRetrieveOutputModelTransactionCaptureInstanceRecord getTransactionCaptureInstanceRecord() {
    return transactionCaptureInstanceRecord;
  }

  public void setTransactionCaptureInstanceRecord(BQTransactionRoutingRetrieveOutputModelTransactionCaptureInstanceRecord transactionCaptureInstanceRecord) {
    this.transactionCaptureInstanceRecord = transactionCaptureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The function that handles the onward routing and transmission of transactions, including tracking and retransmission for failed/timed-out transmissions 
   * @return transactionRoutingInstanceRecord
  **/

  public Object getTransactionRoutingInstanceRecord() {
    return transactionRoutingInstanceRecord;
  }

  public void setTransactionRoutingInstanceRecord(Object transactionRoutingInstanceRecord) {
    this.transactionRoutingInstanceRecord = transactionRoutingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Transaction Routing instance retrieve service call 
   * @return transactionRoutingRetrieveActionTaskReference
  **/

  public String getTransactionRoutingRetrieveActionTaskReference() {
    return transactionRoutingRetrieveActionTaskReference;
  }

  public void setTransactionRoutingRetrieveActionTaskReference(String transactionRoutingRetrieveActionTaskReference) {
    this.transactionRoutingRetrieveActionTaskReference = transactionRoutingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return transactionRoutingRetrieveActionTaskRecord
  **/

  public Object getTransactionRoutingRetrieveActionTaskRecord() {
    return transactionRoutingRetrieveActionTaskRecord;
  }

  public void setTransactionRoutingRetrieveActionTaskRecord(Object transactionRoutingRetrieveActionTaskRecord) {
    this.transactionRoutingRetrieveActionTaskRecord = transactionRoutingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return transactionRoutingRetrieveActionResponse
  **/

  public String getTransactionRoutingRetrieveActionResponse() {
    return transactionRoutingRetrieveActionResponse;
  }

  public void setTransactionRoutingRetrieveActionResponse(String transactionRoutingRetrieveActionResponse) {
    this.transactionRoutingRetrieveActionResponse = transactionRoutingRetrieveActionResponse;
  }


  /**
   * Get transactionRoutingInstanceReport
   * @return transactionRoutingInstanceReport
  **/

  public BQTransactionRoutingRetrieveOutputModelTransactionRoutingInstanceReport getTransactionRoutingInstanceReport() {
    return transactionRoutingInstanceReport;
  }

  public void setTransactionRoutingInstanceReport(BQTransactionRoutingRetrieveOutputModelTransactionRoutingInstanceReport transactionRoutingInstanceReport) {
    this.transactionRoutingInstanceReport = transactionRoutingInstanceReport;
  }


  /**
   * Get transactionRoutingInstanceAnalysis
   * @return transactionRoutingInstanceAnalysis
  **/

  public BQTransactionRoutingRetrieveOutputModelTransactionRoutingInstanceAnalysis getTransactionRoutingInstanceAnalysis() {
    return transactionRoutingInstanceAnalysis;
  }

  public void setTransactionRoutingInstanceAnalysis(BQTransactionRoutingRetrieveOutputModelTransactionRoutingInstanceAnalysis transactionRoutingInstanceAnalysis) {
    this.transactionRoutingInstanceAnalysis = transactionRoutingInstanceAnalysis;
  }


}

