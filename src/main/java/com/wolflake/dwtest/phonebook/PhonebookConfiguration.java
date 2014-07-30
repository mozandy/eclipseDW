package com.wolflake.dwtest.phonebook;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import javax.validation.constraints.Max;
import org.hibernate.validator.constraints.NotEmpty;
import io.dropwizard.db.DataSourceFactory;

public class PhonebookConfiguration extends Configuration {
  @JsonProperty
  @NotEmpty
  private String message;

  @JsonProperty
  private String additionalMessage = "This is optional";

  @JsonProperty
  @Max(10)
  private int messageRepetitions;

  @JsonProperty
  private DataSourceFactory database = new DataSourceFactory();

  public DataSourceFactory getDataSourceFactory() {
    return database;
  }

  public String getMessage() {
    return message;
  }

  public int getMessageRepetitions() {
    return messageRepetitions;
  }

  public String getAdditionalMessage() {
    return additionalMessage;
  }
}