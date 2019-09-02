package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionRoutingRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceRecord
 */
public class BQTransactionRoutingRetrieveOutputModelCardTransactionSwitchOperatingSessionInstanceRecord   {
  private String networkReference = null;

  private String participantAcquirerBankReference = null;

  private String participantAcquirerBanktransactionRoutingDetails = null;

  private String participantIssuerBankReference = null;

  private String participantIssuerBankTransactionRoutingDetails = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the card network 
   * @return networkReference
  **/

  public String getNetworkReference() {
    return networkReference;
  }

  public void setNetworkReference(String networkReference) {
    this.networkReference = networkReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Acquiring bank for which the Network orchestrates transaction routing 
   * @return participantAcquirerBankReference
  **/

  public String getParticipantAcquirerBankReference() {
    return participantAcquirerBankReference;
  }

  public void setParticipantAcquirerBankReference(String participantAcquirerBankReference) {
    this.participantAcquirerBankReference = participantAcquirerBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines transaction routing details - referenced by the Network  
   * @return participantAcquirerBanktransactionRoutingDetails
  **/

  public String getParticipantAcquirerBanktransactionRoutingDetails() {
    return participantAcquirerBanktransactionRoutingDetails;
  }

  public void setParticipantAcquirerBanktransactionRoutingDetails(String participantAcquirerBanktransactionRoutingDetails) {
    this.participantAcquirerBanktransactionRoutingDetails = participantAcquirerBanktransactionRoutingDetails;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issuing bank for which the Network orchestrates transaction routing 
   * @return participantIssuerBankReference
  **/

  public String getParticipantIssuerBankReference() {
    return participantIssuerBankReference;
  }

  public void setParticipantIssuerBankReference(String participantIssuerBankReference) {
    this.participantIssuerBankReference = participantIssuerBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines transaction routing details - referenced by the Network  
   * @return participantIssuerBankTransactionRoutingDetails
  **/

  public String getParticipantIssuerBankTransactionRoutingDetails() {
    return participantIssuerBankTransactionRoutingDetails;
  }

  public void setParticipantIssuerBankTransactionRoutingDetails(String participantIssuerBankTransactionRoutingDetails) {
    this.participantIssuerBankTransactionRoutingDetails = participantIssuerBankTransactionRoutingDetails;
  }


}

