package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionRoutingRetrieveInputModelTransactionRoutingInstanceAnalysis;
import org.bian.dto.BQTransactionRoutingRetrieveInputModelTransactionRoutingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTransactionRoutingRetrieveInputModel
 */
public class BQTransactionRoutingRetrieveInputModel   {
  private Object transactionRoutingRetrieveActionTaskRecord = null;

  private String transactionRoutingRetrieveActionRequest = null;

  private BQTransactionRoutingRetrieveInputModelTransactionRoutingInstanceReport transactionRoutingInstanceReport = null;

  private BQTransactionRoutingRetrieveInputModelTransactionRoutingInstanceAnalysis transactionRoutingInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return transactionRoutingRetrieveActionRequest
  **/

  public String getTransactionRoutingRetrieveActionRequest() {
    return transactionRoutingRetrieveActionRequest;
  }

  public void setTransactionRoutingRetrieveActionRequest(String transactionRoutingRetrieveActionRequest) {
    this.transactionRoutingRetrieveActionRequest = transactionRoutingRetrieveActionRequest;
  }


  /**
   * Get transactionRoutingInstanceReport
   * @return transactionRoutingInstanceReport
  **/

  public BQTransactionRoutingRetrieveInputModelTransactionRoutingInstanceReport getTransactionRoutingInstanceReport() {
    return transactionRoutingInstanceReport;
  }

  public void setTransactionRoutingInstanceReport(BQTransactionRoutingRetrieveInputModelTransactionRoutingInstanceReport transactionRoutingInstanceReport) {
    this.transactionRoutingInstanceReport = transactionRoutingInstanceReport;
  }


  /**
   * Get transactionRoutingInstanceAnalysis
   * @return transactionRoutingInstanceAnalysis
  **/

  public BQTransactionRoutingRetrieveInputModelTransactionRoutingInstanceAnalysis getTransactionRoutingInstanceAnalysis() {
    return transactionRoutingInstanceAnalysis;
  }

  public void setTransactionRoutingInstanceAnalysis(BQTransactionRoutingRetrieveInputModelTransactionRoutingInstanceAnalysis transactionRoutingInstanceAnalysis) {
    this.transactionRoutingInstanceAnalysis = transactionRoutingInstanceAnalysis;
  }


}

