package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionRoutingRetrieveInputModelTransactionRoutingInstanceAnalysis
 */
public class BQTransactionRoutingRetrieveInputModelTransactionRoutingInstanceAnalysis   {
  private String transactionRoutingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return transactionRoutingInstanceAnalysisReference
  **/

  public String getTransactionRoutingInstanceAnalysisReference() {
    return transactionRoutingInstanceAnalysisReference;
  }

  public void setTransactionRoutingInstanceAnalysisReference(String transactionRoutingInstanceAnalysisReference) {
    this.transactionRoutingInstanceAnalysisReference = transactionRoutingInstanceAnalysisReference;
  }


}

