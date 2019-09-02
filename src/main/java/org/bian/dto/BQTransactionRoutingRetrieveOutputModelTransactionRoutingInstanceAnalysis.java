package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionRoutingRetrieveOutputModelTransactionRoutingInstanceAnalysis
 */
public class BQTransactionRoutingRetrieveOutputModelTransactionRoutingInstanceAnalysis   {
  private Object transactionRoutingInstanceAnalysisRecord = null;

  private String transactionRoutingInstanceAnalysisReportType = null;

  private String transactionRoutingInstanceAnalysisParameters = null;

  private Object transactionRoutingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return transactionRoutingInstanceAnalysisRecord
  **/

  public Object getTransactionRoutingInstanceAnalysisRecord() {
    return transactionRoutingInstanceAnalysisRecord;
  }

  public void setTransactionRoutingInstanceAnalysisRecord(Object transactionRoutingInstanceAnalysisRecord) {
    this.transactionRoutingInstanceAnalysisRecord = transactionRoutingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return transactionRoutingInstanceAnalysisReportType
  **/

  public String getTransactionRoutingInstanceAnalysisReportType() {
    return transactionRoutingInstanceAnalysisReportType;
  }

  public void setTransactionRoutingInstanceAnalysisReportType(String transactionRoutingInstanceAnalysisReportType) {
    this.transactionRoutingInstanceAnalysisReportType = transactionRoutingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return transactionRoutingInstanceAnalysisParameters
  **/

  public String getTransactionRoutingInstanceAnalysisParameters() {
    return transactionRoutingInstanceAnalysisParameters;
  }

  public void setTransactionRoutingInstanceAnalysisParameters(String transactionRoutingInstanceAnalysisParameters) {
    this.transactionRoutingInstanceAnalysisParameters = transactionRoutingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return transactionRoutingInstanceAnalysisReport
  **/

  public Object getTransactionRoutingInstanceAnalysisReport() {
    return transactionRoutingInstanceAnalysisReport;
  }

  public void setTransactionRoutingInstanceAnalysisReport(Object transactionRoutingInstanceAnalysisReport) {
    this.transactionRoutingInstanceAnalysisReport = transactionRoutingInstanceAnalysisReport;
  }


}

