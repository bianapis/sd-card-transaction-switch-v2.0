package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionRoutingRetrieveOutputModelTransactionRoutingInstanceReport
 */
public class BQTransactionRoutingRetrieveOutputModelTransactionRoutingInstanceReport   {
  private Object transactionRoutingInstanceReportRecord = null;

  private String transactionRoutingInstanceReportType = null;

  private String transactionRoutingInstanceReportParameters = null;

  private Object transactionRoutingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return transactionRoutingInstanceReportRecord
  **/

  public Object getTransactionRoutingInstanceReportRecord() {
    return transactionRoutingInstanceReportRecord;
  }

  public void setTransactionRoutingInstanceReportRecord(Object transactionRoutingInstanceReportRecord) {
    this.transactionRoutingInstanceReportRecord = transactionRoutingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return transactionRoutingInstanceReportType
  **/

  public String getTransactionRoutingInstanceReportType() {
    return transactionRoutingInstanceReportType;
  }

  public void setTransactionRoutingInstanceReportType(String transactionRoutingInstanceReportType) {
    this.transactionRoutingInstanceReportType = transactionRoutingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return transactionRoutingInstanceReportParameters
  **/

  public String getTransactionRoutingInstanceReportParameters() {
    return transactionRoutingInstanceReportParameters;
  }

  public void setTransactionRoutingInstanceReportParameters(String transactionRoutingInstanceReportParameters) {
    this.transactionRoutingInstanceReportParameters = transactionRoutingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return transactionRoutingInstanceReport
  **/

  public Object getTransactionRoutingInstanceReport() {
    return transactionRoutingInstanceReport;
  }

  public void setTransactionRoutingInstanceReport(Object transactionRoutingInstanceReport) {
    this.transactionRoutingInstanceReport = transactionRoutingInstanceReport;
  }


}

