package com.sxit.mgt.pmp.dto;

public class RptContractModel{
	

		private Long contract_id;//   序列	private String type_id;//   指标类型	private String index_code;//   指标编号	private String index_name;//   指标名称	private String index_value;//   指标值	private java.sql.Timestamp create_time;//   创建时间	private String dimension;//   维度	private String dime_value;//   维度值	public Long getContract_id() {	    return this.contract_id;	}	public void setContract_id(Long contract_id) {	    this.contract_id=contract_id;	}	public String getType_id() {	    return this.type_id;	}	public void setType_id(String type_id) {	    this.type_id=type_id;	}	public String getIndex_code() {	    return this.index_code;	}	public void setIndex_code(String index_code) {	    this.index_code=index_code;	}	public String getIndex_name() {	    return this.index_name;	}	public void setIndex_name(String index_name) {	    this.index_name=index_name;	}	public String getIndex_value() {	    return this.index_value;	}	public void setIndex_value(String index_value) {	    this.index_value=index_value;	}	public java.sql.Timestamp getCreate_time() {	    return this.create_time;	}	public void setCreate_time(java.sql.Timestamp create_time) {	    this.create_time=create_time;	}	public String getDimension() {	    return this.dimension;	}	public void setDimension(String dimension) {	    this.dimension=dimension;	}	public String getDime_value() {	    return this.dime_value;	}	public void setDime_value(String dime_value) {	    this.dime_value=dime_value;	}
	
}
