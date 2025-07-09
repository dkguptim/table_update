
package article_backfeed_updated.it005p_table_update_job_0_1;

import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.DataQuality;
import routines.Relational;
import routines.DataQualityDependencies;
import routines.Mathematical;
import routines.SQLike;
import routines.Numeric;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.DQTechnical;
import routines.StringHandling;
import routines.DataMasking;
import routines.TalendDate;
import routines.DqStringHandling;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 





@SuppressWarnings("unused")

/**
 * Job: IT005p_table_update_job Purpose: <br>
 * Description:  <br>
 * @author user@talend.com
 * @version 7.3.1.20220210_0236-patch
 * @status 
 */
public class IT005p_table_update_job implements TalendJob {
	static {System.setProperty("TalendJob.log", "IT005p_table_update_job.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(IT005p_table_update_job.class);
	

protected static void logIgnoredError(String message, Throwable cause) {
       log.error(message, cause);

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(CONTEXT_ADR7_ADDITIONAL_PARAMETERS != null){
				
					this.setProperty("CONTEXT_ADR7_ADDITIONAL_PARAMETERS", CONTEXT_ADR7_ADDITIONAL_PARAMETERS.toString());
				
			}
			
			if(CONTEXT_ADR7_DATABASE != null){
				
					this.setProperty("CONTEXT_ADR7_DATABASE", CONTEXT_ADR7_DATABASE.toString());
				
			}
			
			if(CONTEXT_ADR7_LOGIN != null){
				
					this.setProperty("CONTEXT_ADR7_LOGIN", CONTEXT_ADR7_LOGIN.toString());
				
			}
			
			if(CONTEXT_ADR7_PASSWORD != null){
				
					this.setProperty("CONTEXT_ADR7_PASSWORD", CONTEXT_ADR7_PASSWORD.toString());
				
			}
			
			if(CONTEXT_ADR7_SERVER != null){
				
					this.setProperty("CONTEXT_ADR7_SERVER", CONTEXT_ADR7_SERVER.toString());
				
			}
			
			if(ADR4_OK_CHECK != null){
				
					this.setProperty("ADR4_OK_CHECK", ADR4_OK_CHECK.toString());
				
			}
			
			if(ADR7_OK_CHECK != null){
				
					this.setProperty("ADR7_OK_CHECK", ADR7_OK_CHECK.toString());
				
			}
			
			if(ALLOW_IT777P_INSERT != null){
				
					this.setProperty("ALLOW_IT777P_INSERT", ALLOW_IT777P_INSERT.toString());
				
			}
			
			if(ALLOW_ITEM_DESCRIPTION_UPDATE != null){
				
					this.setProperty("ALLOW_ITEM_DESCRIPTION_UPDATE", ALLOW_ITEM_DESCRIPTION_UPDATE.toString());
				
			}
			
			if(ALLOW_SHIP_SUB_FLOW != null){
				
					this.setProperty("ALLOW_SHIP_SUB_FLOW", ALLOW_SHIP_SUB_FLOW.toString());
				
			}
			
			if(ARTICLE_NUMBER != null){
				
					this.setProperty("ARTICLE_NUMBER", ARTICLE_NUMBER.toString());
				
			}
			
			if(Article_Transformation_Error_Codes != null){
				
					this.setProperty("Article_Transformation_Error_Codes", Article_Transformation_Error_Codes.toString());
				
			}
			
			if(CONTEXT_ADR7_BRAND_ID_FILE != null){
				
					this.setProperty("CONTEXT_ADR7_BRAND_ID_FILE", CONTEXT_ADR7_BRAND_ID_FILE.toString());
				
			}
			
			if(CONTEXT_ADR7_SUB_DEP_FILE != null){
				
					this.setProperty("CONTEXT_ADR7_SUB_DEP_FILE", CONTEXT_ADR7_SUB_DEP_FILE.toString());
				
			}
			
			if(CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE != null){
				
					this.setProperty("CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE", CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE.toString());
				
			}
			
			if(CONTEXT_ARTICLE_XREF != null){
				
					this.setProperty("CONTEXT_ARTICLE_XREF", CONTEXT_ARTICLE_XREF.toString());
				
			}
			
			if(CONTEXT_BACKFEED_SEQ_NBR != null){
				
					this.setProperty("CONTEXT_BACKFEED_SEQ_NBR", CONTEXT_BACKFEED_SEQ_NBR.toString());
				
			}
			
			if(CONTEXT_BASIC_IND_UPD_OPSTUDY != null){
				
					this.setProperty("CONTEXT_BASIC_IND_UPD_OPSTUDY", CONTEXT_BASIC_IND_UPD_OPSTUDY.toString());
				
			}
			
			if(CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA != null){
				
					this.setProperty("CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA", CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA.toString());
				
			}
			
			if(CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL != null){
				
					this.setProperty("CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL", CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL.toString());
				
			}
			
			if(CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG != null){
				
					this.setProperty("CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG", CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG.toString());
				
			}
			
			if(CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT != null){
				
					this.setProperty("CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT", CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT.toString());
				
			}
			
			if(CONTEXT_CHECKPOINT_FILE_NAME != null){
				
					this.setProperty("CONTEXT_CHECKPOINT_FILE_NAME", CONTEXT_CHECKPOINT_FILE_NAME.toString());
				
			}
			
			if(CONTEXT_COLOR_CODE != null){
				
					this.setProperty("CONTEXT_COLOR_CODE", CONTEXT_COLOR_CODE.toString());
				
			}
			
			if(CONTEXT_CUTOFF_TIME_MIN != null){
				
					this.setProperty("CONTEXT_CUTOFF_TIME_MIN", CONTEXT_CUTOFF_TIME_MIN.toString());
				
			}
			
			if(CONTEXT_DC_SERVICING_IND_FILE != null){
				
					this.setProperty("CONTEXT_DC_SERVICING_IND_FILE", CONTEXT_DC_SERVICING_IND_FILE.toString());
				
			}
			
			if(CONTEXT_DELETE_VOL_LIMIT != null){
				
					this.setProperty("CONTEXT_DELETE_VOL_LIMIT", CONTEXT_DELETE_VOL_LIMIT.toString());
				
			}
			
			if(CONTEXT_DELTA_VOL_LIMIT != null){
				
					this.setProperty("CONTEXT_DELTA_VOL_LIMIT", CONTEXT_DELTA_VOL_LIMIT.toString());
				
			}
			
			if(CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO != null){
				
					this.setProperty("CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO", CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO.toString());
				
			}
			
			if(CONTEXT_DELTA_VOL_TARGET != null){
				
					this.setProperty("CONTEXT_DELTA_VOL_TARGET", CONTEXT_DELTA_VOL_TARGET.toString());
				
			}
			
			if(CONTEXT_ERR_REPORT != null){
				
					this.setProperty("CONTEXT_ERR_REPORT", CONTEXT_ERR_REPORT.toString());
				
			}
			
			if(CONTEXT_ETL_ARCHIVE_FILE_PATH != null){
				
					this.setProperty("CONTEXT_ETL_ARCHIVE_FILE_PATH", CONTEXT_ETL_ARCHIVE_FILE_PATH.toString());
				
			}
			
			if(CONTEXT_ETL_BSCONFIG_FILE_EXTENSION != null){
				
					this.setProperty("CONTEXT_ETL_BSCONFIG_FILE_EXTENSION", CONTEXT_ETL_BSCONFIG_FILE_EXTENSION.toString());
				
			}
			
			if(CONTEXT_ETL_CSV_FILE_EXTENSION != null){
				
					this.setProperty("CONTEXT_ETL_CSV_FILE_EXTENSION", CONTEXT_ETL_CSV_FILE_EXTENSION.toString());
				
			}
			
			if(CONTEXT_ETL_ENCODING != null){
				
					this.setProperty("CONTEXT_ETL_ENCODING", CONTEXT_ETL_ENCODING.toString());
				
			}
			
			if(CONTEXT_ETL_EXCEL_FILE_EXTENSION != null){
				
					this.setProperty("CONTEXT_ETL_EXCEL_FILE_EXTENSION", CONTEXT_ETL_EXCEL_FILE_EXTENSION.toString());
				
			}
			
			if(CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE != null){
				
					this.setProperty("CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE", CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE.toString());
				
			}
			
			if(CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT != null){
				
					this.setProperty("CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT", CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT.toString());
				
			}
			
			if(CONTEXT_ETL_GROUPEMAILID_FROM != null){
				
					this.setProperty("CONTEXT_ETL_GROUPEMAILID_FROM", CONTEXT_ETL_GROUPEMAILID_FROM.toString());
				
			}
			
			if(CONTEXT_ETL_GROUPEMAILID_SMTP_HOST != null){
				
					this.setProperty("CONTEXT_ETL_GROUPEMAILID_SMTP_HOST", CONTEXT_ETL_GROUPEMAILID_SMTP_HOST.toString());
				
			}
			
			if(CONTEXT_ETL_GROUPEMAILID_SMTP_PORT != null){
				
					this.setProperty("CONTEXT_ETL_GROUPEMAILID_SMTP_PORT", CONTEXT_ETL_GROUPEMAILID_SMTP_PORT.toString());
				
			}
			
			if(CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE != null){
				
					this.setProperty("CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE", CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE.toString());
				
			}
			
			if(CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT != null){
				
					this.setProperty("CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT", CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT.toString());
				
			}
			
			if(CONTEXT_ETL_GROUPEMAILID_TO != null){
				
					this.setProperty("CONTEXT_ETL_GROUPEMAILID_TO", CONTEXT_ETL_GROUPEMAILID_TO.toString());
				
			}
			
			if(CONTEXT_ETL_INPUT_FILE_EXTENSION != null){
				
					this.setProperty("CONTEXT_ETL_INPUT_FILE_EXTENSION", CONTEXT_ETL_INPUT_FILE_EXTENSION.toString());
				
			}
			
			if(CONTEXT_ETL_INPUT_ORG_PATH != null){
				
					this.setProperty("CONTEXT_ETL_INPUT_ORG_PATH", CONTEXT_ETL_INPUT_ORG_PATH.toString());
				
			}
			
			if(CONTEXT_ETL_INPUT_PATH != null){
				
					this.setProperty("CONTEXT_ETL_INPUT_PATH", CONTEXT_ETL_INPUT_PATH.toString());
				
			}
			
			if(CONTEXT_ETL_INTM_FIELD_SEPARATOR != null){
				
					this.setProperty("CONTEXT_ETL_INTM_FIELD_SEPARATOR", CONTEXT_ETL_INTM_FIELD_SEPARATOR.toString());
				
			}
			
			if(CONTEXT_ETL_INTM_FILE_ENCODING != null){
				
					this.setProperty("CONTEXT_ETL_INTM_FILE_ENCODING", CONTEXT_ETL_INTM_FILE_ENCODING.toString());
				
			}
			
			if(CONTEXT_ETL_INTM_FILE_EXTENSION != null){
				
					this.setProperty("CONTEXT_ETL_INTM_FILE_EXTENSION", CONTEXT_ETL_INTM_FILE_EXTENSION.toString());
				
			}
			
			if(CONTEXT_ETL_INTM_FILE_PATH != null){
				
					this.setProperty("CONTEXT_ETL_INTM_FILE_PATH", CONTEXT_ETL_INTM_FILE_PATH.toString());
				
			}
			
			if(CONTEXT_ETL_JOB_NAME != null){
				
					this.setProperty("CONTEXT_ETL_JOB_NAME", CONTEXT_ETL_JOB_NAME.toString());
				
			}
			
			if(CONTEXT_ETL_LOG_FILE_NAME != null){
				
					this.setProperty("CONTEXT_ETL_LOG_FILE_NAME", CONTEXT_ETL_LOG_FILE_NAME.toString());
				
			}
			
			if(CONTEXT_ETL_LOG_FILE_PATH != null){
				
					this.setProperty("CONTEXT_ETL_LOG_FILE_PATH", CONTEXT_ETL_LOG_FILE_PATH.toString());
				
			}
			
			if(CONTEXT_ETL_LOG_PATH != null){
				
					this.setProperty("CONTEXT_ETL_LOG_PATH", CONTEXT_ETL_LOG_PATH.toString());
				
			}
			
			if(CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR != null){
				
					this.setProperty("CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR", CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR.toString());
				
			}
			
			if(CONTEXT_ETL_OUTPUT_FILE_ENCODING != null){
				
					this.setProperty("CONTEXT_ETL_OUTPUT_FILE_ENCODING", CONTEXT_ETL_OUTPUT_FILE_ENCODING.toString());
				
			}
			
			if(CONTEXT_ETL_OUTPUT_FILE_EXTENSION != null){
				
					this.setProperty("CONTEXT_ETL_OUTPUT_FILE_EXTENSION", CONTEXT_ETL_OUTPUT_FILE_EXTENSION.toString());
				
			}
			
			if(CONTEXT_ETL_OUTPUT_FILE_PATH != null){
				
					this.setProperty("CONTEXT_ETL_OUTPUT_FILE_PATH", CONTEXT_ETL_OUTPUT_FILE_PATH.toString());
				
			}
			
			if(CONTEXT_ETL_REJECT_FILE_PATH != null){
				
					this.setProperty("CONTEXT_ETL_REJECT_FILE_PATH", CONTEXT_ETL_REJECT_FILE_PATH.toString());
				
			}
			
			if(CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION != null){
				
					this.setProperty("CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION", CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION.toString());
				
			}
			
			if(CONTEXT_ETL_TARGET_FILE_PATH != null){
				
					this.setProperty("CONTEXT_ETL_TARGET_FILE_PATH", CONTEXT_ETL_TARGET_FILE_PATH.toString());
				
			}
			
			if(CONTEXT_ETL_TEAM_NAME != null){
				
					this.setProperty("CONTEXT_ETL_TEAM_NAME", CONTEXT_ETL_TEAM_NAME.toString());
				
			}
			
			if(CONTEXT_ETL_XREF_JOB_NAME != null){
				
					this.setProperty("CONTEXT_ETL_XREF_JOB_NAME", CONTEXT_ETL_XREF_JOB_NAME.toString());
				
			}
			
			if(CONTEXT_EXCEPTION_FLAG != null){
				
					this.setProperty("CONTEXT_EXCEPTION_FLAG", CONTEXT_EXCEPTION_FLAG.toString());
				
			}
			
			if(CONTEXT_EXISTING_CASE_GTIN != null){
				
					this.setProperty("CONTEXT_EXISTING_CASE_GTIN", CONTEXT_EXISTING_CASE_GTIN.toString());
				
			}
			
			if(CONTEXT_EXISTING_UPC_LIST != null){
				
					this.setProperty("CONTEXT_EXISTING_UPC_LIST", CONTEXT_EXISTING_UPC_LIST.toString());
				
			}
			
			if(CONTEXT_FILE_PATH != null){
				
					this.setProperty("CONTEXT_FILE_PATH", CONTEXT_FILE_PATH.toString());
				
			}
			
			if(CONTEXT_GA072P_ENABLE_FLAG != null){
				
					this.setProperty("CONTEXT_GA072P_ENABLE_FLAG", CONTEXT_GA072P_ENABLE_FLAG.toString());
				
			}
			
			if(CONTEXT_HALLMARK_PERSISTENT_FILE_NAME != null){
				
					this.setProperty("CONTEXT_HALLMARK_PERSISTENT_FILE_NAME", CONTEXT_HALLMARK_PERSISTENT_FILE_NAME.toString());
				
			}
			
			if(CONTEXT_IT028P_SOM_ITEMLIST != null){
				
					this.setProperty("CONTEXT_IT028P_SOM_ITEMLIST", CONTEXT_IT028P_SOM_ITEMLIST.toString());
				
			}
			
			if(CONTEXT_KEYSTOREPWD != null){
				
					this.setProperty("CONTEXT_KEYSTOREPWD", CONTEXT_KEYSTOREPWD.toString());
				
			}
			
			if(CONTEXT_LEGACY_SAP_CNTRY_MAPPING != null){
				
					this.setProperty("CONTEXT_LEGACY_SAP_CNTRY_MAPPING", CONTEXT_LEGACY_SAP_CNTRY_MAPPING.toString());
				
			}
			
			if(CONTEXT_LEGAL_UOM_XREF != null){
				
					this.setProperty("CONTEXT_LEGAL_UOM_XREF", CONTEXT_LEGAL_UOM_XREF.toString());
				
			}
			
			if(CONTEXT_LISTING_TYPE != null){
				
					this.setProperty("CONTEXT_LISTING_TYPE", CONTEXT_LISTING_TYPE.toString());
				
			}
			
			if(CONTEXT_MARA_ADDITIONALSEG != null){
				
					this.setProperty("CONTEXT_MARA_ADDITIONALSEG", CONTEXT_MARA_ADDITIONALSEG.toString());
				
			}
			
			if(CONTEXT_MARA_BASIC_EXTENSION != null){
				
					this.setProperty("CONTEXT_MARA_BASIC_EXTENSION", CONTEXT_MARA_BASIC_EXTENSION.toString());
				
			}
			
			if(CONTEXT_MARA_BOMMAT != null){
				
					this.setProperty("CONTEXT_MARA_BOMMAT", CONTEXT_MARA_BOMMAT.toString());
				
			}
			
			if(CONTEXT_MARA_DR_DESC != null){
				
					this.setProperty("CONTEXT_MARA_DR_DESC", CONTEXT_MARA_DR_DESC.toString());
				
			}
			
			if(CONTEXT_MARA_EXTRACTSEG != null){
				
					this.setProperty("CONTEXT_MARA_EXTRACTSEG", CONTEXT_MARA_EXTRACTSEG.toString());
				
			}
			
			if(CONTEXT_MARA_GTIN_UPC_REL != null){
				
					this.setProperty("CONTEXT_MARA_GTIN_UPC_REL", CONTEXT_MARA_GTIN_UPC_REL.toString());
				
			}
			
			if(CONTEXT_MARA_HIERARCHYNODE != null){
				
					this.setProperty("CONTEXT_MARA_HIERARCHYNODE", CONTEXT_MARA_HIERARCHYNODE.toString());
				
			}
			
			if(CONTEXT_MARA_HTSCLASS != null){
				
					this.setProperty("CONTEXT_MARA_HTSCLASS", CONTEXT_MARA_HTSCLASS.toString());
				
			}
			
			if(CONTEXT_MARA_LEGACY_ITEM != null){
				
					this.setProperty("CONTEXT_MARA_LEGACY_ITEM", CONTEXT_MARA_LEGACY_ITEM.toString());
				
			}
			
			if(CONTEXT_MARA_LEGACY_ITEM_VENDOR != null){
				
					this.setProperty("CONTEXT_MARA_LEGACY_ITEM_VENDOR", CONTEXT_MARA_LEGACY_ITEM_VENDOR.toString());
				
			}
			
			if(CONTEXT_MARA_LEGACYSEG != null){
				
					this.setProperty("CONTEXT_MARA_LEGACYSEG", CONTEXT_MARA_LEGACYSEG.toString());
				
			}
			
			if(CONTEXT_MARA_LEGALUOM != null){
				
					this.setProperty("CONTEXT_MARA_LEGALUOM", CONTEXT_MARA_LEGALUOM.toString());
				
			}
			
			if(CONTEXT_MARA_MAIN_ARTICLE != null){
				
					this.setProperty("CONTEXT_MARA_MAIN_ARTICLE", CONTEXT_MARA_MAIN_ARTICLE.toString());
				
			}
			
			if(CONTEXT_MARA_MAMSEG != null){
				
					this.setProperty("CONTEXT_MARA_MAMSEG", CONTEXT_MARA_MAMSEG.toString());
				
			}
			
			if(CONTEXT_MARA_MARASEG != null){
				
					this.setProperty("CONTEXT_MARA_MARASEG", CONTEXT_MARA_MARASEG.toString());
				
			}
			
			if(CONTEXT_MARA_MARMSEG != null){
				
					this.setProperty("CONTEXT_MARA_MARMSEG", CONTEXT_MARA_MARMSEG.toString());
				
			}
			
			if(CONTEXT_MARA_MATDESC != null){
				
					this.setProperty("CONTEXT_MARA_MATDESC", CONTEXT_MARA_MATDESC.toString());
				
			}
			
			if(CONTEXT_MARA_MAW_SEG != null){
				
					this.setProperty("CONTEXT_MARA_MAW_SEG", CONTEXT_MARA_MAW_SEG.toString());
				
			}
			
			if(CONTEXT_MARA_MAWSEG != null){
				
					this.setProperty("CONTEXT_MARA_MAWSEG", CONTEXT_MARA_MAWSEG.toString());
				
			}
			
			if(CONTEXT_MARA_MEANSEG != null){
				
					this.setProperty("CONTEXT_MARA_MEANSEG", CONTEXT_MARA_MEANSEG.toString());
				
			}
			
			if(CONTEXT_MARA_MLEASEG != null){
				
					this.setProperty("CONTEXT_MARA_MLEASEG", CONTEXT_MARA_MLEASEG.toString());
				
			}
			
			if(CONTEXT_MARA_MVKERT != null){
				
					this.setProperty("CONTEXT_MARA_MVKERT", CONTEXT_MARA_MVKERT.toString());
				
			}
			
			if(CONTEXT_MARA_PURSUB != null){
				
					this.setProperty("CONTEXT_MARA_PURSUB", CONTEXT_MARA_PURSUB.toString());
				
			}
			
			if(CONTEXT_MARA_SEASONCODE != null){
				
					this.setProperty("CONTEXT_MARA_SEASONCODE", CONTEXT_MARA_SEASONCODE.toString());
				
			}
			
			if(CONTEXT_MARA_SHIPSUB != null){
				
					this.setProperty("CONTEXT_MARA_SHIPSUB", CONTEXT_MARA_SHIPSUB.toString());
				
			}
			
			if(CONTEXT_MARA_VARIANT_ARTICLE != null){
				
					this.setProperty("CONTEXT_MARA_VARIANT_ARTICLE", CONTEXT_MARA_VARIANT_ARTICLE.toString());
				
			}
			
			if(CONTEXT_MARA_WLK2EXTRTSEG != null){
				
					this.setProperty("CONTEXT_MARA_WLK2EXTRTSEG", CONTEXT_MARA_WLK2EXTRTSEG.toString());
				
			}
			
			if(CONTEXT_MARA_WLK2SEG != null){
				
					this.setProperty("CONTEXT_MARA_WLK2SEG", CONTEXT_MARA_WLK2SEG.toString());
				
			}
			
			if(CONTEXT_MDM_KEYSTORE != null){
				
					this.setProperty("CONTEXT_MDM_KEYSTORE", CONTEXT_MDM_KEYSTORE.toString());
				
			}
			
			if(CONTEXT_MDM_TRUSTSTORE != null){
				
					this.setProperty("CONTEXT_MDM_TRUSTSTORE", CONTEXT_MDM_TRUSTSTORE.toString());
				
			}
			
			if(CONTEXT_MISSING_UPC_EMAIL_TO != null){
				
					this.setProperty("CONTEXT_MISSING_UPC_EMAIL_TO", CONTEXT_MISSING_UPC_EMAIL_TO.toString());
				
			}
			
			if(CONTEXT_MISSING_UPC_REPLY_TO != null){
				
					this.setProperty("CONTEXT_MISSING_UPC_REPLY_TO", CONTEXT_MISSING_UPC_REPLY_TO.toString());
				
			}
			
			if(CONTEXT_MYLAR_MERCH_OPSTUDY != null){
				
					this.setProperty("CONTEXT_MYLAR_MERCH_OPSTUDY", CONTEXT_MYLAR_MERCH_OPSTUDY.toString());
				
			}
			
			if(CONTEXT_NEW_UOM_WIC_REQ_FLAG != null){
				
					this.setProperty("CONTEXT_NEW_UOM_WIC_REQ_FLAG", CONTEXT_NEW_UOM_WIC_REQ_FLAG.toString());
				
			}
			
			if(CONTEXT_OB_CLR_PERSISTENT_FILE != null){
				
					this.setProperty("CONTEXT_OB_CLR_PERSISTENT_FILE", CONTEXT_OB_CLR_PERSISTENT_FILE.toString());
				
			}
			
			if(CONTEXT_OB_CLR_XREF != null){
				
					this.setProperty("CONTEXT_OB_CLR_XREF", CONTEXT_OB_CLR_XREF.toString());
				
			}
			
			if(CONTEXT_ORMD_IND != null){
				
					this.setProperty("CONTEXT_ORMD_IND", CONTEXT_ORMD_IND.toString());
				
			}
			
			if(CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT != null){
				
					this.setProperty("CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT", CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT.toString());
				
			}
			
			if(CONTEXT_PARKING_EXCEPT_LIST != null){
				
					this.setProperty("CONTEXT_PARKING_EXCEPT_LIST", CONTEXT_PARKING_EXCEPT_LIST.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_ADR4_MD039P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_ADR4_MD039P", CONTEXT_PIR_PARKED_ADR4_MD039P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT002P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT002P", CONTEXT_PIR_PARKED_IT002P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT007P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT007P", CONTEXT_PIR_PARKED_IT007P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT008P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT008P", CONTEXT_PIR_PARKED_IT008P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT011P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT011P", CONTEXT_PIR_PARKED_IT011P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT015P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT015P", CONTEXT_PIR_PARKED_IT015P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT029P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT029P", CONTEXT_PIR_PARKED_IT029P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT088P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT088P", CONTEXT_PIR_PARKED_IT088P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT107P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT107P", CONTEXT_PIR_PARKED_IT107P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT108P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT108P", CONTEXT_PIR_PARKED_IT108P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT185P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT185P", CONTEXT_PIR_PARKED_IT185P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT186P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT186P", CONTEXT_PIR_PARKED_IT186P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT282P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT282P", CONTEXT_PIR_PARKED_IT282P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT402P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT402P", CONTEXT_PIR_PARKED_IT402P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT517P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT517P", CONTEXT_PIR_PARKED_IT517P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT839P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT839P", CONTEXT_PIR_PARKED_IT839P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_IT981P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_IT981P", CONTEXT_PIR_PARKED_IT981P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_MD039P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_MD039P", CONTEXT_PIR_PARKED_MD039P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_MD041P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_MD041P", CONTEXT_PIR_PARKED_MD041P.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_MD041P_ADR4 != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_MD041P_ADR4", CONTEXT_PIR_PARKED_MD041P_ADR4.toString());
				
			}
			
			if(CONTEXT_PIR_PARKED_MD639P != null){
				
					this.setProperty("CONTEXT_PIR_PARKED_MD639P", CONTEXT_PIR_PARKED_MD639P.toString());
				
			}
			
			if(CONTEXT_PLN_MERGE != null){
				
					this.setProperty("CONTEXT_PLN_MERGE", CONTEXT_PLN_MERGE.toString());
				
			}
			
			if(CONTEXT_PLN_SM_TRACKING_FILE != null){
				
					this.setProperty("CONTEXT_PLN_SM_TRACKING_FILE", CONTEXT_PLN_SM_TRACKING_FILE.toString());
				
			}
			
			if(CONTEXT_PLN_SPLIT != null){
				
					this.setProperty("CONTEXT_PLN_SPLIT", CONTEXT_PLN_SPLIT.toString());
				
			}
			
			if(CONTEXT_QUICKWIC_ARTICLE_STATUS != null){
				
					this.setProperty("CONTEXT_QUICKWIC_ARTICLE_STATUS", CONTEXT_QUICKWIC_ARTICLE_STATUS.toString());
				
			}
			
			if(CONTEXT_RACK_MYLAR != null){
				
					this.setProperty("CONTEXT_RACK_MYLAR", CONTEXT_RACK_MYLAR.toString());
				
			}
			
			if(CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG != null){
				
					this.setProperty("CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG", CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG.toString());
				
			}
			
			if(CONTEXT_RT_CONTROL_FOLDER != null){
				
					this.setProperty("CONTEXT_RT_CONTROL_FOLDER", CONTEXT_RT_CONTROL_FOLDER.toString());
				
			}
			
			if(CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH != null){
				
					this.setProperty("CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH", CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH.toString());
				
			}
			
			if(CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH != null){
				
					this.setProperty("CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH", CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH.toString());
				
			}
			
			if(CONTEXT_RT_R4B_PARKED_PIR_FILEPATH != null){
				
					this.setProperty("CONTEXT_RT_R4B_PARKED_PIR_FILEPATH", CONTEXT_RT_R4B_PARKED_PIR_FILEPATH.toString());
				
			}
			
			if(CONTEXT_RT_R4B_PARKED_XREF_FILEPATH != null){
				
					this.setProperty("CONTEXT_RT_R4B_PARKED_XREF_FILEPATH", CONTEXT_RT_R4B_PARKED_XREF_FILEPATH.toString());
				
			}
			
			if(CONTEXT_RT_RNWL_HOME != null){
				
					this.setProperty("CONTEXT_RT_RNWL_HOME", CONTEXT_RT_RNWL_HOME.toString());
				
			}
			
			if(CONTEXT_RT_SOURCE != null){
				
					this.setProperty("CONTEXT_RT_SOURCE", CONTEXT_RT_SOURCE.toString());
				
			}
			
			if(CONTEXT_RT_TRACK != null){
				
					this.setProperty("CONTEXT_RT_TRACK", CONTEXT_RT_TRACK.toString());
				
			}
			
			if(CONTEXT_RT_TRACK_DYNAMIC != null){
				
					this.setProperty("CONTEXT_RT_TRACK_DYNAMIC", CONTEXT_RT_TRACK_DYNAMIC.toString());
				
			}
			
			if(CONTEXT_RT_TRACK_LOAD != null){
				
					this.setProperty("CONTEXT_RT_TRACK_LOAD", CONTEXT_RT_TRACK_LOAD.toString());
				
			}
			
			if(CONTEXT_RT_TRACK_SAG != null){
				
					this.setProperty("CONTEXT_RT_TRACK_SAG", CONTEXT_RT_TRACK_SAG.toString());
				
			}
			
			if(CONTEXT_RT_TRACK_STATIC != null){
				
					this.setProperty("CONTEXT_RT_TRACK_STATIC", CONTEXT_RT_TRACK_STATIC.toString());
				
			}
			
			if(CONTEXT_RT_TRACK_XREF != null){
				
					this.setProperty("CONTEXT_RT_TRACK_XREF", CONTEXT_RT_TRACK_XREF.toString());
				
			}
			
			if(CONTEXT_RT_TRACK_XREF_UPDATE != null){
				
					this.setProperty("CONTEXT_RT_TRACK_XREF_UPDATE", CONTEXT_RT_TRACK_XREF_UPDATE.toString());
				
			}
			
			if(CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE != null){
				
					this.setProperty("CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE", CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE.toString());
				
			}
			
			if(CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM != null){
				
					this.setProperty("CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM", CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM.toString());
				
			}
			
			if(CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME != null){
				
					this.setProperty("CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME", CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME.toString());
				
			}
			
			if(CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM != null){
				
					this.setProperty("CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM", CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM.toString());
				
			}
			
			if(CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM != null){
				
					this.setProperty("CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM", CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM.toString());
				
			}
			
			if(CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM != null){
				
					this.setProperty("CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM", CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM.toString());
				
			}
			
			if(CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM != null){
				
					this.setProperty("CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM", CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM.toString());
				
			}
			
			if(CONTEXT_SAG_EXTRACT_JOB_NAME != null){
				
					this.setProperty("CONTEXT_SAG_EXTRACT_JOB_NAME", CONTEXT_SAG_EXTRACT_JOB_NAME.toString());
				
			}
			
			if(CONTEXT_SAG_EXTRACT_LOG_FILE_NAME != null){
				
					this.setProperty("CONTEXT_SAG_EXTRACT_LOG_FILE_NAME", CONTEXT_SAG_EXTRACT_LOG_FILE_NAME.toString());
				
			}
			
			if(CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL != null){
				
					this.setProperty("CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL", CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL.toString());
				
			}
			
			if(CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE != null){
				
					this.setProperty("CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE", CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE.toString());
				
			}
			
			if(CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD != null){
				
					this.setProperty("CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD", CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD.toString());
				
			}
			
			if(CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT != null){
				
					this.setProperty("CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT", CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT.toString());
				
			}
			
			if(CONTEXT_SAP_LEGACY_UOM_XREF != null){
				
					this.setProperty("CONTEXT_SAP_LEGACY_UOM_XREF", CONTEXT_SAP_LEGACY_UOM_XREF.toString());
				
			}
			
			if(CONTEXT_SAP_XREF_FOLDER_NAME != null){
				
					this.setProperty("CONTEXT_SAP_XREF_FOLDER_NAME", CONTEXT_SAP_XREF_FOLDER_NAME.toString());
				
			}
			
			if(CONTEXT_SEASON_CODE_EXCEPTION_TO != null){
				
					this.setProperty("CONTEXT_SEASON_CODE_EXCEPTION_TO", CONTEXT_SEASON_CODE_EXCEPTION_TO.toString());
				
			}
			
			if(CONTEXT_SEASON_DEFAULT_VALUE != null){
				
					this.setProperty("CONTEXT_SEASON_DEFAULT_VALUE", CONTEXT_SEASON_DEFAULT_VALUE.toString());
				
			}
			
			if(CONTEXT_SEASONCODE_EXCEL != null){
				
					this.setProperty("CONTEXT_SEASONCODE_EXCEL", CONTEXT_SEASONCODE_EXCEL.toString());
				
			}
			
			if(CONTEXT_SIGNAL_FILE_PATH != null){
				
					this.setProperty("CONTEXT_SIGNAL_FILE_PATH", CONTEXT_SIGNAL_FILE_PATH.toString());
				
			}
			
			if(CONTEXT_SITE_XREF != null){
				
					this.setProperty("CONTEXT_SITE_XREF", CONTEXT_SITE_XREF.toString());
				
			}
			
			if(CONTEXT_SOURCE_ARTICLE_FOLDER_NAME != null){
				
					this.setProperty("CONTEXT_SOURCE_ARTICLE_FOLDER_NAME", CONTEXT_SOURCE_ARTICLE_FOLDER_NAME.toString());
				
			}
			
			if(CONTEXT_STIBO_CF_PERSISTENT_FILE != null){
				
					this.setProperty("CONTEXT_STIBO_CF_PERSISTENT_FILE", CONTEXT_STIBO_CF_PERSISTENT_FILE.toString());
				
			}
			
			if(CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE != null){
				
					this.setProperty("CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE", CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE.toString());
				
			}
			
			if(CONTEXT_STIBO_PERSISTENT_FILE != null){
				
					this.setProperty("CONTEXT_STIBO_PERSISTENT_FILE", CONTEXT_STIBO_PERSISTENT_FILE.toString());
				
			}
			
			if(CONTEXT_STIBO_SOM_PERSISTENT_FILE != null){
				
					this.setProperty("CONTEXT_STIBO_SOM_PERSISTENT_FILE", CONTEXT_STIBO_SOM_PERSISTENT_FILE.toString());
				
			}
			
			if(CONTEXT_TALEND_ARTICLE_XREF != null){
				
					this.setProperty("CONTEXT_TALEND_ARTICLE_XREF", CONTEXT_TALEND_ARTICLE_XREF.toString());
				
			}
			
			if(CONTEXT_TALEND_VENDOR_XREF != null){
				
					this.setProperty("CONTEXT_TALEND_VENDOR_XREF", CONTEXT_TALEND_VENDOR_XREF.toString());
				
			}
			
			if(CONTEXT_TEMP_CONTROL != null){
				
					this.setProperty("CONTEXT_TEMP_CONTROL", CONTEXT_TEMP_CONTROL.toString());
				
			}
			
			if(CONTEXT_TEMP_MERCH_OPSTUDY != null){
				
					this.setProperty("CONTEXT_TEMP_MERCH_OPSTUDY", CONTEXT_TEMP_MERCH_OPSTUDY.toString());
				
			}
			
			if(CONTEXT_TRUSTSTOREPWD != null){
				
					this.setProperty("CONTEXT_TRUSTSTOREPWD", CONTEXT_TRUSTSTOREPWD.toString());
				
			}
			
			if(CONTEXT_UPC_DELETE_FLAG != null){
				
					this.setProperty("CONTEXT_UPC_DELETE_FLAG", CONTEXT_UPC_DELETE_FLAG.toString());
				
			}
			
			if(CONTEXT_VALID_ARTTYPE_STIBOCHECK != null){
				
					this.setProperty("CONTEXT_VALID_ARTTYPE_STIBOCHECK", CONTEXT_VALID_ARTTYPE_STIBOCHECK.toString());
				
			}
			
			if(CONTEXT_VALID_ITEMS_LOAD_ADR4 != null){
				
					this.setProperty("CONTEXT_VALID_ITEMS_LOAD_ADR4", CONTEXT_VALID_ITEMS_LOAD_ADR4.toString());
				
			}
			
			if(CONTEXT_VALID_ITEMS_LOAD_ADR7 != null){
				
					this.setProperty("CONTEXT_VALID_ITEMS_LOAD_ADR7", CONTEXT_VALID_ITEMS_LOAD_ADR7.toString());
				
			}
			
			if(CONTEXT_VALIDATION_REP_FROM != null){
				
					this.setProperty("CONTEXT_VALIDATION_REP_FROM", CONTEXT_VALIDATION_REP_FROM.toString());
				
			}
			
			if(CONTEXT_VALIDATION_REP_TO != null){
				
					this.setProperty("CONTEXT_VALIDATION_REP_TO", CONTEXT_VALIDATION_REP_TO.toString());
				
			}
			
			if(CONTEXT_VALIDATION_REPORTNAME != null){
				
					this.setProperty("CONTEXT_VALIDATION_REPORTNAME", CONTEXT_VALIDATION_REPORTNAME.toString());
				
			}
			
			if(CONTEXT_VENDOR_VOG != null){
				
					this.setProperty("CONTEXT_VENDOR_VOG", CONTEXT_VENDOR_VOG.toString());
				
			}
			
			if(CONTEXT_VENDOR_XREF != null){
				
					this.setProperty("CONTEXT_VENDOR_XREF", CONTEXT_VENDOR_XREF.toString());
				
			}
			
			if(CURR_DT != null){
				
					this.setProperty("CURR_DT", CURR_DT.toString());
				
			}
			
			if(JMS_ARTICLE_QUEUE_INPUT_FILE_NAME != null){
				
					this.setProperty("JMS_ARTICLE_QUEUE_INPUT_FILE_NAME", JMS_ARTICLE_QUEUE_INPUT_FILE_NAME.toString());
				
			}
			
			if(JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM != null){
				
					this.setProperty("JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM", JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM.toString());
				
			}
			
			if(JMS_ARTICLE_QUEUE_MESSAGE_COUNT != null){
				
					this.setProperty("JMS_ARTICLE_QUEUE_MESSAGE_COUNT", JMS_ARTICLE_QUEUE_MESSAGE_COUNT.toString());
				
			}
			
			if(NewWIC != null){
				
					this.setProperty("NewWIC", NewWIC.toString());
				
			}
			
			if(OB_CLR_XREF_TARGET != null){
				
					this.setProperty("OB_CLR_XREF_TARGET", OB_CLR_XREF_TARGET.toString());
				
			}
			
			if(PROCESS_CATEGORY != null){
				
					this.setProperty("PROCESS_CATEGORY", PROCESS_CATEGORY.toString());
				
			}
			
			if(PROCESSED_FLAG != null){
				
					this.setProperty("PROCESSED_FLAG", PROCESSED_FLAG.toString());
				
			}
			
			if(PROGRAM_LIB_NAME != null){
				
					this.setProperty("PROGRAM_LIB_NAME", PROGRAM_LIB_NAME.toString());
				
			}
			
			if(RUN_DAY != null){
				
					this.setProperty("RUN_DAY", RUN_DAY.toString());
				
			}
			
			if(SAF_OVERRIDE_FILE != null){
				
					this.setProperty("SAF_OVERRIDE_FILE", SAF_OVERRIDE_FILE.toString());
				
			}
			
			if(SHIP_SUB_OPSTUDY != null){
				
					this.setProperty("SHIP_SUB_OPSTUDY", SHIP_SUB_OPSTUDY.toString());
				
			}
			
			if(UOM != null){
				
					this.setProperty("UOM", UOM.toString());
				
			}
			
			if(UPC != null){
				
					this.setProperty("UPC", UPC.toString());
				
			}
			
			if(UPC_LENGTH_DIGIT != null){
				
					this.setProperty("UPC_LENGTH_DIGIT", UPC_LENGTH_DIGIT.toString());
				
			}
			
			if(USER_STAMP != null){
				
					this.setProperty("USER_STAMP", USER_STAMP.toString());
				
			}
			
			if(WICRequiredFlag != null){
				
					this.setProperty("WICRequiredFlag", WICRequiredFlag.toString());
				
			}
			
		}
		
		//if the stored or passed value is "<TALEND_NULL>" string, it mean null
		public String getStringValue(String key) {
			String origin_value = this.getProperty(key);
			if(NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY.equals(origin_value)) {
				return null;
			}
			return origin_value;
		}

public String CONTEXT_ADR7_ADDITIONAL_PARAMETERS;
public String getCONTEXT_ADR7_ADDITIONAL_PARAMETERS(){
	return this.CONTEXT_ADR7_ADDITIONAL_PARAMETERS;
}
public String CONTEXT_ADR7_DATABASE;
public String getCONTEXT_ADR7_DATABASE(){
	return this.CONTEXT_ADR7_DATABASE;
}
public String CONTEXT_ADR7_LOGIN;
public String getCONTEXT_ADR7_LOGIN(){
	return this.CONTEXT_ADR7_LOGIN;
}
public java.lang.String CONTEXT_ADR7_PASSWORD;
public java.lang.String getCONTEXT_ADR7_PASSWORD(){
	return this.CONTEXT_ADR7_PASSWORD;
}
public String CONTEXT_ADR7_SERVER;
public String getCONTEXT_ADR7_SERVER(){
	return this.CONTEXT_ADR7_SERVER;
}
public String ADR4_OK_CHECK;
public String getADR4_OK_CHECK(){
	return this.ADR4_OK_CHECK;
}
public String ADR7_OK_CHECK;
public String getADR7_OK_CHECK(){
	return this.ADR7_OK_CHECK;
}
public String ALLOW_IT777P_INSERT;
public String getALLOW_IT777P_INSERT(){
	return this.ALLOW_IT777P_INSERT;
}
public String ALLOW_ITEM_DESCRIPTION_UPDATE;
public String getALLOW_ITEM_DESCRIPTION_UPDATE(){
	return this.ALLOW_ITEM_DESCRIPTION_UPDATE;
}
public String ALLOW_SHIP_SUB_FLOW;
public String getALLOW_SHIP_SUB_FLOW(){
	return this.ALLOW_SHIP_SUB_FLOW;
}
public String ARTICLE_NUMBER;
public String getARTICLE_NUMBER(){
	return this.ARTICLE_NUMBER;
}
public String Article_Transformation_Error_Codes;
public String getArticle_Transformation_Error_Codes(){
	return this.Article_Transformation_Error_Codes;
}
public String CONTEXT_ADR7_BRAND_ID_FILE;
public String getCONTEXT_ADR7_BRAND_ID_FILE(){
	return this.CONTEXT_ADR7_BRAND_ID_FILE;
}
public String CONTEXT_ADR7_SUB_DEP_FILE;
public String getCONTEXT_ADR7_SUB_DEP_FILE(){
	return this.CONTEXT_ADR7_SUB_DEP_FILE;
}
public String CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE;
public String getCONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE(){
	return this.CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE;
}
public String CONTEXT_ARTICLE_XREF;
public String getCONTEXT_ARTICLE_XREF(){
	return this.CONTEXT_ARTICLE_XREF;
}
public BigDecimal CONTEXT_BACKFEED_SEQ_NBR;
public BigDecimal getCONTEXT_BACKFEED_SEQ_NBR(){
	return this.CONTEXT_BACKFEED_SEQ_NBR;
}
public String CONTEXT_BASIC_IND_UPD_OPSTUDY;
public String getCONTEXT_BASIC_IND_UPD_OPSTUDY(){
	return this.CONTEXT_BASIC_IND_UPD_OPSTUDY;
}
public String CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA;
public String getCONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA(){
	return this.CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA;
}
public String CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL;
public String getCONTEXT_BUYER_SELLER_CONFIG_FILE_FULL(){
	return this.CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL;
}
public String CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG;
public String getCONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG(){
	return this.CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG;
}
public String CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT;
public String getCONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT(){
	return this.CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT;
}
public String CONTEXT_CHECKPOINT_FILE_NAME;
public String getCONTEXT_CHECKPOINT_FILE_NAME(){
	return this.CONTEXT_CHECKPOINT_FILE_NAME;
}
public String CONTEXT_COLOR_CODE;
public String getCONTEXT_COLOR_CODE(){
	return this.CONTEXT_COLOR_CODE;
}
public String CONTEXT_CUTOFF_TIME_MIN;
public String getCONTEXT_CUTOFF_TIME_MIN(){
	return this.CONTEXT_CUTOFF_TIME_MIN;
}
public String CONTEXT_DC_SERVICING_IND_FILE;
public String getCONTEXT_DC_SERVICING_IND_FILE(){
	return this.CONTEXT_DC_SERVICING_IND_FILE;
}
public Integer CONTEXT_DELETE_VOL_LIMIT;
public Integer getCONTEXT_DELETE_VOL_LIMIT(){
	return this.CONTEXT_DELETE_VOL_LIMIT;
}
public Integer CONTEXT_DELTA_VOL_LIMIT;
public Integer getCONTEXT_DELTA_VOL_LIMIT(){
	return this.CONTEXT_DELTA_VOL_LIMIT;
}
public String CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO;
public String getCONTEXT_DELTA_VOL_LIMIT_EMAIL_TO(){
	return this.CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO;
}
public String CONTEXT_DELTA_VOL_TARGET;
public String getCONTEXT_DELTA_VOL_TARGET(){
	return this.CONTEXT_DELTA_VOL_TARGET;
}
public String CONTEXT_ERR_REPORT;
public String getCONTEXT_ERR_REPORT(){
	return this.CONTEXT_ERR_REPORT;
}
public String CONTEXT_ETL_ARCHIVE_FILE_PATH;
public String getCONTEXT_ETL_ARCHIVE_FILE_PATH(){
	return this.CONTEXT_ETL_ARCHIVE_FILE_PATH;
}
public String CONTEXT_ETL_BSCONFIG_FILE_EXTENSION;
public String getCONTEXT_ETL_BSCONFIG_FILE_EXTENSION(){
	return this.CONTEXT_ETL_BSCONFIG_FILE_EXTENSION;
}
public String CONTEXT_ETL_CSV_FILE_EXTENSION;
public String getCONTEXT_ETL_CSV_FILE_EXTENSION(){
	return this.CONTEXT_ETL_CSV_FILE_EXTENSION;
}
public String CONTEXT_ETL_ENCODING;
public String getCONTEXT_ETL_ENCODING(){
	return this.CONTEXT_ETL_ENCODING;
}
public String CONTEXT_ETL_EXCEL_FILE_EXTENSION;
public String getCONTEXT_ETL_EXCEL_FILE_EXTENSION(){
	return this.CONTEXT_ETL_EXCEL_FILE_EXTENSION;
}
public String CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE;
public String getCONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE(){
	return this.CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE;
}
public String CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT;
public String getCONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT(){
	return this.CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT;
}
public String CONTEXT_ETL_GROUPEMAILID_FROM;
public String getCONTEXT_ETL_GROUPEMAILID_FROM(){
	return this.CONTEXT_ETL_GROUPEMAILID_FROM;
}
public String CONTEXT_ETL_GROUPEMAILID_SMTP_HOST;
public String getCONTEXT_ETL_GROUPEMAILID_SMTP_HOST(){
	return this.CONTEXT_ETL_GROUPEMAILID_SMTP_HOST;
}
public String CONTEXT_ETL_GROUPEMAILID_SMTP_PORT;
public String getCONTEXT_ETL_GROUPEMAILID_SMTP_PORT(){
	return this.CONTEXT_ETL_GROUPEMAILID_SMTP_PORT;
}
public String CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE;
public String getCONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE(){
	return this.CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE;
}
public String CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT;
public String getCONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT(){
	return this.CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT;
}
public String CONTEXT_ETL_GROUPEMAILID_TO;
public String getCONTEXT_ETL_GROUPEMAILID_TO(){
	return this.CONTEXT_ETL_GROUPEMAILID_TO;
}
public String CONTEXT_ETL_INPUT_FILE_EXTENSION;
public String getCONTEXT_ETL_INPUT_FILE_EXTENSION(){
	return this.CONTEXT_ETL_INPUT_FILE_EXTENSION;
}
public String CONTEXT_ETL_INPUT_ORG_PATH;
public String getCONTEXT_ETL_INPUT_ORG_PATH(){
	return this.CONTEXT_ETL_INPUT_ORG_PATH;
}
public String CONTEXT_ETL_INPUT_PATH;
public String getCONTEXT_ETL_INPUT_PATH(){
	return this.CONTEXT_ETL_INPUT_PATH;
}
public String CONTEXT_ETL_INTM_FIELD_SEPARATOR;
public String getCONTEXT_ETL_INTM_FIELD_SEPARATOR(){
	return this.CONTEXT_ETL_INTM_FIELD_SEPARATOR;
}
public String CONTEXT_ETL_INTM_FILE_ENCODING;
public String getCONTEXT_ETL_INTM_FILE_ENCODING(){
	return this.CONTEXT_ETL_INTM_FILE_ENCODING;
}
public String CONTEXT_ETL_INTM_FILE_EXTENSION;
public String getCONTEXT_ETL_INTM_FILE_EXTENSION(){
	return this.CONTEXT_ETL_INTM_FILE_EXTENSION;
}
public String CONTEXT_ETL_INTM_FILE_PATH;
public String getCONTEXT_ETL_INTM_FILE_PATH(){
	return this.CONTEXT_ETL_INTM_FILE_PATH;
}
public String CONTEXT_ETL_JOB_NAME;
public String getCONTEXT_ETL_JOB_NAME(){
	return this.CONTEXT_ETL_JOB_NAME;
}
public String CONTEXT_ETL_LOG_FILE_NAME;
public String getCONTEXT_ETL_LOG_FILE_NAME(){
	return this.CONTEXT_ETL_LOG_FILE_NAME;
}
public String CONTEXT_ETL_LOG_FILE_PATH;
public String getCONTEXT_ETL_LOG_FILE_PATH(){
	return this.CONTEXT_ETL_LOG_FILE_PATH;
}
public String CONTEXT_ETL_LOG_PATH;
public String getCONTEXT_ETL_LOG_PATH(){
	return this.CONTEXT_ETL_LOG_PATH;
}
public String CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR;
public String getCONTEXT_ETL_OUTPUT_FIELD_SEPARATOR(){
	return this.CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR;
}
public String CONTEXT_ETL_OUTPUT_FILE_ENCODING;
public String getCONTEXT_ETL_OUTPUT_FILE_ENCODING(){
	return this.CONTEXT_ETL_OUTPUT_FILE_ENCODING;
}
public String CONTEXT_ETL_OUTPUT_FILE_EXTENSION;
public String getCONTEXT_ETL_OUTPUT_FILE_EXTENSION(){
	return this.CONTEXT_ETL_OUTPUT_FILE_EXTENSION;
}
public String CONTEXT_ETL_OUTPUT_FILE_PATH;
public String getCONTEXT_ETL_OUTPUT_FILE_PATH(){
	return this.CONTEXT_ETL_OUTPUT_FILE_PATH;
}
public String CONTEXT_ETL_REJECT_FILE_PATH;
public String getCONTEXT_ETL_REJECT_FILE_PATH(){
	return this.CONTEXT_ETL_REJECT_FILE_PATH;
}
public String CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION;
public String getCONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION(){
	return this.CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION;
}
public String CONTEXT_ETL_TARGET_FILE_PATH;
public String getCONTEXT_ETL_TARGET_FILE_PATH(){
	return this.CONTEXT_ETL_TARGET_FILE_PATH;
}
public String CONTEXT_ETL_TEAM_NAME;
public String getCONTEXT_ETL_TEAM_NAME(){
	return this.CONTEXT_ETL_TEAM_NAME;
}
public String CONTEXT_ETL_XREF_JOB_NAME;
public String getCONTEXT_ETL_XREF_JOB_NAME(){
	return this.CONTEXT_ETL_XREF_JOB_NAME;
}
public String CONTEXT_EXCEPTION_FLAG;
public String getCONTEXT_EXCEPTION_FLAG(){
	return this.CONTEXT_EXCEPTION_FLAG;
}
public String CONTEXT_EXISTING_CASE_GTIN;
public String getCONTEXT_EXISTING_CASE_GTIN(){
	return this.CONTEXT_EXISTING_CASE_GTIN;
}
public String CONTEXT_EXISTING_UPC_LIST;
public String getCONTEXT_EXISTING_UPC_LIST(){
	return this.CONTEXT_EXISTING_UPC_LIST;
}
public String CONTEXT_FILE_PATH;
public String getCONTEXT_FILE_PATH(){
	return this.CONTEXT_FILE_PATH;
}
public String CONTEXT_GA072P_ENABLE_FLAG;
public String getCONTEXT_GA072P_ENABLE_FLAG(){
	return this.CONTEXT_GA072P_ENABLE_FLAG;
}
public String CONTEXT_HALLMARK_PERSISTENT_FILE_NAME;
public String getCONTEXT_HALLMARK_PERSISTENT_FILE_NAME(){
	return this.CONTEXT_HALLMARK_PERSISTENT_FILE_NAME;
}
public String CONTEXT_IT028P_SOM_ITEMLIST;
public String getCONTEXT_IT028P_SOM_ITEMLIST(){
	return this.CONTEXT_IT028P_SOM_ITEMLIST;
}
public String CONTEXT_KEYSTOREPWD;
public String getCONTEXT_KEYSTOREPWD(){
	return this.CONTEXT_KEYSTOREPWD;
}
public String CONTEXT_LEGACY_SAP_CNTRY_MAPPING;
public String getCONTEXT_LEGACY_SAP_CNTRY_MAPPING(){
	return this.CONTEXT_LEGACY_SAP_CNTRY_MAPPING;
}
public String CONTEXT_LEGAL_UOM_XREF;
public String getCONTEXT_LEGAL_UOM_XREF(){
	return this.CONTEXT_LEGAL_UOM_XREF;
}
public String CONTEXT_LISTING_TYPE;
public String getCONTEXT_LISTING_TYPE(){
	return this.CONTEXT_LISTING_TYPE;
}
public String CONTEXT_MARA_ADDITIONALSEG;
public String getCONTEXT_MARA_ADDITIONALSEG(){
	return this.CONTEXT_MARA_ADDITIONALSEG;
}
public String CONTEXT_MARA_BASIC_EXTENSION;
public String getCONTEXT_MARA_BASIC_EXTENSION(){
	return this.CONTEXT_MARA_BASIC_EXTENSION;
}
public String CONTEXT_MARA_BOMMAT;
public String getCONTEXT_MARA_BOMMAT(){
	return this.CONTEXT_MARA_BOMMAT;
}
public String CONTEXT_MARA_DR_DESC;
public String getCONTEXT_MARA_DR_DESC(){
	return this.CONTEXT_MARA_DR_DESC;
}
public String CONTEXT_MARA_EXTRACTSEG;
public String getCONTEXT_MARA_EXTRACTSEG(){
	return this.CONTEXT_MARA_EXTRACTSEG;
}
public String CONTEXT_MARA_GTIN_UPC_REL;
public String getCONTEXT_MARA_GTIN_UPC_REL(){
	return this.CONTEXT_MARA_GTIN_UPC_REL;
}
public String CONTEXT_MARA_HIERARCHYNODE;
public String getCONTEXT_MARA_HIERARCHYNODE(){
	return this.CONTEXT_MARA_HIERARCHYNODE;
}
public String CONTEXT_MARA_HTSCLASS;
public String getCONTEXT_MARA_HTSCLASS(){
	return this.CONTEXT_MARA_HTSCLASS;
}
public String CONTEXT_MARA_LEGACY_ITEM;
public String getCONTEXT_MARA_LEGACY_ITEM(){
	return this.CONTEXT_MARA_LEGACY_ITEM;
}
public String CONTEXT_MARA_LEGACY_ITEM_VENDOR;
public String getCONTEXT_MARA_LEGACY_ITEM_VENDOR(){
	return this.CONTEXT_MARA_LEGACY_ITEM_VENDOR;
}
public String CONTEXT_MARA_LEGACYSEG;
public String getCONTEXT_MARA_LEGACYSEG(){
	return this.CONTEXT_MARA_LEGACYSEG;
}
public String CONTEXT_MARA_LEGALUOM;
public String getCONTEXT_MARA_LEGALUOM(){
	return this.CONTEXT_MARA_LEGALUOM;
}
public String CONTEXT_MARA_MAIN_ARTICLE;
public String getCONTEXT_MARA_MAIN_ARTICLE(){
	return this.CONTEXT_MARA_MAIN_ARTICLE;
}
public String CONTEXT_MARA_MAMSEG;
public String getCONTEXT_MARA_MAMSEG(){
	return this.CONTEXT_MARA_MAMSEG;
}
public String CONTEXT_MARA_MARASEG;
public String getCONTEXT_MARA_MARASEG(){
	return this.CONTEXT_MARA_MARASEG;
}
public String CONTEXT_MARA_MARMSEG;
public String getCONTEXT_MARA_MARMSEG(){
	return this.CONTEXT_MARA_MARMSEG;
}
public String CONTEXT_MARA_MATDESC;
public String getCONTEXT_MARA_MATDESC(){
	return this.CONTEXT_MARA_MATDESC;
}
public String CONTEXT_MARA_MAW_SEG;
public String getCONTEXT_MARA_MAW_SEG(){
	return this.CONTEXT_MARA_MAW_SEG;
}
public String CONTEXT_MARA_MAWSEG;
public String getCONTEXT_MARA_MAWSEG(){
	return this.CONTEXT_MARA_MAWSEG;
}
public String CONTEXT_MARA_MEANSEG;
public String getCONTEXT_MARA_MEANSEG(){
	return this.CONTEXT_MARA_MEANSEG;
}
public String CONTEXT_MARA_MLEASEG;
public String getCONTEXT_MARA_MLEASEG(){
	return this.CONTEXT_MARA_MLEASEG;
}
public String CONTEXT_MARA_MVKERT;
public String getCONTEXT_MARA_MVKERT(){
	return this.CONTEXT_MARA_MVKERT;
}
public String CONTEXT_MARA_PURSUB;
public String getCONTEXT_MARA_PURSUB(){
	return this.CONTEXT_MARA_PURSUB;
}
public String CONTEXT_MARA_SEASONCODE;
public String getCONTEXT_MARA_SEASONCODE(){
	return this.CONTEXT_MARA_SEASONCODE;
}
public String CONTEXT_MARA_SHIPSUB;
public String getCONTEXT_MARA_SHIPSUB(){
	return this.CONTEXT_MARA_SHIPSUB;
}
public String CONTEXT_MARA_VARIANT_ARTICLE;
public String getCONTEXT_MARA_VARIANT_ARTICLE(){
	return this.CONTEXT_MARA_VARIANT_ARTICLE;
}
public String CONTEXT_MARA_WLK2EXTRTSEG;
public String getCONTEXT_MARA_WLK2EXTRTSEG(){
	return this.CONTEXT_MARA_WLK2EXTRTSEG;
}
public String CONTEXT_MARA_WLK2SEG;
public String getCONTEXT_MARA_WLK2SEG(){
	return this.CONTEXT_MARA_WLK2SEG;
}
public String CONTEXT_MDM_KEYSTORE;
public String getCONTEXT_MDM_KEYSTORE(){
	return this.CONTEXT_MDM_KEYSTORE;
}
public String CONTEXT_MDM_TRUSTSTORE;
public String getCONTEXT_MDM_TRUSTSTORE(){
	return this.CONTEXT_MDM_TRUSTSTORE;
}
public String CONTEXT_MISSING_UPC_EMAIL_TO;
public String getCONTEXT_MISSING_UPC_EMAIL_TO(){
	return this.CONTEXT_MISSING_UPC_EMAIL_TO;
}
public String CONTEXT_MISSING_UPC_REPLY_TO;
public String getCONTEXT_MISSING_UPC_REPLY_TO(){
	return this.CONTEXT_MISSING_UPC_REPLY_TO;
}
public String CONTEXT_MYLAR_MERCH_OPSTUDY;
public String getCONTEXT_MYLAR_MERCH_OPSTUDY(){
	return this.CONTEXT_MYLAR_MERCH_OPSTUDY;
}
public String CONTEXT_NEW_UOM_WIC_REQ_FLAG;
public String getCONTEXT_NEW_UOM_WIC_REQ_FLAG(){
	return this.CONTEXT_NEW_UOM_WIC_REQ_FLAG;
}
public String CONTEXT_OB_CLR_PERSISTENT_FILE;
public String getCONTEXT_OB_CLR_PERSISTENT_FILE(){
	return this.CONTEXT_OB_CLR_PERSISTENT_FILE;
}
public String CONTEXT_OB_CLR_XREF;
public String getCONTEXT_OB_CLR_XREF(){
	return this.CONTEXT_OB_CLR_XREF;
}
public String CONTEXT_ORMD_IND;
public String getCONTEXT_ORMD_IND(){
	return this.CONTEXT_ORMD_IND;
}
public String CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT;
public String getCONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT(){
	return this.CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT;
}
public String CONTEXT_PARKING_EXCEPT_LIST;
public String getCONTEXT_PARKING_EXCEPT_LIST(){
	return this.CONTEXT_PARKING_EXCEPT_LIST;
}
public String CONTEXT_PIR_PARKED_ADR4_MD039P;
public String getCONTEXT_PIR_PARKED_ADR4_MD039P(){
	return this.CONTEXT_PIR_PARKED_ADR4_MD039P;
}
public String CONTEXT_PIR_PARKED_IT002P;
public String getCONTEXT_PIR_PARKED_IT002P(){
	return this.CONTEXT_PIR_PARKED_IT002P;
}
public String CONTEXT_PIR_PARKED_IT007P;
public String getCONTEXT_PIR_PARKED_IT007P(){
	return this.CONTEXT_PIR_PARKED_IT007P;
}
public String CONTEXT_PIR_PARKED_IT008P;
public String getCONTEXT_PIR_PARKED_IT008P(){
	return this.CONTEXT_PIR_PARKED_IT008P;
}
public String CONTEXT_PIR_PARKED_IT011P;
public String getCONTEXT_PIR_PARKED_IT011P(){
	return this.CONTEXT_PIR_PARKED_IT011P;
}
public String CONTEXT_PIR_PARKED_IT015P;
public String getCONTEXT_PIR_PARKED_IT015P(){
	return this.CONTEXT_PIR_PARKED_IT015P;
}
public String CONTEXT_PIR_PARKED_IT029P;
public String getCONTEXT_PIR_PARKED_IT029P(){
	return this.CONTEXT_PIR_PARKED_IT029P;
}
public String CONTEXT_PIR_PARKED_IT088P;
public String getCONTEXT_PIR_PARKED_IT088P(){
	return this.CONTEXT_PIR_PARKED_IT088P;
}
public String CONTEXT_PIR_PARKED_IT107P;
public String getCONTEXT_PIR_PARKED_IT107P(){
	return this.CONTEXT_PIR_PARKED_IT107P;
}
public String CONTEXT_PIR_PARKED_IT108P;
public String getCONTEXT_PIR_PARKED_IT108P(){
	return this.CONTEXT_PIR_PARKED_IT108P;
}
public String CONTEXT_PIR_PARKED_IT185P;
public String getCONTEXT_PIR_PARKED_IT185P(){
	return this.CONTEXT_PIR_PARKED_IT185P;
}
public String CONTEXT_PIR_PARKED_IT186P;
public String getCONTEXT_PIR_PARKED_IT186P(){
	return this.CONTEXT_PIR_PARKED_IT186P;
}
public String CONTEXT_PIR_PARKED_IT282P;
public String getCONTEXT_PIR_PARKED_IT282P(){
	return this.CONTEXT_PIR_PARKED_IT282P;
}
public String CONTEXT_PIR_PARKED_IT402P;
public String getCONTEXT_PIR_PARKED_IT402P(){
	return this.CONTEXT_PIR_PARKED_IT402P;
}
public String CONTEXT_PIR_PARKED_IT517P;
public String getCONTEXT_PIR_PARKED_IT517P(){
	return this.CONTEXT_PIR_PARKED_IT517P;
}
public String CONTEXT_PIR_PARKED_IT839P;
public String getCONTEXT_PIR_PARKED_IT839P(){
	return this.CONTEXT_PIR_PARKED_IT839P;
}
public String CONTEXT_PIR_PARKED_IT981P;
public String getCONTEXT_PIR_PARKED_IT981P(){
	return this.CONTEXT_PIR_PARKED_IT981P;
}
public String CONTEXT_PIR_PARKED_MD039P;
public String getCONTEXT_PIR_PARKED_MD039P(){
	return this.CONTEXT_PIR_PARKED_MD039P;
}
public String CONTEXT_PIR_PARKED_MD041P;
public String getCONTEXT_PIR_PARKED_MD041P(){
	return this.CONTEXT_PIR_PARKED_MD041P;
}
public String CONTEXT_PIR_PARKED_MD041P_ADR4;
public String getCONTEXT_PIR_PARKED_MD041P_ADR4(){
	return this.CONTEXT_PIR_PARKED_MD041P_ADR4;
}
public String CONTEXT_PIR_PARKED_MD639P;
public String getCONTEXT_PIR_PARKED_MD639P(){
	return this.CONTEXT_PIR_PARKED_MD639P;
}
public String CONTEXT_PLN_MERGE;
public String getCONTEXT_PLN_MERGE(){
	return this.CONTEXT_PLN_MERGE;
}
public String CONTEXT_PLN_SM_TRACKING_FILE;
public String getCONTEXT_PLN_SM_TRACKING_FILE(){
	return this.CONTEXT_PLN_SM_TRACKING_FILE;
}
public String CONTEXT_PLN_SPLIT;
public String getCONTEXT_PLN_SPLIT(){
	return this.CONTEXT_PLN_SPLIT;
}
public String CONTEXT_QUICKWIC_ARTICLE_STATUS;
public String getCONTEXT_QUICKWIC_ARTICLE_STATUS(){
	return this.CONTEXT_QUICKWIC_ARTICLE_STATUS;
}
public String CONTEXT_RACK_MYLAR;
public String getCONTEXT_RACK_MYLAR(){
	return this.CONTEXT_RACK_MYLAR;
}
public String CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG;
public String getCONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG(){
	return this.CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG;
}
public String CONTEXT_RT_CONTROL_FOLDER;
public String getCONTEXT_RT_CONTROL_FOLDER(){
	return this.CONTEXT_RT_CONTROL_FOLDER;
}
public String CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH;
public String getCONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH(){
	return this.CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH;
}
public String CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH;
public String getCONTEXT_RT_R4B_ADR4_PARKING_FILEPATH(){
	return this.CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH;
}
public String CONTEXT_RT_R4B_PARKED_PIR_FILEPATH;
public String getCONTEXT_RT_R4B_PARKED_PIR_FILEPATH(){
	return this.CONTEXT_RT_R4B_PARKED_PIR_FILEPATH;
}
public String CONTEXT_RT_R4B_PARKED_XREF_FILEPATH;
public String getCONTEXT_RT_R4B_PARKED_XREF_FILEPATH(){
	return this.CONTEXT_RT_R4B_PARKED_XREF_FILEPATH;
}
public String CONTEXT_RT_RNWL_HOME;
public String getCONTEXT_RT_RNWL_HOME(){
	return this.CONTEXT_RT_RNWL_HOME;
}
public String CONTEXT_RT_SOURCE;
public String getCONTEXT_RT_SOURCE(){
	return this.CONTEXT_RT_SOURCE;
}
public String CONTEXT_RT_TRACK;
public String getCONTEXT_RT_TRACK(){
	return this.CONTEXT_RT_TRACK;
}
public String CONTEXT_RT_TRACK_DYNAMIC;
public String getCONTEXT_RT_TRACK_DYNAMIC(){
	return this.CONTEXT_RT_TRACK_DYNAMIC;
}
public String CONTEXT_RT_TRACK_LOAD;
public String getCONTEXT_RT_TRACK_LOAD(){
	return this.CONTEXT_RT_TRACK_LOAD;
}
public String CONTEXT_RT_TRACK_SAG;
public String getCONTEXT_RT_TRACK_SAG(){
	return this.CONTEXT_RT_TRACK_SAG;
}
public String CONTEXT_RT_TRACK_STATIC;
public String getCONTEXT_RT_TRACK_STATIC(){
	return this.CONTEXT_RT_TRACK_STATIC;
}
public String CONTEXT_RT_TRACK_XREF;
public String getCONTEXT_RT_TRACK_XREF(){
	return this.CONTEXT_RT_TRACK_XREF;
}
public String CONTEXT_RT_TRACK_XREF_UPDATE;
public String getCONTEXT_RT_TRACK_XREF_UPDATE(){
	return this.CONTEXT_RT_TRACK_XREF_UPDATE;
}
public String CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE;
public String getCONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE(){
	return this.CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE;
}
public String CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM;
public String getCONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM(){
	return this.CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM;
}
public String CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME;
public String getCONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME(){
	return this.CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME;
}
public String CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM;
public String getCONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM(){
	return this.CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM;
}
public String CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM;
public String getCONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM(){
	return this.CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM;
}
public String CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM;
public String getCONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM(){
	return this.CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM;
}
public String CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM;
public String getCONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM(){
	return this.CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM;
}
public String CONTEXT_SAG_EXTRACT_JOB_NAME;
public String getCONTEXT_SAG_EXTRACT_JOB_NAME(){
	return this.CONTEXT_SAG_EXTRACT_JOB_NAME;
}
public String CONTEXT_SAG_EXTRACT_LOG_FILE_NAME;
public String getCONTEXT_SAG_EXTRACT_LOG_FILE_NAME(){
	return this.CONTEXT_SAG_EXTRACT_LOG_FILE_NAME;
}
public String CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL;
public String getCONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL(){
	return this.CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL;
}
public String CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE;
public String getCONTEXT_SAP_ARTICLE_XREF_DELETE_FILE(){
	return this.CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE;
}
public String CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD;
public String getCONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD(){
	return this.CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD;
}
public String CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT;
public String getCONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT(){
	return this.CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT;
}
public String CONTEXT_SAP_LEGACY_UOM_XREF;
public String getCONTEXT_SAP_LEGACY_UOM_XREF(){
	return this.CONTEXT_SAP_LEGACY_UOM_XREF;
}
public String CONTEXT_SAP_XREF_FOLDER_NAME;
public String getCONTEXT_SAP_XREF_FOLDER_NAME(){
	return this.CONTEXT_SAP_XREF_FOLDER_NAME;
}
public String CONTEXT_SEASON_CODE_EXCEPTION_TO;
public String getCONTEXT_SEASON_CODE_EXCEPTION_TO(){
	return this.CONTEXT_SEASON_CODE_EXCEPTION_TO;
}
public String CONTEXT_SEASON_DEFAULT_VALUE;
public String getCONTEXT_SEASON_DEFAULT_VALUE(){
	return this.CONTEXT_SEASON_DEFAULT_VALUE;
}
public String CONTEXT_SEASONCODE_EXCEL;
public String getCONTEXT_SEASONCODE_EXCEL(){
	return this.CONTEXT_SEASONCODE_EXCEL;
}
public String CONTEXT_SIGNAL_FILE_PATH;
public String getCONTEXT_SIGNAL_FILE_PATH(){
	return this.CONTEXT_SIGNAL_FILE_PATH;
}
public String CONTEXT_SITE_XREF;
public String getCONTEXT_SITE_XREF(){
	return this.CONTEXT_SITE_XREF;
}
public String CONTEXT_SOURCE_ARTICLE_FOLDER_NAME;
public String getCONTEXT_SOURCE_ARTICLE_FOLDER_NAME(){
	return this.CONTEXT_SOURCE_ARTICLE_FOLDER_NAME;
}
public String CONTEXT_STIBO_CF_PERSISTENT_FILE;
public String getCONTEXT_STIBO_CF_PERSISTENT_FILE(){
	return this.CONTEXT_STIBO_CF_PERSISTENT_FILE;
}
public String CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE;
public String getCONTEXT_STIBO_EXTENDED_PERSISTENT_FILE(){
	return this.CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE;
}
public String CONTEXT_STIBO_PERSISTENT_FILE;
public String getCONTEXT_STIBO_PERSISTENT_FILE(){
	return this.CONTEXT_STIBO_PERSISTENT_FILE;
}
public String CONTEXT_STIBO_SOM_PERSISTENT_FILE;
public String getCONTEXT_STIBO_SOM_PERSISTENT_FILE(){
	return this.CONTEXT_STIBO_SOM_PERSISTENT_FILE;
}
public String CONTEXT_TALEND_ARTICLE_XREF;
public String getCONTEXT_TALEND_ARTICLE_XREF(){
	return this.CONTEXT_TALEND_ARTICLE_XREF;
}
public String CONTEXT_TALEND_VENDOR_XREF;
public String getCONTEXT_TALEND_VENDOR_XREF(){
	return this.CONTEXT_TALEND_VENDOR_XREF;
}
public String CONTEXT_TEMP_CONTROL;
public String getCONTEXT_TEMP_CONTROL(){
	return this.CONTEXT_TEMP_CONTROL;
}
public String CONTEXT_TEMP_MERCH_OPSTUDY;
public String getCONTEXT_TEMP_MERCH_OPSTUDY(){
	return this.CONTEXT_TEMP_MERCH_OPSTUDY;
}
public String CONTEXT_TRUSTSTOREPWD;
public String getCONTEXT_TRUSTSTOREPWD(){
	return this.CONTEXT_TRUSTSTOREPWD;
}
public String CONTEXT_UPC_DELETE_FLAG;
public String getCONTEXT_UPC_DELETE_FLAG(){
	return this.CONTEXT_UPC_DELETE_FLAG;
}
public String CONTEXT_VALID_ARTTYPE_STIBOCHECK;
public String getCONTEXT_VALID_ARTTYPE_STIBOCHECK(){
	return this.CONTEXT_VALID_ARTTYPE_STIBOCHECK;
}
public String CONTEXT_VALID_ITEMS_LOAD_ADR4;
public String getCONTEXT_VALID_ITEMS_LOAD_ADR4(){
	return this.CONTEXT_VALID_ITEMS_LOAD_ADR4;
}
public String CONTEXT_VALID_ITEMS_LOAD_ADR7;
public String getCONTEXT_VALID_ITEMS_LOAD_ADR7(){
	return this.CONTEXT_VALID_ITEMS_LOAD_ADR7;
}
public String CONTEXT_VALIDATION_REP_FROM;
public String getCONTEXT_VALIDATION_REP_FROM(){
	return this.CONTEXT_VALIDATION_REP_FROM;
}
public String CONTEXT_VALIDATION_REP_TO;
public String getCONTEXT_VALIDATION_REP_TO(){
	return this.CONTEXT_VALIDATION_REP_TO;
}
public String CONTEXT_VALIDATION_REPORTNAME;
public String getCONTEXT_VALIDATION_REPORTNAME(){
	return this.CONTEXT_VALIDATION_REPORTNAME;
}
public String CONTEXT_VENDOR_VOG;
public String getCONTEXT_VENDOR_VOG(){
	return this.CONTEXT_VENDOR_VOG;
}
public String CONTEXT_VENDOR_XREF;
public String getCONTEXT_VENDOR_XREF(){
	return this.CONTEXT_VENDOR_XREF;
}
public BigDecimal CURR_DT;
public BigDecimal getCURR_DT(){
	return this.CURR_DT;
}
public String JMS_ARTICLE_QUEUE_INPUT_FILE_NAME;
public String getJMS_ARTICLE_QUEUE_INPUT_FILE_NAME(){
	return this.JMS_ARTICLE_QUEUE_INPUT_FILE_NAME;
}
public String JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM;
public String getJMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM(){
	return this.JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM;
}
public String JMS_ARTICLE_QUEUE_MESSAGE_COUNT;
public String getJMS_ARTICLE_QUEUE_MESSAGE_COUNT(){
	return this.JMS_ARTICLE_QUEUE_MESSAGE_COUNT;
}
public String NewWIC;
public String getNewWIC(){
	return this.NewWIC;
}
public String OB_CLR_XREF_TARGET;
public String getOB_CLR_XREF_TARGET(){
	return this.OB_CLR_XREF_TARGET;
}
public String PROCESS_CATEGORY;
public String getPROCESS_CATEGORY(){
	return this.PROCESS_CATEGORY;
}
public String PROCESSED_FLAG;
public String getPROCESSED_FLAG(){
	return this.PROCESSED_FLAG;
}
public String PROGRAM_LIB_NAME;
public String getPROGRAM_LIB_NAME(){
	return this.PROGRAM_LIB_NAME;
}
public String RUN_DAY;
public String getRUN_DAY(){
	return this.RUN_DAY;
}
public String SAF_OVERRIDE_FILE;
public String getSAF_OVERRIDE_FILE(){
	return this.SAF_OVERRIDE_FILE;
}
public String SHIP_SUB_OPSTUDY;
public String getSHIP_SUB_OPSTUDY(){
	return this.SHIP_SUB_OPSTUDY;
}
public String UOM;
public String getUOM(){
	return this.UOM;
}
public String UPC;
public String getUPC(){
	return this.UPC;
}
public Integer UPC_LENGTH_DIGIT;
public Integer getUPC_LENGTH_DIGIT(){
	return this.UPC_LENGTH_DIGIT;
}
public String USER_STAMP;
public String getUSER_STAMP(){
	return this.USER_STAMP;
}
public String WICRequiredFlag;
public String getWICRequiredFlag(){
	return this.WICRequiredFlag;
}
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "IT005p_table_update_job";
	private final String projectName = "ARTICLE_BACKFEED_UPDATED";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private final JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_hHtsEBX0EfCPYPnHbrjoFg", "0.1");
private org.talend.job.audit.JobAuditLogger auditLogger_talendJobLog = null;

private RunStat runStat = new RunStat(talendJobLog, System.getProperty("audit.interval"));

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}
	
	public void setDataSourceReferences(List serviceReferences) throws Exception{
		
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		java.util.Map<String, javax.sql.DataSource> dataSources = new java.util.HashMap<String, javax.sql.DataSource>();
		
		for (java.util.Map.Entry<String, javax.sql.DataSource> entry : BundleUtils.getServices(serviceReferences,  javax.sql.DataSource.class).entrySet()) {
                    dataSources.put(entry.getKey(), entry.getValue());
                    talendDataSources.put(entry.getKey(), new routines.system.TalendDataSource(entry.getValue()));
		}

		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}


private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	private String currentComponent = null;
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				IT005p_table_update_job.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(IT005p_table_update_job.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void Implicit_Context_Regex_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
							Implicit_Context_Context_error(exception, errorComponent, globalMap);
						
						}
					
			public void Implicit_Context_Context_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					Implicit_Context_Regex_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tContextLoad_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileInputDelimited_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBOutput_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFilterColumns_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tFileOutputDelimited_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tFileInputDelimited_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tDBCommit_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tDBCommit_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void Implicit_Context_Regex_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tFileInputDelimited_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tDBCommit_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}







		

public static class row_Implicit_Context_RegexStruct implements routines.system.IPersistableRow<row_Implicit_Context_RegexStruct> {
    final static byte[] commonByteArrayLock_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[0];
    static byte[] commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[0];

	
			    public String key;

				public String getKey () {
					return this.key;
				}
				
			    public String value;

				public String getValue () {
					return this.value;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job.length) {
				if(length < 1024 && commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job.length == 0) {
   					commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[1024];
				} else {
   					commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job, 0, length);
			strReturn = new String(commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job) {

        	try {

        		int length = 0;
		
					this.key = readString(dis);
					
					this.value = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("key="+key);
		sb.append(",value="+value);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(key == null){
        					sb.append("<null>");
        				}else{
            				sb.append(key);
            			}
            		
        			sb.append("|");
        		
        				if(value == null){
        					sb.append("<null>");
        				}else{
            				sb.append(value);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row_Implicit_Context_RegexStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void Implicit_Context_RegexProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("Implicit_Context_Regex_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
		String currentVirtualComponent = null;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row_Implicit_Context_RegexStruct row_Implicit_Context_Regex = new row_Implicit_Context_RegexStruct();




	
	/**
	 * [Implicit_Context_Context begin ] start
	 */

	

	
		
		ok_Hash.put("Implicit_Context_Context", false);
		start_Hash.put("Implicit_Context_Context", System.currentTimeMillis());
		
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Main");
			
		int tos_count_Implicit_Context_Context = 0;
		
                if(log.isDebugEnabled())
            log.debug("Implicit_Context_Context - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_Implicit_Context_Context{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_Implicit_Context_Context = new StringBuilder();
                    log4jParamters_Implicit_Context_Context.append("Parameters:");
                            log4jParamters_Implicit_Context_Context.append("LOAD_NEW_VARIABLE" + " = " + "Warning");
                        log4jParamters_Implicit_Context_Context.append(" | ");
                            log4jParamters_Implicit_Context_Context.append("NOT_LOAD_OLD_VARIABLE" + " = " + "Warning");
                        log4jParamters_Implicit_Context_Context.append(" | ");
                            log4jParamters_Implicit_Context_Context.append("PRINT_OPERATIONS" + " = " + "false");
                        log4jParamters_Implicit_Context_Context.append(" | ");
                            log4jParamters_Implicit_Context_Context.append("DISABLE_ERROR" + " = " + "false");
                        log4jParamters_Implicit_Context_Context.append(" | ");
                            log4jParamters_Implicit_Context_Context.append("DISABLE_WARNINGS" + " = " + "false");
                        log4jParamters_Implicit_Context_Context.append(" | ");
                            log4jParamters_Implicit_Context_Context.append("DISABLE_INFO" + " = " + "false");
                        log4jParamters_Implicit_Context_Context.append(" | ");
                            log4jParamters_Implicit_Context_Context.append("DIEONERROR" + " = " + "false");
                        log4jParamters_Implicit_Context_Context.append(" | ");
                if(log.isDebugEnabled())
            log.debug("Implicit_Context_Context - "  + (log4jParamters_Implicit_Context_Context) );
                    } 
                } 
            new BytesLimit65535_Implicit_Context_Context().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("Implicit_Context_Context", "Implicit_Context_Context", "tContextLoad");
				talendJobLogProcess(globalMap);
			}
			
	java.util.List<String> assignList_Implicit_Context_Context = new java.util.ArrayList<String>();
	java.util.List<String> newPropertyList_Implicit_Context_Context = new java.util.ArrayList<String>();
	java.util.List<String> noAssignList_Implicit_Context_Context = new java.util.ArrayList<String>();
	int nb_line_Implicit_Context_Context = 0;

 



/**
 * [Implicit_Context_Context begin ] stop
 */



	
	/**
	 * [Implicit_Context_Regex begin ] start
	 */

	

	
		
		ok_Hash.put("Implicit_Context_Regex", false);
		start_Hash.put("Implicit_Context_Regex", System.currentTimeMillis());
		
	
		currentVirtualComponent = "Implicit_Context_Regex";
	
	currentComponent="Implicit_Context_Regex";

	
		int tos_count_Implicit_Context_Regex = 0;
		
                if(log.isDebugEnabled())
            log.debug("Implicit_Context_Regex - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_Implicit_Context_Regex{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_Implicit_Context_Regex = new StringBuilder();
                    log4jParamters_Implicit_Context_Regex.append("Parameters:");
                            log4jParamters_Implicit_Context_Regex.append("FILENAME" + " = " + "context.CONTEXT_FILE_PATH");
                        log4jParamters_Implicit_Context_Regex.append(" | ");
                            log4jParamters_Implicit_Context_Regex.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_Implicit_Context_Regex.append(" | ");
                            log4jParamters_Implicit_Context_Regex.append("REGEX" + " = " + "\"^([^\"+\"\\\\|\"+\"]*)\"+\"\\\\|\"+\"(.*)$\"");
                        log4jParamters_Implicit_Context_Regex.append(" | ");
                            log4jParamters_Implicit_Context_Regex.append("HEADER" + " = " + "0");
                        log4jParamters_Implicit_Context_Regex.append(" | ");
                            log4jParamters_Implicit_Context_Regex.append("FOOTER" + " = " + "0");
                        log4jParamters_Implicit_Context_Regex.append(" | ");
                            log4jParamters_Implicit_Context_Regex.append("LIMIT" + " = " + "");
                        log4jParamters_Implicit_Context_Regex.append(" | ");
                            log4jParamters_Implicit_Context_Regex.append("IGNORE_ERROR_MESSAGE" + " = " + "true");
                        log4jParamters_Implicit_Context_Regex.append(" | ");
                            log4jParamters_Implicit_Context_Regex.append("REMOVE_EMPTY_ROW" + " = " + "true");
                        log4jParamters_Implicit_Context_Regex.append(" | ");
                            log4jParamters_Implicit_Context_Regex.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_Implicit_Context_Regex.append(" | ");
                            log4jParamters_Implicit_Context_Regex.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_Implicit_Context_Regex.append(" | ");
                if(log.isDebugEnabled())
            log.debug("Implicit_Context_Regex - "  + (log4jParamters_Implicit_Context_Regex) );
                    } 
                } 
            new BytesLimit65535_Implicit_Context_Regex().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("Implicit_Context_Regex", "Implicit_Context_Regex", "tFileInputRegex");
				talendJobLogProcess(globalMap);
			}
			

	
	
				final StringBuffer log4jSb_Implicit_Context_Regex = new StringBuffer();
			
		int nb_line_Implicit_Context_Regex = 0;
        
        int footer_Implicit_Context_Regex  = 0;
        boolean removeEmptyRowImplicit_Context_Regex = true;
        Object source_Implicit_Context_Regex = /** Start field Implicit_Context_Regex:FILENAME */context.CONTEXT_FILE_PATH/** End field Implicit_Context_Regex:FILENAME */;
        
        org.talend.fileprocess.TOSDelimitedReader inImplicit_Context_Regex=null;
        if(source_Implicit_Context_Regex instanceof String || source_Implicit_Context_Regex instanceof java.io.InputStream){
        	inImplicit_Context_Regex = new org.talend.fileprocess.TOSDelimitedReader(/** Start field Implicit_Context_Regex:FILENAME */context.CONTEXT_FILE_PATH/** End field Implicit_Context_Regex:FILENAME */, "ISO-8859-15", "", "\n", removeEmptyRowImplicit_Context_Regex);
        }else{
        	throw new java.lang.Exception("The source data should be specified as File Path or InputStream or java.io.Reader!");
        }
        String strImplicit_Context_Regex;
        int totalLineImplicit_Context_Regex=0,currentLineImplicit_Context_Regex=0,beginLineImplicit_Context_Regex=0,lastLineImplicit_Context_Regex=-1,validRowCountImplicit_Context_Regex=0;
        int limitImplicit_Context_Regex=-1;
        
		int headerImplicit_Context_Regex = 0;
		if(headerImplicit_Context_Regex > 0){
			beginLineImplicit_Context_Regex=headerImplicit_Context_Regex+1;
		}
    	
        if(footer_Implicit_Context_Regex > 0){
			while (inImplicit_Context_Regex.readRecord()) {
                strImplicit_Context_Regex =inImplicit_Context_Regex.getRowRecord();        
				totalLineImplicit_Context_Regex++;
			}
			int lastLineTempImplicit_Context_Regex = totalLineImplicit_Context_Regex - footer_Implicit_Context_Regex   < 0? 0 : totalLineImplicit_Context_Regex - footer_Implicit_Context_Regex ;
			if(lastLineImplicit_Context_Regex > 0){
				lastLineImplicit_Context_Regex = lastLineImplicit_Context_Regex < lastLineTempImplicit_Context_Regex ? lastLineImplicit_Context_Regex : lastLineTempImplicit_Context_Regex; 
			}else {
				lastLineImplicit_Context_Regex = lastLineTempImplicit_Context_Regex;
			}
		  	inImplicit_Context_Regex.close();
        	inImplicit_Context_Regex = new org.talend.fileprocess.TOSDelimitedReader(/** Start field Implicit_Context_Regex:FILENAME */context.CONTEXT_FILE_PATH/** End field Implicit_Context_Regex:FILENAME */, "ISO-8859-15", "", "\n", removeEmptyRowImplicit_Context_Regex);
		}
        java.util.StringTokenizer strTokenImplicit_Context_Regex;
        java.util.regex.Pattern patternImplicit_Context_Regex = java.util.regex.Pattern.compile("^([^"+"\\|"+"]*)"+"\\|"+"(.*)$");
        java.util.regex.Matcher matcherImplicit_Context_Regex = null;
        
				log.debug("Implicit_Context_Regex - Retrieving records from the datasource.");
			
        
        while (inImplicit_Context_Regex.readRecord()) {
            strImplicit_Context_Regex =inImplicit_Context_Regex.getRowRecord(); 
        	
       		currentLineImplicit_Context_Regex++;
        	if(currentLineImplicit_Context_Regex < beginLineImplicit_Context_Regex) {
        		continue;
        	}
        	if(lastLineImplicit_Context_Regex > -1 && currentLineImplicit_Context_Regex > lastLineImplicit_Context_Regex) {
        		break;
        	}
        	if(removeEmptyRowImplicit_Context_Regex && ("").equals(strImplicit_Context_Regex)){
        		continue;
        	}
        	if(limitImplicit_Context_Regex!=-1&& validRowCountImplicit_Context_Regex >= limitImplicit_Context_Regex){
        		break;
        	}
        	
        	matcherImplicit_Context_Regex = patternImplicit_Context_Regex.matcher(strImplicit_Context_Regex);
        	int groupCountImplicit_Context_Regex = 0;
        	boolean isMatchImplicit_Context_Regex = matcherImplicit_Context_Regex.find(); 
        	if(isMatchImplicit_Context_Regex){
        	groupCountImplicit_Context_Regex=matcherImplicit_Context_Regex.groupCount();
			}
    		row_Implicit_Context_Regex = null;						
			
			boolean lineIsEmptyImplicit_Context_Regex = strImplicit_Context_Regex.length() == 0;
			
			String[] valueImplicit_Context_Regex = new String[2];
			String frontCharImplicit_Context_Regex,behindCharImplicit_Context_Regex;
			for(int i=0;i<2;i++){
				valueImplicit_Context_Regex[i] = "";
				if(lineIsEmptyImplicit_Context_Regex){
					continue;
				}
				if(i < groupCountImplicit_Context_Regex){
					valueImplicit_Context_Regex[i] = matcherImplicit_Context_Regex.group(i+1);
				}
			}
			validRowCountImplicit_Context_Regex++;
			
			boolean whetherReject_Implicit_Context_Regex = false;
			row_Implicit_Context_Regex = new row_Implicit_Context_RegexStruct();
			try {			
			if(!isMatchImplicit_Context_Regex){//line data not matched with given regex parameter
        		throw new java.lang.Exception("Line doesn't match: " + strImplicit_Context_Regex);
        	}
								
						if(valueImplicit_Context_Regex[0]!=null && valueImplicit_Context_Regex[0].length() > 0) {
							row_Implicit_Context_Regex.key = valueImplicit_Context_Regex[0];					
						} else {
						row_Implicit_Context_Regex.key = "";}
						
						if(valueImplicit_Context_Regex[1]!=null && valueImplicit_Context_Regex[1].length() > 0) {
							row_Implicit_Context_Regex.value = valueImplicit_Context_Regex[1];					
						} else {
						row_Implicit_Context_Regex.value = "";}
	
				log.debug("Implicit_Context_Regex - Retrieving the record " + (nb_line_Implicit_Context_Regex+1) + ".");
			
										
					
    } catch (java.lang.Exception e) {
globalMap.put("Implicit_Context_Regex_ERROR_MESSAGE",e.getMessage());
        whetherReject_Implicit_Context_Regex = true;
                row_Implicit_Context_Regex = null;
    }					
					
					
			
			nb_line_Implicit_Context_Regex++;

 



/**
 * [Implicit_Context_Regex begin ] stop
 */
	
	/**
	 * [Implicit_Context_Regex main ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Regex";
	
	currentComponent="Implicit_Context_Regex";

	

 


	tos_count_Implicit_Context_Regex++;

/**
 * [Implicit_Context_Regex main ] stop
 */
	
	/**
	 * [Implicit_Context_Regex process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Regex";
	
	currentComponent="Implicit_Context_Regex";

	

 



/**
 * [Implicit_Context_Regex process_data_begin ] stop
 */
// Start of branch "row_Implicit_Context_Regex"
if(row_Implicit_Context_Regex != null) { 



	
	/**
	 * [Implicit_Context_Context main ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"Main","Implicit_Context_Regex","Implicit_Context_Regex","tFileInputRegex","Implicit_Context_Context","Implicit_Context_Context","tContextLoad"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
        //////////////////////////
        String tmp_key_Implicit_Context_Context = null;
                    String key_Implicit_Context_Context = null;
                      if (row_Implicit_Context_Regex.key != null){
                          tmp_key_Implicit_Context_Context = row_Implicit_Context_Regex.key.trim();
                        if ((tmp_key_Implicit_Context_Context.startsWith("#") || tmp_key_Implicit_Context_Context.startsWith("!") )){
                          tmp_key_Implicit_Context_Context = null;
                        } else {
                          row_Implicit_Context_Regex.key = tmp_key_Implicit_Context_Context;
                        }
                      }
                        if(row_Implicit_Context_Regex.key != null) {
                    key_Implicit_Context_Context =
                        row_Implicit_Context_Regex.key;
                        }
                    String value_Implicit_Context_Context = null;
                        if(row_Implicit_Context_Regex.value != null) {
                    value_Implicit_Context_Context =
                        row_Implicit_Context_Regex.value;
                        }
				
				String currentValue_Implicit_Context_Context = value_Implicit_Context_Context;
										
						if ((key_Implicit_Context_Context != null) && ("CONTEXT_ADR7_PASSWORD".equals(key_Implicit_Context_Context)) ) currentValue_Implicit_Context_Context = currentValue_Implicit_Context_Context.replaceAll(".", "*");

  if (tmp_key_Implicit_Context_Context != null){
  try{
        if(key_Implicit_Context_Context!=null && "CONTEXT_ADR7_ADDITIONAL_PARAMETERS".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ADR7_ADDITIONAL_PARAMETERS=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ADR7_DATABASE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ADR7_DATABASE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ADR7_LOGIN".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ADR7_LOGIN=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ADR7_PASSWORD".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ADR7_PASSWORD=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ADR7_SERVER".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ADR7_SERVER=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "ADR4_OK_CHECK".equals(key_Implicit_Context_Context))
        {
           context.ADR4_OK_CHECK=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "ADR7_OK_CHECK".equals(key_Implicit_Context_Context))
        {
           context.ADR7_OK_CHECK=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "ALLOW_IT777P_INSERT".equals(key_Implicit_Context_Context))
        {
           context.ALLOW_IT777P_INSERT=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "ALLOW_ITEM_DESCRIPTION_UPDATE".equals(key_Implicit_Context_Context))
        {
           context.ALLOW_ITEM_DESCRIPTION_UPDATE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "ALLOW_SHIP_SUB_FLOW".equals(key_Implicit_Context_Context))
        {
           context.ALLOW_SHIP_SUB_FLOW=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "ARTICLE_NUMBER".equals(key_Implicit_Context_Context))
        {
           context.ARTICLE_NUMBER=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "Article_Transformation_Error_Codes".equals(key_Implicit_Context_Context))
        {
           context.Article_Transformation_Error_Codes=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ADR7_BRAND_ID_FILE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ADR7_BRAND_ID_FILE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ADR7_SUB_DEP_FILE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ADR7_SUB_DEP_FILE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ARTICLE_XREF".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ARTICLE_XREF=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_BACKFEED_SEQ_NBR".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_BACKFEED_SEQ_NBR=new BigDecimal (value_Implicit_Context_Context);
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_BASIC_IND_UPD_OPSTUDY".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_BASIC_IND_UPD_OPSTUDY=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_CHECKPOINT_FILE_NAME".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_CHECKPOINT_FILE_NAME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_COLOR_CODE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_COLOR_CODE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_CUTOFF_TIME_MIN".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_CUTOFF_TIME_MIN=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_DC_SERVICING_IND_FILE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_DC_SERVICING_IND_FILE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_DELETE_VOL_LIMIT".equals(key_Implicit_Context_Context))
        {

                context.CONTEXT_DELETE_VOL_LIMIT=Integer.parseInt(value_Implicit_Context_Context);

        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_DELTA_VOL_LIMIT".equals(key_Implicit_Context_Context))
        {

                context.CONTEXT_DELTA_VOL_LIMIT=Integer.parseInt(value_Implicit_Context_Context);

        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_DELTA_VOL_TARGET".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_DELTA_VOL_TARGET=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ERR_REPORT".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ERR_REPORT=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_ARCHIVE_FILE_PATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_ARCHIVE_FILE_PATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_BSCONFIG_FILE_EXTENSION".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_BSCONFIG_FILE_EXTENSION=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_CSV_FILE_EXTENSION".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_CSV_FILE_EXTENSION=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_ENCODING".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_ENCODING=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_EXCEL_FILE_EXTENSION".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_EXCEL_FILE_EXTENSION=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_GROUPEMAILID_FROM".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_GROUPEMAILID_FROM=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_GROUPEMAILID_SMTP_HOST".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_GROUPEMAILID_SMTP_HOST=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_GROUPEMAILID_SMTP_PORT".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_GROUPEMAILID_SMTP_PORT=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_GROUPEMAILID_TO".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_GROUPEMAILID_TO=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_INPUT_FILE_EXTENSION".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_INPUT_FILE_EXTENSION=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_INPUT_ORG_PATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_INPUT_ORG_PATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_INPUT_PATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_INPUT_PATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_INTM_FIELD_SEPARATOR".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_INTM_FIELD_SEPARATOR=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_INTM_FILE_ENCODING".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_INTM_FILE_ENCODING=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_INTM_FILE_EXTENSION".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_INTM_FILE_EXTENSION=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_INTM_FILE_PATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_INTM_FILE_PATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_JOB_NAME".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_JOB_NAME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_LOG_FILE_NAME".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_LOG_FILE_NAME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_LOG_FILE_PATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_LOG_FILE_PATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_LOG_PATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_LOG_PATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_OUTPUT_FILE_ENCODING".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_OUTPUT_FILE_ENCODING=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_OUTPUT_FILE_EXTENSION".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_OUTPUT_FILE_EXTENSION=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_OUTPUT_FILE_PATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_OUTPUT_FILE_PATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_REJECT_FILE_PATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_REJECT_FILE_PATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_TARGET_FILE_PATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_TARGET_FILE_PATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_TEAM_NAME".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_TEAM_NAME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ETL_XREF_JOB_NAME".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ETL_XREF_JOB_NAME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_EXCEPTION_FLAG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_EXCEPTION_FLAG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_EXISTING_CASE_GTIN".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_EXISTING_CASE_GTIN=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_EXISTING_UPC_LIST".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_EXISTING_UPC_LIST=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_FILE_PATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_FILE_PATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_GA072P_ENABLE_FLAG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_GA072P_ENABLE_FLAG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_HALLMARK_PERSISTENT_FILE_NAME".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_HALLMARK_PERSISTENT_FILE_NAME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_IT028P_SOM_ITEMLIST".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_IT028P_SOM_ITEMLIST=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_KEYSTOREPWD".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_KEYSTOREPWD=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_LEGACY_SAP_CNTRY_MAPPING".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_LEGACY_SAP_CNTRY_MAPPING=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_LEGAL_UOM_XREF".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_LEGAL_UOM_XREF=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_LISTING_TYPE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_LISTING_TYPE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_ADDITIONALSEG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_ADDITIONALSEG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_BASIC_EXTENSION".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_BASIC_EXTENSION=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_BOMMAT".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_BOMMAT=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_DR_DESC".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_DR_DESC=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_EXTRACTSEG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_EXTRACTSEG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_GTIN_UPC_REL".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_GTIN_UPC_REL=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_HIERARCHYNODE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_HIERARCHYNODE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_HTSCLASS".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_HTSCLASS=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_LEGACY_ITEM".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_LEGACY_ITEM=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_LEGACY_ITEM_VENDOR".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_LEGACY_ITEM_VENDOR=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_LEGACYSEG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_LEGACYSEG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_LEGALUOM".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_LEGALUOM=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_MAIN_ARTICLE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_MAIN_ARTICLE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_MAMSEG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_MAMSEG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_MARASEG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_MARASEG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_MARMSEG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_MARMSEG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_MATDESC".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_MATDESC=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_MAW_SEG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_MAW_SEG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_MAWSEG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_MAWSEG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_MEANSEG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_MEANSEG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_MLEASEG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_MLEASEG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_MVKERT".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_MVKERT=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_PURSUB".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_PURSUB=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_SEASONCODE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_SEASONCODE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_SHIPSUB".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_SHIPSUB=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_VARIANT_ARTICLE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_VARIANT_ARTICLE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_WLK2EXTRTSEG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_WLK2EXTRTSEG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MARA_WLK2SEG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MARA_WLK2SEG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MDM_KEYSTORE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MDM_KEYSTORE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MDM_TRUSTSTORE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MDM_TRUSTSTORE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MISSING_UPC_EMAIL_TO".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MISSING_UPC_EMAIL_TO=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MISSING_UPC_REPLY_TO".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MISSING_UPC_REPLY_TO=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_MYLAR_MERCH_OPSTUDY".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_MYLAR_MERCH_OPSTUDY=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_NEW_UOM_WIC_REQ_FLAG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_NEW_UOM_WIC_REQ_FLAG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_OB_CLR_PERSISTENT_FILE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_OB_CLR_PERSISTENT_FILE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_OB_CLR_XREF".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_OB_CLR_XREF=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_ORMD_IND".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_ORMD_IND=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PARKING_EXCEPT_LIST".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PARKING_EXCEPT_LIST=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_ADR4_MD039P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_ADR4_MD039P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT002P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT002P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT007P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT007P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT008P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT008P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT011P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT011P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT015P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT015P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT029P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT029P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT088P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT088P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT107P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT107P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT108P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT108P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT185P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT185P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT186P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT186P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT282P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT282P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT402P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT402P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT517P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT517P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT839P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT839P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_IT981P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_IT981P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_MD039P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_MD039P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_MD041P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_MD041P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_MD041P_ADR4".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_MD041P_ADR4=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PIR_PARKED_MD639P".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PIR_PARKED_MD639P=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PLN_MERGE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PLN_MERGE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PLN_SM_TRACKING_FILE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PLN_SM_TRACKING_FILE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_PLN_SPLIT".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_PLN_SPLIT=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_QUICKWIC_ARTICLE_STATUS".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_QUICKWIC_ARTICLE_STATUS=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RACK_MYLAR".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RACK_MYLAR=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RT_CONTROL_FOLDER".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RT_CONTROL_FOLDER=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RT_R4B_PARKED_PIR_FILEPATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RT_R4B_PARKED_PIR_FILEPATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RT_R4B_PARKED_XREF_FILEPATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RT_R4B_PARKED_XREF_FILEPATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RT_RNWL_HOME".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RT_RNWL_HOME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RT_SOURCE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RT_SOURCE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RT_TRACK".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RT_TRACK=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RT_TRACK_DYNAMIC".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RT_TRACK_DYNAMIC=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RT_TRACK_LOAD".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RT_TRACK_LOAD=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RT_TRACK_SAG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RT_TRACK_SAG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RT_TRACK_STATIC".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RT_TRACK_STATIC=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RT_TRACK_XREF".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RT_TRACK_XREF=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_RT_TRACK_XREF_UPDATE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_RT_TRACK_XREF_UPDATE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAG_EXTRACT_JOB_NAME".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAG_EXTRACT_JOB_NAME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAG_EXTRACT_LOG_FILE_NAME".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAG_EXTRACT_LOG_FILE_NAME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAP_LEGACY_UOM_XREF".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAP_LEGACY_UOM_XREF=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SAP_XREF_FOLDER_NAME".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SAP_XREF_FOLDER_NAME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SEASON_CODE_EXCEPTION_TO".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SEASON_CODE_EXCEPTION_TO=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SEASON_DEFAULT_VALUE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SEASON_DEFAULT_VALUE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SEASONCODE_EXCEL".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SEASONCODE_EXCEL=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SIGNAL_FILE_PATH".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SIGNAL_FILE_PATH=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SITE_XREF".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SITE_XREF=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_SOURCE_ARTICLE_FOLDER_NAME".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_SOURCE_ARTICLE_FOLDER_NAME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_STIBO_CF_PERSISTENT_FILE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_STIBO_CF_PERSISTENT_FILE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_STIBO_PERSISTENT_FILE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_STIBO_PERSISTENT_FILE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_STIBO_SOM_PERSISTENT_FILE".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_STIBO_SOM_PERSISTENT_FILE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_TALEND_ARTICLE_XREF".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_TALEND_ARTICLE_XREF=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_TALEND_VENDOR_XREF".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_TALEND_VENDOR_XREF=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_TEMP_CONTROL".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_TEMP_CONTROL=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_TEMP_MERCH_OPSTUDY".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_TEMP_MERCH_OPSTUDY=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_TRUSTSTOREPWD".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_TRUSTSTOREPWD=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_UPC_DELETE_FLAG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_UPC_DELETE_FLAG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_VALID_ARTTYPE_STIBOCHECK".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_VALID_ARTTYPE_STIBOCHECK=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_VALID_ITEMS_LOAD_ADR4".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_VALID_ITEMS_LOAD_ADR4=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_VALID_ITEMS_LOAD_ADR7".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_VALID_ITEMS_LOAD_ADR7=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_VALIDATION_REP_FROM".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_VALIDATION_REP_FROM=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_VALIDATION_REP_TO".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_VALIDATION_REP_TO=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_VALIDATION_REPORTNAME".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_VALIDATION_REPORTNAME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_VENDOR_VOG".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_VENDOR_VOG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CONTEXT_VENDOR_XREF".equals(key_Implicit_Context_Context))
        {
           context.CONTEXT_VENDOR_XREF=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "CURR_DT".equals(key_Implicit_Context_Context))
        {
           context.CURR_DT=new BigDecimal (value_Implicit_Context_Context);
        }

        if(key_Implicit_Context_Context!=null && "JMS_ARTICLE_QUEUE_INPUT_FILE_NAME".equals(key_Implicit_Context_Context))
        {
           context.JMS_ARTICLE_QUEUE_INPUT_FILE_NAME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM".equals(key_Implicit_Context_Context))
        {
           context.JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "JMS_ARTICLE_QUEUE_MESSAGE_COUNT".equals(key_Implicit_Context_Context))
        {
           context.JMS_ARTICLE_QUEUE_MESSAGE_COUNT=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "NewWIC".equals(key_Implicit_Context_Context))
        {
           context.NewWIC=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "OB_CLR_XREF_TARGET".equals(key_Implicit_Context_Context))
        {
           context.OB_CLR_XREF_TARGET=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "PROCESS_CATEGORY".equals(key_Implicit_Context_Context))
        {
           context.PROCESS_CATEGORY=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "PROCESSED_FLAG".equals(key_Implicit_Context_Context))
        {
           context.PROCESSED_FLAG=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "PROGRAM_LIB_NAME".equals(key_Implicit_Context_Context))
        {
           context.PROGRAM_LIB_NAME=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "RUN_DAY".equals(key_Implicit_Context_Context))
        {
           context.RUN_DAY=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "SAF_OVERRIDE_FILE".equals(key_Implicit_Context_Context))
        {
           context.SAF_OVERRIDE_FILE=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "SHIP_SUB_OPSTUDY".equals(key_Implicit_Context_Context))
        {
           context.SHIP_SUB_OPSTUDY=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "UOM".equals(key_Implicit_Context_Context))
        {
           context.UOM=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "UPC".equals(key_Implicit_Context_Context))
        {
           context.UPC=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "UPC_LENGTH_DIGIT".equals(key_Implicit_Context_Context))
        {

                context.UPC_LENGTH_DIGIT=Integer.parseInt(value_Implicit_Context_Context);

        }

        if(key_Implicit_Context_Context!=null && "USER_STAMP".equals(key_Implicit_Context_Context))
        {
           context.USER_STAMP=value_Implicit_Context_Context;
        }

        if(key_Implicit_Context_Context!=null && "WICRequiredFlag".equals(key_Implicit_Context_Context))
        {
           context.WICRequiredFlag=value_Implicit_Context_Context;
        }


        if (context.getProperty(key_Implicit_Context_Context)!=null)
        {
            assignList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }else  {
            newPropertyList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }
        if(value_Implicit_Context_Context == null){
            context.setProperty(key_Implicit_Context_Context, "");
        }else{
            context.setProperty(key_Implicit_Context_Context,value_Implicit_Context_Context);
        }
    }catch(java.lang.Exception e){
globalMap.put("Implicit_Context_Context_ERROR_MESSAGE",e.getMessage());
            log.error("Implicit_Context_Context - Setting a value for the key \"" + key_Implicit_Context_Context + "\" has failed. Error message: " + e.getMessage());
        System.err.println("Setting a value for the key \"" + key_Implicit_Context_Context + "\" has failed. Error message: " + e.getMessage());
    }
        nb_line_Implicit_Context_Context++;
    }
        //////////////////////////

 


	tos_count_Implicit_Context_Context++;

/**
 * [Implicit_Context_Context main ] stop
 */
	
	/**
	 * [Implicit_Context_Context process_data_begin ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	

 



/**
 * [Implicit_Context_Context process_data_begin ] stop
 */
	
	/**
	 * [Implicit_Context_Context process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	

 



/**
 * [Implicit_Context_Context process_data_end ] stop
 */

} // End of branch "row_Implicit_Context_Regex"




	
	/**
	 * [Implicit_Context_Regex process_data_end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Regex";
	
	currentComponent="Implicit_Context_Regex";

	

 



/**
 * [Implicit_Context_Regex process_data_end ] stop
 */
	
	/**
	 * [Implicit_Context_Regex end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Regex";
	
	currentComponent="Implicit_Context_Regex";

	

	
	
    		}
			if(!(source_Implicit_Context_Regex instanceof java.io.InputStream)){
            	inImplicit_Context_Regex.close();
            }
            inImplicit_Context_Regex = null;
            globalMap.put("Implicit_Context_Regex_NB_LINE",nb_line_Implicit_Context_Regex);
				log.debug("Implicit_Context_Regex - Retrieved records count: "+ nb_line_Implicit_Context_Regex + " .");
			      
 
                if(log.isDebugEnabled())
            log.debug("Implicit_Context_Regex - "  + ("Done.") );

ok_Hash.put("Implicit_Context_Regex", true);
end_Hash.put("Implicit_Context_Regex", System.currentTimeMillis());




/**
 * [Implicit_Context_Regex end ] stop
 */

	
	/**
	 * [Implicit_Context_Context end ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	
	
	java.util.Enumeration<?> enu_Implicit_Context_Context = context.propertyNames();
    while(enu_Implicit_Context_Context.hasMoreElements())
    {           
    	String key_Implicit_Context_Context = (String)enu_Implicit_Context_Context.nextElement();
        if(!assignList_Implicit_Context_Context.contains(key_Implicit_Context_Context) && !newPropertyList_Implicit_Context_Context.contains(key_Implicit_Context_Context))
        {
            noAssignList_Implicit_Context_Context.add(key_Implicit_Context_Context);
        }          
    }
	for(Object obj_Implicit_Context_Context :newPropertyList_Implicit_Context_Context){
		
			String newLog_Implicit_Context_Context = "Implicit_Context_Context: Parameter \"" + obj_Implicit_Context_Context + "\" is a new parameter of Implicit_Context_Context";
			
				log.warn(newLog_Implicit_Context_Context);
			
		
		System.out.println("Warning: Parameter \"" + obj_Implicit_Context_Context + "\" is a new parameter of Implicit_Context_Context");        
	}
	for(Object obj_Implicit_Context_Context :noAssignList_Implicit_Context_Context){
		
			String oldLog_Implicit_Context_Context = "Implicit_Context_Context: Parameter \"" + obj_Implicit_Context_Context + "\" has not been set by Implicit_Context_Context";
			
				log.warn(oldLog_Implicit_Context_Context);
			
		
		System.out.println("Warning: Parameter \"" + obj_Implicit_Context_Context + "\" has not been set by Implicit_Context_Context");
		
	} 

    String newPropertyStr_Implicit_Context_Context = newPropertyList_Implicit_Context_Context.toString();
    String newProperty_Implicit_Context_Context = newPropertyStr_Implicit_Context_Context.substring(1, newPropertyStr_Implicit_Context_Context.length() - 1);
    
    String noAssignStr_Implicit_Context_Context = noAssignList_Implicit_Context_Context.toString();
    String noAssign_Implicit_Context_Context = noAssignStr_Implicit_Context_Context.substring(1, noAssignStr_Implicit_Context_Context.length() - 1);
    
    globalMap.put("Implicit_Context_Context_KEY_NOT_INCONTEXT", newProperty_Implicit_Context_Context);
    globalMap.put("Implicit_Context_Context_KEY_NOT_LOADED", noAssign_Implicit_Context_Context);

    globalMap.put("Implicit_Context_Context_NB_LINE",nb_line_Implicit_Context_Context);

	List<String> parametersToEncrypt_Implicit_Context_Context = new java.util.ArrayList<String>();
	
		parametersToEncrypt_Implicit_Context_Context.add("CONTEXT_ADR7_PASSWORD");
		
	
	resumeUtil.addLog("NODE", "NODE:Implicit_Context_Context", "", Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt_Implicit_Context_Context));    
    	log.info("Implicit_Context_Context - Loaded contexts count: " + nb_line_Implicit_Context_Context + ".");
    
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Main",2,0,
			 			"Implicit_Context_Regex","Implicit_Context_Regex","tFileInputRegex","Implicit_Context_Context","Implicit_Context_Context","tContextLoad","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("Implicit_Context_Context - "  + ("Done.") );

ok_Hash.put("Implicit_Context_Context", true);
end_Hash.put("Implicit_Context_Context", System.currentTimeMillis());




/**
 * [Implicit_Context_Context end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
					te.setVirtualComponentName(currentVirtualComponent);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [Implicit_Context_Regex finally ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Regex";
	
	currentComponent="Implicit_Context_Regex";

	

 



/**
 * [Implicit_Context_Regex finally ] stop
 */

	
	/**
	 * [Implicit_Context_Context finally ] start
	 */

	

	
	
		currentVirtualComponent = "Implicit_Context_Context";
	
	currentComponent="Implicit_Context_Context";

	

 



/**
 * [Implicit_Context_Context finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("Implicit_Context_Regex_SUBPROCESS_STATE", 1);
	}
	

public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPrejob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_1", false);
		start_Hash.put("tPrejob_1", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_1";

	
		int tos_count_tPrejob_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPrejob_1", "tPrejob_1", "tPrejob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPrejob_1 begin ] stop
 */
	
	/**
	 * [tPrejob_1 main ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 


	tos_count_tPrejob_1++;

/**
 * [tPrejob_1 main ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_1 end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 

ok_Hash.put("tPrejob_1", true);
end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk1", 0, "ok");
				}
				tFileInputDelimited_1Process(globalMap);



/**
 * [tPrejob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPrejob_1 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
	}
	


public static class row26Struct implements routines.system.IPersistableRow<row26Struct> {
    final static byte[] commonByteArrayLock_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[0];
    static byte[] commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[0];

	
			    public String key;

				public String getKey () {
					return this.key;
				}
				
			    public String value;

				public String getValue () {
					return this.value;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job.length) {
				if(length < 1024 && commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job.length == 0) {
   					commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[1024];
				} else {
   					commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job, 0, length);
			strReturn = new String(commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job) {

        	try {

        		int length = 0;
		
					this.key = readString(dis);
					
					this.value = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("key="+key);
		sb.append(",value="+value);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(key == null){
        					sb.append("<null>");
        				}else{
            				sb.append(key);
            			}
            		
        			sb.append("|");
        		
        				if(value == null){
        					sb.append("<null>");
        				}else{
            				sb.append(value);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row26Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tFileInputDelimited_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row26Struct row26 = new row26Struct();




	
	/**
	 * [tContextLoad_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tContextLoad_1", false);
		start_Hash.put("tContextLoad_1", System.currentTimeMillis());
		
	
	currentComponent="tContextLoad_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row26");
			
		int tos_count_tContextLoad_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tContextLoad_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tContextLoad_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tContextLoad_1 = new StringBuilder();
                    log4jParamters_tContextLoad_1.append("Parameters:");
                            log4jParamters_tContextLoad_1.append("LOAD_NEW_VARIABLE" + " = " + "Warning");
                        log4jParamters_tContextLoad_1.append(" | ");
                            log4jParamters_tContextLoad_1.append("NOT_LOAD_OLD_VARIABLE" + " = " + "Warning");
                        log4jParamters_tContextLoad_1.append(" | ");
                            log4jParamters_tContextLoad_1.append("PRINT_OPERATIONS" + " = " + "false");
                        log4jParamters_tContextLoad_1.append(" | ");
                            log4jParamters_tContextLoad_1.append("DISABLE_ERROR" + " = " + "false");
                        log4jParamters_tContextLoad_1.append(" | ");
                            log4jParamters_tContextLoad_1.append("DISABLE_WARNINGS" + " = " + "true");
                        log4jParamters_tContextLoad_1.append(" | ");
                            log4jParamters_tContextLoad_1.append("DISABLE_INFO" + " = " + "true");
                        log4jParamters_tContextLoad_1.append(" | ");
                            log4jParamters_tContextLoad_1.append("DIEONERROR" + " = " + "false");
                        log4jParamters_tContextLoad_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tContextLoad_1 - "  + (log4jParamters_tContextLoad_1) );
                    } 
                } 
            new BytesLimit65535_tContextLoad_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tContextLoad_1", "tContextLoad_1", "tContextLoad");
				talendJobLogProcess(globalMap);
			}
			
	java.util.List<String> assignList_tContextLoad_1 = new java.util.ArrayList<String>();
	java.util.List<String> newPropertyList_tContextLoad_1 = new java.util.ArrayList<String>();
	java.util.List<String> noAssignList_tContextLoad_1 = new java.util.ArrayList<String>();
	int nb_line_tContextLoad_1 = 0;

 



/**
 * [tContextLoad_1 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_1", false);
		start_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_1";

	
		int tos_count_tFileInputDelimited_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileInputDelimited_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileInputDelimited_1 = new StringBuilder();
                    log4jParamters_tFileInputDelimited_1.append("Parameters:");
                            log4jParamters_tFileInputDelimited_1.append("FILENAME" + " = " + "context.CONTEXT_RT_RNWL_HOME+context.CONTEXT_RT_TRACK_STATIC+context.CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\n\"");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("FIELDSEPARATOR" + " = " + "\"|\"");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("HEADER" + " = " + "0");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("FOOTER" + " = " + "0");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("LIMIT" + " = " + "");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("REMOVE_EMPTY_ROW" + " = " + "true");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("UNCOMPRESS" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("RANDOM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("TRIMALL" + " = " + "true");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("CHECK_FIELDS_NUM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("CHECK_DATE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ENCODING" + " = " + "context.CONTEXT_ETL_INTM_FILE_ENCODING");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("SPLITRECORD" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                            log4jParamters_tFileInputDelimited_1.append("ENABLE_DECODE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_1 - "  + (log4jParamters_tFileInputDelimited_1) );
                    } 
                } 
            new BytesLimit65535_tFileInputDelimited_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileInputDelimited_1", "<b>__UNIQUE_NAME__</b><br>ARD4_ADR7_<br>DB_CONNECTIVITY_FILE", "tFileInputDelimited");
				talendJobLogProcess(globalMap);
			}
			
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_1 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_1 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_1 = null;
				int limit_tFileInputDelimited_1 = -1;
				try{
					
						Object filename_tFileInputDelimited_1 = context.CONTEXT_RT_RNWL_HOME+context.CONTEXT_RT_TRACK_STATIC+context.CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE;
						if(filename_tFileInputDelimited_1 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_1 = 0, random_value_tFileInputDelimited_1 = -1;
			if(footer_value_tFileInputDelimited_1 >0 || random_value_tFileInputDelimited_1 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer and random shouldn't be bigger than 0.");				
			}
		
						}
						try {
							fid_tFileInputDelimited_1 = new org.talend.fileprocess.FileInputDelimited(context.CONTEXT_RT_RNWL_HOME+context.CONTEXT_RT_TRACK_STATIC+context.CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE, context.CONTEXT_ETL_INTM_FILE_ENCODING,"|","\n",true,0,0,
									limit_tFileInputDelimited_1
								,-1, false);
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
							
								
									log.error("tFileInputDelimited_1 - " +e.getMessage());
								
								System.err.println(e.getMessage());
							
						}
					
				    
				    	log.info("tFileInputDelimited_1 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_1!=null && fid_tFileInputDelimited_1.nextRecord()) {
						rowstate_tFileInputDelimited_1.reset();
						
			    						row26 = null;			
												
									boolean whetherReject_tFileInputDelimited_1 = false;
									row26 = new row26Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_1 = 0;
				
					columnIndexWithD_tFileInputDelimited_1 = 0;
					
							row26.key = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1).trim();
						
				
					columnIndexWithD_tFileInputDelimited_1 = 1;
					
							row26.value = fid_tFileInputDelimited_1.get(columnIndexWithD_tFileInputDelimited_1).trim();
						
				
				
										
										if(rowstate_tFileInputDelimited_1.getException()!=null) {
											throw rowstate_tFileInputDelimited_1.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_1_ERROR_MESSAGE",e.getMessage());
			        					whetherReject_tFileInputDelimited_1 = true;
			        					
												log.error("tFileInputDelimited_1 - " +e.getMessage());
											
			                					System.err.println(e.getMessage());
			                					row26 = null;
			                				
										
			    					}
								
			log.debug("tFileInputDelimited_1 - Retrieving the record " + fid_tFileInputDelimited_1.getRowNumber() + ".");
		

 



/**
 * [tFileInputDelimited_1 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 


	tos_count_tFileInputDelimited_1++;

/**
 * [tFileInputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 process_data_begin ] stop
 */
// Start of branch "row26"
if(row26 != null) { 



	
	/**
	 * [tContextLoad_1 main ] start
	 */

	

	
	
	currentComponent="tContextLoad_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row26","tFileInputDelimited_1","<b>__UNIQUE_NAME__</b><br>ARD4_ADR7_<br>DB_CONNECTIVITY_FILE","tFileInputDelimited","tContextLoad_1","tContextLoad_1","tContextLoad"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row26 - " + (row26==null? "": row26.toLogString()));
    			}
    		
        //////////////////////////
        String tmp_key_tContextLoad_1 = null;
                    String key_tContextLoad_1 = null;
                      if (row26.key != null){
                          tmp_key_tContextLoad_1 = row26.key.trim();
                        if ((tmp_key_tContextLoad_1.startsWith("#") || tmp_key_tContextLoad_1.startsWith("!") )){
                          tmp_key_tContextLoad_1 = null;
                        } else {
                          row26.key = tmp_key_tContextLoad_1;
                        }
                      }
                        if(row26.key != null) {
                    key_tContextLoad_1 =
                        row26.key;
                        }
                    String value_tContextLoad_1 = null;
                        if(row26.value != null) {
                    value_tContextLoad_1 =
                        row26.value;
                        }
				
				String currentValue_tContextLoad_1 = value_tContextLoad_1;
										
						if ((key_tContextLoad_1 != null) && ("CONTEXT_ADR7_PASSWORD".equals(key_tContextLoad_1)) ) currentValue_tContextLoad_1 = currentValue_tContextLoad_1.replaceAll(".", "*");

  if (tmp_key_tContextLoad_1 != null){
  try{
        if(key_tContextLoad_1!=null && "CONTEXT_ADR7_ADDITIONAL_PARAMETERS".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ADR7_ADDITIONAL_PARAMETERS=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ADR7_DATABASE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ADR7_DATABASE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ADR7_LOGIN".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ADR7_LOGIN=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ADR7_PASSWORD".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ADR7_PASSWORD=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ADR7_SERVER".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ADR7_SERVER=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ADR4_OK_CHECK".equals(key_tContextLoad_1))
        {
           context.ADR4_OK_CHECK=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ADR7_OK_CHECK".equals(key_tContextLoad_1))
        {
           context.ADR7_OK_CHECK=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ALLOW_IT777P_INSERT".equals(key_tContextLoad_1))
        {
           context.ALLOW_IT777P_INSERT=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ALLOW_ITEM_DESCRIPTION_UPDATE".equals(key_tContextLoad_1))
        {
           context.ALLOW_ITEM_DESCRIPTION_UPDATE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ALLOW_SHIP_SUB_FLOW".equals(key_tContextLoad_1))
        {
           context.ALLOW_SHIP_SUB_FLOW=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "ARTICLE_NUMBER".equals(key_tContextLoad_1))
        {
           context.ARTICLE_NUMBER=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "Article_Transformation_Error_Codes".equals(key_tContextLoad_1))
        {
           context.Article_Transformation_Error_Codes=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ADR7_BRAND_ID_FILE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ADR7_BRAND_ID_FILE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ADR7_SUB_DEP_FILE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ADR7_SUB_DEP_FILE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ARTICLE_XREF".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ARTICLE_XREF=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_BACKFEED_SEQ_NBR".equals(key_tContextLoad_1))
        {
           context.CONTEXT_BACKFEED_SEQ_NBR=new BigDecimal (value_tContextLoad_1);
        }

        if(key_tContextLoad_1!=null && "CONTEXT_BASIC_IND_UPD_OPSTUDY".equals(key_tContextLoad_1))
        {
           context.CONTEXT_BASIC_IND_UPD_OPSTUDY=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA".equals(key_tContextLoad_1))
        {
           context.CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL".equals(key_tContextLoad_1))
        {
           context.CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT".equals(key_tContextLoad_1))
        {
           context.CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_CHECKPOINT_FILE_NAME".equals(key_tContextLoad_1))
        {
           context.CONTEXT_CHECKPOINT_FILE_NAME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_COLOR_CODE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_COLOR_CODE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_CUTOFF_TIME_MIN".equals(key_tContextLoad_1))
        {
           context.CONTEXT_CUTOFF_TIME_MIN=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_DC_SERVICING_IND_FILE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_DC_SERVICING_IND_FILE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_DELETE_VOL_LIMIT".equals(key_tContextLoad_1))
        {

                context.CONTEXT_DELETE_VOL_LIMIT=Integer.parseInt(value_tContextLoad_1);

        }

        if(key_tContextLoad_1!=null && "CONTEXT_DELTA_VOL_LIMIT".equals(key_tContextLoad_1))
        {

                context.CONTEXT_DELTA_VOL_LIMIT=Integer.parseInt(value_tContextLoad_1);

        }

        if(key_tContextLoad_1!=null && "CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO".equals(key_tContextLoad_1))
        {
           context.CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_DELTA_VOL_TARGET".equals(key_tContextLoad_1))
        {
           context.CONTEXT_DELTA_VOL_TARGET=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ERR_REPORT".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ERR_REPORT=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_ARCHIVE_FILE_PATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_ARCHIVE_FILE_PATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_BSCONFIG_FILE_EXTENSION".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_BSCONFIG_FILE_EXTENSION=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_CSV_FILE_EXTENSION".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_CSV_FILE_EXTENSION=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_ENCODING".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_ENCODING=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_EXCEL_FILE_EXTENSION".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_EXCEL_FILE_EXTENSION=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_GROUPEMAILID_FROM".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_GROUPEMAILID_FROM=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_GROUPEMAILID_SMTP_HOST".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_GROUPEMAILID_SMTP_HOST=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_GROUPEMAILID_SMTP_PORT".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_GROUPEMAILID_SMTP_PORT=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_GROUPEMAILID_TO".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_GROUPEMAILID_TO=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_INPUT_FILE_EXTENSION".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_INPUT_FILE_EXTENSION=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_INPUT_ORG_PATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_INPUT_ORG_PATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_INPUT_PATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_INPUT_PATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_INTM_FIELD_SEPARATOR".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_INTM_FIELD_SEPARATOR=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_INTM_FILE_ENCODING".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_INTM_FILE_ENCODING=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_INTM_FILE_EXTENSION".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_INTM_FILE_EXTENSION=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_INTM_FILE_PATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_INTM_FILE_PATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_JOB_NAME".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_JOB_NAME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_LOG_FILE_NAME".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_LOG_FILE_NAME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_LOG_FILE_PATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_LOG_FILE_PATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_LOG_PATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_LOG_PATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_OUTPUT_FILE_ENCODING".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_OUTPUT_FILE_ENCODING=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_OUTPUT_FILE_EXTENSION".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_OUTPUT_FILE_EXTENSION=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_OUTPUT_FILE_PATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_OUTPUT_FILE_PATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_REJECT_FILE_PATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_REJECT_FILE_PATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_TARGET_FILE_PATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_TARGET_FILE_PATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_TEAM_NAME".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_TEAM_NAME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ETL_XREF_JOB_NAME".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ETL_XREF_JOB_NAME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_EXCEPTION_FLAG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_EXCEPTION_FLAG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_EXISTING_CASE_GTIN".equals(key_tContextLoad_1))
        {
           context.CONTEXT_EXISTING_CASE_GTIN=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_EXISTING_UPC_LIST".equals(key_tContextLoad_1))
        {
           context.CONTEXT_EXISTING_UPC_LIST=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_FILE_PATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_FILE_PATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_GA072P_ENABLE_FLAG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_GA072P_ENABLE_FLAG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_HALLMARK_PERSISTENT_FILE_NAME".equals(key_tContextLoad_1))
        {
           context.CONTEXT_HALLMARK_PERSISTENT_FILE_NAME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_IT028P_SOM_ITEMLIST".equals(key_tContextLoad_1))
        {
           context.CONTEXT_IT028P_SOM_ITEMLIST=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_KEYSTOREPWD".equals(key_tContextLoad_1))
        {
           context.CONTEXT_KEYSTOREPWD=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_LEGACY_SAP_CNTRY_MAPPING".equals(key_tContextLoad_1))
        {
           context.CONTEXT_LEGACY_SAP_CNTRY_MAPPING=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_LEGAL_UOM_XREF".equals(key_tContextLoad_1))
        {
           context.CONTEXT_LEGAL_UOM_XREF=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_LISTING_TYPE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_LISTING_TYPE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_ADDITIONALSEG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_ADDITIONALSEG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_BASIC_EXTENSION".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_BASIC_EXTENSION=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_BOMMAT".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_BOMMAT=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_DR_DESC".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_DR_DESC=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_EXTRACTSEG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_EXTRACTSEG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_GTIN_UPC_REL".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_GTIN_UPC_REL=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_HIERARCHYNODE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_HIERARCHYNODE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_HTSCLASS".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_HTSCLASS=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_LEGACY_ITEM".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_LEGACY_ITEM=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_LEGACY_ITEM_VENDOR".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_LEGACY_ITEM_VENDOR=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_LEGACYSEG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_LEGACYSEG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_LEGALUOM".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_LEGALUOM=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_MAIN_ARTICLE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_MAIN_ARTICLE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_MAMSEG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_MAMSEG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_MARASEG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_MARASEG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_MARMSEG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_MARMSEG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_MATDESC".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_MATDESC=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_MAW_SEG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_MAW_SEG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_MAWSEG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_MAWSEG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_MEANSEG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_MEANSEG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_MLEASEG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_MLEASEG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_MVKERT".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_MVKERT=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_PURSUB".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_PURSUB=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_SEASONCODE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_SEASONCODE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_SHIPSUB".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_SHIPSUB=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_VARIANT_ARTICLE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_VARIANT_ARTICLE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_WLK2EXTRTSEG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_WLK2EXTRTSEG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MARA_WLK2SEG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MARA_WLK2SEG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MDM_KEYSTORE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MDM_KEYSTORE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MDM_TRUSTSTORE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MDM_TRUSTSTORE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MISSING_UPC_EMAIL_TO".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MISSING_UPC_EMAIL_TO=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MISSING_UPC_REPLY_TO".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MISSING_UPC_REPLY_TO=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_MYLAR_MERCH_OPSTUDY".equals(key_tContextLoad_1))
        {
           context.CONTEXT_MYLAR_MERCH_OPSTUDY=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_NEW_UOM_WIC_REQ_FLAG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_NEW_UOM_WIC_REQ_FLAG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_OB_CLR_PERSISTENT_FILE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_OB_CLR_PERSISTENT_FILE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_OB_CLR_XREF".equals(key_tContextLoad_1))
        {
           context.CONTEXT_OB_CLR_XREF=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_ORMD_IND".equals(key_tContextLoad_1))
        {
           context.CONTEXT_ORMD_IND=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PARKING_EXCEPT_LIST".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PARKING_EXCEPT_LIST=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_ADR4_MD039P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_ADR4_MD039P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT002P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT002P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT007P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT007P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT008P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT008P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT011P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT011P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT015P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT015P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT029P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT029P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT088P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT088P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT107P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT107P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT108P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT108P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT185P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT185P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT186P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT186P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT282P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT282P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT402P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT402P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT517P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT517P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT839P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT839P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_IT981P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_IT981P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_MD039P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_MD039P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_MD041P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_MD041P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_MD041P_ADR4".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_MD041P_ADR4=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PIR_PARKED_MD639P".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PIR_PARKED_MD639P=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PLN_MERGE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PLN_MERGE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PLN_SM_TRACKING_FILE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PLN_SM_TRACKING_FILE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_PLN_SPLIT".equals(key_tContextLoad_1))
        {
           context.CONTEXT_PLN_SPLIT=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_QUICKWIC_ARTICLE_STATUS".equals(key_tContextLoad_1))
        {
           context.CONTEXT_QUICKWIC_ARTICLE_STATUS=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RACK_MYLAR".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RACK_MYLAR=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RT_CONTROL_FOLDER".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RT_CONTROL_FOLDER=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RT_R4B_PARKED_PIR_FILEPATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RT_R4B_PARKED_PIR_FILEPATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RT_R4B_PARKED_XREF_FILEPATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RT_R4B_PARKED_XREF_FILEPATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RT_RNWL_HOME".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RT_RNWL_HOME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RT_SOURCE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RT_SOURCE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RT_TRACK".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RT_TRACK=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RT_TRACK_DYNAMIC".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RT_TRACK_DYNAMIC=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RT_TRACK_LOAD".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RT_TRACK_LOAD=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RT_TRACK_SAG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RT_TRACK_SAG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RT_TRACK_STATIC".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RT_TRACK_STATIC=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RT_TRACK_XREF".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RT_TRACK_XREF=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_RT_TRACK_XREF_UPDATE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_RT_TRACK_XREF_UPDATE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAG_EXTRACT_JOB_NAME".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAG_EXTRACT_JOB_NAME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAG_EXTRACT_LOG_FILE_NAME".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAG_EXTRACT_LOG_FILE_NAME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAP_LEGACY_UOM_XREF".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAP_LEGACY_UOM_XREF=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SAP_XREF_FOLDER_NAME".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SAP_XREF_FOLDER_NAME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SEASON_CODE_EXCEPTION_TO".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SEASON_CODE_EXCEPTION_TO=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SEASON_DEFAULT_VALUE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SEASON_DEFAULT_VALUE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SEASONCODE_EXCEL".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SEASONCODE_EXCEL=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SIGNAL_FILE_PATH".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SIGNAL_FILE_PATH=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SITE_XREF".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SITE_XREF=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_SOURCE_ARTICLE_FOLDER_NAME".equals(key_tContextLoad_1))
        {
           context.CONTEXT_SOURCE_ARTICLE_FOLDER_NAME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_STIBO_CF_PERSISTENT_FILE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_STIBO_CF_PERSISTENT_FILE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_STIBO_PERSISTENT_FILE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_STIBO_PERSISTENT_FILE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_STIBO_SOM_PERSISTENT_FILE".equals(key_tContextLoad_1))
        {
           context.CONTEXT_STIBO_SOM_PERSISTENT_FILE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_TALEND_ARTICLE_XREF".equals(key_tContextLoad_1))
        {
           context.CONTEXT_TALEND_ARTICLE_XREF=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_TALEND_VENDOR_XREF".equals(key_tContextLoad_1))
        {
           context.CONTEXT_TALEND_VENDOR_XREF=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_TEMP_CONTROL".equals(key_tContextLoad_1))
        {
           context.CONTEXT_TEMP_CONTROL=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_TEMP_MERCH_OPSTUDY".equals(key_tContextLoad_1))
        {
           context.CONTEXT_TEMP_MERCH_OPSTUDY=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_TRUSTSTOREPWD".equals(key_tContextLoad_1))
        {
           context.CONTEXT_TRUSTSTOREPWD=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_UPC_DELETE_FLAG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_UPC_DELETE_FLAG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_VALID_ARTTYPE_STIBOCHECK".equals(key_tContextLoad_1))
        {
           context.CONTEXT_VALID_ARTTYPE_STIBOCHECK=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_VALID_ITEMS_LOAD_ADR4".equals(key_tContextLoad_1))
        {
           context.CONTEXT_VALID_ITEMS_LOAD_ADR4=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_VALID_ITEMS_LOAD_ADR7".equals(key_tContextLoad_1))
        {
           context.CONTEXT_VALID_ITEMS_LOAD_ADR7=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_VALIDATION_REP_FROM".equals(key_tContextLoad_1))
        {
           context.CONTEXT_VALIDATION_REP_FROM=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_VALIDATION_REP_TO".equals(key_tContextLoad_1))
        {
           context.CONTEXT_VALIDATION_REP_TO=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_VALIDATION_REPORTNAME".equals(key_tContextLoad_1))
        {
           context.CONTEXT_VALIDATION_REPORTNAME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_VENDOR_VOG".equals(key_tContextLoad_1))
        {
           context.CONTEXT_VENDOR_VOG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CONTEXT_VENDOR_XREF".equals(key_tContextLoad_1))
        {
           context.CONTEXT_VENDOR_XREF=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "CURR_DT".equals(key_tContextLoad_1))
        {
           context.CURR_DT=new BigDecimal (value_tContextLoad_1);
        }

        if(key_tContextLoad_1!=null && "JMS_ARTICLE_QUEUE_INPUT_FILE_NAME".equals(key_tContextLoad_1))
        {
           context.JMS_ARTICLE_QUEUE_INPUT_FILE_NAME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM".equals(key_tContextLoad_1))
        {
           context.JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "JMS_ARTICLE_QUEUE_MESSAGE_COUNT".equals(key_tContextLoad_1))
        {
           context.JMS_ARTICLE_QUEUE_MESSAGE_COUNT=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "NewWIC".equals(key_tContextLoad_1))
        {
           context.NewWIC=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "OB_CLR_XREF_TARGET".equals(key_tContextLoad_1))
        {
           context.OB_CLR_XREF_TARGET=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "PROCESS_CATEGORY".equals(key_tContextLoad_1))
        {
           context.PROCESS_CATEGORY=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "PROCESSED_FLAG".equals(key_tContextLoad_1))
        {
           context.PROCESSED_FLAG=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "PROGRAM_LIB_NAME".equals(key_tContextLoad_1))
        {
           context.PROGRAM_LIB_NAME=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "RUN_DAY".equals(key_tContextLoad_1))
        {
           context.RUN_DAY=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SAF_OVERRIDE_FILE".equals(key_tContextLoad_1))
        {
           context.SAF_OVERRIDE_FILE=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "SHIP_SUB_OPSTUDY".equals(key_tContextLoad_1))
        {
           context.SHIP_SUB_OPSTUDY=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "UOM".equals(key_tContextLoad_1))
        {
           context.UOM=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "UPC".equals(key_tContextLoad_1))
        {
           context.UPC=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "UPC_LENGTH_DIGIT".equals(key_tContextLoad_1))
        {

                context.UPC_LENGTH_DIGIT=Integer.parseInt(value_tContextLoad_1);

        }

        if(key_tContextLoad_1!=null && "USER_STAMP".equals(key_tContextLoad_1))
        {
           context.USER_STAMP=value_tContextLoad_1;
        }

        if(key_tContextLoad_1!=null && "WICRequiredFlag".equals(key_tContextLoad_1))
        {
           context.WICRequiredFlag=value_tContextLoad_1;
        }


        if (context.getProperty(key_tContextLoad_1)!=null)
        {
            assignList_tContextLoad_1.add(key_tContextLoad_1);
        }else  {
            newPropertyList_tContextLoad_1.add(key_tContextLoad_1);
        }
        if(value_tContextLoad_1 == null){
            context.setProperty(key_tContextLoad_1, "");
        }else{
            context.setProperty(key_tContextLoad_1,value_tContextLoad_1);
        }
    }catch(java.lang.Exception e){
globalMap.put("tContextLoad_1_ERROR_MESSAGE",e.getMessage());
            log.error("tContextLoad_1 - Setting a value for the key \"" + key_tContextLoad_1 + "\" has failed. Error message: " + e.getMessage());
        System.err.println("Setting a value for the key \"" + key_tContextLoad_1 + "\" has failed. Error message: " + e.getMessage());
    }
        nb_line_tContextLoad_1++;
    }
        //////////////////////////

 


	tos_count_tContextLoad_1++;

/**
 * [tContextLoad_1 main ] stop
 */
	
	/**
	 * [tContextLoad_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tContextLoad_1";

	

 



/**
 * [tContextLoad_1 process_data_begin ] stop
 */
	
	/**
	 * [tContextLoad_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tContextLoad_1";

	

 



/**
 * [tContextLoad_1 process_data_end ] stop
 */

} // End of branch "row26"




	
	/**
	 * [tFileInputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	



            }
            }finally{
                if(!((Object)(context.CONTEXT_RT_RNWL_HOME+context.CONTEXT_RT_TRACK_STATIC+context.CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE) instanceof java.io.InputStream)){
                	if(fid_tFileInputDelimited_1!=null){
                		fid_tFileInputDelimited_1.close();
                	}
                }
                if(fid_tFileInputDelimited_1!=null){
                	globalMap.put("tFileInputDelimited_1_NB_LINE", fid_tFileInputDelimited_1.getRowNumber());
					
						log.info("tFileInputDelimited_1 - Retrieved records count: "+ fid_tFileInputDelimited_1.getRowNumber() + ".");
					
                }
			}
			  

 
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_1 - "  + ("Done.") );

ok_Hash.put("tFileInputDelimited_1", true);
end_Hash.put("tFileInputDelimited_1", System.currentTimeMillis());




/**
 * [tFileInputDelimited_1 end ] stop
 */

	
	/**
	 * [tContextLoad_1 end ] start
	 */

	

	
	
	currentComponent="tContextLoad_1";

	
	
	java.util.Enumeration<?> enu_tContextLoad_1 = context.propertyNames();
    while(enu_tContextLoad_1.hasMoreElements())
    {           
    	String key_tContextLoad_1 = (String)enu_tContextLoad_1.nextElement();
        if(!assignList_tContextLoad_1.contains(key_tContextLoad_1) && !newPropertyList_tContextLoad_1.contains(key_tContextLoad_1))
        {
            noAssignList_tContextLoad_1.add(key_tContextLoad_1);
        }          
    } 

    String newPropertyStr_tContextLoad_1 = newPropertyList_tContextLoad_1.toString();
    String newProperty_tContextLoad_1 = newPropertyStr_tContextLoad_1.substring(1, newPropertyStr_tContextLoad_1.length() - 1);
    
    String noAssignStr_tContextLoad_1 = noAssignList_tContextLoad_1.toString();
    String noAssign_tContextLoad_1 = noAssignStr_tContextLoad_1.substring(1, noAssignStr_tContextLoad_1.length() - 1);
    
    globalMap.put("tContextLoad_1_KEY_NOT_INCONTEXT", newProperty_tContextLoad_1);
    globalMap.put("tContextLoad_1_KEY_NOT_LOADED", noAssign_tContextLoad_1);

    globalMap.put("tContextLoad_1_NB_LINE",nb_line_tContextLoad_1);

	List<String> parametersToEncrypt_tContextLoad_1 = new java.util.ArrayList<String>();
	
		parametersToEncrypt_tContextLoad_1.add("CONTEXT_ADR7_PASSWORD");
		
	
	resumeUtil.addLog("NODE", "NODE:tContextLoad_1", "", Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt_tContextLoad_1));    
    	log.info("tContextLoad_1 - Loaded contexts count: " + nb_line_tContextLoad_1 + ".");
    
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row26",2,0,
			 			"tFileInputDelimited_1","<b>__UNIQUE_NAME__</b><br>ARD4_ADR7_<br>DB_CONNECTIVITY_FILE","tFileInputDelimited","tContextLoad_1","tContextLoad_1","tContextLoad","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tContextLoad_1 - "  + ("Done.") );

ok_Hash.put("tContextLoad_1", true);
end_Hash.put("tContextLoad_1", System.currentTimeMillis());




/**
 * [tContextLoad_1 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tFileInputDelimited_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk1", 0, "ok");
								} 
							
							tDBConnection_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileInputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_1";

	

 



/**
 * [tFileInputDelimited_1 finally ] stop
 */

	
	/**
	 * [tContextLoad_1 finally ] start
	 */

	

	
	
	currentComponent="tContextLoad_1";

	

 



/**
 * [tContextLoad_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDBConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBConnection_1", false);
		start_Hash.put("tDBConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tDBConnection_1";

	
		int tos_count_tDBConnection_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBConnection_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBConnection_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBConnection_1 = new StringBuilder();
                    log4jParamters_tDBConnection_1.append("Parameters:");
                            log4jParamters_tDBConnection_1.append("DB_VERSION" + " = " + "jt400_V6R1.jar");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("HOST" + " = " + "context.CONTEXT_ADR7_SERVER");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("DBNAME" + " = " + "context.CONTEXT_ADR7_DATABASE");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("USER" + " = " + "context.CONTEXT_ADR7_LOGIN");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.CONTEXT_ADR7_PASSWORD)).substring(0, 4) + "...");     
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("USE_SHARED_CONNECTION" + " = " + "false");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("PROPERTIES" + " = " + "context.CONTEXT_ADR7_ADDITIONAL_PARAMETERS");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("AUTO_COMMIT" + " = " + "false");
                        log4jParamters_tDBConnection_1.append(" | ");
                            log4jParamters_tDBConnection_1.append("UNIFIED_COMPONENTS" + " = " + "tAS400Connection");
                        log4jParamters_tDBConnection_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBConnection_1 - "  + (log4jParamters_tDBConnection_1) );
                    } 
                } 
            new BytesLimit65535_tDBConnection_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBConnection_1", "<b>__UNIQUE_NAME__</b><br>ADR7_Connection", "tAS400Connection");
				talendJobLogProcess(globalMap);
			}
			
	

	 
    	String url_tDBConnection_1 = "jdbc:as400://" + context.CONTEXT_ADR7_SERVER + "/" + context.CONTEXT_ADR7_DATABASE + ";" + context.CONTEXT_ADR7_ADDITIONAL_PARAMETERS;
	String dbUser_tDBConnection_1 = context.CONTEXT_ADR7_LOGIN;
	
	
		
	final String decryptedPassword_tDBConnection_1 = context.CONTEXT_ADR7_PASSWORD; 
		String dbPwd_tDBConnection_1 = decryptedPassword_tDBConnection_1;
	
	
	java.sql.Connection conn_tDBConnection_1 = null;
	
		
			String driverClass_tDBConnection_1 = "com.ibm.as400.access.AS400JDBCDriver";
			java.lang.Class jdbcclazz_tDBConnection_1 = java.lang.Class.forName(driverClass_tDBConnection_1);
			globalMap.put("driverClass_tDBConnection_1", driverClass_tDBConnection_1);
		
	    		log.debug("tDBConnection_1 - Driver ClassName: "+driverClass_tDBConnection_1+".");
			
	    		log.debug("tDBConnection_1 - Connection attempt to '" + url_tDBConnection_1 + "' with the username '" + dbUser_tDBConnection_1 + "'.");
			
			conn_tDBConnection_1 = java.sql.DriverManager.getConnection(url_tDBConnection_1,dbUser_tDBConnection_1,dbPwd_tDBConnection_1);
	    		log.debug("tDBConnection_1 - Connection to '" + url_tDBConnection_1 + "' has succeeded.");
			

		globalMap.put("conn_tDBConnection_1", conn_tDBConnection_1);
	if (null != conn_tDBConnection_1) {
		
			log.debug("tDBConnection_1 - Connection is set auto commit to 'false'.");
			conn_tDBConnection_1.setAutoCommit(false);
	}

	globalMap.put("conn_" + "tDBConnection_1",conn_tDBConnection_1);

 



/**
 * [tDBConnection_1 begin ] stop
 */
	
	/**
	 * [tDBConnection_1 main ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 


	tos_count_tDBConnection_1++;

/**
 * [tDBConnection_1 main ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tDBConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tDBConnection_1 end ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tDBConnection_1 - "  + ("Done.") );

ok_Hash.put("tDBConnection_1", true);
end_Hash.put("tDBConnection_1", System.currentTimeMillis());




/**
 * [tDBConnection_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tDBConnection_1";

	

 



/**
 * [tDBConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBConnection_1_SUBPROCESS_STATE", 1);
	}
	


public static class row40Struct implements routines.system.IPersistableRow<row40Struct> {
    final static byte[] commonByteArrayLock_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[0];
    static byte[] commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String ITEM_NUMBER;

				public String getITEM_NUMBER () {
					return this.ITEM_NUMBER;
				}
				
			    public String ITEM_NUMBER_CK_DIGIT;

				public String getITEM_NUMBER_CK_DIGIT () {
					return this.ITEM_NUMBER_CK_DIGIT;
				}
				
			    public String MANUFACTURER_NAME;

				public String getMANUFACTURER_NAME () {
					return this.MANUFACTURER_NAME;
				}
				
			    public String MANUFACTURER_STOCK_NBR;

				public String getMANUFACTURER_STOCK_NBR () {
					return this.MANUFACTURER_STOCK_NBR;
				}
				
			    public String PRODUCT_BRAND_NAME;

				public String getPRODUCT_BRAND_NAME () {
					return this.PRODUCT_BRAND_NAME;
				}
				
			    public String PRODUCT_TYPE;

				public String getPRODUCT_TYPE () {
					return this.PRODUCT_TYPE;
				}
				
			    public String ITEM_DESCRIPTION;

				public String getITEM_DESCRIPTION () {
					return this.ITEM_DESCRIPTION;
				}
				
			    public String ITEM_RECEIPT_DESCRIPTION;

				public String getITEM_RECEIPT_DESCRIPTION () {
					return this.ITEM_RECEIPT_DESCRIPTION;
				}
				
			    public String ITEM_MYLAR_DESCRIPTION;

				public String getITEM_MYLAR_DESCRIPTION () {
					return this.ITEM_MYLAR_DESCRIPTION;
				}
				
			    public String ITEM_MYLAR_INDICATOR;

				public String getITEM_MYLAR_INDICATOR () {
					return this.ITEM_MYLAR_INDICATOR;
				}
				
			    public String ITEM_EZ_REF_DESCRIPTION;

				public String getITEM_EZ_REF_DESCRIPTION () {
					return this.ITEM_EZ_REF_DESCRIPTION;
				}
				
			    public String ITEM_SUPPLY_SOURCE;

				public String getITEM_SUPPLY_SOURCE () {
					return this.ITEM_SUPPLY_SOURCE;
				}
				
			    public String UNIT_OF_MEASURE;

				public String getUNIT_OF_MEASURE () {
					return this.UNIT_OF_MEASURE;
				}
				
			    public String ITEM_PURCHASED_CODE;

				public String getITEM_PURCHASED_CODE () {
					return this.ITEM_PURCHASED_CODE;
				}
				
			    public BigDecimal ITEM_QUANTITY_OF_UNIT;

				public BigDecimal getITEM_QUANTITY_OF_UNIT () {
					return this.ITEM_QUANTITY_OF_UNIT;
				}
				
			    public String RETAIL_SELL_UNIT;

				public String getRETAIL_SELL_UNIT () {
					return this.RETAIL_SELL_UNIT;
				}
				
			    public BigDecimal SKUS_PER_RETAIL_UNIT;

				public BigDecimal getSKUS_PER_RETAIL_UNIT () {
					return this.SKUS_PER_RETAIL_UNIT;
				}
				
			    public BigDecimal SKU_CUBE;

				public BigDecimal getSKU_CUBE () {
					return this.SKU_CUBE;
				}
				
			    public BigDecimal SKU_WEIGHT;

				public BigDecimal getSKU_WEIGHT () {
					return this.SKU_WEIGHT;
				}
				
			    public String MERCH_OPSTUDY_NBR;

				public String getMERCH_OPSTUDY_NBR () {
					return this.MERCH_OPSTUDY_NBR;
				}
				
			    public String PROD_CATEG_CODE;

				public String getPROD_CATEG_CODE () {
					return this.PROD_CATEG_CODE;
				}
				
			    public String REPURCHASABLE_CODE;

				public String getREPURCHASABLE_CODE () {
					return this.REPURCHASABLE_CODE;
				}
				
			    public BigDecimal FREIGHT_CLASS_CODE;

				public BigDecimal getFREIGHT_CLASS_CODE () {
					return this.FREIGHT_CLASS_CODE;
				}
				
			    public String ITEM_FOOD_STAMP_CODE;

				public String getITEM_FOOD_STAMP_CODE () {
					return this.ITEM_FOOD_STAMP_CODE;
				}
				
			    public BigDecimal MFG_SUGGESTED_RETAIL;

				public BigDecimal getMFG_SUGGESTED_RETAIL () {
					return this.MFG_SUGGESTED_RETAIL;
				}
				
			    public BigDecimal MFG_SUGG_RETAIL_MULT;

				public BigDecimal getMFG_SUGG_RETAIL_MULT () {
					return this.MFG_SUGG_RETAIL_MULT;
				}
				
			    public String PRICE_CLASS;

				public String getPRICE_CLASS () {
					return this.PRICE_CLASS;
				}
				
			    public BigDecimal ITEM_COST_LINK;

				public BigDecimal getITEM_COST_LINK () {
					return this.ITEM_COST_LINK;
				}
				
			    public String SAME_RETAIL_LINK;

				public String getSAME_RETAIL_LINK () {
					return this.SAME_RETAIL_LINK;
				}
				
			    public String PRODUCT_PRE_PRICE_IND;

				public String getPRODUCT_PRE_PRICE_IND () {
					return this.PRODUCT_PRE_PRICE_IND;
				}
				
			    public String ITEM_PRICE_REQUIRED_IND;

				public String getITEM_PRICE_REQUIRED_IND () {
					return this.ITEM_PRICE_REQUIRED_IND;
				}
				
			    public String TRIAL_SIZE_INDICATOR;

				public String getTRIAL_SIZE_INDICATOR () {
					return this.TRIAL_SIZE_INDICATOR;
				}
				
			    public String TEST_ITEM_INDICATOR;

				public String getTEST_ITEM_INDICATOR () {
					return this.TEST_ITEM_INDICATOR;
				}
				
			    public String EXPENSE_ITEM_INDICATOR;

				public String getEXPENSE_ITEM_INDICATOR () {
					return this.EXPENSE_ITEM_INDICATOR;
				}
				
			    public String CRW_ITEM_INDICATOR;

				public String getCRW_ITEM_INDICATOR () {
					return this.CRW_ITEM_INDICATOR;
				}
				
			    public String CRW_ITEM_NUMBER;

				public String getCRW_ITEM_NUMBER () {
					return this.CRW_ITEM_NUMBER;
				}
				
			    public String ITEM_DIFFT_RETAIL_LINK;

				public String getITEM_DIFFT_RETAIL_LINK () {
					return this.ITEM_DIFFT_RETAIL_LINK;
				}
				
			    public BigDecimal CENTS_OFF_RETAIL_PRICE;

				public BigDecimal getCENTS_OFF_RETAIL_PRICE () {
					return this.CENTS_OFF_RETAIL_PRICE;
				}
				
			    public BigDecimal CENTS_OFF_RETAIL_PCT;

				public BigDecimal getCENTS_OFF_RETAIL_PCT () {
					return this.CENTS_OFF_RETAIL_PCT;
				}
				
			    public String ITEM_TEMPERATURE_CTRL_CD;

				public String getITEM_TEMPERATURE_CTRL_CD () {
					return this.ITEM_TEMPERATURE_CTRL_CD;
				}
				
			    public String SPECIAL_HANDLING_CODE;

				public String getSPECIAL_HANDLING_CODE () {
					return this.SPECIAL_HANDLING_CODE;
				}
				
			    public BigDecimal ITEM_EXP_DATE_CODE;

				public BigDecimal getITEM_EXP_DATE_CODE () {
					return this.ITEM_EXP_DATE_CODE;
				}
				
			    public BigDecimal ITEM_SHORT_DATE_MONTH;

				public BigDecimal getITEM_SHORT_DATE_MONTH () {
					return this.ITEM_SHORT_DATE_MONTH;
				}
				
			    public String LOT_NUMBER_CODE;

				public String getLOT_NUMBER_CODE () {
					return this.LOT_NUMBER_CODE;
				}
				
			    public String WAREHOUSE_DEPARTMENT;

				public String getWAREHOUSE_DEPARTMENT () {
					return this.WAREHOUSE_DEPARTMENT;
				}
				
			    public String CONSIGNMENT_INDICATOR;

				public String getCONSIGNMENT_INDICATOR () {
					return this.CONSIGNMENT_INDICATOR;
				}
				
			    public String GUARANTEED_SALE_CODE;

				public String getGUARANTEED_SALE_CODE () {
					return this.GUARANTEED_SALE_CODE;
				}
				
			    public BigDecimal GUARANTEED_RETURN_DATE;

				public BigDecimal getGUARANTEED_RETURN_DATE () {
					return this.GUARANTEED_RETURN_DATE;
				}
				
			    public String EMPLOYEE_DISCOUNT_IND;

				public String getEMPLOYEE_DISCOUNT_IND () {
					return this.EMPLOYEE_DISCOUNT_IND;
				}
				
			    public String SR_DISCOUNT_IND;

				public String getSR_DISCOUNT_IND () {
					return this.SR_DISCOUNT_IND;
				}
				
			    public String PROF_DISCOUNT_IND;

				public String getPROF_DISCOUNT_IND () {
					return this.PROF_DISCOUNT_IND;
				}
				
			    public String DANGEROUS_DRUG_INDICATOR;

				public String getDANGEROUS_DRUG_INDICATOR () {
					return this.DANGEROUS_DRUG_INDICATOR;
				}
				
			    public String CONTROL_DRUG_CLASS;

				public String getCONTROL_DRUG_CLASS () {
					return this.CONTROL_DRUG_CLASS;
				}
				
			    public String CONTROL_DRUG_NUMBER;

				public String getCONTROL_DRUG_NUMBER () {
					return this.CONTROL_DRUG_NUMBER;
				}
				
			    public BigDecimal AVERAGE_WHOLESALE_PRICE;

				public BigDecimal getAVERAGE_WHOLESALE_PRICE () {
					return this.AVERAGE_WHOLESALE_PRICE;
				}
				
			    public String ITEM_ORDER_INDICATOR;

				public String getITEM_ORDER_INDICATOR () {
					return this.ITEM_ORDER_INDICATOR;
				}
				
			    public BigDecimal ITEM_ORDER_IND_DATE;

				public BigDecimal getITEM_ORDER_IND_DATE () {
					return this.ITEM_ORDER_IND_DATE;
				}
				
			    public String ITEM_SLCT_ORDER_METHOD;

				public String getITEM_SLCT_ORDER_METHOD () {
					return this.ITEM_SLCT_ORDER_METHOD;
				}
				
			    public BigDecimal ITEM_SLCT_ORDER_METH_QTY;

				public BigDecimal getITEM_SLCT_ORDER_METH_QTY () {
					return this.ITEM_SLCT_ORDER_METH_QTY;
				}
				
			    public String TOBACCO_TAX_CLASS;

				public String getTOBACCO_TAX_CLASS () {
					return this.TOBACCO_TAX_CLASS;
				}
				
			    public String ITEM_BASIC_DEPT_IND;

				public String getITEM_BASIC_DEPT_IND () {
					return this.ITEM_BASIC_DEPT_IND;
				}
				
			    public String REPLACED_ITEM_NUMBER;

				public String getREPLACED_ITEM_NUMBER () {
					return this.REPLACED_ITEM_NUMBER;
				}
				
			    public BigDecimal REPLACED_EFFECTIVE_DATE;

				public BigDecimal getREPLACED_EFFECTIVE_DATE () {
					return this.REPLACED_EFFECTIVE_DATE;
				}
				
			    public String REPLACED_BY_ITEM_NBR;

				public String getREPLACED_BY_ITEM_NBR () {
					return this.REPLACED_BY_ITEM_NBR;
				}
				
			    public BigDecimal REPLACED_BY_EFF_DATE;

				public BigDecimal getREPLACED_BY_EFF_DATE () {
					return this.REPLACED_BY_EFF_DATE;
				}
				
			    public String ITEM_STUS_IND;

				public String getITEM_STUS_IND () {
					return this.ITEM_STUS_IND;
				}
				
			    public BigDecimal ITEM_STUS_EFF_DATE;

				public BigDecimal getITEM_STUS_EFF_DATE () {
					return this.ITEM_STUS_EFF_DATE;
				}
				
			    public String ADV_ITEM_567_INDICATOR;

				public String getADV_ITEM_567_INDICATOR () {
					return this.ADV_ITEM_567_INDICATOR;
				}
				
			    public String ADV_STORED_CPY_AVAIL_CDE;

				public String getADV_STORED_CPY_AVAIL_CDE () {
					return this.ADV_STORED_CPY_AVAIL_CDE;
				}
				
			    public String ADV_PHOTO_AVAIL_CODE;

				public String getADV_PHOTO_AVAIL_CODE () {
					return this.ADV_PHOTO_AVAIL_CODE;
				}
				
			    public String ADV_GB_PRINT_CDE;

				public String getADV_GB_PRINT_CDE () {
					return this.ADV_GB_PRINT_CDE;
				}
				
			    public String REORDER_SOURCE;

				public String getREORDER_SOURCE () {
					return this.REORDER_SOURCE;
				}
				
			    public BigDecimal ALCOHOL_PERCENT;

				public BigDecimal getALCOHOL_PERCENT () {
					return this.ALCOHOL_PERCENT;
				}
				
			    public String PRICE_STICKER;

				public String getPRICE_STICKER () {
					return this.PRICE_STICKER;
				}
				
			    public String ITEM_TYPE;

				public String getITEM_TYPE () {
					return this.ITEM_TYPE;
				}
				
			    public String SALEABLE_ITEM;

				public String getSALEABLE_ITEM () {
					return this.SALEABLE_ITEM;
				}
				
			    public BigDecimal DUTY_RATE;

				public BigDecimal getDUTY_RATE () {
					return this.DUTY_RATE;
				}
				
			    public BigDecimal HARMONIZED_TARIFF_NBR;

				public BigDecimal getHARMONIZED_TARIFF_NBR () {
					return this.HARMONIZED_TARIFF_NBR;
				}
				
			    public String WALGREEN_DEPT_NBR;

				public String getWALGREEN_DEPT_NBR () {
					return this.WALGREEN_DEPT_NBR;
				}
				
			    public String SUB_DEPARTMENT_NBR;

				public String getSUB_DEPARTMENT_NBR () {
					return this.SUB_DEPARTMENT_NBR;
				}
				
			    public String COUNTRY_CODE;

				public String getCOUNTRY_CODE () {
					return this.COUNTRY_CODE;
				}
				
			    public String AEROSOL_IND;

				public String getAEROSOL_IND () {
					return this.AEROSOL_IND;
				}
				
			    public String SCHEDULE_2_DRUG_IND;

				public String getSCHEDULE_2_DRUG_IND () {
					return this.SCHEDULE_2_DRUG_IND;
				}
				
			    public String ETHNIC_CODE;

				public String getETHNIC_CODE () {
					return this.ETHNIC_CODE;
				}
				
			    public String HAZARDOUS_IND;

				public String getHAZARDOUS_IND () {
					return this.HAZARDOUS_IND;
				}
				
			    public String ITEM_EXP_DATE_TYPE;

				public String getITEM_EXP_DATE_TYPE () {
					return this.ITEM_EXP_DATE_TYPE;
				}
				
			    public String PDQ_ALLOWED_IND;

				public String getPDQ_ALLOWED_IND () {
					return this.PDQ_ALLOWED_IND;
				}
				
			    public String ORMD_IND;

				public String getORMD_IND () {
					return this.ORMD_IND;
				}
				
			    public String FLAMMABLE_IND;

				public String getFLAMMABLE_IND () {
					return this.FLAMMABLE_IND;
				}
				
			    public String CURRENT_BUYER_NBR;

				public String getCURRENT_BUYER_NBR () {
					return this.CURRENT_BUYER_NBR;
				}
				
			    public String USER_STAMP;

				public String getUSER_STAMP () {
					return this.USER_STAMP;
				}
				
			    public BigDecimal TIME_STAMP;

				public BigDecimal getTIME_STAMP () {
					return this.TIME_STAMP;
				}
				
			    public BigDecimal DATE_STAMP;

				public BigDecimal getDATE_STAMP () {
					return this.DATE_STAMP;
				}
				
			    public String errorCode;

				public String getErrorCode () {
					return this.errorCode;
				}
				
			    public String errorMessage;

				public String getErrorMessage () {
					return this.errorMessage;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ITEM_NUMBER == null) ? 0 : this.ITEM_NUMBER.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row40Struct other = (row40Struct) obj;
		
						if (this.ITEM_NUMBER == null) {
							if (other.ITEM_NUMBER != null)
								return false;
						
						} else if (!this.ITEM_NUMBER.equals(other.ITEM_NUMBER))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row40Struct other) {

		other.ITEM_NUMBER = this.ITEM_NUMBER;
	            other.ITEM_NUMBER_CK_DIGIT = this.ITEM_NUMBER_CK_DIGIT;
	            other.MANUFACTURER_NAME = this.MANUFACTURER_NAME;
	            other.MANUFACTURER_STOCK_NBR = this.MANUFACTURER_STOCK_NBR;
	            other.PRODUCT_BRAND_NAME = this.PRODUCT_BRAND_NAME;
	            other.PRODUCT_TYPE = this.PRODUCT_TYPE;
	            other.ITEM_DESCRIPTION = this.ITEM_DESCRIPTION;
	            other.ITEM_RECEIPT_DESCRIPTION = this.ITEM_RECEIPT_DESCRIPTION;
	            other.ITEM_MYLAR_DESCRIPTION = this.ITEM_MYLAR_DESCRIPTION;
	            other.ITEM_MYLAR_INDICATOR = this.ITEM_MYLAR_INDICATOR;
	            other.ITEM_EZ_REF_DESCRIPTION = this.ITEM_EZ_REF_DESCRIPTION;
	            other.ITEM_SUPPLY_SOURCE = this.ITEM_SUPPLY_SOURCE;
	            other.UNIT_OF_MEASURE = this.UNIT_OF_MEASURE;
	            other.ITEM_PURCHASED_CODE = this.ITEM_PURCHASED_CODE;
	            other.ITEM_QUANTITY_OF_UNIT = this.ITEM_QUANTITY_OF_UNIT;
	            other.RETAIL_SELL_UNIT = this.RETAIL_SELL_UNIT;
	            other.SKUS_PER_RETAIL_UNIT = this.SKUS_PER_RETAIL_UNIT;
	            other.SKU_CUBE = this.SKU_CUBE;
	            other.SKU_WEIGHT = this.SKU_WEIGHT;
	            other.MERCH_OPSTUDY_NBR = this.MERCH_OPSTUDY_NBR;
	            other.PROD_CATEG_CODE = this.PROD_CATEG_CODE;
	            other.REPURCHASABLE_CODE = this.REPURCHASABLE_CODE;
	            other.FREIGHT_CLASS_CODE = this.FREIGHT_CLASS_CODE;
	            other.ITEM_FOOD_STAMP_CODE = this.ITEM_FOOD_STAMP_CODE;
	            other.MFG_SUGGESTED_RETAIL = this.MFG_SUGGESTED_RETAIL;
	            other.MFG_SUGG_RETAIL_MULT = this.MFG_SUGG_RETAIL_MULT;
	            other.PRICE_CLASS = this.PRICE_CLASS;
	            other.ITEM_COST_LINK = this.ITEM_COST_LINK;
	            other.SAME_RETAIL_LINK = this.SAME_RETAIL_LINK;
	            other.PRODUCT_PRE_PRICE_IND = this.PRODUCT_PRE_PRICE_IND;
	            other.ITEM_PRICE_REQUIRED_IND = this.ITEM_PRICE_REQUIRED_IND;
	            other.TRIAL_SIZE_INDICATOR = this.TRIAL_SIZE_INDICATOR;
	            other.TEST_ITEM_INDICATOR = this.TEST_ITEM_INDICATOR;
	            other.EXPENSE_ITEM_INDICATOR = this.EXPENSE_ITEM_INDICATOR;
	            other.CRW_ITEM_INDICATOR = this.CRW_ITEM_INDICATOR;
	            other.CRW_ITEM_NUMBER = this.CRW_ITEM_NUMBER;
	            other.ITEM_DIFFT_RETAIL_LINK = this.ITEM_DIFFT_RETAIL_LINK;
	            other.CENTS_OFF_RETAIL_PRICE = this.CENTS_OFF_RETAIL_PRICE;
	            other.CENTS_OFF_RETAIL_PCT = this.CENTS_OFF_RETAIL_PCT;
	            other.ITEM_TEMPERATURE_CTRL_CD = this.ITEM_TEMPERATURE_CTRL_CD;
	            other.SPECIAL_HANDLING_CODE = this.SPECIAL_HANDLING_CODE;
	            other.ITEM_EXP_DATE_CODE = this.ITEM_EXP_DATE_CODE;
	            other.ITEM_SHORT_DATE_MONTH = this.ITEM_SHORT_DATE_MONTH;
	            other.LOT_NUMBER_CODE = this.LOT_NUMBER_CODE;
	            other.WAREHOUSE_DEPARTMENT = this.WAREHOUSE_DEPARTMENT;
	            other.CONSIGNMENT_INDICATOR = this.CONSIGNMENT_INDICATOR;
	            other.GUARANTEED_SALE_CODE = this.GUARANTEED_SALE_CODE;
	            other.GUARANTEED_RETURN_DATE = this.GUARANTEED_RETURN_DATE;
	            other.EMPLOYEE_DISCOUNT_IND = this.EMPLOYEE_DISCOUNT_IND;
	            other.SR_DISCOUNT_IND = this.SR_DISCOUNT_IND;
	            other.PROF_DISCOUNT_IND = this.PROF_DISCOUNT_IND;
	            other.DANGEROUS_DRUG_INDICATOR = this.DANGEROUS_DRUG_INDICATOR;
	            other.CONTROL_DRUG_CLASS = this.CONTROL_DRUG_CLASS;
	            other.CONTROL_DRUG_NUMBER = this.CONTROL_DRUG_NUMBER;
	            other.AVERAGE_WHOLESALE_PRICE = this.AVERAGE_WHOLESALE_PRICE;
	            other.ITEM_ORDER_INDICATOR = this.ITEM_ORDER_INDICATOR;
	            other.ITEM_ORDER_IND_DATE = this.ITEM_ORDER_IND_DATE;
	            other.ITEM_SLCT_ORDER_METHOD = this.ITEM_SLCT_ORDER_METHOD;
	            other.ITEM_SLCT_ORDER_METH_QTY = this.ITEM_SLCT_ORDER_METH_QTY;
	            other.TOBACCO_TAX_CLASS = this.TOBACCO_TAX_CLASS;
	            other.ITEM_BASIC_DEPT_IND = this.ITEM_BASIC_DEPT_IND;
	            other.REPLACED_ITEM_NUMBER = this.REPLACED_ITEM_NUMBER;
	            other.REPLACED_EFFECTIVE_DATE = this.REPLACED_EFFECTIVE_DATE;
	            other.REPLACED_BY_ITEM_NBR = this.REPLACED_BY_ITEM_NBR;
	            other.REPLACED_BY_EFF_DATE = this.REPLACED_BY_EFF_DATE;
	            other.ITEM_STUS_IND = this.ITEM_STUS_IND;
	            other.ITEM_STUS_EFF_DATE = this.ITEM_STUS_EFF_DATE;
	            other.ADV_ITEM_567_INDICATOR = this.ADV_ITEM_567_INDICATOR;
	            other.ADV_STORED_CPY_AVAIL_CDE = this.ADV_STORED_CPY_AVAIL_CDE;
	            other.ADV_PHOTO_AVAIL_CODE = this.ADV_PHOTO_AVAIL_CODE;
	            other.ADV_GB_PRINT_CDE = this.ADV_GB_PRINT_CDE;
	            other.REORDER_SOURCE = this.REORDER_SOURCE;
	            other.ALCOHOL_PERCENT = this.ALCOHOL_PERCENT;
	            other.PRICE_STICKER = this.PRICE_STICKER;
	            other.ITEM_TYPE = this.ITEM_TYPE;
	            other.SALEABLE_ITEM = this.SALEABLE_ITEM;
	            other.DUTY_RATE = this.DUTY_RATE;
	            other.HARMONIZED_TARIFF_NBR = this.HARMONIZED_TARIFF_NBR;
	            other.WALGREEN_DEPT_NBR = this.WALGREEN_DEPT_NBR;
	            other.SUB_DEPARTMENT_NBR = this.SUB_DEPARTMENT_NBR;
	            other.COUNTRY_CODE = this.COUNTRY_CODE;
	            other.AEROSOL_IND = this.AEROSOL_IND;
	            other.SCHEDULE_2_DRUG_IND = this.SCHEDULE_2_DRUG_IND;
	            other.ETHNIC_CODE = this.ETHNIC_CODE;
	            other.HAZARDOUS_IND = this.HAZARDOUS_IND;
	            other.ITEM_EXP_DATE_TYPE = this.ITEM_EXP_DATE_TYPE;
	            other.PDQ_ALLOWED_IND = this.PDQ_ALLOWED_IND;
	            other.ORMD_IND = this.ORMD_IND;
	            other.FLAMMABLE_IND = this.FLAMMABLE_IND;
	            other.CURRENT_BUYER_NBR = this.CURRENT_BUYER_NBR;
	            other.USER_STAMP = this.USER_STAMP;
	            other.TIME_STAMP = this.TIME_STAMP;
	            other.DATE_STAMP = this.DATE_STAMP;
	            other.errorCode = this.errorCode;
	            other.errorMessage = this.errorMessage;
	            
	}

	public void copyKeysDataTo(row40Struct other) {

		other.ITEM_NUMBER = this.ITEM_NUMBER;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job.length) {
				if(length < 1024 && commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job.length == 0) {
   					commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[1024];
				} else {
   					commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job, 0, length);
			strReturn = new String(commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job) {

        	try {

        		int length = 0;
		
					this.ITEM_NUMBER = readString(dis);
					
					this.ITEM_NUMBER_CK_DIGIT = readString(dis);
					
					this.MANUFACTURER_NAME = readString(dis);
					
					this.MANUFACTURER_STOCK_NBR = readString(dis);
					
					this.PRODUCT_BRAND_NAME = readString(dis);
					
					this.PRODUCT_TYPE = readString(dis);
					
					this.ITEM_DESCRIPTION = readString(dis);
					
					this.ITEM_RECEIPT_DESCRIPTION = readString(dis);
					
					this.ITEM_MYLAR_DESCRIPTION = readString(dis);
					
					this.ITEM_MYLAR_INDICATOR = readString(dis);
					
					this.ITEM_EZ_REF_DESCRIPTION = readString(dis);
					
					this.ITEM_SUPPLY_SOURCE = readString(dis);
					
					this.UNIT_OF_MEASURE = readString(dis);
					
					this.ITEM_PURCHASED_CODE = readString(dis);
					
						this.ITEM_QUANTITY_OF_UNIT = (BigDecimal) dis.readObject();
					
					this.RETAIL_SELL_UNIT = readString(dis);
					
						this.SKUS_PER_RETAIL_UNIT = (BigDecimal) dis.readObject();
					
						this.SKU_CUBE = (BigDecimal) dis.readObject();
					
						this.SKU_WEIGHT = (BigDecimal) dis.readObject();
					
					this.MERCH_OPSTUDY_NBR = readString(dis);
					
					this.PROD_CATEG_CODE = readString(dis);
					
					this.REPURCHASABLE_CODE = readString(dis);
					
						this.FREIGHT_CLASS_CODE = (BigDecimal) dis.readObject();
					
					this.ITEM_FOOD_STAMP_CODE = readString(dis);
					
						this.MFG_SUGGESTED_RETAIL = (BigDecimal) dis.readObject();
					
						this.MFG_SUGG_RETAIL_MULT = (BigDecimal) dis.readObject();
					
					this.PRICE_CLASS = readString(dis);
					
						this.ITEM_COST_LINK = (BigDecimal) dis.readObject();
					
					this.SAME_RETAIL_LINK = readString(dis);
					
					this.PRODUCT_PRE_PRICE_IND = readString(dis);
					
					this.ITEM_PRICE_REQUIRED_IND = readString(dis);
					
					this.TRIAL_SIZE_INDICATOR = readString(dis);
					
					this.TEST_ITEM_INDICATOR = readString(dis);
					
					this.EXPENSE_ITEM_INDICATOR = readString(dis);
					
					this.CRW_ITEM_INDICATOR = readString(dis);
					
					this.CRW_ITEM_NUMBER = readString(dis);
					
					this.ITEM_DIFFT_RETAIL_LINK = readString(dis);
					
						this.CENTS_OFF_RETAIL_PRICE = (BigDecimal) dis.readObject();
					
						this.CENTS_OFF_RETAIL_PCT = (BigDecimal) dis.readObject();
					
					this.ITEM_TEMPERATURE_CTRL_CD = readString(dis);
					
					this.SPECIAL_HANDLING_CODE = readString(dis);
					
						this.ITEM_EXP_DATE_CODE = (BigDecimal) dis.readObject();
					
						this.ITEM_SHORT_DATE_MONTH = (BigDecimal) dis.readObject();
					
					this.LOT_NUMBER_CODE = readString(dis);
					
					this.WAREHOUSE_DEPARTMENT = readString(dis);
					
					this.CONSIGNMENT_INDICATOR = readString(dis);
					
					this.GUARANTEED_SALE_CODE = readString(dis);
					
						this.GUARANTEED_RETURN_DATE = (BigDecimal) dis.readObject();
					
					this.EMPLOYEE_DISCOUNT_IND = readString(dis);
					
					this.SR_DISCOUNT_IND = readString(dis);
					
					this.PROF_DISCOUNT_IND = readString(dis);
					
					this.DANGEROUS_DRUG_INDICATOR = readString(dis);
					
					this.CONTROL_DRUG_CLASS = readString(dis);
					
					this.CONTROL_DRUG_NUMBER = readString(dis);
					
						this.AVERAGE_WHOLESALE_PRICE = (BigDecimal) dis.readObject();
					
					this.ITEM_ORDER_INDICATOR = readString(dis);
					
						this.ITEM_ORDER_IND_DATE = (BigDecimal) dis.readObject();
					
					this.ITEM_SLCT_ORDER_METHOD = readString(dis);
					
						this.ITEM_SLCT_ORDER_METH_QTY = (BigDecimal) dis.readObject();
					
					this.TOBACCO_TAX_CLASS = readString(dis);
					
					this.ITEM_BASIC_DEPT_IND = readString(dis);
					
					this.REPLACED_ITEM_NUMBER = readString(dis);
					
						this.REPLACED_EFFECTIVE_DATE = (BigDecimal) dis.readObject();
					
					this.REPLACED_BY_ITEM_NBR = readString(dis);
					
						this.REPLACED_BY_EFF_DATE = (BigDecimal) dis.readObject();
					
					this.ITEM_STUS_IND = readString(dis);
					
						this.ITEM_STUS_EFF_DATE = (BigDecimal) dis.readObject();
					
					this.ADV_ITEM_567_INDICATOR = readString(dis);
					
					this.ADV_STORED_CPY_AVAIL_CDE = readString(dis);
					
					this.ADV_PHOTO_AVAIL_CODE = readString(dis);
					
					this.ADV_GB_PRINT_CDE = readString(dis);
					
					this.REORDER_SOURCE = readString(dis);
					
						this.ALCOHOL_PERCENT = (BigDecimal) dis.readObject();
					
					this.PRICE_STICKER = readString(dis);
					
					this.ITEM_TYPE = readString(dis);
					
					this.SALEABLE_ITEM = readString(dis);
					
						this.DUTY_RATE = (BigDecimal) dis.readObject();
					
						this.HARMONIZED_TARIFF_NBR = (BigDecimal) dis.readObject();
					
					this.WALGREEN_DEPT_NBR = readString(dis);
					
					this.SUB_DEPARTMENT_NBR = readString(dis);
					
					this.COUNTRY_CODE = readString(dis);
					
					this.AEROSOL_IND = readString(dis);
					
					this.SCHEDULE_2_DRUG_IND = readString(dis);
					
					this.ETHNIC_CODE = readString(dis);
					
					this.HAZARDOUS_IND = readString(dis);
					
					this.ITEM_EXP_DATE_TYPE = readString(dis);
					
					this.PDQ_ALLOWED_IND = readString(dis);
					
					this.ORMD_IND = readString(dis);
					
					this.FLAMMABLE_IND = readString(dis);
					
					this.CURRENT_BUYER_NBR = readString(dis);
					
					this.USER_STAMP = readString(dis);
					
						this.TIME_STAMP = (BigDecimal) dis.readObject();
					
						this.DATE_STAMP = (BigDecimal) dis.readObject();
					
					this.errorCode = readString(dis);
					
					this.errorMessage = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ITEM_NUMBER,dos);
					
					// String
				
						writeString(this.ITEM_NUMBER_CK_DIGIT,dos);
					
					// String
				
						writeString(this.MANUFACTURER_NAME,dos);
					
					// String
				
						writeString(this.MANUFACTURER_STOCK_NBR,dos);
					
					// String
				
						writeString(this.PRODUCT_BRAND_NAME,dos);
					
					// String
				
						writeString(this.PRODUCT_TYPE,dos);
					
					// String
				
						writeString(this.ITEM_DESCRIPTION,dos);
					
					// String
				
						writeString(this.ITEM_RECEIPT_DESCRIPTION,dos);
					
					// String
				
						writeString(this.ITEM_MYLAR_DESCRIPTION,dos);
					
					// String
				
						writeString(this.ITEM_MYLAR_INDICATOR,dos);
					
					// String
				
						writeString(this.ITEM_EZ_REF_DESCRIPTION,dos);
					
					// String
				
						writeString(this.ITEM_SUPPLY_SOURCE,dos);
					
					// String
				
						writeString(this.UNIT_OF_MEASURE,dos);
					
					// String
				
						writeString(this.ITEM_PURCHASED_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_QUANTITY_OF_UNIT);
					
					// String
				
						writeString(this.RETAIL_SELL_UNIT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SKUS_PER_RETAIL_UNIT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SKU_CUBE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SKU_WEIGHT);
					
					// String
				
						writeString(this.MERCH_OPSTUDY_NBR,dos);
					
					// String
				
						writeString(this.PROD_CATEG_CODE,dos);
					
					// String
				
						writeString(this.REPURCHASABLE_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FREIGHT_CLASS_CODE);
					
					// String
				
						writeString(this.ITEM_FOOD_STAMP_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MFG_SUGGESTED_RETAIL);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MFG_SUGG_RETAIL_MULT);
					
					// String
				
						writeString(this.PRICE_CLASS,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_COST_LINK);
					
					// String
				
						writeString(this.SAME_RETAIL_LINK,dos);
					
					// String
				
						writeString(this.PRODUCT_PRE_PRICE_IND,dos);
					
					// String
				
						writeString(this.ITEM_PRICE_REQUIRED_IND,dos);
					
					// String
				
						writeString(this.TRIAL_SIZE_INDICATOR,dos);
					
					// String
				
						writeString(this.TEST_ITEM_INDICATOR,dos);
					
					// String
				
						writeString(this.EXPENSE_ITEM_INDICATOR,dos);
					
					// String
				
						writeString(this.CRW_ITEM_INDICATOR,dos);
					
					// String
				
						writeString(this.CRW_ITEM_NUMBER,dos);
					
					// String
				
						writeString(this.ITEM_DIFFT_RETAIL_LINK,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CENTS_OFF_RETAIL_PRICE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CENTS_OFF_RETAIL_PCT);
					
					// String
				
						writeString(this.ITEM_TEMPERATURE_CTRL_CD,dos);
					
					// String
				
						writeString(this.SPECIAL_HANDLING_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_EXP_DATE_CODE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_SHORT_DATE_MONTH);
					
					// String
				
						writeString(this.LOT_NUMBER_CODE,dos);
					
					// String
				
						writeString(this.WAREHOUSE_DEPARTMENT,dos);
					
					// String
				
						writeString(this.CONSIGNMENT_INDICATOR,dos);
					
					// String
				
						writeString(this.GUARANTEED_SALE_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.GUARANTEED_RETURN_DATE);
					
					// String
				
						writeString(this.EMPLOYEE_DISCOUNT_IND,dos);
					
					// String
				
						writeString(this.SR_DISCOUNT_IND,dos);
					
					// String
				
						writeString(this.PROF_DISCOUNT_IND,dos);
					
					// String
				
						writeString(this.DANGEROUS_DRUG_INDICATOR,dos);
					
					// String
				
						writeString(this.CONTROL_DRUG_CLASS,dos);
					
					// String
				
						writeString(this.CONTROL_DRUG_NUMBER,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.AVERAGE_WHOLESALE_PRICE);
					
					// String
				
						writeString(this.ITEM_ORDER_INDICATOR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_ORDER_IND_DATE);
					
					// String
				
						writeString(this.ITEM_SLCT_ORDER_METHOD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_SLCT_ORDER_METH_QTY);
					
					// String
				
						writeString(this.TOBACCO_TAX_CLASS,dos);
					
					// String
				
						writeString(this.ITEM_BASIC_DEPT_IND,dos);
					
					// String
				
						writeString(this.REPLACED_ITEM_NUMBER,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REPLACED_EFFECTIVE_DATE);
					
					// String
				
						writeString(this.REPLACED_BY_ITEM_NBR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REPLACED_BY_EFF_DATE);
					
					// String
				
						writeString(this.ITEM_STUS_IND,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_STUS_EFF_DATE);
					
					// String
				
						writeString(this.ADV_ITEM_567_INDICATOR,dos);
					
					// String
				
						writeString(this.ADV_STORED_CPY_AVAIL_CDE,dos);
					
					// String
				
						writeString(this.ADV_PHOTO_AVAIL_CODE,dos);
					
					// String
				
						writeString(this.ADV_GB_PRINT_CDE,dos);
					
					// String
				
						writeString(this.REORDER_SOURCE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ALCOHOL_PERCENT);
					
					// String
				
						writeString(this.PRICE_STICKER,dos);
					
					// String
				
						writeString(this.ITEM_TYPE,dos);
					
					// String
				
						writeString(this.SALEABLE_ITEM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DUTY_RATE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.HARMONIZED_TARIFF_NBR);
					
					// String
				
						writeString(this.WALGREEN_DEPT_NBR,dos);
					
					// String
				
						writeString(this.SUB_DEPARTMENT_NBR,dos);
					
					// String
				
						writeString(this.COUNTRY_CODE,dos);
					
					// String
				
						writeString(this.AEROSOL_IND,dos);
					
					// String
				
						writeString(this.SCHEDULE_2_DRUG_IND,dos);
					
					// String
				
						writeString(this.ETHNIC_CODE,dos);
					
					// String
				
						writeString(this.HAZARDOUS_IND,dos);
					
					// String
				
						writeString(this.ITEM_EXP_DATE_TYPE,dos);
					
					// String
				
						writeString(this.PDQ_ALLOWED_IND,dos);
					
					// String
				
						writeString(this.ORMD_IND,dos);
					
					// String
				
						writeString(this.FLAMMABLE_IND,dos);
					
					// String
				
						writeString(this.CURRENT_BUYER_NBR,dos);
					
					// String
				
						writeString(this.USER_STAMP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TIME_STAMP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DATE_STAMP);
					
					// String
				
						writeString(this.errorCode,dos);
					
					// String
				
						writeString(this.errorMessage,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ITEM_NUMBER="+ITEM_NUMBER);
		sb.append(",ITEM_NUMBER_CK_DIGIT="+ITEM_NUMBER_CK_DIGIT);
		sb.append(",MANUFACTURER_NAME="+MANUFACTURER_NAME);
		sb.append(",MANUFACTURER_STOCK_NBR="+MANUFACTURER_STOCK_NBR);
		sb.append(",PRODUCT_BRAND_NAME="+PRODUCT_BRAND_NAME);
		sb.append(",PRODUCT_TYPE="+PRODUCT_TYPE);
		sb.append(",ITEM_DESCRIPTION="+ITEM_DESCRIPTION);
		sb.append(",ITEM_RECEIPT_DESCRIPTION="+ITEM_RECEIPT_DESCRIPTION);
		sb.append(",ITEM_MYLAR_DESCRIPTION="+ITEM_MYLAR_DESCRIPTION);
		sb.append(",ITEM_MYLAR_INDICATOR="+ITEM_MYLAR_INDICATOR);
		sb.append(",ITEM_EZ_REF_DESCRIPTION="+ITEM_EZ_REF_DESCRIPTION);
		sb.append(",ITEM_SUPPLY_SOURCE="+ITEM_SUPPLY_SOURCE);
		sb.append(",UNIT_OF_MEASURE="+UNIT_OF_MEASURE);
		sb.append(",ITEM_PURCHASED_CODE="+ITEM_PURCHASED_CODE);
		sb.append(",ITEM_QUANTITY_OF_UNIT="+String.valueOf(ITEM_QUANTITY_OF_UNIT));
		sb.append(",RETAIL_SELL_UNIT="+RETAIL_SELL_UNIT);
		sb.append(",SKUS_PER_RETAIL_UNIT="+String.valueOf(SKUS_PER_RETAIL_UNIT));
		sb.append(",SKU_CUBE="+String.valueOf(SKU_CUBE));
		sb.append(",SKU_WEIGHT="+String.valueOf(SKU_WEIGHT));
		sb.append(",MERCH_OPSTUDY_NBR="+MERCH_OPSTUDY_NBR);
		sb.append(",PROD_CATEG_CODE="+PROD_CATEG_CODE);
		sb.append(",REPURCHASABLE_CODE="+REPURCHASABLE_CODE);
		sb.append(",FREIGHT_CLASS_CODE="+String.valueOf(FREIGHT_CLASS_CODE));
		sb.append(",ITEM_FOOD_STAMP_CODE="+ITEM_FOOD_STAMP_CODE);
		sb.append(",MFG_SUGGESTED_RETAIL="+String.valueOf(MFG_SUGGESTED_RETAIL));
		sb.append(",MFG_SUGG_RETAIL_MULT="+String.valueOf(MFG_SUGG_RETAIL_MULT));
		sb.append(",PRICE_CLASS="+PRICE_CLASS);
		sb.append(",ITEM_COST_LINK="+String.valueOf(ITEM_COST_LINK));
		sb.append(",SAME_RETAIL_LINK="+SAME_RETAIL_LINK);
		sb.append(",PRODUCT_PRE_PRICE_IND="+PRODUCT_PRE_PRICE_IND);
		sb.append(",ITEM_PRICE_REQUIRED_IND="+ITEM_PRICE_REQUIRED_IND);
		sb.append(",TRIAL_SIZE_INDICATOR="+TRIAL_SIZE_INDICATOR);
		sb.append(",TEST_ITEM_INDICATOR="+TEST_ITEM_INDICATOR);
		sb.append(",EXPENSE_ITEM_INDICATOR="+EXPENSE_ITEM_INDICATOR);
		sb.append(",CRW_ITEM_INDICATOR="+CRW_ITEM_INDICATOR);
		sb.append(",CRW_ITEM_NUMBER="+CRW_ITEM_NUMBER);
		sb.append(",ITEM_DIFFT_RETAIL_LINK="+ITEM_DIFFT_RETAIL_LINK);
		sb.append(",CENTS_OFF_RETAIL_PRICE="+String.valueOf(CENTS_OFF_RETAIL_PRICE));
		sb.append(",CENTS_OFF_RETAIL_PCT="+String.valueOf(CENTS_OFF_RETAIL_PCT));
		sb.append(",ITEM_TEMPERATURE_CTRL_CD="+ITEM_TEMPERATURE_CTRL_CD);
		sb.append(",SPECIAL_HANDLING_CODE="+SPECIAL_HANDLING_CODE);
		sb.append(",ITEM_EXP_DATE_CODE="+String.valueOf(ITEM_EXP_DATE_CODE));
		sb.append(",ITEM_SHORT_DATE_MONTH="+String.valueOf(ITEM_SHORT_DATE_MONTH));
		sb.append(",LOT_NUMBER_CODE="+LOT_NUMBER_CODE);
		sb.append(",WAREHOUSE_DEPARTMENT="+WAREHOUSE_DEPARTMENT);
		sb.append(",CONSIGNMENT_INDICATOR="+CONSIGNMENT_INDICATOR);
		sb.append(",GUARANTEED_SALE_CODE="+GUARANTEED_SALE_CODE);
		sb.append(",GUARANTEED_RETURN_DATE="+String.valueOf(GUARANTEED_RETURN_DATE));
		sb.append(",EMPLOYEE_DISCOUNT_IND="+EMPLOYEE_DISCOUNT_IND);
		sb.append(",SR_DISCOUNT_IND="+SR_DISCOUNT_IND);
		sb.append(",PROF_DISCOUNT_IND="+PROF_DISCOUNT_IND);
		sb.append(",DANGEROUS_DRUG_INDICATOR="+DANGEROUS_DRUG_INDICATOR);
		sb.append(",CONTROL_DRUG_CLASS="+CONTROL_DRUG_CLASS);
		sb.append(",CONTROL_DRUG_NUMBER="+CONTROL_DRUG_NUMBER);
		sb.append(",AVERAGE_WHOLESALE_PRICE="+String.valueOf(AVERAGE_WHOLESALE_PRICE));
		sb.append(",ITEM_ORDER_INDICATOR="+ITEM_ORDER_INDICATOR);
		sb.append(",ITEM_ORDER_IND_DATE="+String.valueOf(ITEM_ORDER_IND_DATE));
		sb.append(",ITEM_SLCT_ORDER_METHOD="+ITEM_SLCT_ORDER_METHOD);
		sb.append(",ITEM_SLCT_ORDER_METH_QTY="+String.valueOf(ITEM_SLCT_ORDER_METH_QTY));
		sb.append(",TOBACCO_TAX_CLASS="+TOBACCO_TAX_CLASS);
		sb.append(",ITEM_BASIC_DEPT_IND="+ITEM_BASIC_DEPT_IND);
		sb.append(",REPLACED_ITEM_NUMBER="+REPLACED_ITEM_NUMBER);
		sb.append(",REPLACED_EFFECTIVE_DATE="+String.valueOf(REPLACED_EFFECTIVE_DATE));
		sb.append(",REPLACED_BY_ITEM_NBR="+REPLACED_BY_ITEM_NBR);
		sb.append(",REPLACED_BY_EFF_DATE="+String.valueOf(REPLACED_BY_EFF_DATE));
		sb.append(",ITEM_STUS_IND="+ITEM_STUS_IND);
		sb.append(",ITEM_STUS_EFF_DATE="+String.valueOf(ITEM_STUS_EFF_DATE));
		sb.append(",ADV_ITEM_567_INDICATOR="+ADV_ITEM_567_INDICATOR);
		sb.append(",ADV_STORED_CPY_AVAIL_CDE="+ADV_STORED_CPY_AVAIL_CDE);
		sb.append(",ADV_PHOTO_AVAIL_CODE="+ADV_PHOTO_AVAIL_CODE);
		sb.append(",ADV_GB_PRINT_CDE="+ADV_GB_PRINT_CDE);
		sb.append(",REORDER_SOURCE="+REORDER_SOURCE);
		sb.append(",ALCOHOL_PERCENT="+String.valueOf(ALCOHOL_PERCENT));
		sb.append(",PRICE_STICKER="+PRICE_STICKER);
		sb.append(",ITEM_TYPE="+ITEM_TYPE);
		sb.append(",SALEABLE_ITEM="+SALEABLE_ITEM);
		sb.append(",DUTY_RATE="+String.valueOf(DUTY_RATE));
		sb.append(",HARMONIZED_TARIFF_NBR="+String.valueOf(HARMONIZED_TARIFF_NBR));
		sb.append(",WALGREEN_DEPT_NBR="+WALGREEN_DEPT_NBR);
		sb.append(",SUB_DEPARTMENT_NBR="+SUB_DEPARTMENT_NBR);
		sb.append(",COUNTRY_CODE="+COUNTRY_CODE);
		sb.append(",AEROSOL_IND="+AEROSOL_IND);
		sb.append(",SCHEDULE_2_DRUG_IND="+SCHEDULE_2_DRUG_IND);
		sb.append(",ETHNIC_CODE="+ETHNIC_CODE);
		sb.append(",HAZARDOUS_IND="+HAZARDOUS_IND);
		sb.append(",ITEM_EXP_DATE_TYPE="+ITEM_EXP_DATE_TYPE);
		sb.append(",PDQ_ALLOWED_IND="+PDQ_ALLOWED_IND);
		sb.append(",ORMD_IND="+ORMD_IND);
		sb.append(",FLAMMABLE_IND="+FLAMMABLE_IND);
		sb.append(",CURRENT_BUYER_NBR="+CURRENT_BUYER_NBR);
		sb.append(",USER_STAMP="+USER_STAMP);
		sb.append(",TIME_STAMP="+String.valueOf(TIME_STAMP));
		sb.append(",DATE_STAMP="+String.valueOf(DATE_STAMP));
		sb.append(",errorCode="+errorCode);
		sb.append(",errorMessage="+errorMessage);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ITEM_NUMBER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_NUMBER);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_NUMBER_CK_DIGIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_NUMBER_CK_DIGIT);
            			}
            		
        			sb.append("|");
        		
        				if(MANUFACTURER_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MANUFACTURER_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(MANUFACTURER_STOCK_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MANUFACTURER_STOCK_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT_BRAND_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT_BRAND_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_RECEIPT_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_RECEIPT_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_MYLAR_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_MYLAR_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_MYLAR_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_MYLAR_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_EZ_REF_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_EZ_REF_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_SUPPLY_SOURCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_SUPPLY_SOURCE);
            			}
            		
        			sb.append("|");
        		
        				if(UNIT_OF_MEASURE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UNIT_OF_MEASURE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_PURCHASED_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_PURCHASED_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_QUANTITY_OF_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_QUANTITY_OF_UNIT);
            			}
            		
        			sb.append("|");
        		
        				if(RETAIL_SELL_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RETAIL_SELL_UNIT);
            			}
            		
        			sb.append("|");
        		
        				if(SKUS_PER_RETAIL_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SKUS_PER_RETAIL_UNIT);
            			}
            		
        			sb.append("|");
        		
        				if(SKU_CUBE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SKU_CUBE);
            			}
            		
        			sb.append("|");
        		
        				if(SKU_WEIGHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SKU_WEIGHT);
            			}
            		
        			sb.append("|");
        		
        				if(MERCH_OPSTUDY_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MERCH_OPSTUDY_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(PROD_CATEG_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PROD_CATEG_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(REPURCHASABLE_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPURCHASABLE_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(FREIGHT_CLASS_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FREIGHT_CLASS_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_FOOD_STAMP_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_FOOD_STAMP_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(MFG_SUGGESTED_RETAIL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MFG_SUGGESTED_RETAIL);
            			}
            		
        			sb.append("|");
        		
        				if(MFG_SUGG_RETAIL_MULT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MFG_SUGG_RETAIL_MULT);
            			}
            		
        			sb.append("|");
        		
        				if(PRICE_CLASS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICE_CLASS);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_COST_LINK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_COST_LINK);
            			}
            		
        			sb.append("|");
        		
        				if(SAME_RETAIL_LINK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SAME_RETAIL_LINK);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT_PRE_PRICE_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT_PRE_PRICE_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_PRICE_REQUIRED_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_PRICE_REQUIRED_IND);
            			}
            		
        			sb.append("|");
        		
        				if(TRIAL_SIZE_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TRIAL_SIZE_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(TEST_ITEM_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TEST_ITEM_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(EXPENSE_ITEM_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXPENSE_ITEM_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(CRW_ITEM_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CRW_ITEM_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(CRW_ITEM_NUMBER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CRW_ITEM_NUMBER);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_DIFFT_RETAIL_LINK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_DIFFT_RETAIL_LINK);
            			}
            		
        			sb.append("|");
        		
        				if(CENTS_OFF_RETAIL_PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CENTS_OFF_RETAIL_PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(CENTS_OFF_RETAIL_PCT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CENTS_OFF_RETAIL_PCT);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_TEMPERATURE_CTRL_CD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_TEMPERATURE_CTRL_CD);
            			}
            		
        			sb.append("|");
        		
        				if(SPECIAL_HANDLING_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SPECIAL_HANDLING_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_EXP_DATE_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_EXP_DATE_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_SHORT_DATE_MONTH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_SHORT_DATE_MONTH);
            			}
            		
        			sb.append("|");
        		
        				if(LOT_NUMBER_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LOT_NUMBER_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(WAREHOUSE_DEPARTMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(WAREHOUSE_DEPARTMENT);
            			}
            		
        			sb.append("|");
        		
        				if(CONSIGNMENT_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONSIGNMENT_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(GUARANTEED_SALE_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(GUARANTEED_SALE_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(GUARANTEED_RETURN_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(GUARANTEED_RETURN_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(EMPLOYEE_DISCOUNT_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EMPLOYEE_DISCOUNT_IND);
            			}
            		
        			sb.append("|");
        		
        				if(SR_DISCOUNT_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SR_DISCOUNT_IND);
            			}
            		
        			sb.append("|");
        		
        				if(PROF_DISCOUNT_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PROF_DISCOUNT_IND);
            			}
            		
        			sb.append("|");
        		
        				if(DANGEROUS_DRUG_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DANGEROUS_DRUG_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(CONTROL_DRUG_CLASS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONTROL_DRUG_CLASS);
            			}
            		
        			sb.append("|");
        		
        				if(CONTROL_DRUG_NUMBER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONTROL_DRUG_NUMBER);
            			}
            		
        			sb.append("|");
        		
        				if(AVERAGE_WHOLESALE_PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AVERAGE_WHOLESALE_PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_ORDER_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_ORDER_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_ORDER_IND_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_ORDER_IND_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_SLCT_ORDER_METHOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_SLCT_ORDER_METHOD);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_SLCT_ORDER_METH_QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_SLCT_ORDER_METH_QTY);
            			}
            		
        			sb.append("|");
        		
        				if(TOBACCO_TAX_CLASS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TOBACCO_TAX_CLASS);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_BASIC_DEPT_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_BASIC_DEPT_IND);
            			}
            		
        			sb.append("|");
        		
        				if(REPLACED_ITEM_NUMBER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPLACED_ITEM_NUMBER);
            			}
            		
        			sb.append("|");
        		
        				if(REPLACED_EFFECTIVE_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPLACED_EFFECTIVE_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(REPLACED_BY_ITEM_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPLACED_BY_ITEM_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(REPLACED_BY_EFF_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPLACED_BY_EFF_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_STUS_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_STUS_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_STUS_EFF_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_STUS_EFF_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(ADV_ITEM_567_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADV_ITEM_567_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(ADV_STORED_CPY_AVAIL_CDE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADV_STORED_CPY_AVAIL_CDE);
            			}
            		
        			sb.append("|");
        		
        				if(ADV_PHOTO_AVAIL_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADV_PHOTO_AVAIL_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ADV_GB_PRINT_CDE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADV_GB_PRINT_CDE);
            			}
            		
        			sb.append("|");
        		
        				if(REORDER_SOURCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REORDER_SOURCE);
            			}
            		
        			sb.append("|");
        		
        				if(ALCOHOL_PERCENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ALCOHOL_PERCENT);
            			}
            		
        			sb.append("|");
        		
        				if(PRICE_STICKER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICE_STICKER);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(SALEABLE_ITEM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SALEABLE_ITEM);
            			}
            		
        			sb.append("|");
        		
        				if(DUTY_RATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DUTY_RATE);
            			}
            		
        			sb.append("|");
        		
        				if(HARMONIZED_TARIFF_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HARMONIZED_TARIFF_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(WALGREEN_DEPT_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(WALGREEN_DEPT_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(SUB_DEPARTMENT_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SUB_DEPARTMENT_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(COUNTRY_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(COUNTRY_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(AEROSOL_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AEROSOL_IND);
            			}
            		
        			sb.append("|");
        		
        				if(SCHEDULE_2_DRUG_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SCHEDULE_2_DRUG_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ETHNIC_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETHNIC_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(HAZARDOUS_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HAZARDOUS_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_EXP_DATE_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_EXP_DATE_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(PDQ_ALLOWED_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PDQ_ALLOWED_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ORMD_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORMD_IND);
            			}
            		
        			sb.append("|");
        		
        				if(FLAMMABLE_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FLAMMABLE_IND);
            			}
            		
        			sb.append("|");
        		
        				if(CURRENT_BUYER_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CURRENT_BUYER_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(USER_STAMP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(USER_STAMP);
            			}
            		
        			sb.append("|");
        		
        				if(TIME_STAMP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TIME_STAMP);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_STAMP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_STAMP);
            			}
            		
        			sb.append("|");
        		
        				if(errorCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(errorCode);
            			}
            		
        			sb.append("|");
        		
        				if(errorMessage == null){
        					sb.append("<null>");
        				}else{
            				sb.append(errorMessage);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row40Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ITEM_NUMBER, other.ITEM_NUMBER);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row39Struct implements routines.system.IPersistableRow<row39Struct> {
    final static byte[] commonByteArrayLock_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[0];
    static byte[] commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String ITEM_NUMBER;

				public String getITEM_NUMBER () {
					return this.ITEM_NUMBER;
				}
				
			    public String ITEM_NUMBER_CK_DIGIT;

				public String getITEM_NUMBER_CK_DIGIT () {
					return this.ITEM_NUMBER_CK_DIGIT;
				}
				
			    public String MANUFACTURER_NAME;

				public String getMANUFACTURER_NAME () {
					return this.MANUFACTURER_NAME;
				}
				
			    public String MANUFACTURER_STOCK_NBR;

				public String getMANUFACTURER_STOCK_NBR () {
					return this.MANUFACTURER_STOCK_NBR;
				}
				
			    public String PRODUCT_BRAND_NAME;

				public String getPRODUCT_BRAND_NAME () {
					return this.PRODUCT_BRAND_NAME;
				}
				
			    public String PRODUCT_TYPE;

				public String getPRODUCT_TYPE () {
					return this.PRODUCT_TYPE;
				}
				
			    public String ITEM_DESCRIPTION;

				public String getITEM_DESCRIPTION () {
					return this.ITEM_DESCRIPTION;
				}
				
			    public String ITEM_RECEIPT_DESCRIPTION;

				public String getITEM_RECEIPT_DESCRIPTION () {
					return this.ITEM_RECEIPT_DESCRIPTION;
				}
				
			    public String ITEM_MYLAR_DESCRIPTION;

				public String getITEM_MYLAR_DESCRIPTION () {
					return this.ITEM_MYLAR_DESCRIPTION;
				}
				
			    public String ITEM_MYLAR_INDICATOR;

				public String getITEM_MYLAR_INDICATOR () {
					return this.ITEM_MYLAR_INDICATOR;
				}
				
			    public String ITEM_EZ_REF_DESCRIPTION;

				public String getITEM_EZ_REF_DESCRIPTION () {
					return this.ITEM_EZ_REF_DESCRIPTION;
				}
				
			    public String ITEM_SUPPLY_SOURCE;

				public String getITEM_SUPPLY_SOURCE () {
					return this.ITEM_SUPPLY_SOURCE;
				}
				
			    public String UNIT_OF_MEASURE;

				public String getUNIT_OF_MEASURE () {
					return this.UNIT_OF_MEASURE;
				}
				
			    public String ITEM_PURCHASED_CODE;

				public String getITEM_PURCHASED_CODE () {
					return this.ITEM_PURCHASED_CODE;
				}
				
			    public BigDecimal ITEM_QUANTITY_OF_UNIT;

				public BigDecimal getITEM_QUANTITY_OF_UNIT () {
					return this.ITEM_QUANTITY_OF_UNIT;
				}
				
			    public String RETAIL_SELL_UNIT;

				public String getRETAIL_SELL_UNIT () {
					return this.RETAIL_SELL_UNIT;
				}
				
			    public BigDecimal SKUS_PER_RETAIL_UNIT;

				public BigDecimal getSKUS_PER_RETAIL_UNIT () {
					return this.SKUS_PER_RETAIL_UNIT;
				}
				
			    public BigDecimal SKU_CUBE;

				public BigDecimal getSKU_CUBE () {
					return this.SKU_CUBE;
				}
				
			    public BigDecimal SKU_WEIGHT;

				public BigDecimal getSKU_WEIGHT () {
					return this.SKU_WEIGHT;
				}
				
			    public String MERCH_OPSTUDY_NBR;

				public String getMERCH_OPSTUDY_NBR () {
					return this.MERCH_OPSTUDY_NBR;
				}
				
			    public String PROD_CATEG_CODE;

				public String getPROD_CATEG_CODE () {
					return this.PROD_CATEG_CODE;
				}
				
			    public String REPURCHASABLE_CODE;

				public String getREPURCHASABLE_CODE () {
					return this.REPURCHASABLE_CODE;
				}
				
			    public BigDecimal FREIGHT_CLASS_CODE;

				public BigDecimal getFREIGHT_CLASS_CODE () {
					return this.FREIGHT_CLASS_CODE;
				}
				
			    public String ITEM_FOOD_STAMP_CODE;

				public String getITEM_FOOD_STAMP_CODE () {
					return this.ITEM_FOOD_STAMP_CODE;
				}
				
			    public BigDecimal MFG_SUGGESTED_RETAIL;

				public BigDecimal getMFG_SUGGESTED_RETAIL () {
					return this.MFG_SUGGESTED_RETAIL;
				}
				
			    public BigDecimal MFG_SUGG_RETAIL_MULT;

				public BigDecimal getMFG_SUGG_RETAIL_MULT () {
					return this.MFG_SUGG_RETAIL_MULT;
				}
				
			    public String PRICE_CLASS;

				public String getPRICE_CLASS () {
					return this.PRICE_CLASS;
				}
				
			    public BigDecimal ITEM_COST_LINK;

				public BigDecimal getITEM_COST_LINK () {
					return this.ITEM_COST_LINK;
				}
				
			    public String SAME_RETAIL_LINK;

				public String getSAME_RETAIL_LINK () {
					return this.SAME_RETAIL_LINK;
				}
				
			    public String PRODUCT_PRE_PRICE_IND;

				public String getPRODUCT_PRE_PRICE_IND () {
					return this.PRODUCT_PRE_PRICE_IND;
				}
				
			    public String ITEM_PRICE_REQUIRED_IND;

				public String getITEM_PRICE_REQUIRED_IND () {
					return this.ITEM_PRICE_REQUIRED_IND;
				}
				
			    public String TRIAL_SIZE_INDICATOR;

				public String getTRIAL_SIZE_INDICATOR () {
					return this.TRIAL_SIZE_INDICATOR;
				}
				
			    public String TEST_ITEM_INDICATOR;

				public String getTEST_ITEM_INDICATOR () {
					return this.TEST_ITEM_INDICATOR;
				}
				
			    public String EXPENSE_ITEM_INDICATOR;

				public String getEXPENSE_ITEM_INDICATOR () {
					return this.EXPENSE_ITEM_INDICATOR;
				}
				
			    public String CRW_ITEM_INDICATOR;

				public String getCRW_ITEM_INDICATOR () {
					return this.CRW_ITEM_INDICATOR;
				}
				
			    public String CRW_ITEM_NUMBER;

				public String getCRW_ITEM_NUMBER () {
					return this.CRW_ITEM_NUMBER;
				}
				
			    public String ITEM_DIFFT_RETAIL_LINK;

				public String getITEM_DIFFT_RETAIL_LINK () {
					return this.ITEM_DIFFT_RETAIL_LINK;
				}
				
			    public BigDecimal CENTS_OFF_RETAIL_PRICE;

				public BigDecimal getCENTS_OFF_RETAIL_PRICE () {
					return this.CENTS_OFF_RETAIL_PRICE;
				}
				
			    public BigDecimal CENTS_OFF_RETAIL_PCT;

				public BigDecimal getCENTS_OFF_RETAIL_PCT () {
					return this.CENTS_OFF_RETAIL_PCT;
				}
				
			    public String ITEM_TEMPERATURE_CTRL_CD;

				public String getITEM_TEMPERATURE_CTRL_CD () {
					return this.ITEM_TEMPERATURE_CTRL_CD;
				}
				
			    public String SPECIAL_HANDLING_CODE;

				public String getSPECIAL_HANDLING_CODE () {
					return this.SPECIAL_HANDLING_CODE;
				}
				
			    public BigDecimal ITEM_EXP_DATE_CODE;

				public BigDecimal getITEM_EXP_DATE_CODE () {
					return this.ITEM_EXP_DATE_CODE;
				}
				
			    public BigDecimal ITEM_SHORT_DATE_MONTH;

				public BigDecimal getITEM_SHORT_DATE_MONTH () {
					return this.ITEM_SHORT_DATE_MONTH;
				}
				
			    public String LOT_NUMBER_CODE;

				public String getLOT_NUMBER_CODE () {
					return this.LOT_NUMBER_CODE;
				}
				
			    public String WAREHOUSE_DEPARTMENT;

				public String getWAREHOUSE_DEPARTMENT () {
					return this.WAREHOUSE_DEPARTMENT;
				}
				
			    public String CONSIGNMENT_INDICATOR;

				public String getCONSIGNMENT_INDICATOR () {
					return this.CONSIGNMENT_INDICATOR;
				}
				
			    public String GUARANTEED_SALE_CODE;

				public String getGUARANTEED_SALE_CODE () {
					return this.GUARANTEED_SALE_CODE;
				}
				
			    public BigDecimal GUARANTEED_RETURN_DATE;

				public BigDecimal getGUARANTEED_RETURN_DATE () {
					return this.GUARANTEED_RETURN_DATE;
				}
				
			    public String EMPLOYEE_DISCOUNT_IND;

				public String getEMPLOYEE_DISCOUNT_IND () {
					return this.EMPLOYEE_DISCOUNT_IND;
				}
				
			    public String SR_DISCOUNT_IND;

				public String getSR_DISCOUNT_IND () {
					return this.SR_DISCOUNT_IND;
				}
				
			    public String PROF_DISCOUNT_IND;

				public String getPROF_DISCOUNT_IND () {
					return this.PROF_DISCOUNT_IND;
				}
				
			    public String DANGEROUS_DRUG_INDICATOR;

				public String getDANGEROUS_DRUG_INDICATOR () {
					return this.DANGEROUS_DRUG_INDICATOR;
				}
				
			    public String CONTROL_DRUG_CLASS;

				public String getCONTROL_DRUG_CLASS () {
					return this.CONTROL_DRUG_CLASS;
				}
				
			    public String CONTROL_DRUG_NUMBER;

				public String getCONTROL_DRUG_NUMBER () {
					return this.CONTROL_DRUG_NUMBER;
				}
				
			    public BigDecimal AVERAGE_WHOLESALE_PRICE;

				public BigDecimal getAVERAGE_WHOLESALE_PRICE () {
					return this.AVERAGE_WHOLESALE_PRICE;
				}
				
			    public String ITEM_ORDER_INDICATOR;

				public String getITEM_ORDER_INDICATOR () {
					return this.ITEM_ORDER_INDICATOR;
				}
				
			    public BigDecimal ITEM_ORDER_IND_DATE;

				public BigDecimal getITEM_ORDER_IND_DATE () {
					return this.ITEM_ORDER_IND_DATE;
				}
				
			    public String ITEM_SLCT_ORDER_METHOD;

				public String getITEM_SLCT_ORDER_METHOD () {
					return this.ITEM_SLCT_ORDER_METHOD;
				}
				
			    public BigDecimal ITEM_SLCT_ORDER_METH_QTY;

				public BigDecimal getITEM_SLCT_ORDER_METH_QTY () {
					return this.ITEM_SLCT_ORDER_METH_QTY;
				}
				
			    public String TOBACCO_TAX_CLASS;

				public String getTOBACCO_TAX_CLASS () {
					return this.TOBACCO_TAX_CLASS;
				}
				
			    public String ITEM_BASIC_DEPT_IND;

				public String getITEM_BASIC_DEPT_IND () {
					return this.ITEM_BASIC_DEPT_IND;
				}
				
			    public String REPLACED_ITEM_NUMBER;

				public String getREPLACED_ITEM_NUMBER () {
					return this.REPLACED_ITEM_NUMBER;
				}
				
			    public BigDecimal REPLACED_EFFECTIVE_DATE;

				public BigDecimal getREPLACED_EFFECTIVE_DATE () {
					return this.REPLACED_EFFECTIVE_DATE;
				}
				
			    public String REPLACED_BY_ITEM_NBR;

				public String getREPLACED_BY_ITEM_NBR () {
					return this.REPLACED_BY_ITEM_NBR;
				}
				
			    public BigDecimal REPLACED_BY_EFF_DATE;

				public BigDecimal getREPLACED_BY_EFF_DATE () {
					return this.REPLACED_BY_EFF_DATE;
				}
				
			    public String ITEM_STUS_IND;

				public String getITEM_STUS_IND () {
					return this.ITEM_STUS_IND;
				}
				
			    public BigDecimal ITEM_STUS_EFF_DATE;

				public BigDecimal getITEM_STUS_EFF_DATE () {
					return this.ITEM_STUS_EFF_DATE;
				}
				
			    public String ADV_ITEM_567_INDICATOR;

				public String getADV_ITEM_567_INDICATOR () {
					return this.ADV_ITEM_567_INDICATOR;
				}
				
			    public String ADV_STORED_CPY_AVAIL_CDE;

				public String getADV_STORED_CPY_AVAIL_CDE () {
					return this.ADV_STORED_CPY_AVAIL_CDE;
				}
				
			    public String ADV_PHOTO_AVAIL_CODE;

				public String getADV_PHOTO_AVAIL_CODE () {
					return this.ADV_PHOTO_AVAIL_CODE;
				}
				
			    public String ADV_GB_PRINT_CDE;

				public String getADV_GB_PRINT_CDE () {
					return this.ADV_GB_PRINT_CDE;
				}
				
			    public String REORDER_SOURCE;

				public String getREORDER_SOURCE () {
					return this.REORDER_SOURCE;
				}
				
			    public BigDecimal ALCOHOL_PERCENT;

				public BigDecimal getALCOHOL_PERCENT () {
					return this.ALCOHOL_PERCENT;
				}
				
			    public String PRICE_STICKER;

				public String getPRICE_STICKER () {
					return this.PRICE_STICKER;
				}
				
			    public String ITEM_TYPE;

				public String getITEM_TYPE () {
					return this.ITEM_TYPE;
				}
				
			    public String SALEABLE_ITEM;

				public String getSALEABLE_ITEM () {
					return this.SALEABLE_ITEM;
				}
				
			    public BigDecimal DUTY_RATE;

				public BigDecimal getDUTY_RATE () {
					return this.DUTY_RATE;
				}
				
			    public BigDecimal HARMONIZED_TARIFF_NBR;

				public BigDecimal getHARMONIZED_TARIFF_NBR () {
					return this.HARMONIZED_TARIFF_NBR;
				}
				
			    public String WALGREEN_DEPT_NBR;

				public String getWALGREEN_DEPT_NBR () {
					return this.WALGREEN_DEPT_NBR;
				}
				
			    public String SUB_DEPARTMENT_NBR;

				public String getSUB_DEPARTMENT_NBR () {
					return this.SUB_DEPARTMENT_NBR;
				}
				
			    public String COUNTRY_CODE;

				public String getCOUNTRY_CODE () {
					return this.COUNTRY_CODE;
				}
				
			    public String AEROSOL_IND;

				public String getAEROSOL_IND () {
					return this.AEROSOL_IND;
				}
				
			    public String SCHEDULE_2_DRUG_IND;

				public String getSCHEDULE_2_DRUG_IND () {
					return this.SCHEDULE_2_DRUG_IND;
				}
				
			    public String ETHNIC_CODE;

				public String getETHNIC_CODE () {
					return this.ETHNIC_CODE;
				}
				
			    public String HAZARDOUS_IND;

				public String getHAZARDOUS_IND () {
					return this.HAZARDOUS_IND;
				}
				
			    public String ITEM_EXP_DATE_TYPE;

				public String getITEM_EXP_DATE_TYPE () {
					return this.ITEM_EXP_DATE_TYPE;
				}
				
			    public String PDQ_ALLOWED_IND;

				public String getPDQ_ALLOWED_IND () {
					return this.PDQ_ALLOWED_IND;
				}
				
			    public String ORMD_IND;

				public String getORMD_IND () {
					return this.ORMD_IND;
				}
				
			    public String FLAMMABLE_IND;

				public String getFLAMMABLE_IND () {
					return this.FLAMMABLE_IND;
				}
				
			    public String CURRENT_BUYER_NBR;

				public String getCURRENT_BUYER_NBR () {
					return this.CURRENT_BUYER_NBR;
				}
				
			    public String USER_STAMP;

				public String getUSER_STAMP () {
					return this.USER_STAMP;
				}
				
			    public BigDecimal TIME_STAMP;

				public BigDecimal getTIME_STAMP () {
					return this.TIME_STAMP;
				}
				
			    public BigDecimal DATE_STAMP;

				public BigDecimal getDATE_STAMP () {
					return this.DATE_STAMP;
				}
				
			    public String errorCode;

				public String getErrorCode () {
					return this.errorCode;
				}
				
			    public String errorMessage;

				public String getErrorMessage () {
					return this.errorMessage;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.ITEM_NUMBER == null) ? 0 : this.ITEM_NUMBER.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final row39Struct other = (row39Struct) obj;
		
						if (this.ITEM_NUMBER == null) {
							if (other.ITEM_NUMBER != null)
								return false;
						
						} else if (!this.ITEM_NUMBER.equals(other.ITEM_NUMBER))
						
							return false;
					

		return true;
    }

	public void copyDataTo(row39Struct other) {

		other.ITEM_NUMBER = this.ITEM_NUMBER;
	            other.ITEM_NUMBER_CK_DIGIT = this.ITEM_NUMBER_CK_DIGIT;
	            other.MANUFACTURER_NAME = this.MANUFACTURER_NAME;
	            other.MANUFACTURER_STOCK_NBR = this.MANUFACTURER_STOCK_NBR;
	            other.PRODUCT_BRAND_NAME = this.PRODUCT_BRAND_NAME;
	            other.PRODUCT_TYPE = this.PRODUCT_TYPE;
	            other.ITEM_DESCRIPTION = this.ITEM_DESCRIPTION;
	            other.ITEM_RECEIPT_DESCRIPTION = this.ITEM_RECEIPT_DESCRIPTION;
	            other.ITEM_MYLAR_DESCRIPTION = this.ITEM_MYLAR_DESCRIPTION;
	            other.ITEM_MYLAR_INDICATOR = this.ITEM_MYLAR_INDICATOR;
	            other.ITEM_EZ_REF_DESCRIPTION = this.ITEM_EZ_REF_DESCRIPTION;
	            other.ITEM_SUPPLY_SOURCE = this.ITEM_SUPPLY_SOURCE;
	            other.UNIT_OF_MEASURE = this.UNIT_OF_MEASURE;
	            other.ITEM_PURCHASED_CODE = this.ITEM_PURCHASED_CODE;
	            other.ITEM_QUANTITY_OF_UNIT = this.ITEM_QUANTITY_OF_UNIT;
	            other.RETAIL_SELL_UNIT = this.RETAIL_SELL_UNIT;
	            other.SKUS_PER_RETAIL_UNIT = this.SKUS_PER_RETAIL_UNIT;
	            other.SKU_CUBE = this.SKU_CUBE;
	            other.SKU_WEIGHT = this.SKU_WEIGHT;
	            other.MERCH_OPSTUDY_NBR = this.MERCH_OPSTUDY_NBR;
	            other.PROD_CATEG_CODE = this.PROD_CATEG_CODE;
	            other.REPURCHASABLE_CODE = this.REPURCHASABLE_CODE;
	            other.FREIGHT_CLASS_CODE = this.FREIGHT_CLASS_CODE;
	            other.ITEM_FOOD_STAMP_CODE = this.ITEM_FOOD_STAMP_CODE;
	            other.MFG_SUGGESTED_RETAIL = this.MFG_SUGGESTED_RETAIL;
	            other.MFG_SUGG_RETAIL_MULT = this.MFG_SUGG_RETAIL_MULT;
	            other.PRICE_CLASS = this.PRICE_CLASS;
	            other.ITEM_COST_LINK = this.ITEM_COST_LINK;
	            other.SAME_RETAIL_LINK = this.SAME_RETAIL_LINK;
	            other.PRODUCT_PRE_PRICE_IND = this.PRODUCT_PRE_PRICE_IND;
	            other.ITEM_PRICE_REQUIRED_IND = this.ITEM_PRICE_REQUIRED_IND;
	            other.TRIAL_SIZE_INDICATOR = this.TRIAL_SIZE_INDICATOR;
	            other.TEST_ITEM_INDICATOR = this.TEST_ITEM_INDICATOR;
	            other.EXPENSE_ITEM_INDICATOR = this.EXPENSE_ITEM_INDICATOR;
	            other.CRW_ITEM_INDICATOR = this.CRW_ITEM_INDICATOR;
	            other.CRW_ITEM_NUMBER = this.CRW_ITEM_NUMBER;
	            other.ITEM_DIFFT_RETAIL_LINK = this.ITEM_DIFFT_RETAIL_LINK;
	            other.CENTS_OFF_RETAIL_PRICE = this.CENTS_OFF_RETAIL_PRICE;
	            other.CENTS_OFF_RETAIL_PCT = this.CENTS_OFF_RETAIL_PCT;
	            other.ITEM_TEMPERATURE_CTRL_CD = this.ITEM_TEMPERATURE_CTRL_CD;
	            other.SPECIAL_HANDLING_CODE = this.SPECIAL_HANDLING_CODE;
	            other.ITEM_EXP_DATE_CODE = this.ITEM_EXP_DATE_CODE;
	            other.ITEM_SHORT_DATE_MONTH = this.ITEM_SHORT_DATE_MONTH;
	            other.LOT_NUMBER_CODE = this.LOT_NUMBER_CODE;
	            other.WAREHOUSE_DEPARTMENT = this.WAREHOUSE_DEPARTMENT;
	            other.CONSIGNMENT_INDICATOR = this.CONSIGNMENT_INDICATOR;
	            other.GUARANTEED_SALE_CODE = this.GUARANTEED_SALE_CODE;
	            other.GUARANTEED_RETURN_DATE = this.GUARANTEED_RETURN_DATE;
	            other.EMPLOYEE_DISCOUNT_IND = this.EMPLOYEE_DISCOUNT_IND;
	            other.SR_DISCOUNT_IND = this.SR_DISCOUNT_IND;
	            other.PROF_DISCOUNT_IND = this.PROF_DISCOUNT_IND;
	            other.DANGEROUS_DRUG_INDICATOR = this.DANGEROUS_DRUG_INDICATOR;
	            other.CONTROL_DRUG_CLASS = this.CONTROL_DRUG_CLASS;
	            other.CONTROL_DRUG_NUMBER = this.CONTROL_DRUG_NUMBER;
	            other.AVERAGE_WHOLESALE_PRICE = this.AVERAGE_WHOLESALE_PRICE;
	            other.ITEM_ORDER_INDICATOR = this.ITEM_ORDER_INDICATOR;
	            other.ITEM_ORDER_IND_DATE = this.ITEM_ORDER_IND_DATE;
	            other.ITEM_SLCT_ORDER_METHOD = this.ITEM_SLCT_ORDER_METHOD;
	            other.ITEM_SLCT_ORDER_METH_QTY = this.ITEM_SLCT_ORDER_METH_QTY;
	            other.TOBACCO_TAX_CLASS = this.TOBACCO_TAX_CLASS;
	            other.ITEM_BASIC_DEPT_IND = this.ITEM_BASIC_DEPT_IND;
	            other.REPLACED_ITEM_NUMBER = this.REPLACED_ITEM_NUMBER;
	            other.REPLACED_EFFECTIVE_DATE = this.REPLACED_EFFECTIVE_DATE;
	            other.REPLACED_BY_ITEM_NBR = this.REPLACED_BY_ITEM_NBR;
	            other.REPLACED_BY_EFF_DATE = this.REPLACED_BY_EFF_DATE;
	            other.ITEM_STUS_IND = this.ITEM_STUS_IND;
	            other.ITEM_STUS_EFF_DATE = this.ITEM_STUS_EFF_DATE;
	            other.ADV_ITEM_567_INDICATOR = this.ADV_ITEM_567_INDICATOR;
	            other.ADV_STORED_CPY_AVAIL_CDE = this.ADV_STORED_CPY_AVAIL_CDE;
	            other.ADV_PHOTO_AVAIL_CODE = this.ADV_PHOTO_AVAIL_CODE;
	            other.ADV_GB_PRINT_CDE = this.ADV_GB_PRINT_CDE;
	            other.REORDER_SOURCE = this.REORDER_SOURCE;
	            other.ALCOHOL_PERCENT = this.ALCOHOL_PERCENT;
	            other.PRICE_STICKER = this.PRICE_STICKER;
	            other.ITEM_TYPE = this.ITEM_TYPE;
	            other.SALEABLE_ITEM = this.SALEABLE_ITEM;
	            other.DUTY_RATE = this.DUTY_RATE;
	            other.HARMONIZED_TARIFF_NBR = this.HARMONIZED_TARIFF_NBR;
	            other.WALGREEN_DEPT_NBR = this.WALGREEN_DEPT_NBR;
	            other.SUB_DEPARTMENT_NBR = this.SUB_DEPARTMENT_NBR;
	            other.COUNTRY_CODE = this.COUNTRY_CODE;
	            other.AEROSOL_IND = this.AEROSOL_IND;
	            other.SCHEDULE_2_DRUG_IND = this.SCHEDULE_2_DRUG_IND;
	            other.ETHNIC_CODE = this.ETHNIC_CODE;
	            other.HAZARDOUS_IND = this.HAZARDOUS_IND;
	            other.ITEM_EXP_DATE_TYPE = this.ITEM_EXP_DATE_TYPE;
	            other.PDQ_ALLOWED_IND = this.PDQ_ALLOWED_IND;
	            other.ORMD_IND = this.ORMD_IND;
	            other.FLAMMABLE_IND = this.FLAMMABLE_IND;
	            other.CURRENT_BUYER_NBR = this.CURRENT_BUYER_NBR;
	            other.USER_STAMP = this.USER_STAMP;
	            other.TIME_STAMP = this.TIME_STAMP;
	            other.DATE_STAMP = this.DATE_STAMP;
	            other.errorCode = this.errorCode;
	            other.errorMessage = this.errorMessage;
	            
	}

	public void copyKeysDataTo(row39Struct other) {

		other.ITEM_NUMBER = this.ITEM_NUMBER;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job.length) {
				if(length < 1024 && commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job.length == 0) {
   					commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[1024];
				} else {
   					commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job, 0, length);
			strReturn = new String(commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job) {

        	try {

        		int length = 0;
		
					this.ITEM_NUMBER = readString(dis);
					
					this.ITEM_NUMBER_CK_DIGIT = readString(dis);
					
					this.MANUFACTURER_NAME = readString(dis);
					
					this.MANUFACTURER_STOCK_NBR = readString(dis);
					
					this.PRODUCT_BRAND_NAME = readString(dis);
					
					this.PRODUCT_TYPE = readString(dis);
					
					this.ITEM_DESCRIPTION = readString(dis);
					
					this.ITEM_RECEIPT_DESCRIPTION = readString(dis);
					
					this.ITEM_MYLAR_DESCRIPTION = readString(dis);
					
					this.ITEM_MYLAR_INDICATOR = readString(dis);
					
					this.ITEM_EZ_REF_DESCRIPTION = readString(dis);
					
					this.ITEM_SUPPLY_SOURCE = readString(dis);
					
					this.UNIT_OF_MEASURE = readString(dis);
					
					this.ITEM_PURCHASED_CODE = readString(dis);
					
						this.ITEM_QUANTITY_OF_UNIT = (BigDecimal) dis.readObject();
					
					this.RETAIL_SELL_UNIT = readString(dis);
					
						this.SKUS_PER_RETAIL_UNIT = (BigDecimal) dis.readObject();
					
						this.SKU_CUBE = (BigDecimal) dis.readObject();
					
						this.SKU_WEIGHT = (BigDecimal) dis.readObject();
					
					this.MERCH_OPSTUDY_NBR = readString(dis);
					
					this.PROD_CATEG_CODE = readString(dis);
					
					this.REPURCHASABLE_CODE = readString(dis);
					
						this.FREIGHT_CLASS_CODE = (BigDecimal) dis.readObject();
					
					this.ITEM_FOOD_STAMP_CODE = readString(dis);
					
						this.MFG_SUGGESTED_RETAIL = (BigDecimal) dis.readObject();
					
						this.MFG_SUGG_RETAIL_MULT = (BigDecimal) dis.readObject();
					
					this.PRICE_CLASS = readString(dis);
					
						this.ITEM_COST_LINK = (BigDecimal) dis.readObject();
					
					this.SAME_RETAIL_LINK = readString(dis);
					
					this.PRODUCT_PRE_PRICE_IND = readString(dis);
					
					this.ITEM_PRICE_REQUIRED_IND = readString(dis);
					
					this.TRIAL_SIZE_INDICATOR = readString(dis);
					
					this.TEST_ITEM_INDICATOR = readString(dis);
					
					this.EXPENSE_ITEM_INDICATOR = readString(dis);
					
					this.CRW_ITEM_INDICATOR = readString(dis);
					
					this.CRW_ITEM_NUMBER = readString(dis);
					
					this.ITEM_DIFFT_RETAIL_LINK = readString(dis);
					
						this.CENTS_OFF_RETAIL_PRICE = (BigDecimal) dis.readObject();
					
						this.CENTS_OFF_RETAIL_PCT = (BigDecimal) dis.readObject();
					
					this.ITEM_TEMPERATURE_CTRL_CD = readString(dis);
					
					this.SPECIAL_HANDLING_CODE = readString(dis);
					
						this.ITEM_EXP_DATE_CODE = (BigDecimal) dis.readObject();
					
						this.ITEM_SHORT_DATE_MONTH = (BigDecimal) dis.readObject();
					
					this.LOT_NUMBER_CODE = readString(dis);
					
					this.WAREHOUSE_DEPARTMENT = readString(dis);
					
					this.CONSIGNMENT_INDICATOR = readString(dis);
					
					this.GUARANTEED_SALE_CODE = readString(dis);
					
						this.GUARANTEED_RETURN_DATE = (BigDecimal) dis.readObject();
					
					this.EMPLOYEE_DISCOUNT_IND = readString(dis);
					
					this.SR_DISCOUNT_IND = readString(dis);
					
					this.PROF_DISCOUNT_IND = readString(dis);
					
					this.DANGEROUS_DRUG_INDICATOR = readString(dis);
					
					this.CONTROL_DRUG_CLASS = readString(dis);
					
					this.CONTROL_DRUG_NUMBER = readString(dis);
					
						this.AVERAGE_WHOLESALE_PRICE = (BigDecimal) dis.readObject();
					
					this.ITEM_ORDER_INDICATOR = readString(dis);
					
						this.ITEM_ORDER_IND_DATE = (BigDecimal) dis.readObject();
					
					this.ITEM_SLCT_ORDER_METHOD = readString(dis);
					
						this.ITEM_SLCT_ORDER_METH_QTY = (BigDecimal) dis.readObject();
					
					this.TOBACCO_TAX_CLASS = readString(dis);
					
					this.ITEM_BASIC_DEPT_IND = readString(dis);
					
					this.REPLACED_ITEM_NUMBER = readString(dis);
					
						this.REPLACED_EFFECTIVE_DATE = (BigDecimal) dis.readObject();
					
					this.REPLACED_BY_ITEM_NBR = readString(dis);
					
						this.REPLACED_BY_EFF_DATE = (BigDecimal) dis.readObject();
					
					this.ITEM_STUS_IND = readString(dis);
					
						this.ITEM_STUS_EFF_DATE = (BigDecimal) dis.readObject();
					
					this.ADV_ITEM_567_INDICATOR = readString(dis);
					
					this.ADV_STORED_CPY_AVAIL_CDE = readString(dis);
					
					this.ADV_PHOTO_AVAIL_CODE = readString(dis);
					
					this.ADV_GB_PRINT_CDE = readString(dis);
					
					this.REORDER_SOURCE = readString(dis);
					
						this.ALCOHOL_PERCENT = (BigDecimal) dis.readObject();
					
					this.PRICE_STICKER = readString(dis);
					
					this.ITEM_TYPE = readString(dis);
					
					this.SALEABLE_ITEM = readString(dis);
					
						this.DUTY_RATE = (BigDecimal) dis.readObject();
					
						this.HARMONIZED_TARIFF_NBR = (BigDecimal) dis.readObject();
					
					this.WALGREEN_DEPT_NBR = readString(dis);
					
					this.SUB_DEPARTMENT_NBR = readString(dis);
					
					this.COUNTRY_CODE = readString(dis);
					
					this.AEROSOL_IND = readString(dis);
					
					this.SCHEDULE_2_DRUG_IND = readString(dis);
					
					this.ETHNIC_CODE = readString(dis);
					
					this.HAZARDOUS_IND = readString(dis);
					
					this.ITEM_EXP_DATE_TYPE = readString(dis);
					
					this.PDQ_ALLOWED_IND = readString(dis);
					
					this.ORMD_IND = readString(dis);
					
					this.FLAMMABLE_IND = readString(dis);
					
					this.CURRENT_BUYER_NBR = readString(dis);
					
					this.USER_STAMP = readString(dis);
					
						this.TIME_STAMP = (BigDecimal) dis.readObject();
					
						this.DATE_STAMP = (BigDecimal) dis.readObject();
					
					this.errorCode = readString(dis);
					
					this.errorMessage = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ITEM_NUMBER,dos);
					
					// String
				
						writeString(this.ITEM_NUMBER_CK_DIGIT,dos);
					
					// String
				
						writeString(this.MANUFACTURER_NAME,dos);
					
					// String
				
						writeString(this.MANUFACTURER_STOCK_NBR,dos);
					
					// String
				
						writeString(this.PRODUCT_BRAND_NAME,dos);
					
					// String
				
						writeString(this.PRODUCT_TYPE,dos);
					
					// String
				
						writeString(this.ITEM_DESCRIPTION,dos);
					
					// String
				
						writeString(this.ITEM_RECEIPT_DESCRIPTION,dos);
					
					// String
				
						writeString(this.ITEM_MYLAR_DESCRIPTION,dos);
					
					// String
				
						writeString(this.ITEM_MYLAR_INDICATOR,dos);
					
					// String
				
						writeString(this.ITEM_EZ_REF_DESCRIPTION,dos);
					
					// String
				
						writeString(this.ITEM_SUPPLY_SOURCE,dos);
					
					// String
				
						writeString(this.UNIT_OF_MEASURE,dos);
					
					// String
				
						writeString(this.ITEM_PURCHASED_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_QUANTITY_OF_UNIT);
					
					// String
				
						writeString(this.RETAIL_SELL_UNIT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SKUS_PER_RETAIL_UNIT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SKU_CUBE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SKU_WEIGHT);
					
					// String
				
						writeString(this.MERCH_OPSTUDY_NBR,dos);
					
					// String
				
						writeString(this.PROD_CATEG_CODE,dos);
					
					// String
				
						writeString(this.REPURCHASABLE_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FREIGHT_CLASS_CODE);
					
					// String
				
						writeString(this.ITEM_FOOD_STAMP_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MFG_SUGGESTED_RETAIL);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MFG_SUGG_RETAIL_MULT);
					
					// String
				
						writeString(this.PRICE_CLASS,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_COST_LINK);
					
					// String
				
						writeString(this.SAME_RETAIL_LINK,dos);
					
					// String
				
						writeString(this.PRODUCT_PRE_PRICE_IND,dos);
					
					// String
				
						writeString(this.ITEM_PRICE_REQUIRED_IND,dos);
					
					// String
				
						writeString(this.TRIAL_SIZE_INDICATOR,dos);
					
					// String
				
						writeString(this.TEST_ITEM_INDICATOR,dos);
					
					// String
				
						writeString(this.EXPENSE_ITEM_INDICATOR,dos);
					
					// String
				
						writeString(this.CRW_ITEM_INDICATOR,dos);
					
					// String
				
						writeString(this.CRW_ITEM_NUMBER,dos);
					
					// String
				
						writeString(this.ITEM_DIFFT_RETAIL_LINK,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CENTS_OFF_RETAIL_PRICE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CENTS_OFF_RETAIL_PCT);
					
					// String
				
						writeString(this.ITEM_TEMPERATURE_CTRL_CD,dos);
					
					// String
				
						writeString(this.SPECIAL_HANDLING_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_EXP_DATE_CODE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_SHORT_DATE_MONTH);
					
					// String
				
						writeString(this.LOT_NUMBER_CODE,dos);
					
					// String
				
						writeString(this.WAREHOUSE_DEPARTMENT,dos);
					
					// String
				
						writeString(this.CONSIGNMENT_INDICATOR,dos);
					
					// String
				
						writeString(this.GUARANTEED_SALE_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.GUARANTEED_RETURN_DATE);
					
					// String
				
						writeString(this.EMPLOYEE_DISCOUNT_IND,dos);
					
					// String
				
						writeString(this.SR_DISCOUNT_IND,dos);
					
					// String
				
						writeString(this.PROF_DISCOUNT_IND,dos);
					
					// String
				
						writeString(this.DANGEROUS_DRUG_INDICATOR,dos);
					
					// String
				
						writeString(this.CONTROL_DRUG_CLASS,dos);
					
					// String
				
						writeString(this.CONTROL_DRUG_NUMBER,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.AVERAGE_WHOLESALE_PRICE);
					
					// String
				
						writeString(this.ITEM_ORDER_INDICATOR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_ORDER_IND_DATE);
					
					// String
				
						writeString(this.ITEM_SLCT_ORDER_METHOD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_SLCT_ORDER_METH_QTY);
					
					// String
				
						writeString(this.TOBACCO_TAX_CLASS,dos);
					
					// String
				
						writeString(this.ITEM_BASIC_DEPT_IND,dos);
					
					// String
				
						writeString(this.REPLACED_ITEM_NUMBER,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REPLACED_EFFECTIVE_DATE);
					
					// String
				
						writeString(this.REPLACED_BY_ITEM_NBR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REPLACED_BY_EFF_DATE);
					
					// String
				
						writeString(this.ITEM_STUS_IND,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_STUS_EFF_DATE);
					
					// String
				
						writeString(this.ADV_ITEM_567_INDICATOR,dos);
					
					// String
				
						writeString(this.ADV_STORED_CPY_AVAIL_CDE,dos);
					
					// String
				
						writeString(this.ADV_PHOTO_AVAIL_CODE,dos);
					
					// String
				
						writeString(this.ADV_GB_PRINT_CDE,dos);
					
					// String
				
						writeString(this.REORDER_SOURCE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ALCOHOL_PERCENT);
					
					// String
				
						writeString(this.PRICE_STICKER,dos);
					
					// String
				
						writeString(this.ITEM_TYPE,dos);
					
					// String
				
						writeString(this.SALEABLE_ITEM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DUTY_RATE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.HARMONIZED_TARIFF_NBR);
					
					// String
				
						writeString(this.WALGREEN_DEPT_NBR,dos);
					
					// String
				
						writeString(this.SUB_DEPARTMENT_NBR,dos);
					
					// String
				
						writeString(this.COUNTRY_CODE,dos);
					
					// String
				
						writeString(this.AEROSOL_IND,dos);
					
					// String
				
						writeString(this.SCHEDULE_2_DRUG_IND,dos);
					
					// String
				
						writeString(this.ETHNIC_CODE,dos);
					
					// String
				
						writeString(this.HAZARDOUS_IND,dos);
					
					// String
				
						writeString(this.ITEM_EXP_DATE_TYPE,dos);
					
					// String
				
						writeString(this.PDQ_ALLOWED_IND,dos);
					
					// String
				
						writeString(this.ORMD_IND,dos);
					
					// String
				
						writeString(this.FLAMMABLE_IND,dos);
					
					// String
				
						writeString(this.CURRENT_BUYER_NBR,dos);
					
					// String
				
						writeString(this.USER_STAMP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TIME_STAMP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DATE_STAMP);
					
					// String
				
						writeString(this.errorCode,dos);
					
					// String
				
						writeString(this.errorMessage,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ITEM_NUMBER="+ITEM_NUMBER);
		sb.append(",ITEM_NUMBER_CK_DIGIT="+ITEM_NUMBER_CK_DIGIT);
		sb.append(",MANUFACTURER_NAME="+MANUFACTURER_NAME);
		sb.append(",MANUFACTURER_STOCK_NBR="+MANUFACTURER_STOCK_NBR);
		sb.append(",PRODUCT_BRAND_NAME="+PRODUCT_BRAND_NAME);
		sb.append(",PRODUCT_TYPE="+PRODUCT_TYPE);
		sb.append(",ITEM_DESCRIPTION="+ITEM_DESCRIPTION);
		sb.append(",ITEM_RECEIPT_DESCRIPTION="+ITEM_RECEIPT_DESCRIPTION);
		sb.append(",ITEM_MYLAR_DESCRIPTION="+ITEM_MYLAR_DESCRIPTION);
		sb.append(",ITEM_MYLAR_INDICATOR="+ITEM_MYLAR_INDICATOR);
		sb.append(",ITEM_EZ_REF_DESCRIPTION="+ITEM_EZ_REF_DESCRIPTION);
		sb.append(",ITEM_SUPPLY_SOURCE="+ITEM_SUPPLY_SOURCE);
		sb.append(",UNIT_OF_MEASURE="+UNIT_OF_MEASURE);
		sb.append(",ITEM_PURCHASED_CODE="+ITEM_PURCHASED_CODE);
		sb.append(",ITEM_QUANTITY_OF_UNIT="+String.valueOf(ITEM_QUANTITY_OF_UNIT));
		sb.append(",RETAIL_SELL_UNIT="+RETAIL_SELL_UNIT);
		sb.append(",SKUS_PER_RETAIL_UNIT="+String.valueOf(SKUS_PER_RETAIL_UNIT));
		sb.append(",SKU_CUBE="+String.valueOf(SKU_CUBE));
		sb.append(",SKU_WEIGHT="+String.valueOf(SKU_WEIGHT));
		sb.append(",MERCH_OPSTUDY_NBR="+MERCH_OPSTUDY_NBR);
		sb.append(",PROD_CATEG_CODE="+PROD_CATEG_CODE);
		sb.append(",REPURCHASABLE_CODE="+REPURCHASABLE_CODE);
		sb.append(",FREIGHT_CLASS_CODE="+String.valueOf(FREIGHT_CLASS_CODE));
		sb.append(",ITEM_FOOD_STAMP_CODE="+ITEM_FOOD_STAMP_CODE);
		sb.append(",MFG_SUGGESTED_RETAIL="+String.valueOf(MFG_SUGGESTED_RETAIL));
		sb.append(",MFG_SUGG_RETAIL_MULT="+String.valueOf(MFG_SUGG_RETAIL_MULT));
		sb.append(",PRICE_CLASS="+PRICE_CLASS);
		sb.append(",ITEM_COST_LINK="+String.valueOf(ITEM_COST_LINK));
		sb.append(",SAME_RETAIL_LINK="+SAME_RETAIL_LINK);
		sb.append(",PRODUCT_PRE_PRICE_IND="+PRODUCT_PRE_PRICE_IND);
		sb.append(",ITEM_PRICE_REQUIRED_IND="+ITEM_PRICE_REQUIRED_IND);
		sb.append(",TRIAL_SIZE_INDICATOR="+TRIAL_SIZE_INDICATOR);
		sb.append(",TEST_ITEM_INDICATOR="+TEST_ITEM_INDICATOR);
		sb.append(",EXPENSE_ITEM_INDICATOR="+EXPENSE_ITEM_INDICATOR);
		sb.append(",CRW_ITEM_INDICATOR="+CRW_ITEM_INDICATOR);
		sb.append(",CRW_ITEM_NUMBER="+CRW_ITEM_NUMBER);
		sb.append(",ITEM_DIFFT_RETAIL_LINK="+ITEM_DIFFT_RETAIL_LINK);
		sb.append(",CENTS_OFF_RETAIL_PRICE="+String.valueOf(CENTS_OFF_RETAIL_PRICE));
		sb.append(",CENTS_OFF_RETAIL_PCT="+String.valueOf(CENTS_OFF_RETAIL_PCT));
		sb.append(",ITEM_TEMPERATURE_CTRL_CD="+ITEM_TEMPERATURE_CTRL_CD);
		sb.append(",SPECIAL_HANDLING_CODE="+SPECIAL_HANDLING_CODE);
		sb.append(",ITEM_EXP_DATE_CODE="+String.valueOf(ITEM_EXP_DATE_CODE));
		sb.append(",ITEM_SHORT_DATE_MONTH="+String.valueOf(ITEM_SHORT_DATE_MONTH));
		sb.append(",LOT_NUMBER_CODE="+LOT_NUMBER_CODE);
		sb.append(",WAREHOUSE_DEPARTMENT="+WAREHOUSE_DEPARTMENT);
		sb.append(",CONSIGNMENT_INDICATOR="+CONSIGNMENT_INDICATOR);
		sb.append(",GUARANTEED_SALE_CODE="+GUARANTEED_SALE_CODE);
		sb.append(",GUARANTEED_RETURN_DATE="+String.valueOf(GUARANTEED_RETURN_DATE));
		sb.append(",EMPLOYEE_DISCOUNT_IND="+EMPLOYEE_DISCOUNT_IND);
		sb.append(",SR_DISCOUNT_IND="+SR_DISCOUNT_IND);
		sb.append(",PROF_DISCOUNT_IND="+PROF_DISCOUNT_IND);
		sb.append(",DANGEROUS_DRUG_INDICATOR="+DANGEROUS_DRUG_INDICATOR);
		sb.append(",CONTROL_DRUG_CLASS="+CONTROL_DRUG_CLASS);
		sb.append(",CONTROL_DRUG_NUMBER="+CONTROL_DRUG_NUMBER);
		sb.append(",AVERAGE_WHOLESALE_PRICE="+String.valueOf(AVERAGE_WHOLESALE_PRICE));
		sb.append(",ITEM_ORDER_INDICATOR="+ITEM_ORDER_INDICATOR);
		sb.append(",ITEM_ORDER_IND_DATE="+String.valueOf(ITEM_ORDER_IND_DATE));
		sb.append(",ITEM_SLCT_ORDER_METHOD="+ITEM_SLCT_ORDER_METHOD);
		sb.append(",ITEM_SLCT_ORDER_METH_QTY="+String.valueOf(ITEM_SLCT_ORDER_METH_QTY));
		sb.append(",TOBACCO_TAX_CLASS="+TOBACCO_TAX_CLASS);
		sb.append(",ITEM_BASIC_DEPT_IND="+ITEM_BASIC_DEPT_IND);
		sb.append(",REPLACED_ITEM_NUMBER="+REPLACED_ITEM_NUMBER);
		sb.append(",REPLACED_EFFECTIVE_DATE="+String.valueOf(REPLACED_EFFECTIVE_DATE));
		sb.append(",REPLACED_BY_ITEM_NBR="+REPLACED_BY_ITEM_NBR);
		sb.append(",REPLACED_BY_EFF_DATE="+String.valueOf(REPLACED_BY_EFF_DATE));
		sb.append(",ITEM_STUS_IND="+ITEM_STUS_IND);
		sb.append(",ITEM_STUS_EFF_DATE="+String.valueOf(ITEM_STUS_EFF_DATE));
		sb.append(",ADV_ITEM_567_INDICATOR="+ADV_ITEM_567_INDICATOR);
		sb.append(",ADV_STORED_CPY_AVAIL_CDE="+ADV_STORED_CPY_AVAIL_CDE);
		sb.append(",ADV_PHOTO_AVAIL_CODE="+ADV_PHOTO_AVAIL_CODE);
		sb.append(",ADV_GB_PRINT_CDE="+ADV_GB_PRINT_CDE);
		sb.append(",REORDER_SOURCE="+REORDER_SOURCE);
		sb.append(",ALCOHOL_PERCENT="+String.valueOf(ALCOHOL_PERCENT));
		sb.append(",PRICE_STICKER="+PRICE_STICKER);
		sb.append(",ITEM_TYPE="+ITEM_TYPE);
		sb.append(",SALEABLE_ITEM="+SALEABLE_ITEM);
		sb.append(",DUTY_RATE="+String.valueOf(DUTY_RATE));
		sb.append(",HARMONIZED_TARIFF_NBR="+String.valueOf(HARMONIZED_TARIFF_NBR));
		sb.append(",WALGREEN_DEPT_NBR="+WALGREEN_DEPT_NBR);
		sb.append(",SUB_DEPARTMENT_NBR="+SUB_DEPARTMENT_NBR);
		sb.append(",COUNTRY_CODE="+COUNTRY_CODE);
		sb.append(",AEROSOL_IND="+AEROSOL_IND);
		sb.append(",SCHEDULE_2_DRUG_IND="+SCHEDULE_2_DRUG_IND);
		sb.append(",ETHNIC_CODE="+ETHNIC_CODE);
		sb.append(",HAZARDOUS_IND="+HAZARDOUS_IND);
		sb.append(",ITEM_EXP_DATE_TYPE="+ITEM_EXP_DATE_TYPE);
		sb.append(",PDQ_ALLOWED_IND="+PDQ_ALLOWED_IND);
		sb.append(",ORMD_IND="+ORMD_IND);
		sb.append(",FLAMMABLE_IND="+FLAMMABLE_IND);
		sb.append(",CURRENT_BUYER_NBR="+CURRENT_BUYER_NBR);
		sb.append(",USER_STAMP="+USER_STAMP);
		sb.append(",TIME_STAMP="+String.valueOf(TIME_STAMP));
		sb.append(",DATE_STAMP="+String.valueOf(DATE_STAMP));
		sb.append(",errorCode="+errorCode);
		sb.append(",errorMessage="+errorMessage);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ITEM_NUMBER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_NUMBER);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_NUMBER_CK_DIGIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_NUMBER_CK_DIGIT);
            			}
            		
        			sb.append("|");
        		
        				if(MANUFACTURER_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MANUFACTURER_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(MANUFACTURER_STOCK_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MANUFACTURER_STOCK_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT_BRAND_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT_BRAND_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_RECEIPT_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_RECEIPT_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_MYLAR_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_MYLAR_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_MYLAR_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_MYLAR_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_EZ_REF_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_EZ_REF_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_SUPPLY_SOURCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_SUPPLY_SOURCE);
            			}
            		
        			sb.append("|");
        		
        				if(UNIT_OF_MEASURE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UNIT_OF_MEASURE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_PURCHASED_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_PURCHASED_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_QUANTITY_OF_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_QUANTITY_OF_UNIT);
            			}
            		
        			sb.append("|");
        		
        				if(RETAIL_SELL_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RETAIL_SELL_UNIT);
            			}
            		
        			sb.append("|");
        		
        				if(SKUS_PER_RETAIL_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SKUS_PER_RETAIL_UNIT);
            			}
            		
        			sb.append("|");
        		
        				if(SKU_CUBE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SKU_CUBE);
            			}
            		
        			sb.append("|");
        		
        				if(SKU_WEIGHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SKU_WEIGHT);
            			}
            		
        			sb.append("|");
        		
        				if(MERCH_OPSTUDY_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MERCH_OPSTUDY_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(PROD_CATEG_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PROD_CATEG_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(REPURCHASABLE_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPURCHASABLE_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(FREIGHT_CLASS_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FREIGHT_CLASS_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_FOOD_STAMP_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_FOOD_STAMP_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(MFG_SUGGESTED_RETAIL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MFG_SUGGESTED_RETAIL);
            			}
            		
        			sb.append("|");
        		
        				if(MFG_SUGG_RETAIL_MULT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MFG_SUGG_RETAIL_MULT);
            			}
            		
        			sb.append("|");
        		
        				if(PRICE_CLASS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICE_CLASS);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_COST_LINK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_COST_LINK);
            			}
            		
        			sb.append("|");
        		
        				if(SAME_RETAIL_LINK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SAME_RETAIL_LINK);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT_PRE_PRICE_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT_PRE_PRICE_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_PRICE_REQUIRED_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_PRICE_REQUIRED_IND);
            			}
            		
        			sb.append("|");
        		
        				if(TRIAL_SIZE_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TRIAL_SIZE_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(TEST_ITEM_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TEST_ITEM_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(EXPENSE_ITEM_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXPENSE_ITEM_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(CRW_ITEM_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CRW_ITEM_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(CRW_ITEM_NUMBER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CRW_ITEM_NUMBER);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_DIFFT_RETAIL_LINK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_DIFFT_RETAIL_LINK);
            			}
            		
        			sb.append("|");
        		
        				if(CENTS_OFF_RETAIL_PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CENTS_OFF_RETAIL_PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(CENTS_OFF_RETAIL_PCT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CENTS_OFF_RETAIL_PCT);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_TEMPERATURE_CTRL_CD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_TEMPERATURE_CTRL_CD);
            			}
            		
        			sb.append("|");
        		
        				if(SPECIAL_HANDLING_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SPECIAL_HANDLING_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_EXP_DATE_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_EXP_DATE_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_SHORT_DATE_MONTH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_SHORT_DATE_MONTH);
            			}
            		
        			sb.append("|");
        		
        				if(LOT_NUMBER_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LOT_NUMBER_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(WAREHOUSE_DEPARTMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(WAREHOUSE_DEPARTMENT);
            			}
            		
        			sb.append("|");
        		
        				if(CONSIGNMENT_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONSIGNMENT_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(GUARANTEED_SALE_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(GUARANTEED_SALE_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(GUARANTEED_RETURN_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(GUARANTEED_RETURN_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(EMPLOYEE_DISCOUNT_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EMPLOYEE_DISCOUNT_IND);
            			}
            		
        			sb.append("|");
        		
        				if(SR_DISCOUNT_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SR_DISCOUNT_IND);
            			}
            		
        			sb.append("|");
        		
        				if(PROF_DISCOUNT_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PROF_DISCOUNT_IND);
            			}
            		
        			sb.append("|");
        		
        				if(DANGEROUS_DRUG_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DANGEROUS_DRUG_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(CONTROL_DRUG_CLASS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONTROL_DRUG_CLASS);
            			}
            		
        			sb.append("|");
        		
        				if(CONTROL_DRUG_NUMBER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONTROL_DRUG_NUMBER);
            			}
            		
        			sb.append("|");
        		
        				if(AVERAGE_WHOLESALE_PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AVERAGE_WHOLESALE_PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_ORDER_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_ORDER_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_ORDER_IND_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_ORDER_IND_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_SLCT_ORDER_METHOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_SLCT_ORDER_METHOD);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_SLCT_ORDER_METH_QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_SLCT_ORDER_METH_QTY);
            			}
            		
        			sb.append("|");
        		
        				if(TOBACCO_TAX_CLASS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TOBACCO_TAX_CLASS);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_BASIC_DEPT_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_BASIC_DEPT_IND);
            			}
            		
        			sb.append("|");
        		
        				if(REPLACED_ITEM_NUMBER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPLACED_ITEM_NUMBER);
            			}
            		
        			sb.append("|");
        		
        				if(REPLACED_EFFECTIVE_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPLACED_EFFECTIVE_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(REPLACED_BY_ITEM_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPLACED_BY_ITEM_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(REPLACED_BY_EFF_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPLACED_BY_EFF_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_STUS_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_STUS_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_STUS_EFF_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_STUS_EFF_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(ADV_ITEM_567_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADV_ITEM_567_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(ADV_STORED_CPY_AVAIL_CDE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADV_STORED_CPY_AVAIL_CDE);
            			}
            		
        			sb.append("|");
        		
        				if(ADV_PHOTO_AVAIL_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADV_PHOTO_AVAIL_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ADV_GB_PRINT_CDE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADV_GB_PRINT_CDE);
            			}
            		
        			sb.append("|");
        		
        				if(REORDER_SOURCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REORDER_SOURCE);
            			}
            		
        			sb.append("|");
        		
        				if(ALCOHOL_PERCENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ALCOHOL_PERCENT);
            			}
            		
        			sb.append("|");
        		
        				if(PRICE_STICKER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICE_STICKER);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(SALEABLE_ITEM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SALEABLE_ITEM);
            			}
            		
        			sb.append("|");
        		
        				if(DUTY_RATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DUTY_RATE);
            			}
            		
        			sb.append("|");
        		
        				if(HARMONIZED_TARIFF_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HARMONIZED_TARIFF_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(WALGREEN_DEPT_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(WALGREEN_DEPT_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(SUB_DEPARTMENT_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SUB_DEPARTMENT_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(COUNTRY_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(COUNTRY_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(AEROSOL_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AEROSOL_IND);
            			}
            		
        			sb.append("|");
        		
        				if(SCHEDULE_2_DRUG_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SCHEDULE_2_DRUG_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ETHNIC_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETHNIC_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(HAZARDOUS_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HAZARDOUS_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_EXP_DATE_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_EXP_DATE_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(PDQ_ALLOWED_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PDQ_ALLOWED_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ORMD_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORMD_IND);
            			}
            		
        			sb.append("|");
        		
        				if(FLAMMABLE_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FLAMMABLE_IND);
            			}
            		
        			sb.append("|");
        		
        				if(CURRENT_BUYER_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CURRENT_BUYER_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(USER_STAMP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(USER_STAMP);
            			}
            		
        			sb.append("|");
        		
        				if(TIME_STAMP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TIME_STAMP);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_STAMP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_STAMP);
            			}
            		
        			sb.append("|");
        		
        				if(errorCode == null){
        					sb.append("<null>");
        				}else{
            				sb.append(errorCode);
            			}
            		
        			sb.append("|");
        		
        				if(errorMessage == null){
        					sb.append("<null>");
        				}else{
            				sb.append(errorMessage);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row39Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.ITEM_NUMBER, other.ITEM_NUMBER);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class row27Struct implements routines.system.IPersistableRow<row27Struct> {
    final static byte[] commonByteArrayLock_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[0];
    static byte[] commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[0];

	
			    public String ITEM_NUMBER;

				public String getITEM_NUMBER () {
					return this.ITEM_NUMBER;
				}
				
			    public String ITEM_NUMBER_CK_DIGIT;

				public String getITEM_NUMBER_CK_DIGIT () {
					return this.ITEM_NUMBER_CK_DIGIT;
				}
				
			    public String MANUFACTURER_NAME;

				public String getMANUFACTURER_NAME () {
					return this.MANUFACTURER_NAME;
				}
				
			    public String MANUFACTURER_STOCK_NBR;

				public String getMANUFACTURER_STOCK_NBR () {
					return this.MANUFACTURER_STOCK_NBR;
				}
				
			    public String PRODUCT_BRAND_NAME;

				public String getPRODUCT_BRAND_NAME () {
					return this.PRODUCT_BRAND_NAME;
				}
				
			    public String PRODUCT_TYPE;

				public String getPRODUCT_TYPE () {
					return this.PRODUCT_TYPE;
				}
				
			    public String ITEM_DESCRIPTION;

				public String getITEM_DESCRIPTION () {
					return this.ITEM_DESCRIPTION;
				}
				
			    public String ITEM_RECEIPT_DESCRIPTION;

				public String getITEM_RECEIPT_DESCRIPTION () {
					return this.ITEM_RECEIPT_DESCRIPTION;
				}
				
			    public String ITEM_MYLAR_DESCRIPTION;

				public String getITEM_MYLAR_DESCRIPTION () {
					return this.ITEM_MYLAR_DESCRIPTION;
				}
				
			    public String ITEM_MYLAR_INDICATOR;

				public String getITEM_MYLAR_INDICATOR () {
					return this.ITEM_MYLAR_INDICATOR;
				}
				
			    public String ITEM_EZ_REF_DESCRIPTION;

				public String getITEM_EZ_REF_DESCRIPTION () {
					return this.ITEM_EZ_REF_DESCRIPTION;
				}
				
			    public String ITEM_SUPPLY_SOURCE;

				public String getITEM_SUPPLY_SOURCE () {
					return this.ITEM_SUPPLY_SOURCE;
				}
				
			    public String UNIT_OF_MEASURE;

				public String getUNIT_OF_MEASURE () {
					return this.UNIT_OF_MEASURE;
				}
				
			    public String ITEM_PURCHASED_CODE;

				public String getITEM_PURCHASED_CODE () {
					return this.ITEM_PURCHASED_CODE;
				}
				
			    public BigDecimal ITEM_QUANTITY_OF_UNIT;

				public BigDecimal getITEM_QUANTITY_OF_UNIT () {
					return this.ITEM_QUANTITY_OF_UNIT;
				}
				
			    public String RETAIL_SELL_UNIT;

				public String getRETAIL_SELL_UNIT () {
					return this.RETAIL_SELL_UNIT;
				}
				
			    public BigDecimal SKUS_PER_RETAIL_UNIT;

				public BigDecimal getSKUS_PER_RETAIL_UNIT () {
					return this.SKUS_PER_RETAIL_UNIT;
				}
				
			    public BigDecimal SKU_CUBE;

				public BigDecimal getSKU_CUBE () {
					return this.SKU_CUBE;
				}
				
			    public BigDecimal SKU_WEIGHT;

				public BigDecimal getSKU_WEIGHT () {
					return this.SKU_WEIGHT;
				}
				
			    public String MERCH_OPSTUDY_NBR;

				public String getMERCH_OPSTUDY_NBR () {
					return this.MERCH_OPSTUDY_NBR;
				}
				
			    public String PROD_CATEG_CODE;

				public String getPROD_CATEG_CODE () {
					return this.PROD_CATEG_CODE;
				}
				
			    public String REPURCHASABLE_CODE;

				public String getREPURCHASABLE_CODE () {
					return this.REPURCHASABLE_CODE;
				}
				
			    public BigDecimal FREIGHT_CLASS_CODE;

				public BigDecimal getFREIGHT_CLASS_CODE () {
					return this.FREIGHT_CLASS_CODE;
				}
				
			    public String ITEM_FOOD_STAMP_CODE;

				public String getITEM_FOOD_STAMP_CODE () {
					return this.ITEM_FOOD_STAMP_CODE;
				}
				
			    public BigDecimal MFG_SUGGESTED_RETAIL;

				public BigDecimal getMFG_SUGGESTED_RETAIL () {
					return this.MFG_SUGGESTED_RETAIL;
				}
				
			    public BigDecimal MFG_SUGG_RETAIL_MULT;

				public BigDecimal getMFG_SUGG_RETAIL_MULT () {
					return this.MFG_SUGG_RETAIL_MULT;
				}
				
			    public String PRICE_CLASS;

				public String getPRICE_CLASS () {
					return this.PRICE_CLASS;
				}
				
			    public BigDecimal ITEM_COST_LINK;

				public BigDecimal getITEM_COST_LINK () {
					return this.ITEM_COST_LINK;
				}
				
			    public String SAME_RETAIL_LINK;

				public String getSAME_RETAIL_LINK () {
					return this.SAME_RETAIL_LINK;
				}
				
			    public String PRODUCT_PRE_PRICE_IND;

				public String getPRODUCT_PRE_PRICE_IND () {
					return this.PRODUCT_PRE_PRICE_IND;
				}
				
			    public String ITEM_PRICE_REQUIRED_IND;

				public String getITEM_PRICE_REQUIRED_IND () {
					return this.ITEM_PRICE_REQUIRED_IND;
				}
				
			    public String TRIAL_SIZE_INDICATOR;

				public String getTRIAL_SIZE_INDICATOR () {
					return this.TRIAL_SIZE_INDICATOR;
				}
				
			    public String TEST_ITEM_INDICATOR;

				public String getTEST_ITEM_INDICATOR () {
					return this.TEST_ITEM_INDICATOR;
				}
				
			    public String EXPENSE_ITEM_INDICATOR;

				public String getEXPENSE_ITEM_INDICATOR () {
					return this.EXPENSE_ITEM_INDICATOR;
				}
				
			    public String CRW_ITEM_INDICATOR;

				public String getCRW_ITEM_INDICATOR () {
					return this.CRW_ITEM_INDICATOR;
				}
				
			    public String CRW_ITEM_NUMBER;

				public String getCRW_ITEM_NUMBER () {
					return this.CRW_ITEM_NUMBER;
				}
				
			    public String ITEM_DIFFT_RETAIL_LINK;

				public String getITEM_DIFFT_RETAIL_LINK () {
					return this.ITEM_DIFFT_RETAIL_LINK;
				}
				
			    public BigDecimal CENTS_OFF_RETAIL_PRICE;

				public BigDecimal getCENTS_OFF_RETAIL_PRICE () {
					return this.CENTS_OFF_RETAIL_PRICE;
				}
				
			    public BigDecimal CENTS_OFF_RETAIL_PCT;

				public BigDecimal getCENTS_OFF_RETAIL_PCT () {
					return this.CENTS_OFF_RETAIL_PCT;
				}
				
			    public String ITEM_TEMPERATURE_CTRL_CD;

				public String getITEM_TEMPERATURE_CTRL_CD () {
					return this.ITEM_TEMPERATURE_CTRL_CD;
				}
				
			    public String SPECIAL_HANDLING_CODE;

				public String getSPECIAL_HANDLING_CODE () {
					return this.SPECIAL_HANDLING_CODE;
				}
				
			    public BigDecimal ITEM_EXP_DATE_CODE;

				public BigDecimal getITEM_EXP_DATE_CODE () {
					return this.ITEM_EXP_DATE_CODE;
				}
				
			    public BigDecimal ITEM_SHORT_DATE_MONTH;

				public BigDecimal getITEM_SHORT_DATE_MONTH () {
					return this.ITEM_SHORT_DATE_MONTH;
				}
				
			    public String LOT_NUMBER_CODE;

				public String getLOT_NUMBER_CODE () {
					return this.LOT_NUMBER_CODE;
				}
				
			    public String WAREHOUSE_DEPARTMENT;

				public String getWAREHOUSE_DEPARTMENT () {
					return this.WAREHOUSE_DEPARTMENT;
				}
				
			    public String CONSIGNMENT_INDICATOR;

				public String getCONSIGNMENT_INDICATOR () {
					return this.CONSIGNMENT_INDICATOR;
				}
				
			    public String GUARANTEED_SALE_CODE;

				public String getGUARANTEED_SALE_CODE () {
					return this.GUARANTEED_SALE_CODE;
				}
				
			    public BigDecimal GUARANTEED_RETURN_DATE;

				public BigDecimal getGUARANTEED_RETURN_DATE () {
					return this.GUARANTEED_RETURN_DATE;
				}
				
			    public String EMPLOYEE_DISCOUNT_IND;

				public String getEMPLOYEE_DISCOUNT_IND () {
					return this.EMPLOYEE_DISCOUNT_IND;
				}
				
			    public String SR_DISCOUNT_IND;

				public String getSR_DISCOUNT_IND () {
					return this.SR_DISCOUNT_IND;
				}
				
			    public String PROF_DISCOUNT_IND;

				public String getPROF_DISCOUNT_IND () {
					return this.PROF_DISCOUNT_IND;
				}
				
			    public String DANGEROUS_DRUG_INDICATOR;

				public String getDANGEROUS_DRUG_INDICATOR () {
					return this.DANGEROUS_DRUG_INDICATOR;
				}
				
			    public String CONTROL_DRUG_CLASS;

				public String getCONTROL_DRUG_CLASS () {
					return this.CONTROL_DRUG_CLASS;
				}
				
			    public String CONTROL_DRUG_NUMBER;

				public String getCONTROL_DRUG_NUMBER () {
					return this.CONTROL_DRUG_NUMBER;
				}
				
			    public BigDecimal AVERAGE_WHOLESALE_PRICE;

				public BigDecimal getAVERAGE_WHOLESALE_PRICE () {
					return this.AVERAGE_WHOLESALE_PRICE;
				}
				
			    public String ITEM_ORDER_INDICATOR;

				public String getITEM_ORDER_INDICATOR () {
					return this.ITEM_ORDER_INDICATOR;
				}
				
			    public BigDecimal ITEM_ORDER_IND_DATE;

				public BigDecimal getITEM_ORDER_IND_DATE () {
					return this.ITEM_ORDER_IND_DATE;
				}
				
			    public String ITEM_SLCT_ORDER_METHOD;

				public String getITEM_SLCT_ORDER_METHOD () {
					return this.ITEM_SLCT_ORDER_METHOD;
				}
				
			    public BigDecimal ITEM_SLCT_ORDER_METH_QTY;

				public BigDecimal getITEM_SLCT_ORDER_METH_QTY () {
					return this.ITEM_SLCT_ORDER_METH_QTY;
				}
				
			    public String TOBACCO_TAX_CLASS;

				public String getTOBACCO_TAX_CLASS () {
					return this.TOBACCO_TAX_CLASS;
				}
				
			    public String ITEM_BASIC_DEPT_IND;

				public String getITEM_BASIC_DEPT_IND () {
					return this.ITEM_BASIC_DEPT_IND;
				}
				
			    public String REPLACED_ITEM_NUMBER;

				public String getREPLACED_ITEM_NUMBER () {
					return this.REPLACED_ITEM_NUMBER;
				}
				
			    public BigDecimal REPLACED_EFFECTIVE_DATE;

				public BigDecimal getREPLACED_EFFECTIVE_DATE () {
					return this.REPLACED_EFFECTIVE_DATE;
				}
				
			    public String REPLACED_BY_ITEM_NBR;

				public String getREPLACED_BY_ITEM_NBR () {
					return this.REPLACED_BY_ITEM_NBR;
				}
				
			    public BigDecimal REPLACED_BY_EFF_DATE;

				public BigDecimal getREPLACED_BY_EFF_DATE () {
					return this.REPLACED_BY_EFF_DATE;
				}
				
			    public String ITEM_STUS_IND;

				public String getITEM_STUS_IND () {
					return this.ITEM_STUS_IND;
				}
				
			    public BigDecimal ITEM_STUS_EFF_DATE;

				public BigDecimal getITEM_STUS_EFF_DATE () {
					return this.ITEM_STUS_EFF_DATE;
				}
				
			    public String ADV_ITEM_567_INDICATOR;

				public String getADV_ITEM_567_INDICATOR () {
					return this.ADV_ITEM_567_INDICATOR;
				}
				
			    public String ADV_STORED_CPY_AVAIL_CDE;

				public String getADV_STORED_CPY_AVAIL_CDE () {
					return this.ADV_STORED_CPY_AVAIL_CDE;
				}
				
			    public String ADV_PHOTO_AVAIL_CODE;

				public String getADV_PHOTO_AVAIL_CODE () {
					return this.ADV_PHOTO_AVAIL_CODE;
				}
				
			    public String ADV_GB_PRINT_CDE;

				public String getADV_GB_PRINT_CDE () {
					return this.ADV_GB_PRINT_CDE;
				}
				
			    public String REORDER_SOURCE;

				public String getREORDER_SOURCE () {
					return this.REORDER_SOURCE;
				}
				
			    public BigDecimal ALCOHOL_PERCENT;

				public BigDecimal getALCOHOL_PERCENT () {
					return this.ALCOHOL_PERCENT;
				}
				
			    public String PRICE_STICKER;

				public String getPRICE_STICKER () {
					return this.PRICE_STICKER;
				}
				
			    public String ITEM_TYPE;

				public String getITEM_TYPE () {
					return this.ITEM_TYPE;
				}
				
			    public String SALEABLE_ITEM;

				public String getSALEABLE_ITEM () {
					return this.SALEABLE_ITEM;
				}
				
			    public BigDecimal DUTY_RATE;

				public BigDecimal getDUTY_RATE () {
					return this.DUTY_RATE;
				}
				
			    public BigDecimal HARMONIZED_TARIFF_NBR;

				public BigDecimal getHARMONIZED_TARIFF_NBR () {
					return this.HARMONIZED_TARIFF_NBR;
				}
				
			    public String WALGREEN_DEPT_NBR;

				public String getWALGREEN_DEPT_NBR () {
					return this.WALGREEN_DEPT_NBR;
				}
				
			    public String SUB_DEPARTMENT_NBR;

				public String getSUB_DEPARTMENT_NBR () {
					return this.SUB_DEPARTMENT_NBR;
				}
				
			    public String COUNTRY_CODE;

				public String getCOUNTRY_CODE () {
					return this.COUNTRY_CODE;
				}
				
			    public String AEROSOL_IND;

				public String getAEROSOL_IND () {
					return this.AEROSOL_IND;
				}
				
			    public String SCHEDULE_2_DRUG_IND;

				public String getSCHEDULE_2_DRUG_IND () {
					return this.SCHEDULE_2_DRUG_IND;
				}
				
			    public String ETHNIC_CODE;

				public String getETHNIC_CODE () {
					return this.ETHNIC_CODE;
				}
				
			    public String HAZARDOUS_IND;

				public String getHAZARDOUS_IND () {
					return this.HAZARDOUS_IND;
				}
				
			    public String ITEM_EXP_DATE_TYPE;

				public String getITEM_EXP_DATE_TYPE () {
					return this.ITEM_EXP_DATE_TYPE;
				}
				
			    public String PDQ_ALLOWED_IND;

				public String getPDQ_ALLOWED_IND () {
					return this.PDQ_ALLOWED_IND;
				}
				
			    public String ORMD_IND;

				public String getORMD_IND () {
					return this.ORMD_IND;
				}
				
			    public String FLAMMABLE_IND;

				public String getFLAMMABLE_IND () {
					return this.FLAMMABLE_IND;
				}
				
			    public String CURRENT_BUYER_NBR;

				public String getCURRENT_BUYER_NBR () {
					return this.CURRENT_BUYER_NBR;
				}
				
			    public String USER_STAMP;

				public String getUSER_STAMP () {
					return this.USER_STAMP;
				}
				
			    public BigDecimal TIME_STAMP;

				public BigDecimal getTIME_STAMP () {
					return this.TIME_STAMP;
				}
				
			    public BigDecimal DATE_STAMP;

				public BigDecimal getDATE_STAMP () {
					return this.DATE_STAMP;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job.length) {
				if(length < 1024 && commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job.length == 0) {
   					commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[1024];
				} else {
   					commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job, 0, length);
			strReturn = new String(commonByteArray_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_ARTICLE_BACKFEED_UPDATED_IT005p_table_update_job) {

        	try {

        		int length = 0;
		
					this.ITEM_NUMBER = readString(dis);
					
					this.ITEM_NUMBER_CK_DIGIT = readString(dis);
					
					this.MANUFACTURER_NAME = readString(dis);
					
					this.MANUFACTURER_STOCK_NBR = readString(dis);
					
					this.PRODUCT_BRAND_NAME = readString(dis);
					
					this.PRODUCT_TYPE = readString(dis);
					
					this.ITEM_DESCRIPTION = readString(dis);
					
					this.ITEM_RECEIPT_DESCRIPTION = readString(dis);
					
					this.ITEM_MYLAR_DESCRIPTION = readString(dis);
					
					this.ITEM_MYLAR_INDICATOR = readString(dis);
					
					this.ITEM_EZ_REF_DESCRIPTION = readString(dis);
					
					this.ITEM_SUPPLY_SOURCE = readString(dis);
					
					this.UNIT_OF_MEASURE = readString(dis);
					
					this.ITEM_PURCHASED_CODE = readString(dis);
					
						this.ITEM_QUANTITY_OF_UNIT = (BigDecimal) dis.readObject();
					
					this.RETAIL_SELL_UNIT = readString(dis);
					
						this.SKUS_PER_RETAIL_UNIT = (BigDecimal) dis.readObject();
					
						this.SKU_CUBE = (BigDecimal) dis.readObject();
					
						this.SKU_WEIGHT = (BigDecimal) dis.readObject();
					
					this.MERCH_OPSTUDY_NBR = readString(dis);
					
					this.PROD_CATEG_CODE = readString(dis);
					
					this.REPURCHASABLE_CODE = readString(dis);
					
						this.FREIGHT_CLASS_CODE = (BigDecimal) dis.readObject();
					
					this.ITEM_FOOD_STAMP_CODE = readString(dis);
					
						this.MFG_SUGGESTED_RETAIL = (BigDecimal) dis.readObject();
					
						this.MFG_SUGG_RETAIL_MULT = (BigDecimal) dis.readObject();
					
					this.PRICE_CLASS = readString(dis);
					
						this.ITEM_COST_LINK = (BigDecimal) dis.readObject();
					
					this.SAME_RETAIL_LINK = readString(dis);
					
					this.PRODUCT_PRE_PRICE_IND = readString(dis);
					
					this.ITEM_PRICE_REQUIRED_IND = readString(dis);
					
					this.TRIAL_SIZE_INDICATOR = readString(dis);
					
					this.TEST_ITEM_INDICATOR = readString(dis);
					
					this.EXPENSE_ITEM_INDICATOR = readString(dis);
					
					this.CRW_ITEM_INDICATOR = readString(dis);
					
					this.CRW_ITEM_NUMBER = readString(dis);
					
					this.ITEM_DIFFT_RETAIL_LINK = readString(dis);
					
						this.CENTS_OFF_RETAIL_PRICE = (BigDecimal) dis.readObject();
					
						this.CENTS_OFF_RETAIL_PCT = (BigDecimal) dis.readObject();
					
					this.ITEM_TEMPERATURE_CTRL_CD = readString(dis);
					
					this.SPECIAL_HANDLING_CODE = readString(dis);
					
						this.ITEM_EXP_DATE_CODE = (BigDecimal) dis.readObject();
					
						this.ITEM_SHORT_DATE_MONTH = (BigDecimal) dis.readObject();
					
					this.LOT_NUMBER_CODE = readString(dis);
					
					this.WAREHOUSE_DEPARTMENT = readString(dis);
					
					this.CONSIGNMENT_INDICATOR = readString(dis);
					
					this.GUARANTEED_SALE_CODE = readString(dis);
					
						this.GUARANTEED_RETURN_DATE = (BigDecimal) dis.readObject();
					
					this.EMPLOYEE_DISCOUNT_IND = readString(dis);
					
					this.SR_DISCOUNT_IND = readString(dis);
					
					this.PROF_DISCOUNT_IND = readString(dis);
					
					this.DANGEROUS_DRUG_INDICATOR = readString(dis);
					
					this.CONTROL_DRUG_CLASS = readString(dis);
					
					this.CONTROL_DRUG_NUMBER = readString(dis);
					
						this.AVERAGE_WHOLESALE_PRICE = (BigDecimal) dis.readObject();
					
					this.ITEM_ORDER_INDICATOR = readString(dis);
					
						this.ITEM_ORDER_IND_DATE = (BigDecimal) dis.readObject();
					
					this.ITEM_SLCT_ORDER_METHOD = readString(dis);
					
						this.ITEM_SLCT_ORDER_METH_QTY = (BigDecimal) dis.readObject();
					
					this.TOBACCO_TAX_CLASS = readString(dis);
					
					this.ITEM_BASIC_DEPT_IND = readString(dis);
					
					this.REPLACED_ITEM_NUMBER = readString(dis);
					
						this.REPLACED_EFFECTIVE_DATE = (BigDecimal) dis.readObject();
					
					this.REPLACED_BY_ITEM_NBR = readString(dis);
					
						this.REPLACED_BY_EFF_DATE = (BigDecimal) dis.readObject();
					
					this.ITEM_STUS_IND = readString(dis);
					
						this.ITEM_STUS_EFF_DATE = (BigDecimal) dis.readObject();
					
					this.ADV_ITEM_567_INDICATOR = readString(dis);
					
					this.ADV_STORED_CPY_AVAIL_CDE = readString(dis);
					
					this.ADV_PHOTO_AVAIL_CODE = readString(dis);
					
					this.ADV_GB_PRINT_CDE = readString(dis);
					
					this.REORDER_SOURCE = readString(dis);
					
						this.ALCOHOL_PERCENT = (BigDecimal) dis.readObject();
					
					this.PRICE_STICKER = readString(dis);
					
					this.ITEM_TYPE = readString(dis);
					
					this.SALEABLE_ITEM = readString(dis);
					
						this.DUTY_RATE = (BigDecimal) dis.readObject();
					
						this.HARMONIZED_TARIFF_NBR = (BigDecimal) dis.readObject();
					
					this.WALGREEN_DEPT_NBR = readString(dis);
					
					this.SUB_DEPARTMENT_NBR = readString(dis);
					
					this.COUNTRY_CODE = readString(dis);
					
					this.AEROSOL_IND = readString(dis);
					
					this.SCHEDULE_2_DRUG_IND = readString(dis);
					
					this.ETHNIC_CODE = readString(dis);
					
					this.HAZARDOUS_IND = readString(dis);
					
					this.ITEM_EXP_DATE_TYPE = readString(dis);
					
					this.PDQ_ALLOWED_IND = readString(dis);
					
					this.ORMD_IND = readString(dis);
					
					this.FLAMMABLE_IND = readString(dis);
					
					this.CURRENT_BUYER_NBR = readString(dis);
					
					this.USER_STAMP = readString(dis);
					
						this.TIME_STAMP = (BigDecimal) dis.readObject();
					
						this.DATE_STAMP = (BigDecimal) dis.readObject();
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		
			} catch(ClassNotFoundException eCNFE) {
				 throw new RuntimeException(eCNFE);
		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.ITEM_NUMBER,dos);
					
					// String
				
						writeString(this.ITEM_NUMBER_CK_DIGIT,dos);
					
					// String
				
						writeString(this.MANUFACTURER_NAME,dos);
					
					// String
				
						writeString(this.MANUFACTURER_STOCK_NBR,dos);
					
					// String
				
						writeString(this.PRODUCT_BRAND_NAME,dos);
					
					// String
				
						writeString(this.PRODUCT_TYPE,dos);
					
					// String
				
						writeString(this.ITEM_DESCRIPTION,dos);
					
					// String
				
						writeString(this.ITEM_RECEIPT_DESCRIPTION,dos);
					
					// String
				
						writeString(this.ITEM_MYLAR_DESCRIPTION,dos);
					
					// String
				
						writeString(this.ITEM_MYLAR_INDICATOR,dos);
					
					// String
				
						writeString(this.ITEM_EZ_REF_DESCRIPTION,dos);
					
					// String
				
						writeString(this.ITEM_SUPPLY_SOURCE,dos);
					
					// String
				
						writeString(this.UNIT_OF_MEASURE,dos);
					
					// String
				
						writeString(this.ITEM_PURCHASED_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_QUANTITY_OF_UNIT);
					
					// String
				
						writeString(this.RETAIL_SELL_UNIT,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SKUS_PER_RETAIL_UNIT);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SKU_CUBE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.SKU_WEIGHT);
					
					// String
				
						writeString(this.MERCH_OPSTUDY_NBR,dos);
					
					// String
				
						writeString(this.PROD_CATEG_CODE,dos);
					
					// String
				
						writeString(this.REPURCHASABLE_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.FREIGHT_CLASS_CODE);
					
					// String
				
						writeString(this.ITEM_FOOD_STAMP_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MFG_SUGGESTED_RETAIL);
					
					// BigDecimal
				
       			    	dos.writeObject(this.MFG_SUGG_RETAIL_MULT);
					
					// String
				
						writeString(this.PRICE_CLASS,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_COST_LINK);
					
					// String
				
						writeString(this.SAME_RETAIL_LINK,dos);
					
					// String
				
						writeString(this.PRODUCT_PRE_PRICE_IND,dos);
					
					// String
				
						writeString(this.ITEM_PRICE_REQUIRED_IND,dos);
					
					// String
				
						writeString(this.TRIAL_SIZE_INDICATOR,dos);
					
					// String
				
						writeString(this.TEST_ITEM_INDICATOR,dos);
					
					// String
				
						writeString(this.EXPENSE_ITEM_INDICATOR,dos);
					
					// String
				
						writeString(this.CRW_ITEM_INDICATOR,dos);
					
					// String
				
						writeString(this.CRW_ITEM_NUMBER,dos);
					
					// String
				
						writeString(this.ITEM_DIFFT_RETAIL_LINK,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CENTS_OFF_RETAIL_PRICE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.CENTS_OFF_RETAIL_PCT);
					
					// String
				
						writeString(this.ITEM_TEMPERATURE_CTRL_CD,dos);
					
					// String
				
						writeString(this.SPECIAL_HANDLING_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_EXP_DATE_CODE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_SHORT_DATE_MONTH);
					
					// String
				
						writeString(this.LOT_NUMBER_CODE,dos);
					
					// String
				
						writeString(this.WAREHOUSE_DEPARTMENT,dos);
					
					// String
				
						writeString(this.CONSIGNMENT_INDICATOR,dos);
					
					// String
				
						writeString(this.GUARANTEED_SALE_CODE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.GUARANTEED_RETURN_DATE);
					
					// String
				
						writeString(this.EMPLOYEE_DISCOUNT_IND,dos);
					
					// String
				
						writeString(this.SR_DISCOUNT_IND,dos);
					
					// String
				
						writeString(this.PROF_DISCOUNT_IND,dos);
					
					// String
				
						writeString(this.DANGEROUS_DRUG_INDICATOR,dos);
					
					// String
				
						writeString(this.CONTROL_DRUG_CLASS,dos);
					
					// String
				
						writeString(this.CONTROL_DRUG_NUMBER,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.AVERAGE_WHOLESALE_PRICE);
					
					// String
				
						writeString(this.ITEM_ORDER_INDICATOR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_ORDER_IND_DATE);
					
					// String
				
						writeString(this.ITEM_SLCT_ORDER_METHOD,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_SLCT_ORDER_METH_QTY);
					
					// String
				
						writeString(this.TOBACCO_TAX_CLASS,dos);
					
					// String
				
						writeString(this.ITEM_BASIC_DEPT_IND,dos);
					
					// String
				
						writeString(this.REPLACED_ITEM_NUMBER,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REPLACED_EFFECTIVE_DATE);
					
					// String
				
						writeString(this.REPLACED_BY_ITEM_NBR,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.REPLACED_BY_EFF_DATE);
					
					// String
				
						writeString(this.ITEM_STUS_IND,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ITEM_STUS_EFF_DATE);
					
					// String
				
						writeString(this.ADV_ITEM_567_INDICATOR,dos);
					
					// String
				
						writeString(this.ADV_STORED_CPY_AVAIL_CDE,dos);
					
					// String
				
						writeString(this.ADV_PHOTO_AVAIL_CODE,dos);
					
					// String
				
						writeString(this.ADV_GB_PRINT_CDE,dos);
					
					// String
				
						writeString(this.REORDER_SOURCE,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.ALCOHOL_PERCENT);
					
					// String
				
						writeString(this.PRICE_STICKER,dos);
					
					// String
				
						writeString(this.ITEM_TYPE,dos);
					
					// String
				
						writeString(this.SALEABLE_ITEM,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DUTY_RATE);
					
					// BigDecimal
				
       			    	dos.writeObject(this.HARMONIZED_TARIFF_NBR);
					
					// String
				
						writeString(this.WALGREEN_DEPT_NBR,dos);
					
					// String
				
						writeString(this.SUB_DEPARTMENT_NBR,dos);
					
					// String
				
						writeString(this.COUNTRY_CODE,dos);
					
					// String
				
						writeString(this.AEROSOL_IND,dos);
					
					// String
				
						writeString(this.SCHEDULE_2_DRUG_IND,dos);
					
					// String
				
						writeString(this.ETHNIC_CODE,dos);
					
					// String
				
						writeString(this.HAZARDOUS_IND,dos);
					
					// String
				
						writeString(this.ITEM_EXP_DATE_TYPE,dos);
					
					// String
				
						writeString(this.PDQ_ALLOWED_IND,dos);
					
					// String
				
						writeString(this.ORMD_IND,dos);
					
					// String
				
						writeString(this.FLAMMABLE_IND,dos);
					
					// String
				
						writeString(this.CURRENT_BUYER_NBR,dos);
					
					// String
				
						writeString(this.USER_STAMP,dos);
					
					// BigDecimal
				
       			    	dos.writeObject(this.TIME_STAMP);
					
					// BigDecimal
				
       			    	dos.writeObject(this.DATE_STAMP);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("ITEM_NUMBER="+ITEM_NUMBER);
		sb.append(",ITEM_NUMBER_CK_DIGIT="+ITEM_NUMBER_CK_DIGIT);
		sb.append(",MANUFACTURER_NAME="+MANUFACTURER_NAME);
		sb.append(",MANUFACTURER_STOCK_NBR="+MANUFACTURER_STOCK_NBR);
		sb.append(",PRODUCT_BRAND_NAME="+PRODUCT_BRAND_NAME);
		sb.append(",PRODUCT_TYPE="+PRODUCT_TYPE);
		sb.append(",ITEM_DESCRIPTION="+ITEM_DESCRIPTION);
		sb.append(",ITEM_RECEIPT_DESCRIPTION="+ITEM_RECEIPT_DESCRIPTION);
		sb.append(",ITEM_MYLAR_DESCRIPTION="+ITEM_MYLAR_DESCRIPTION);
		sb.append(",ITEM_MYLAR_INDICATOR="+ITEM_MYLAR_INDICATOR);
		sb.append(",ITEM_EZ_REF_DESCRIPTION="+ITEM_EZ_REF_DESCRIPTION);
		sb.append(",ITEM_SUPPLY_SOURCE="+ITEM_SUPPLY_SOURCE);
		sb.append(",UNIT_OF_MEASURE="+UNIT_OF_MEASURE);
		sb.append(",ITEM_PURCHASED_CODE="+ITEM_PURCHASED_CODE);
		sb.append(",ITEM_QUANTITY_OF_UNIT="+String.valueOf(ITEM_QUANTITY_OF_UNIT));
		sb.append(",RETAIL_SELL_UNIT="+RETAIL_SELL_UNIT);
		sb.append(",SKUS_PER_RETAIL_UNIT="+String.valueOf(SKUS_PER_RETAIL_UNIT));
		sb.append(",SKU_CUBE="+String.valueOf(SKU_CUBE));
		sb.append(",SKU_WEIGHT="+String.valueOf(SKU_WEIGHT));
		sb.append(",MERCH_OPSTUDY_NBR="+MERCH_OPSTUDY_NBR);
		sb.append(",PROD_CATEG_CODE="+PROD_CATEG_CODE);
		sb.append(",REPURCHASABLE_CODE="+REPURCHASABLE_CODE);
		sb.append(",FREIGHT_CLASS_CODE="+String.valueOf(FREIGHT_CLASS_CODE));
		sb.append(",ITEM_FOOD_STAMP_CODE="+ITEM_FOOD_STAMP_CODE);
		sb.append(",MFG_SUGGESTED_RETAIL="+String.valueOf(MFG_SUGGESTED_RETAIL));
		sb.append(",MFG_SUGG_RETAIL_MULT="+String.valueOf(MFG_SUGG_RETAIL_MULT));
		sb.append(",PRICE_CLASS="+PRICE_CLASS);
		sb.append(",ITEM_COST_LINK="+String.valueOf(ITEM_COST_LINK));
		sb.append(",SAME_RETAIL_LINK="+SAME_RETAIL_LINK);
		sb.append(",PRODUCT_PRE_PRICE_IND="+PRODUCT_PRE_PRICE_IND);
		sb.append(",ITEM_PRICE_REQUIRED_IND="+ITEM_PRICE_REQUIRED_IND);
		sb.append(",TRIAL_SIZE_INDICATOR="+TRIAL_SIZE_INDICATOR);
		sb.append(",TEST_ITEM_INDICATOR="+TEST_ITEM_INDICATOR);
		sb.append(",EXPENSE_ITEM_INDICATOR="+EXPENSE_ITEM_INDICATOR);
		sb.append(",CRW_ITEM_INDICATOR="+CRW_ITEM_INDICATOR);
		sb.append(",CRW_ITEM_NUMBER="+CRW_ITEM_NUMBER);
		sb.append(",ITEM_DIFFT_RETAIL_LINK="+ITEM_DIFFT_RETAIL_LINK);
		sb.append(",CENTS_OFF_RETAIL_PRICE="+String.valueOf(CENTS_OFF_RETAIL_PRICE));
		sb.append(",CENTS_OFF_RETAIL_PCT="+String.valueOf(CENTS_OFF_RETAIL_PCT));
		sb.append(",ITEM_TEMPERATURE_CTRL_CD="+ITEM_TEMPERATURE_CTRL_CD);
		sb.append(",SPECIAL_HANDLING_CODE="+SPECIAL_HANDLING_CODE);
		sb.append(",ITEM_EXP_DATE_CODE="+String.valueOf(ITEM_EXP_DATE_CODE));
		sb.append(",ITEM_SHORT_DATE_MONTH="+String.valueOf(ITEM_SHORT_DATE_MONTH));
		sb.append(",LOT_NUMBER_CODE="+LOT_NUMBER_CODE);
		sb.append(",WAREHOUSE_DEPARTMENT="+WAREHOUSE_DEPARTMENT);
		sb.append(",CONSIGNMENT_INDICATOR="+CONSIGNMENT_INDICATOR);
		sb.append(",GUARANTEED_SALE_CODE="+GUARANTEED_SALE_CODE);
		sb.append(",GUARANTEED_RETURN_DATE="+String.valueOf(GUARANTEED_RETURN_DATE));
		sb.append(",EMPLOYEE_DISCOUNT_IND="+EMPLOYEE_DISCOUNT_IND);
		sb.append(",SR_DISCOUNT_IND="+SR_DISCOUNT_IND);
		sb.append(",PROF_DISCOUNT_IND="+PROF_DISCOUNT_IND);
		sb.append(",DANGEROUS_DRUG_INDICATOR="+DANGEROUS_DRUG_INDICATOR);
		sb.append(",CONTROL_DRUG_CLASS="+CONTROL_DRUG_CLASS);
		sb.append(",CONTROL_DRUG_NUMBER="+CONTROL_DRUG_NUMBER);
		sb.append(",AVERAGE_WHOLESALE_PRICE="+String.valueOf(AVERAGE_WHOLESALE_PRICE));
		sb.append(",ITEM_ORDER_INDICATOR="+ITEM_ORDER_INDICATOR);
		sb.append(",ITEM_ORDER_IND_DATE="+String.valueOf(ITEM_ORDER_IND_DATE));
		sb.append(",ITEM_SLCT_ORDER_METHOD="+ITEM_SLCT_ORDER_METHOD);
		sb.append(",ITEM_SLCT_ORDER_METH_QTY="+String.valueOf(ITEM_SLCT_ORDER_METH_QTY));
		sb.append(",TOBACCO_TAX_CLASS="+TOBACCO_TAX_CLASS);
		sb.append(",ITEM_BASIC_DEPT_IND="+ITEM_BASIC_DEPT_IND);
		sb.append(",REPLACED_ITEM_NUMBER="+REPLACED_ITEM_NUMBER);
		sb.append(",REPLACED_EFFECTIVE_DATE="+String.valueOf(REPLACED_EFFECTIVE_DATE));
		sb.append(",REPLACED_BY_ITEM_NBR="+REPLACED_BY_ITEM_NBR);
		sb.append(",REPLACED_BY_EFF_DATE="+String.valueOf(REPLACED_BY_EFF_DATE));
		sb.append(",ITEM_STUS_IND="+ITEM_STUS_IND);
		sb.append(",ITEM_STUS_EFF_DATE="+String.valueOf(ITEM_STUS_EFF_DATE));
		sb.append(",ADV_ITEM_567_INDICATOR="+ADV_ITEM_567_INDICATOR);
		sb.append(",ADV_STORED_CPY_AVAIL_CDE="+ADV_STORED_CPY_AVAIL_CDE);
		sb.append(",ADV_PHOTO_AVAIL_CODE="+ADV_PHOTO_AVAIL_CODE);
		sb.append(",ADV_GB_PRINT_CDE="+ADV_GB_PRINT_CDE);
		sb.append(",REORDER_SOURCE="+REORDER_SOURCE);
		sb.append(",ALCOHOL_PERCENT="+String.valueOf(ALCOHOL_PERCENT));
		sb.append(",PRICE_STICKER="+PRICE_STICKER);
		sb.append(",ITEM_TYPE="+ITEM_TYPE);
		sb.append(",SALEABLE_ITEM="+SALEABLE_ITEM);
		sb.append(",DUTY_RATE="+String.valueOf(DUTY_RATE));
		sb.append(",HARMONIZED_TARIFF_NBR="+String.valueOf(HARMONIZED_TARIFF_NBR));
		sb.append(",WALGREEN_DEPT_NBR="+WALGREEN_DEPT_NBR);
		sb.append(",SUB_DEPARTMENT_NBR="+SUB_DEPARTMENT_NBR);
		sb.append(",COUNTRY_CODE="+COUNTRY_CODE);
		sb.append(",AEROSOL_IND="+AEROSOL_IND);
		sb.append(",SCHEDULE_2_DRUG_IND="+SCHEDULE_2_DRUG_IND);
		sb.append(",ETHNIC_CODE="+ETHNIC_CODE);
		sb.append(",HAZARDOUS_IND="+HAZARDOUS_IND);
		sb.append(",ITEM_EXP_DATE_TYPE="+ITEM_EXP_DATE_TYPE);
		sb.append(",PDQ_ALLOWED_IND="+PDQ_ALLOWED_IND);
		sb.append(",ORMD_IND="+ORMD_IND);
		sb.append(",FLAMMABLE_IND="+FLAMMABLE_IND);
		sb.append(",CURRENT_BUYER_NBR="+CURRENT_BUYER_NBR);
		sb.append(",USER_STAMP="+USER_STAMP);
		sb.append(",TIME_STAMP="+String.valueOf(TIME_STAMP));
		sb.append(",DATE_STAMP="+String.valueOf(DATE_STAMP));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(ITEM_NUMBER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_NUMBER);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_NUMBER_CK_DIGIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_NUMBER_CK_DIGIT);
            			}
            		
        			sb.append("|");
        		
        				if(MANUFACTURER_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MANUFACTURER_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(MANUFACTURER_STOCK_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MANUFACTURER_STOCK_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT_BRAND_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT_BRAND_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_RECEIPT_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_RECEIPT_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_MYLAR_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_MYLAR_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_MYLAR_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_MYLAR_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_EZ_REF_DESCRIPTION == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_EZ_REF_DESCRIPTION);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_SUPPLY_SOURCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_SUPPLY_SOURCE);
            			}
            		
        			sb.append("|");
        		
        				if(UNIT_OF_MEASURE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UNIT_OF_MEASURE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_PURCHASED_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_PURCHASED_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_QUANTITY_OF_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_QUANTITY_OF_UNIT);
            			}
            		
        			sb.append("|");
        		
        				if(RETAIL_SELL_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(RETAIL_SELL_UNIT);
            			}
            		
        			sb.append("|");
        		
        				if(SKUS_PER_RETAIL_UNIT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SKUS_PER_RETAIL_UNIT);
            			}
            		
        			sb.append("|");
        		
        				if(SKU_CUBE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SKU_CUBE);
            			}
            		
        			sb.append("|");
        		
        				if(SKU_WEIGHT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SKU_WEIGHT);
            			}
            		
        			sb.append("|");
        		
        				if(MERCH_OPSTUDY_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MERCH_OPSTUDY_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(PROD_CATEG_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PROD_CATEG_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(REPURCHASABLE_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPURCHASABLE_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(FREIGHT_CLASS_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FREIGHT_CLASS_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_FOOD_STAMP_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_FOOD_STAMP_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(MFG_SUGGESTED_RETAIL == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MFG_SUGGESTED_RETAIL);
            			}
            		
        			sb.append("|");
        		
        				if(MFG_SUGG_RETAIL_MULT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(MFG_SUGG_RETAIL_MULT);
            			}
            		
        			sb.append("|");
        		
        				if(PRICE_CLASS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICE_CLASS);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_COST_LINK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_COST_LINK);
            			}
            		
        			sb.append("|");
        		
        				if(SAME_RETAIL_LINK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SAME_RETAIL_LINK);
            			}
            		
        			sb.append("|");
        		
        				if(PRODUCT_PRE_PRICE_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRODUCT_PRE_PRICE_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_PRICE_REQUIRED_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_PRICE_REQUIRED_IND);
            			}
            		
        			sb.append("|");
        		
        				if(TRIAL_SIZE_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TRIAL_SIZE_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(TEST_ITEM_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TEST_ITEM_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(EXPENSE_ITEM_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EXPENSE_ITEM_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(CRW_ITEM_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CRW_ITEM_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(CRW_ITEM_NUMBER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CRW_ITEM_NUMBER);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_DIFFT_RETAIL_LINK == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_DIFFT_RETAIL_LINK);
            			}
            		
        			sb.append("|");
        		
        				if(CENTS_OFF_RETAIL_PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CENTS_OFF_RETAIL_PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(CENTS_OFF_RETAIL_PCT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CENTS_OFF_RETAIL_PCT);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_TEMPERATURE_CTRL_CD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_TEMPERATURE_CTRL_CD);
            			}
            		
        			sb.append("|");
        		
        				if(SPECIAL_HANDLING_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SPECIAL_HANDLING_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_EXP_DATE_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_EXP_DATE_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_SHORT_DATE_MONTH == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_SHORT_DATE_MONTH);
            			}
            		
        			sb.append("|");
        		
        				if(LOT_NUMBER_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(LOT_NUMBER_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(WAREHOUSE_DEPARTMENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(WAREHOUSE_DEPARTMENT);
            			}
            		
        			sb.append("|");
        		
        				if(CONSIGNMENT_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONSIGNMENT_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(GUARANTEED_SALE_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(GUARANTEED_SALE_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(GUARANTEED_RETURN_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(GUARANTEED_RETURN_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(EMPLOYEE_DISCOUNT_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(EMPLOYEE_DISCOUNT_IND);
            			}
            		
        			sb.append("|");
        		
        				if(SR_DISCOUNT_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SR_DISCOUNT_IND);
            			}
            		
        			sb.append("|");
        		
        				if(PROF_DISCOUNT_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PROF_DISCOUNT_IND);
            			}
            		
        			sb.append("|");
        		
        				if(DANGEROUS_DRUG_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DANGEROUS_DRUG_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(CONTROL_DRUG_CLASS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONTROL_DRUG_CLASS);
            			}
            		
        			sb.append("|");
        		
        				if(CONTROL_DRUG_NUMBER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CONTROL_DRUG_NUMBER);
            			}
            		
        			sb.append("|");
        		
        				if(AVERAGE_WHOLESALE_PRICE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AVERAGE_WHOLESALE_PRICE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_ORDER_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_ORDER_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_ORDER_IND_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_ORDER_IND_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_SLCT_ORDER_METHOD == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_SLCT_ORDER_METHOD);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_SLCT_ORDER_METH_QTY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_SLCT_ORDER_METH_QTY);
            			}
            		
        			sb.append("|");
        		
        				if(TOBACCO_TAX_CLASS == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TOBACCO_TAX_CLASS);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_BASIC_DEPT_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_BASIC_DEPT_IND);
            			}
            		
        			sb.append("|");
        		
        				if(REPLACED_ITEM_NUMBER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPLACED_ITEM_NUMBER);
            			}
            		
        			sb.append("|");
        		
        				if(REPLACED_EFFECTIVE_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPLACED_EFFECTIVE_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(REPLACED_BY_ITEM_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPLACED_BY_ITEM_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(REPLACED_BY_EFF_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REPLACED_BY_EFF_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_STUS_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_STUS_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_STUS_EFF_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_STUS_EFF_DATE);
            			}
            		
        			sb.append("|");
        		
        				if(ADV_ITEM_567_INDICATOR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADV_ITEM_567_INDICATOR);
            			}
            		
        			sb.append("|");
        		
        				if(ADV_STORED_CPY_AVAIL_CDE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADV_STORED_CPY_AVAIL_CDE);
            			}
            		
        			sb.append("|");
        		
        				if(ADV_PHOTO_AVAIL_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADV_PHOTO_AVAIL_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(ADV_GB_PRINT_CDE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ADV_GB_PRINT_CDE);
            			}
            		
        			sb.append("|");
        		
        				if(REORDER_SOURCE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(REORDER_SOURCE);
            			}
            		
        			sb.append("|");
        		
        				if(ALCOHOL_PERCENT == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ALCOHOL_PERCENT);
            			}
            		
        			sb.append("|");
        		
        				if(PRICE_STICKER == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PRICE_STICKER);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(SALEABLE_ITEM == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SALEABLE_ITEM);
            			}
            		
        			sb.append("|");
        		
        				if(DUTY_RATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DUTY_RATE);
            			}
            		
        			sb.append("|");
        		
        				if(HARMONIZED_TARIFF_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HARMONIZED_TARIFF_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(WALGREEN_DEPT_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(WALGREEN_DEPT_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(SUB_DEPARTMENT_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SUB_DEPARTMENT_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(COUNTRY_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(COUNTRY_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(AEROSOL_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(AEROSOL_IND);
            			}
            		
        			sb.append("|");
        		
        				if(SCHEDULE_2_DRUG_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(SCHEDULE_2_DRUG_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ETHNIC_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ETHNIC_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(HAZARDOUS_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(HAZARDOUS_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ITEM_EXP_DATE_TYPE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ITEM_EXP_DATE_TYPE);
            			}
            		
        			sb.append("|");
        		
        				if(PDQ_ALLOWED_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(PDQ_ALLOWED_IND);
            			}
            		
        			sb.append("|");
        		
        				if(ORMD_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(ORMD_IND);
            			}
            		
        			sb.append("|");
        		
        				if(FLAMMABLE_IND == null){
        					sb.append("<null>");
        				}else{
            				sb.append(FLAMMABLE_IND);
            			}
            		
        			sb.append("|");
        		
        				if(CURRENT_BUYER_NBR == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CURRENT_BUYER_NBR);
            			}
            		
        			sb.append("|");
        		
        				if(USER_STAMP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(USER_STAMP);
            			}
            		
        			sb.append("|");
        		
        				if(TIME_STAMP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(TIME_STAMP);
            			}
            		
        			sb.append("|");
        		
        				if(DATE_STAMP == null){
        					sb.append("<null>");
        				}else{
            				sb.append(DATE_STAMP);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(row27Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tFileInputDelimited_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		row27Struct row27 = new row27Struct();
row39Struct row39 = new row39Struct();
row40Struct row40 = new row40Struct();






	
	/**
	 * [tFileOutputDelimited_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileOutputDelimited_1", false);
		start_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());
		
	
	currentComponent="tFileOutputDelimited_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row40");
			
		int tos_count_tFileOutputDelimited_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileOutputDelimited_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileOutputDelimited_1 = new StringBuilder();
                    log4jParamters_tFileOutputDelimited_1.append("Parameters:");
                            log4jParamters_tFileOutputDelimited_1.append("USESTREAM" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FILENAME" + " = " + "context.CONTEXT_RT_RNWL_HOME+context.CONTEXT_RT_TRACK_STATIC+\"IT005P_ob_clr_dr_Delta_reject\"+context.CONTEXT_ETL_INTM_FILE_EXTENSION");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("ROWSEPARATOR" + " = " + "\"\\r\\n\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FIELDSEPARATOR" + " = " + "\"\\t\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("APPEND" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("INCLUDEHEADER" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("COMPRESS" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("CREATE" + " = " + "true");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("SPLIT" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FLUSHONROW" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("ROW_MODE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("DELETE_EMPTYFILE" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                            log4jParamters_tFileOutputDelimited_1.append("FILE_EXIST_EXCEPTION" + " = " + "false");
                        log4jParamters_tFileOutputDelimited_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + (log4jParamters_tFileOutputDelimited_1) );
                    } 
                } 
            new BytesLimit65535_tFileOutputDelimited_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileOutputDelimited_1", "tFileOutputDelimited_1", "tFileOutputDelimited");
				talendJobLogProcess(globalMap);
			}
			

String fileName_tFileOutputDelimited_1 = "";
                class FileOutputDelimitedUtil_tFileOutputDelimited_1{
                                    public void putHeaderValue_0(java.io.Writer outtFileOutputDelimited_1,final String OUT_DELIM_tFileOutputDelimited_1)throws java.lang.Exception{
                                    outtFileOutputDelimited_1.write("ITEM_NUMBER");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_NUMBER_CK_DIGIT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("MANUFACTURER_NAME");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("MANUFACTURER_STOCK_NBR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("PRODUCT_BRAND_NAME");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("PRODUCT_TYPE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_DESCRIPTION");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_RECEIPT_DESCRIPTION");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_MYLAR_DESCRIPTION");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_MYLAR_INDICATOR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_EZ_REF_DESCRIPTION");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_SUPPLY_SOURCE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("UNIT_OF_MEASURE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_PURCHASED_CODE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_QUANTITY_OF_UNIT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("RETAIL_SELL_UNIT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("SKUS_PER_RETAIL_UNIT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("SKU_CUBE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("SKU_WEIGHT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("MERCH_OPSTUDY_NBR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("PROD_CATEG_CODE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("REPURCHASABLE_CODE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("FREIGHT_CLASS_CODE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_FOOD_STAMP_CODE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("MFG_SUGGESTED_RETAIL");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("MFG_SUGG_RETAIL_MULT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("PRICE_CLASS");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_COST_LINK");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("SAME_RETAIL_LINK");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("PRODUCT_PRE_PRICE_IND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_PRICE_REQUIRED_IND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("TRIAL_SIZE_INDICATOR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("TEST_ITEM_INDICATOR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("EXPENSE_ITEM_INDICATOR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("CRW_ITEM_INDICATOR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("CRW_ITEM_NUMBER");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_DIFFT_RETAIL_LINK");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("CENTS_OFF_RETAIL_PRICE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("CENTS_OFF_RETAIL_PCT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_TEMPERATURE_CTRL_CD");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("SPECIAL_HANDLING_CODE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_EXP_DATE_CODE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_SHORT_DATE_MONTH");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("LOT_NUMBER_CODE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("WAREHOUSE_DEPARTMENT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("CONSIGNMENT_INDICATOR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("GUARANTEED_SALE_CODE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("GUARANTEED_RETURN_DATE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("EMPLOYEE_DISCOUNT_IND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("SR_DISCOUNT_IND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("PROF_DISCOUNT_IND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("DANGEROUS_DRUG_INDICATOR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("CONTROL_DRUG_CLASS");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("CONTROL_DRUG_NUMBER");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("AVERAGE_WHOLESALE_PRICE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_ORDER_INDICATOR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_ORDER_IND_DATE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_SLCT_ORDER_METHOD");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_SLCT_ORDER_METH_QTY");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("TOBACCO_TAX_CLASS");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_BASIC_DEPT_IND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("REPLACED_ITEM_NUMBER");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("REPLACED_EFFECTIVE_DATE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("REPLACED_BY_ITEM_NBR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("REPLACED_BY_EFF_DATE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_STUS_IND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_STUS_EFF_DATE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ADV_ITEM_567_INDICATOR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ADV_STORED_CPY_AVAIL_CDE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ADV_PHOTO_AVAIL_CODE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ADV_GB_PRINT_CDE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("REORDER_SOURCE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ALCOHOL_PERCENT");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("PRICE_STICKER");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_TYPE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("SALEABLE_ITEM");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("DUTY_RATE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("HARMONIZED_TARIFF_NBR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("WALGREEN_DEPT_NBR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("SUB_DEPARTMENT_NBR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("COUNTRY_CODE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("AEROSOL_IND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("SCHEDULE_2_DRUG_IND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ETHNIC_CODE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("HAZARDOUS_IND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ITEM_EXP_DATE_TYPE");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("PDQ_ALLOWED_IND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("ORMD_IND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("FLAMMABLE_IND");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("CURRENT_BUYER_NBR");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    }
                                    public void putHeaderValue_1(java.io.Writer outtFileOutputDelimited_1,final String OUT_DELIM_tFileOutputDelimited_1)throws java.lang.Exception{
                                    outtFileOutputDelimited_1.write("USER_STAMP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("TIME_STAMP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("DATE_STAMP");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("errorCode");
                                    outtFileOutputDelimited_1.write(OUT_DELIM_tFileOutputDelimited_1);
                                    outtFileOutputDelimited_1.write("errorMessage");
                                }
                                public void putValue_0(final row40Struct row40,StringBuilder sb_tFileOutputDelimited_1,final String OUT_DELIM_tFileOutputDelimited_1)throws java.lang.Exception {
                                if(row40.ITEM_NUMBER != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_NUMBER
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_NUMBER_CK_DIGIT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_NUMBER_CK_DIGIT
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.MANUFACTURER_NAME != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.MANUFACTURER_NAME
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.MANUFACTURER_STOCK_NBR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.MANUFACTURER_STOCK_NBR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.PRODUCT_BRAND_NAME != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.PRODUCT_BRAND_NAME
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.PRODUCT_TYPE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.PRODUCT_TYPE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_DESCRIPTION != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_DESCRIPTION
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_RECEIPT_DESCRIPTION != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_RECEIPT_DESCRIPTION
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_MYLAR_DESCRIPTION != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_MYLAR_DESCRIPTION
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_MYLAR_INDICATOR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_MYLAR_INDICATOR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_EZ_REF_DESCRIPTION != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_EZ_REF_DESCRIPTION
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_SUPPLY_SOURCE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_SUPPLY_SOURCE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.UNIT_OF_MEASURE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.UNIT_OF_MEASURE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_PURCHASED_CODE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_PURCHASED_CODE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_QUANTITY_OF_UNIT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_QUANTITY_OF_UNIT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.RETAIL_SELL_UNIT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.RETAIL_SELL_UNIT
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.SKUS_PER_RETAIL_UNIT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.SKUS_PER_RETAIL_UNIT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.SKU_CUBE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.SKU_CUBE.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.SKU_WEIGHT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.SKU_WEIGHT.setScale(4, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.MERCH_OPSTUDY_NBR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.MERCH_OPSTUDY_NBR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.PROD_CATEG_CODE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.PROD_CATEG_CODE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.REPURCHASABLE_CODE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.REPURCHASABLE_CODE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.FREIGHT_CLASS_CODE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.FREIGHT_CLASS_CODE.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_FOOD_STAMP_CODE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_FOOD_STAMP_CODE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.MFG_SUGGESTED_RETAIL != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.MFG_SUGGESTED_RETAIL.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.MFG_SUGG_RETAIL_MULT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.MFG_SUGG_RETAIL_MULT.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.PRICE_CLASS != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.PRICE_CLASS
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_COST_LINK != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_COST_LINK.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.SAME_RETAIL_LINK != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.SAME_RETAIL_LINK
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.PRODUCT_PRE_PRICE_IND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.PRODUCT_PRE_PRICE_IND
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_PRICE_REQUIRED_IND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_PRICE_REQUIRED_IND
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.TRIAL_SIZE_INDICATOR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.TRIAL_SIZE_INDICATOR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.TEST_ITEM_INDICATOR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.TEST_ITEM_INDICATOR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.EXPENSE_ITEM_INDICATOR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.EXPENSE_ITEM_INDICATOR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.CRW_ITEM_INDICATOR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.CRW_ITEM_INDICATOR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.CRW_ITEM_NUMBER != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.CRW_ITEM_NUMBER
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_DIFFT_RETAIL_LINK != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_DIFFT_RETAIL_LINK
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.CENTS_OFF_RETAIL_PRICE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.CENTS_OFF_RETAIL_PRICE.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.CENTS_OFF_RETAIL_PCT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.CENTS_OFF_RETAIL_PCT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_TEMPERATURE_CTRL_CD != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_TEMPERATURE_CTRL_CD
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.SPECIAL_HANDLING_CODE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.SPECIAL_HANDLING_CODE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_EXP_DATE_CODE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_EXP_DATE_CODE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_SHORT_DATE_MONTH != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_SHORT_DATE_MONTH.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.LOT_NUMBER_CODE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.LOT_NUMBER_CODE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.WAREHOUSE_DEPARTMENT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.WAREHOUSE_DEPARTMENT
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.CONSIGNMENT_INDICATOR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.CONSIGNMENT_INDICATOR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.GUARANTEED_SALE_CODE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.GUARANTEED_SALE_CODE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.GUARANTEED_RETURN_DATE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.GUARANTEED_RETURN_DATE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.EMPLOYEE_DISCOUNT_IND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.EMPLOYEE_DISCOUNT_IND
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.SR_DISCOUNT_IND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.SR_DISCOUNT_IND
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.PROF_DISCOUNT_IND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.PROF_DISCOUNT_IND
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.DANGEROUS_DRUG_INDICATOR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.DANGEROUS_DRUG_INDICATOR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.CONTROL_DRUG_CLASS != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.CONTROL_DRUG_CLASS
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.CONTROL_DRUG_NUMBER != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.CONTROL_DRUG_NUMBER
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.AVERAGE_WHOLESALE_PRICE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.AVERAGE_WHOLESALE_PRICE.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_ORDER_INDICATOR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_ORDER_INDICATOR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_ORDER_IND_DATE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_ORDER_IND_DATE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_SLCT_ORDER_METHOD != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_SLCT_ORDER_METHOD
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_SLCT_ORDER_METH_QTY != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_SLCT_ORDER_METH_QTY.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.TOBACCO_TAX_CLASS != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.TOBACCO_TAX_CLASS
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_BASIC_DEPT_IND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_BASIC_DEPT_IND
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.REPLACED_ITEM_NUMBER != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.REPLACED_ITEM_NUMBER
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.REPLACED_EFFECTIVE_DATE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.REPLACED_EFFECTIVE_DATE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.REPLACED_BY_ITEM_NBR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.REPLACED_BY_ITEM_NBR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.REPLACED_BY_EFF_DATE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.REPLACED_BY_EFF_DATE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_STUS_IND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_STUS_IND
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_STUS_EFF_DATE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_STUS_EFF_DATE.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ADV_ITEM_567_INDICATOR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ADV_ITEM_567_INDICATOR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ADV_STORED_CPY_AVAIL_CDE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ADV_STORED_CPY_AVAIL_CDE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ADV_PHOTO_AVAIL_CODE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ADV_PHOTO_AVAIL_CODE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ADV_GB_PRINT_CDE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ADV_GB_PRINT_CDE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.REORDER_SOURCE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.REORDER_SOURCE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ALCOHOL_PERCENT != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ALCOHOL_PERCENT.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.PRICE_STICKER != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.PRICE_STICKER
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_TYPE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_TYPE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.SALEABLE_ITEM != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.SALEABLE_ITEM
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.DUTY_RATE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.DUTY_RATE.setScale(2, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.HARMONIZED_TARIFF_NBR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.HARMONIZED_TARIFF_NBR.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.WALGREEN_DEPT_NBR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.WALGREEN_DEPT_NBR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.SUB_DEPARTMENT_NBR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.SUB_DEPARTMENT_NBR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.COUNTRY_CODE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.COUNTRY_CODE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.AEROSOL_IND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.AEROSOL_IND
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.SCHEDULE_2_DRUG_IND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.SCHEDULE_2_DRUG_IND
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ETHNIC_CODE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ETHNIC_CODE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.HAZARDOUS_IND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.HAZARDOUS_IND
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ITEM_EXP_DATE_TYPE != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ITEM_EXP_DATE_TYPE
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.PDQ_ALLOWED_IND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.PDQ_ALLOWED_IND
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.ORMD_IND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.ORMD_IND
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.FLAMMABLE_IND != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.FLAMMABLE_IND
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.CURRENT_BUYER_NBR != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.CURRENT_BUYER_NBR
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                }
                                public void putValue_1(final row40Struct row40,StringBuilder sb_tFileOutputDelimited_1,final String OUT_DELIM_tFileOutputDelimited_1)throws java.lang.Exception {
                                if(row40.USER_STAMP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.USER_STAMP
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.TIME_STAMP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.TIME_STAMP.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.DATE_STAMP != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.DATE_STAMP.setScale(0, java.math.RoundingMode.HALF_UP).toPlainString()
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.errorCode != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.errorCode
                                );
                                }
                                sb_tFileOutputDelimited_1.append(OUT_DELIM_tFileOutputDelimited_1);
                                if(row40.errorMessage != null) {
                                sb_tFileOutputDelimited_1.append(
                                        row40.errorMessage
                                );
                                }
                            }
                }
                FileOutputDelimitedUtil_tFileOutputDelimited_1 fileOutputDelimitedUtil_tFileOutputDelimited_1=new FileOutputDelimitedUtil_tFileOutputDelimited_1();
    fileName_tFileOutputDelimited_1 = (new java.io.File(context.CONTEXT_RT_RNWL_HOME+context.CONTEXT_RT_TRACK_STATIC+"IT005P_ob_clr_dr_Delta_reject"+context.CONTEXT_ETL_INTM_FILE_EXTENSION)).getAbsolutePath().replace("\\","/");
    String fullName_tFileOutputDelimited_1 = null;
    String extension_tFileOutputDelimited_1 = null;
    String directory_tFileOutputDelimited_1 = null;
    if((fileName_tFileOutputDelimited_1.indexOf("/") != -1)) {
        if(fileName_tFileOutputDelimited_1.lastIndexOf(".") < fileName_tFileOutputDelimited_1.lastIndexOf("/")) {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
            extension_tFileOutputDelimited_1 = "";
        } else {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("."));
            extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
        }
        directory_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("/"));
    } else {
        if(fileName_tFileOutputDelimited_1.lastIndexOf(".") != -1) {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(0, fileName_tFileOutputDelimited_1.lastIndexOf("."));
            extension_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1.substring(fileName_tFileOutputDelimited_1.lastIndexOf("."));
        } else {
            fullName_tFileOutputDelimited_1 = fileName_tFileOutputDelimited_1;
            extension_tFileOutputDelimited_1 = "";
        }
        directory_tFileOutputDelimited_1 = "";
    }
    boolean isFileGenerated_tFileOutputDelimited_1 = true;
    java.io.File filetFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
    globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
            int nb_line_tFileOutputDelimited_1 = 0;
            int splitedFileNo_tFileOutputDelimited_1 = 0;
            int currentRow_tFileOutputDelimited_1 = 0;

            final String OUT_DELIM_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:FIELDSEPARATOR */"\t"/** End field tFileOutputDelimited_1:FIELDSEPARATOR */;

            final String OUT_DELIM_ROWSEP_tFileOutputDelimited_1 = /** Start field tFileOutputDelimited_1:ROWSEPARATOR */"\r\n"/** End field tFileOutputDelimited_1:ROWSEPARATOR */;

                    //create directory only if not exists
                    if(directory_tFileOutputDelimited_1 != null && directory_tFileOutputDelimited_1.trim().length() != 0) {
                        java.io.File dir_tFileOutputDelimited_1 = new java.io.File(directory_tFileOutputDelimited_1);
                        if(!dir_tFileOutputDelimited_1.exists()) {
                                log.info("tFileOutputDelimited_1 - Creating directory '" + dir_tFileOutputDelimited_1.getCanonicalPath() +"'.");
                            dir_tFileOutputDelimited_1.mkdirs();
                                log.info("tFileOutputDelimited_1 - The directory '"+ dir_tFileOutputDelimited_1.getCanonicalPath() + "' has been created successfully.");
                        }
                    }

                        //routines.system.Row
                        java.io.Writer outtFileOutputDelimited_1 = null;

                        java.io.File fileToDelete_tFileOutputDelimited_1 = new java.io.File(fileName_tFileOutputDelimited_1);
                        if(fileToDelete_tFileOutputDelimited_1.exists()) {
                            fileToDelete_tFileOutputDelimited_1.delete();
                        }
                        outtFileOutputDelimited_1 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(
                        new java.io.FileOutputStream(fileName_tFileOutputDelimited_1, false),"ISO-8859-15"));
                                    if(filetFileOutputDelimited_1.length()==0){
                                            fileOutputDelimitedUtil_tFileOutputDelimited_1.putHeaderValue_0(outtFileOutputDelimited_1,OUT_DELIM_tFileOutputDelimited_1);
                                            fileOutputDelimitedUtil_tFileOutputDelimited_1.putHeaderValue_1(outtFileOutputDelimited_1,OUT_DELIM_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.write(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);
                                        outtFileOutputDelimited_1.flush();
                                    }


        resourceMap.put("out_tFileOutputDelimited_1", outtFileOutputDelimited_1);
resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

 



/**
 * [tFileOutputDelimited_1 begin ] stop
 */



	
	/**
	 * [tFilterColumns_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tFilterColumns_1", false);
		start_Hash.put("tFilterColumns_1", System.currentTimeMillis());
		
	
	currentComponent="tFilterColumns_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row39");
			
		int tos_count_tFilterColumns_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFilterColumns_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFilterColumns_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFilterColumns_1 = new StringBuilder();
                    log4jParamters_tFilterColumns_1.append("Parameters:");
                if(log.isDebugEnabled())
            log.debug("tFilterColumns_1 - "  + (log4jParamters_tFilterColumns_1) );
                    } 
                } 
            new BytesLimit65535_tFilterColumns_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFilterColumns_1", "tFilterColumns_1", "tFilterColumns");
				talendJobLogProcess(globalMap);
			}
			

                if(log.isDebugEnabled())
            log.debug("tFilterColumns_1 - "  + ("The input columns are: ")  + ("[ITEM_NUMBER, ITEM_NUMBER_CK_DIGIT, MANUFACTURER_NAME, MANUFACTURER_STOCK_NBR, PRODUCT_BRAND_NAME, PRODUCT_TYPE, ITEM_DESCRIPTION, ITEM_RECEIPT_DESCRIPTION, ITEM_MYLAR_DESCRIPTION, ITEM_MYLAR_INDICATOR, ITEM_EZ_REF_DESCRIPTION, ITEM_SUPPLY_SOURCE, UNIT_OF_MEASURE, ITEM_PURCHASED_CODE, ITEM_QUANTITY_OF_UNIT, RETAIL_SELL_UNIT, SKUS_PER_RETAIL_UNIT, SKU_CUBE, SKU_WEIGHT, MERCH_OPSTUDY_NBR, PROD_CATEG_CODE, REPURCHASABLE_CODE, FREIGHT_CLASS_CODE, ITEM_FOOD_STAMP_CODE, MFG_SUGGESTED_RETAIL, MFG_SUGG_RETAIL_MULT, PRICE_CLASS, ITEM_COST_LINK, SAME_RETAIL_LINK, PRODUCT_PRE_PRICE_IND, ITEM_PRICE_REQUIRED_IND, TRIAL_SIZE_INDICATOR, TEST_ITEM_INDICATOR, EXPENSE_ITEM_INDICATOR, CRW_ITEM_INDICATOR, CRW_ITEM_NUMBER, ITEM_DIFFT_RETAIL_LINK, CENTS_OFF_RETAIL_PRICE, CENTS_OFF_RETAIL_PCT, ITEM_TEMPERATURE_CTRL_CD, SPECIAL_HANDLING_CODE, ITEM_EXP_DATE_CODE, ITEM_SHORT_DATE_MONTH, LOT_NUMBER_CODE, WAREHOUSE_DEPARTMENT, CONSIGNMENT_INDICATOR, GUARANTEED_SALE_CODE, GUARANTEED_RETURN_DATE, EMPLOYEE_DISCOUNT_IND, SR_DISCOUNT_IND, PROF_DISCOUNT_IND, DANGEROUS_DRUG_INDICATOR, CONTROL_DRUG_CLASS, CONTROL_DRUG_NUMBER, AVERAGE_WHOLESALE_PRICE, ITEM_ORDER_INDICATOR, ITEM_ORDER_IND_DATE, ITEM_SLCT_ORDER_METHOD, ITEM_SLCT_ORDER_METH_QTY, TOBACCO_TAX_CLASS, ITEM_BASIC_DEPT_IND, REPLACED_ITEM_NUMBER, REPLACED_EFFECTIVE_DATE, REPLACED_BY_ITEM_NBR, REPLACED_BY_EFF_DATE, ITEM_STUS_IND, ITEM_STUS_EFF_DATE, ADV_ITEM_567_INDICATOR, ADV_STORED_CPY_AVAIL_CDE, ADV_PHOTO_AVAIL_CODE, ADV_GB_PRINT_CDE, REORDER_SOURCE, ALCOHOL_PERCENT, PRICE_STICKER, ITEM_TYPE, SALEABLE_ITEM, DUTY_RATE, HARMONIZED_TARIFF_NBR, WALGREEN_DEPT_NBR, SUB_DEPARTMENT_NBR, COUNTRY_CODE, AEROSOL_IND, SCHEDULE_2_DRUG_IND, ETHNIC_CODE, HAZARDOUS_IND, ITEM_EXP_DATE_TYPE, PDQ_ALLOWED_IND, ORMD_IND, FLAMMABLE_IND, CURRENT_BUYER_NBR, USER_STAMP, TIME_STAMP, DATE_STAMP, errorCode, errorMessage]")  + (".") );
                if(log.isDebugEnabled())
            log.debug("tFilterColumns_1 - "  + ("The output columns are: ")  + ("[ITEM_NUMBER, ITEM_NUMBER_CK_DIGIT, MANUFACTURER_NAME, MANUFACTURER_STOCK_NBR, PRODUCT_BRAND_NAME, PRODUCT_TYPE, ITEM_DESCRIPTION, ITEM_RECEIPT_DESCRIPTION, ITEM_MYLAR_DESCRIPTION, ITEM_MYLAR_INDICATOR, ITEM_EZ_REF_DESCRIPTION, ITEM_SUPPLY_SOURCE, UNIT_OF_MEASURE, ITEM_PURCHASED_CODE, ITEM_QUANTITY_OF_UNIT, RETAIL_SELL_UNIT, SKUS_PER_RETAIL_UNIT, SKU_CUBE, SKU_WEIGHT, MERCH_OPSTUDY_NBR, PROD_CATEG_CODE, REPURCHASABLE_CODE, FREIGHT_CLASS_CODE, ITEM_FOOD_STAMP_CODE, MFG_SUGGESTED_RETAIL, MFG_SUGG_RETAIL_MULT, PRICE_CLASS, ITEM_COST_LINK, SAME_RETAIL_LINK, PRODUCT_PRE_PRICE_IND, ITEM_PRICE_REQUIRED_IND, TRIAL_SIZE_INDICATOR, TEST_ITEM_INDICATOR, EXPENSE_ITEM_INDICATOR, CRW_ITEM_INDICATOR, CRW_ITEM_NUMBER, ITEM_DIFFT_RETAIL_LINK, CENTS_OFF_RETAIL_PRICE, CENTS_OFF_RETAIL_PCT, ITEM_TEMPERATURE_CTRL_CD, SPECIAL_HANDLING_CODE, ITEM_EXP_DATE_CODE, ITEM_SHORT_DATE_MONTH, LOT_NUMBER_CODE, WAREHOUSE_DEPARTMENT, CONSIGNMENT_INDICATOR, GUARANTEED_SALE_CODE, GUARANTEED_RETURN_DATE, EMPLOYEE_DISCOUNT_IND, SR_DISCOUNT_IND, PROF_DISCOUNT_IND, DANGEROUS_DRUG_INDICATOR, CONTROL_DRUG_CLASS, CONTROL_DRUG_NUMBER, AVERAGE_WHOLESALE_PRICE, ITEM_ORDER_INDICATOR, ITEM_ORDER_IND_DATE, ITEM_SLCT_ORDER_METHOD, ITEM_SLCT_ORDER_METH_QTY, TOBACCO_TAX_CLASS, ITEM_BASIC_DEPT_IND, REPLACED_ITEM_NUMBER, REPLACED_EFFECTIVE_DATE, REPLACED_BY_ITEM_NBR, REPLACED_BY_EFF_DATE, ITEM_STUS_IND, ITEM_STUS_EFF_DATE, ADV_ITEM_567_INDICATOR, ADV_STORED_CPY_AVAIL_CDE, ADV_PHOTO_AVAIL_CODE, ADV_GB_PRINT_CDE, REORDER_SOURCE, ALCOHOL_PERCENT, PRICE_STICKER, ITEM_TYPE, SALEABLE_ITEM, DUTY_RATE, HARMONIZED_TARIFF_NBR, WALGREEN_DEPT_NBR, SUB_DEPARTMENT_NBR, COUNTRY_CODE, AEROSOL_IND, SCHEDULE_2_DRUG_IND, ETHNIC_CODE, HAZARDOUS_IND, ITEM_EXP_DATE_TYPE, PDQ_ALLOWED_IND, ORMD_IND, FLAMMABLE_IND, CURRENT_BUYER_NBR, USER_STAMP, TIME_STAMP, DATE_STAMP, errorCode, errorMessage]")  + (".") );

 int nb_line_tFilterColumns_1 = 0;
 



/**
 * [tFilterColumns_1 begin ] stop
 */



	
	/**
	 * [tDBOutput_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBOutput_1", false);
		start_Hash.put("tDBOutput_1", System.currentTimeMillis());
		
	
	currentComponent="tDBOutput_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"row27");
			
		int tos_count_tDBOutput_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBOutput_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBOutput_1 = new StringBuilder();
                    log4jParamters_tDBOutput_1.append("Parameters:");
                            log4jParamters_tDBOutput_1.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("STANDARD_SYNTAX" + " = " + "true");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("CONNECTION" + " = " + "tDBConnection_1");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TABLE" + " = " + "\"IT005P\"");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("DATA_ACTION" + " = " + "INSERT_OR_UPDATE");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("SET_QUERY_TIMEOUT" + " = " + "false");
                        log4jParamters_tDBOutput_1.append(" | ");
                            log4jParamters_tDBOutput_1.append("UNIFIED_COMPONENTS" + " = " + "tAS400Output");
                        log4jParamters_tDBOutput_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + (log4jParamters_tDBOutput_1) );
                    } 
                } 
            new BytesLimit65535_tDBOutput_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBOutput_1", "__UNIQUE_NAME__<br>it005p", "tAS400Output");
				talendJobLogProcess(globalMap);
			}
			





        int updateKeyCount_tDBOutput_1 = 1;
        if(updateKeyCount_tDBOutput_1 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        } else if (updateKeyCount_tDBOutput_1 == 93 && true) {
                    log.warn("For update, every Schema column can not be a key");
        }

int nb_line_tDBOutput_1 = 0;
int nb_line_update_tDBOutput_1 = 0;
int nb_line_inserted_tDBOutput_1 = 0;
int nb_line_deleted_tDBOutput_1 = 0;

int nb_line_rejected_tDBOutput_1 = 0;
int rejectedCount_tDBOutput_1=0;
int tmp_batchUpdateCount_tDBOutput_1 = 0;

int deletedCount_tDBOutput_1=0;
int updatedCount_tDBOutput_1=0;
int insertedCount_tDBOutput_1=0;
int rowsToCommitCount_tDBOutput_1=0;
String tableName_tDBOutput_1 = "IT005P";
boolean whetherReject_tDBOutput_1 = false;


    java.sql.Connection conn_tDBOutput_1 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Uses an existing connection with username '")  + (conn_tDBOutput_1.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tDBOutput_1.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Connection is set auto commit to '")  + (conn_tDBOutput_1.getAutoCommit())  + ("'.") );
int count_tDBOutput_1=0;
    java.sql.PreparedStatement pstmt_tDBOutput_1 = null;
    java.sql.PreparedStatement pstmtInsert_tDBOutput_1 = null;
    java.sql.PreparedStatement pstmtUpdate_tDBOutput_1 = null;
	    pstmt_tDBOutput_1 = conn_tDBOutput_1.prepareStatement("SELECT COUNT(1) FROM " + "IT005P" + " WHERE ITEM_NUMBER = ?");
		resourceMap.put("pstmt_tDBOutput_1", pstmt_tDBOutput_1);
	    String insert_tDBOutput_1 = "INSERT INTO " + "IT005P" + " (ITEM_NUMBER,ITEM_NUMBER_CK_DIGIT,MANUFACTURER_NAME,MANUFACTURER_STOCK_NBR,PRODUCT_BRAND_NAME,PRODUCT_TYPE,ITEM_DESCRIPTION,ITEM_RECEIPT_DESCRIPTION,ITEM_MYLAR_DESCRIPTION,ITEM_MYLAR_INDICATOR,ITEM_EZ_REF_DESCRIPTION,ITEM_SUPPLY_SOURCE,UNIT_OF_MEASURE,ITEM_PURCHASED_CODE,ITEM_QUANTITY_OF_UNIT,RETAIL_SELL_UNIT,SKUS_PER_RETAIL_UNIT,SKU_CUBE,SKU_WEIGHT,MERCH_OPSTUDY_NBR,PROD_CATEG_CODE,REPURCHASABLE_CODE,FREIGHT_CLASS_CODE,ITEM_FOOD_STAMP_CODE,MFG_SUGGESTED_RETAIL,MFG_SUGG_RETAIL_MULT,PRICE_CLASS,ITEM_COST_LINK,SAME_RETAIL_LINK,PRODUCT_PRE_PRICE_IND,ITEM_PRICE_REQUIRED_IND,TRIAL_SIZE_INDICATOR,TEST_ITEM_INDICATOR,EXPENSE_ITEM_INDICATOR,CRW_ITEM_INDICATOR,CRW_ITEM_NUMBER,ITEM_DIFFT_RETAIL_LINK,CENTS_OFF_RETAIL_PRICE,CENTS_OFF_RETAIL_PCT,ITEM_TEMPERATURE_CTRL_CD,SPECIAL_HANDLING_CODE,ITEM_EXP_DATE_CODE,ITEM_SHORT_DATE_MONTH,LOT_NUMBER_CODE,WAREHOUSE_DEPARTMENT,CONSIGNMENT_INDICATOR,GUARANTEED_SALE_CODE,GUARANTEED_RETURN_DATE,EMPLOYEE_DISCOUNT_IND,SR_DISCOUNT_IND,PROF_DISCOUNT_IND,DANGEROUS_DRUG_INDICATOR,CONTROL_DRUG_CLASS,CONTROL_DRUG_NUMBER,AVERAGE_WHOLESALE_PRICE,ITEM_ORDER_INDICATOR,ITEM_ORDER_IND_DATE,ITEM_SLCT_ORDER_METHOD,ITEM_SLCT_ORDER_METH_QTY,TOBACCO_TAX_CLASS,ITEM_BASIC_DEPT_IND,REPLACED_ITEM_NUMBER,REPLACED_EFFECTIVE_DATE,REPLACED_BY_ITEM_NBR,REPLACED_BY_EFF_DATE,ITEM_STUS_IND,ITEM_STUS_EFF_DATE,ADV_ITEM_567_INDICATOR,ADV_STORED_CPY_AVAIL_CDE,ADV_PHOTO_AVAIL_CODE,ADV_GB_PRINT_CDE,REORDER_SOURCE,ALCOHOL_PERCENT,PRICE_STICKER,ITEM_TYPE,SALEABLE_ITEM,DUTY_RATE,HARMONIZED_TARIFF_NBR,WALGREEN_DEPT_NBR,SUB_DEPARTMENT_NBR,COUNTRY_CODE,AEROSOL_IND,SCHEDULE_2_DRUG_IND,ETHNIC_CODE,HAZARDOUS_IND,ITEM_EXP_DATE_TYPE,PDQ_ALLOWED_IND,ORMD_IND,FLAMMABLE_IND,CURRENT_BUYER_NBR,USER_STAMP,TIME_STAMP,DATE_STAMP) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	    pstmtInsert_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(insert_tDBOutput_1);
		resourceMap.put("pstmtInsert_tDBOutput_1", pstmtInsert_tDBOutput_1);
	    String update_tDBOutput_1 = "UPDATE " + "IT005P" + " SET ITEM_NUMBER_CK_DIGIT = ?,MANUFACTURER_NAME = ?,MANUFACTURER_STOCK_NBR = ?,PRODUCT_BRAND_NAME = ?,PRODUCT_TYPE = ?,ITEM_DESCRIPTION = ?,ITEM_RECEIPT_DESCRIPTION = ?,ITEM_MYLAR_DESCRIPTION = ?,ITEM_MYLAR_INDICATOR = ?,ITEM_EZ_REF_DESCRIPTION = ?,ITEM_SUPPLY_SOURCE = ?,UNIT_OF_MEASURE = ?,ITEM_PURCHASED_CODE = ?,ITEM_QUANTITY_OF_UNIT = ?,RETAIL_SELL_UNIT = ?,SKUS_PER_RETAIL_UNIT = ?,SKU_CUBE = ?,SKU_WEIGHT = ?,MERCH_OPSTUDY_NBR = ?,PROD_CATEG_CODE = ?,REPURCHASABLE_CODE = ?,FREIGHT_CLASS_CODE = ?,ITEM_FOOD_STAMP_CODE = ?,MFG_SUGGESTED_RETAIL = ?,MFG_SUGG_RETAIL_MULT = ?,PRICE_CLASS = ?,ITEM_COST_LINK = ?,SAME_RETAIL_LINK = ?,PRODUCT_PRE_PRICE_IND = ?,ITEM_PRICE_REQUIRED_IND = ?,TRIAL_SIZE_INDICATOR = ?,TEST_ITEM_INDICATOR = ?,EXPENSE_ITEM_INDICATOR = ?,CRW_ITEM_INDICATOR = ?,CRW_ITEM_NUMBER = ?,ITEM_DIFFT_RETAIL_LINK = ?,CENTS_OFF_RETAIL_PRICE = ?,CENTS_OFF_RETAIL_PCT = ?,ITEM_TEMPERATURE_CTRL_CD = ?,SPECIAL_HANDLING_CODE = ?,ITEM_EXP_DATE_CODE = ?,ITEM_SHORT_DATE_MONTH = ?,LOT_NUMBER_CODE = ?,WAREHOUSE_DEPARTMENT = ?,CONSIGNMENT_INDICATOR = ?,GUARANTEED_SALE_CODE = ?,GUARANTEED_RETURN_DATE = ?,EMPLOYEE_DISCOUNT_IND = ?,SR_DISCOUNT_IND = ?,PROF_DISCOUNT_IND = ?,DANGEROUS_DRUG_INDICATOR = ?,CONTROL_DRUG_CLASS = ?,CONTROL_DRUG_NUMBER = ?,AVERAGE_WHOLESALE_PRICE = ?,ITEM_ORDER_INDICATOR = ?,ITEM_ORDER_IND_DATE = ?,ITEM_SLCT_ORDER_METHOD = ?,ITEM_SLCT_ORDER_METH_QTY = ?,TOBACCO_TAX_CLASS = ?,ITEM_BASIC_DEPT_IND = ?,REPLACED_ITEM_NUMBER = ?,REPLACED_EFFECTIVE_DATE = ?,REPLACED_BY_ITEM_NBR = ?,REPLACED_BY_EFF_DATE = ?,ITEM_STUS_IND = ?,ITEM_STUS_EFF_DATE = ?,ADV_ITEM_567_INDICATOR = ?,ADV_STORED_CPY_AVAIL_CDE = ?,ADV_PHOTO_AVAIL_CODE = ?,ADV_GB_PRINT_CDE = ?,REORDER_SOURCE = ?,ALCOHOL_PERCENT = ?,PRICE_STICKER = ?,ITEM_TYPE = ?,SALEABLE_ITEM = ?,DUTY_RATE = ?,HARMONIZED_TARIFF_NBR = ?,WALGREEN_DEPT_NBR = ?,SUB_DEPARTMENT_NBR = ?,COUNTRY_CODE = ?,AEROSOL_IND = ?,SCHEDULE_2_DRUG_IND = ?,ETHNIC_CODE = ?,HAZARDOUS_IND = ?,ITEM_EXP_DATE_TYPE = ?,PDQ_ALLOWED_IND = ?,ORMD_IND = ?,FLAMMABLE_IND = ?,CURRENT_BUYER_NBR = ?,USER_STAMP = ?,TIME_STAMP = ?,DATE_STAMP = ? WHERE ITEM_NUMBER = ?";
	    pstmtUpdate_tDBOutput_1 = conn_tDBOutput_1.prepareStatement(update_tDBOutput_1);
		resourceMap.put("pstmtUpdate_tDBOutput_1", pstmtUpdate_tDBOutput_1);
	    




 



/**
 * [tDBOutput_1 begin ] stop
 */



	
	/**
	 * [tFileInputDelimited_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tFileInputDelimited_2", false);
		start_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());
		
	
	currentComponent="tFileInputDelimited_2";

	
		int tos_count_tFileInputDelimited_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tFileInputDelimited_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tFileInputDelimited_2 = new StringBuilder();
                    log4jParamters_tFileInputDelimited_2.append("Parameters:");
                            log4jParamters_tFileInputDelimited_2.append("FILENAME" + " = " + "context.CONTEXT_RT_RNWL_HOME+context.CONTEXT_RT_TRACK_STATIC+\"IT005P_ob_clr_dr_Delta\" +context.CONTEXT_ETL_INTM_FILE_EXTENSION");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("CSV_OPTION" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("ROWSEPARATOR" + " = " + "\"\\r\\n\"");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("FIELDSEPARATOR" + " = " + "\"\\t\"");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("HEADER" + " = " + "1");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("FOOTER" + " = " + "0");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("LIMIT" + " = " + "");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("REMOVE_EMPTY_ROW" + " = " + "true");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("UNCOMPRESS" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("ADVANCED_SEPARATOR" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("RANDOM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("TRIMALL" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("TRIMSELECT" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_NUMBER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_NUMBER_CK_DIGIT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MANUFACTURER_NAME")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MANUFACTURER_STOCK_NBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRODUCT_BRAND_NAME")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRODUCT_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_DESCRIPTION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_RECEIPT_DESCRIPTION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_MYLAR_DESCRIPTION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_MYLAR_INDICATOR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_EZ_REF_DESCRIPTION")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_SUPPLY_SOURCE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("UNIT_OF_MEASURE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_PURCHASED_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_QUANTITY_OF_UNIT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("RETAIL_SELL_UNIT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SKUS_PER_RETAIL_UNIT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SKU_CUBE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SKU_WEIGHT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MERCH_OPSTUDY_NBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PROD_CATEG_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REPURCHASABLE_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FREIGHT_CLASS_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_FOOD_STAMP_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MFG_SUGGESTED_RETAIL")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("MFG_SUGG_RETAIL_MULT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRICE_CLASS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_COST_LINK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SAME_RETAIL_LINK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRODUCT_PRE_PRICE_IND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_PRICE_REQUIRED_IND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TRIAL_SIZE_INDICATOR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TEST_ITEM_INDICATOR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EXPENSE_ITEM_INDICATOR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CRW_ITEM_INDICATOR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CRW_ITEM_NUMBER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_DIFFT_RETAIL_LINK")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CENTS_OFF_RETAIL_PRICE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CENTS_OFF_RETAIL_PCT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_TEMPERATURE_CTRL_CD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SPECIAL_HANDLING_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_EXP_DATE_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_SHORT_DATE_MONTH")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("LOT_NUMBER_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("WAREHOUSE_DEPARTMENT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CONSIGNMENT_INDICATOR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("GUARANTEED_SALE_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("GUARANTEED_RETURN_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("EMPLOYEE_DISCOUNT_IND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SR_DISCOUNT_IND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PROF_DISCOUNT_IND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DANGEROUS_DRUG_INDICATOR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CONTROL_DRUG_CLASS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CONTROL_DRUG_NUMBER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("AVERAGE_WHOLESALE_PRICE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_ORDER_INDICATOR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_ORDER_IND_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_SLCT_ORDER_METHOD")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_SLCT_ORDER_METH_QTY")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TOBACCO_TAX_CLASS")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_BASIC_DEPT_IND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REPLACED_ITEM_NUMBER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REPLACED_EFFECTIVE_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REPLACED_BY_ITEM_NBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REPLACED_BY_EFF_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_STUS_IND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_STUS_EFF_DATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ADV_ITEM_567_INDICATOR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ADV_STORED_CPY_AVAIL_CDE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ADV_PHOTO_AVAIL_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ADV_GB_PRINT_CDE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("REORDER_SOURCE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ALCOHOL_PERCENT")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PRICE_STICKER")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SALEABLE_ITEM")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DUTY_RATE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("HARMONIZED_TARIFF_NBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("WALGREEN_DEPT_NBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SUB_DEPARTMENT_NBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("COUNTRY_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("AEROSOL_IND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("SCHEDULE_2_DRUG_IND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ETHNIC_CODE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("HAZARDOUS_IND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ITEM_EXP_DATE_TYPE")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("PDQ_ALLOWED_IND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("ORMD_IND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("FLAMMABLE_IND")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("CURRENT_BUYER_NBR")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("USER_STAMP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("TIME_STAMP")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("DATE_STAMP")+"}]");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("CHECK_FIELDS_NUM" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("CHECK_DATE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("ENCODING" + " = " + "\"ISO-8859-15\"");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("SPLITRECORD" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                            log4jParamters_tFileInputDelimited_2.append("ENABLE_DECODE" + " = " + "false");
                        log4jParamters_tFileInputDelimited_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_2 - "  + (log4jParamters_tFileInputDelimited_2) );
                    } 
                } 
            new BytesLimit65535_tFileInputDelimited_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tFileInputDelimited_2", "<b>__UNIQUE_NAME__</b><br>IT005P_ob_clr_dr_Delta", "tFileInputDelimited");
				talendJobLogProcess(globalMap);
			}
			
	
	
	
 
	
	
	final routines.system.RowState rowstate_tFileInputDelimited_2 = new routines.system.RowState();
	
	
				int nb_line_tFileInputDelimited_2 = 0;
				org.talend.fileprocess.FileInputDelimited fid_tFileInputDelimited_2 = null;
				int limit_tFileInputDelimited_2 = -1;
				try{
					
						Object filename_tFileInputDelimited_2 = context.CONTEXT_RT_RNWL_HOME+context.CONTEXT_RT_TRACK_STATIC+"IT005P_ob_clr_dr_Delta" +context.CONTEXT_ETL_INTM_FILE_EXTENSION;
						if(filename_tFileInputDelimited_2 instanceof java.io.InputStream){
							
			int footer_value_tFileInputDelimited_2 = 0, random_value_tFileInputDelimited_2 = -1;
			if(footer_value_tFileInputDelimited_2 >0 || random_value_tFileInputDelimited_2 > 0){
				throw new java.lang.Exception("When the input source is a stream,footer and random shouldn't be bigger than 0.");				
			}
		
						}
						try {
							fid_tFileInputDelimited_2 = new org.talend.fileprocess.FileInputDelimited(context.CONTEXT_RT_RNWL_HOME+context.CONTEXT_RT_TRACK_STATIC+"IT005P_ob_clr_dr_Delta" +context.CONTEXT_ETL_INTM_FILE_EXTENSION, "ISO-8859-15","\t","\r\n",true,1,0,
									limit_tFileInputDelimited_2
								,-1, false);
						} catch(java.lang.Exception e) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",e.getMessage());
							
								
									log.error("tFileInputDelimited_2 - " +e.getMessage());
								
								System.err.println(e.getMessage());
							
						}
					
				    
				    	log.info("tFileInputDelimited_2 - Retrieving records from the datasource.");
				    
					while (fid_tFileInputDelimited_2!=null && fid_tFileInputDelimited_2.nextRecord()) {
						rowstate_tFileInputDelimited_2.reset();
						
			    						row27 = null;			
												
									boolean whetherReject_tFileInputDelimited_2 = false;
									row27 = new row27Struct();
									try {
										
				int columnIndexWithD_tFileInputDelimited_2 = 0;
				
					String temp = ""; 
				
					columnIndexWithD_tFileInputDelimited_2 = 0;
					
							row27.ITEM_NUMBER = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 1;
					
							row27.ITEM_NUMBER_CK_DIGIT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 2;
					
							row27.MANUFACTURER_NAME = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 3;
					
							row27.MANUFACTURER_STOCK_NBR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 4;
					
							row27.PRODUCT_BRAND_NAME = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 5;
					
							row27.PRODUCT_TYPE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 6;
					
							row27.ITEM_DESCRIPTION = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 7;
					
							row27.ITEM_RECEIPT_DESCRIPTION = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 8;
					
							row27.ITEM_MYLAR_DESCRIPTION = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 9;
					
							row27.ITEM_MYLAR_INDICATOR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 10;
					
							row27.ITEM_EZ_REF_DESCRIPTION = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 11;
					
							row27.ITEM_SUPPLY_SOURCE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 12;
					
							row27.UNIT_OF_MEASURE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 13;
					
							row27.ITEM_PURCHASED_CODE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 14;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.ITEM_QUANTITY_OF_UNIT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ITEM_QUANTITY_OF_UNIT", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.ITEM_QUANTITY_OF_UNIT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 15;
					
							row27.RETAIL_SELL_UNIT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 16;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.SKUS_PER_RETAIL_UNIT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"SKUS_PER_RETAIL_UNIT", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.SKUS_PER_RETAIL_UNIT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 17;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.SKU_CUBE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"SKU_CUBE", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.SKU_CUBE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 18;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.SKU_WEIGHT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"SKU_WEIGHT", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.SKU_WEIGHT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 19;
					
							row27.MERCH_OPSTUDY_NBR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 20;
					
							row27.PROD_CATEG_CODE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 21;
					
							row27.REPURCHASABLE_CODE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 22;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.FREIGHT_CLASS_CODE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"FREIGHT_CLASS_CODE", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.FREIGHT_CLASS_CODE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 23;
					
							row27.ITEM_FOOD_STAMP_CODE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 24;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.MFG_SUGGESTED_RETAIL = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"MFG_SUGGESTED_RETAIL", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.MFG_SUGGESTED_RETAIL = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 25;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.MFG_SUGG_RETAIL_MULT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"MFG_SUGG_RETAIL_MULT", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.MFG_SUGG_RETAIL_MULT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 26;
					
							row27.PRICE_CLASS = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 27;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.ITEM_COST_LINK = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ITEM_COST_LINK", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.ITEM_COST_LINK = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 28;
					
							row27.SAME_RETAIL_LINK = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 29;
					
							row27.PRODUCT_PRE_PRICE_IND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 30;
					
							row27.ITEM_PRICE_REQUIRED_IND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 31;
					
							row27.TRIAL_SIZE_INDICATOR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 32;
					
							row27.TEST_ITEM_INDICATOR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 33;
					
							row27.EXPENSE_ITEM_INDICATOR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 34;
					
							row27.CRW_ITEM_INDICATOR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 35;
					
							row27.CRW_ITEM_NUMBER = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 36;
					
							row27.ITEM_DIFFT_RETAIL_LINK = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 37;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.CENTS_OFF_RETAIL_PRICE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"CENTS_OFF_RETAIL_PRICE", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.CENTS_OFF_RETAIL_PRICE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 38;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.CENTS_OFF_RETAIL_PCT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"CENTS_OFF_RETAIL_PCT", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.CENTS_OFF_RETAIL_PCT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 39;
					
							row27.ITEM_TEMPERATURE_CTRL_CD = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 40;
					
							row27.SPECIAL_HANDLING_CODE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 41;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.ITEM_EXP_DATE_CODE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ITEM_EXP_DATE_CODE", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.ITEM_EXP_DATE_CODE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 42;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.ITEM_SHORT_DATE_MONTH = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ITEM_SHORT_DATE_MONTH", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.ITEM_SHORT_DATE_MONTH = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 43;
					
							row27.LOT_NUMBER_CODE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 44;
					
							row27.WAREHOUSE_DEPARTMENT = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 45;
					
							row27.CONSIGNMENT_INDICATOR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 46;
					
							row27.GUARANTEED_SALE_CODE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 47;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.GUARANTEED_RETURN_DATE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"GUARANTEED_RETURN_DATE", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.GUARANTEED_RETURN_DATE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 48;
					
							row27.EMPLOYEE_DISCOUNT_IND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 49;
					
							row27.SR_DISCOUNT_IND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 50;
					
							row27.PROF_DISCOUNT_IND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 51;
					
							row27.DANGEROUS_DRUG_INDICATOR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 52;
					
							row27.CONTROL_DRUG_CLASS = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 53;
					
							row27.CONTROL_DRUG_NUMBER = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 54;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.AVERAGE_WHOLESALE_PRICE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"AVERAGE_WHOLESALE_PRICE", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.AVERAGE_WHOLESALE_PRICE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 55;
					
							row27.ITEM_ORDER_INDICATOR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 56;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.ITEM_ORDER_IND_DATE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ITEM_ORDER_IND_DATE", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.ITEM_ORDER_IND_DATE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 57;
					
							row27.ITEM_SLCT_ORDER_METHOD = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 58;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.ITEM_SLCT_ORDER_METH_QTY = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ITEM_SLCT_ORDER_METH_QTY", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.ITEM_SLCT_ORDER_METH_QTY = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 59;
					
							row27.TOBACCO_TAX_CLASS = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 60;
					
							row27.ITEM_BASIC_DEPT_IND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 61;
					
							row27.REPLACED_ITEM_NUMBER = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 62;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.REPLACED_EFFECTIVE_DATE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"REPLACED_EFFECTIVE_DATE", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.REPLACED_EFFECTIVE_DATE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 63;
					
							row27.REPLACED_BY_ITEM_NBR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 64;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.REPLACED_BY_EFF_DATE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"REPLACED_BY_EFF_DATE", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.REPLACED_BY_EFF_DATE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 65;
					
							row27.ITEM_STUS_IND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 66;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.ITEM_STUS_EFF_DATE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ITEM_STUS_EFF_DATE", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.ITEM_STUS_EFF_DATE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 67;
					
							row27.ADV_ITEM_567_INDICATOR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 68;
					
							row27.ADV_STORED_CPY_AVAIL_CDE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 69;
					
							row27.ADV_PHOTO_AVAIL_CODE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 70;
					
							row27.ADV_GB_PRINT_CDE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 71;
					
							row27.REORDER_SOURCE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 72;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.ALCOHOL_PERCENT = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"ALCOHOL_PERCENT", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.ALCOHOL_PERCENT = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 73;
					
							row27.PRICE_STICKER = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 74;
					
							row27.ITEM_TYPE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 75;
					
							row27.SALEABLE_ITEM = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 76;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.DUTY_RATE = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"DUTY_RATE", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.DUTY_RATE = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 77;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.HARMONIZED_TARIFF_NBR = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"HARMONIZED_TARIFF_NBR", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.HARMONIZED_TARIFF_NBR = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 78;
					
							row27.WALGREEN_DEPT_NBR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 79;
					
							row27.SUB_DEPARTMENT_NBR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 80;
					
							row27.COUNTRY_CODE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 81;
					
							row27.AEROSOL_IND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 82;
					
							row27.SCHEDULE_2_DRUG_IND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 83;
					
							row27.ETHNIC_CODE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 84;
					
							row27.HAZARDOUS_IND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 85;
					
							row27.ITEM_EXP_DATE_TYPE = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 86;
					
							row27.PDQ_ALLOWED_IND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 87;
					
							row27.ORMD_IND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 88;
					
							row27.FLAMMABLE_IND = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 89;
					
							row27.CURRENT_BUYER_NBR = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 90;
					
							row27.USER_STAMP = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						
				
					columnIndexWithD_tFileInputDelimited_2 = 91;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.TIME_STAMP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"TIME_STAMP", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.TIME_STAMP = null;
								
							
						}
					
				
					columnIndexWithD_tFileInputDelimited_2 = 92;
					
						temp = fid_tFileInputDelimited_2.get(columnIndexWithD_tFileInputDelimited_2);
						if(temp.length() > 0) {
							
								try {
								
    								row27.DATE_STAMP = ParserUtils.parseTo_BigDecimal(temp);
    							
    							} catch(java.lang.Exception ex_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",ex_tFileInputDelimited_2.getMessage());
									rowstate_tFileInputDelimited_2.setException(new RuntimeException(String.format("Couldn't parse value for column '%s' in '%s', value is '%s'. Details: %s",
										"DATE_STAMP", "row27", temp, ex_tFileInputDelimited_2), ex_tFileInputDelimited_2));
								}
    							
						} else {						
							
								
									row27.DATE_STAMP = null;
								
							
						}
					
				
				
										
										if(rowstate_tFileInputDelimited_2.getException()!=null) {
											throw rowstate_tFileInputDelimited_2.getException();
										}
										
										
							
			    					} catch (java.lang.Exception e) {
globalMap.put("tFileInputDelimited_2_ERROR_MESSAGE",e.getMessage());
			        					whetherReject_tFileInputDelimited_2 = true;
			        					
												log.error("tFileInputDelimited_2 - " +e.getMessage());
											
			                					System.err.println(e.getMessage());
			                					row27 = null;
			                				
										
			    					}
								
			log.debug("tFileInputDelimited_2 - Retrieving the record " + fid_tFileInputDelimited_2.getRowNumber() + ".");
		

 



/**
 * [tFileInputDelimited_2 begin ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 main ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	

 


	tos_count_tFileInputDelimited_2++;

/**
 * [tFileInputDelimited_2 main ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	

 



/**
 * [tFileInputDelimited_2 process_data_begin ] stop
 */
// Start of branch "row27"
if(row27 != null) { 
			row39 = null;



	
	/**
	 * [tDBOutput_1 main ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row27","tFileInputDelimited_2","<b>__UNIQUE_NAME__</b><br>IT005P_ob_clr_dr_Delta","tFileInputDelimited","tDBOutput_1","__UNIQUE_NAME__<br>it005p","tAS400Output"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row27 - " + (row27==null? "": row27.toLogString()));
    			}
    		



            row39 = null;
        whetherReject_tDBOutput_1 = false;
                    if(row27.ITEM_NUMBER == null) {
pstmt_tDBOutput_1.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tDBOutput_1.setString(1, row27.ITEM_NUMBER);
}

            int checkCount_tDBOutput_1 = -1;
            try (java.sql.ResultSet rs_tDBOutput_1 = pstmt_tDBOutput_1.executeQuery()) {
                while(rs_tDBOutput_1.next()) {
                    checkCount_tDBOutput_1 = rs_tDBOutput_1.getInt(1);
                }
            }
    		if(checkCount_tDBOutput_1 > 0) {
    			try {
    			
                        if(row27.ITEM_NUMBER_CK_DIGIT == null) {
pstmtUpdate_tDBOutput_1.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(1, row27.ITEM_NUMBER_CK_DIGIT);
}

                        if(row27.MANUFACTURER_NAME == null) {
pstmtUpdate_tDBOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(2, row27.MANUFACTURER_NAME);
}

                        if(row27.MANUFACTURER_STOCK_NBR == null) {
pstmtUpdate_tDBOutput_1.setNull(3, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(3, row27.MANUFACTURER_STOCK_NBR);
}

                        if(row27.PRODUCT_BRAND_NAME == null) {
pstmtUpdate_tDBOutput_1.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(4, row27.PRODUCT_BRAND_NAME);
}

                        if(row27.PRODUCT_TYPE == null) {
pstmtUpdate_tDBOutput_1.setNull(5, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(5, row27.PRODUCT_TYPE);
}

                        if(row27.ITEM_DESCRIPTION == null) {
pstmtUpdate_tDBOutput_1.setNull(6, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(6, row27.ITEM_DESCRIPTION);
}

                        if(row27.ITEM_RECEIPT_DESCRIPTION == null) {
pstmtUpdate_tDBOutput_1.setNull(7, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(7, row27.ITEM_RECEIPT_DESCRIPTION);
}

                        if(row27.ITEM_MYLAR_DESCRIPTION == null) {
pstmtUpdate_tDBOutput_1.setNull(8, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(8, row27.ITEM_MYLAR_DESCRIPTION);
}

                        if(row27.ITEM_MYLAR_INDICATOR == null) {
pstmtUpdate_tDBOutput_1.setNull(9, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(9, row27.ITEM_MYLAR_INDICATOR);
}

                        if(row27.ITEM_EZ_REF_DESCRIPTION == null) {
pstmtUpdate_tDBOutput_1.setNull(10, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(10, row27.ITEM_EZ_REF_DESCRIPTION);
}

                        if(row27.ITEM_SUPPLY_SOURCE == null) {
pstmtUpdate_tDBOutput_1.setNull(11, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(11, row27.ITEM_SUPPLY_SOURCE);
}

                        if(row27.UNIT_OF_MEASURE == null) {
pstmtUpdate_tDBOutput_1.setNull(12, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(12, row27.UNIT_OF_MEASURE);
}

                        if(row27.ITEM_PURCHASED_CODE == null) {
pstmtUpdate_tDBOutput_1.setNull(13, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(13, row27.ITEM_PURCHASED_CODE);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(14, row27.ITEM_QUANTITY_OF_UNIT);

                        if(row27.RETAIL_SELL_UNIT == null) {
pstmtUpdate_tDBOutput_1.setNull(15, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(15, row27.RETAIL_SELL_UNIT);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(16, row27.SKUS_PER_RETAIL_UNIT);

                        pstmtUpdate_tDBOutput_1.setBigDecimal(17, row27.SKU_CUBE);

                        pstmtUpdate_tDBOutput_1.setBigDecimal(18, row27.SKU_WEIGHT);

                        if(row27.MERCH_OPSTUDY_NBR == null) {
pstmtUpdate_tDBOutput_1.setNull(19, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(19, row27.MERCH_OPSTUDY_NBR);
}

                        if(row27.PROD_CATEG_CODE == null) {
pstmtUpdate_tDBOutput_1.setNull(20, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(20, row27.PROD_CATEG_CODE);
}

                        if(row27.REPURCHASABLE_CODE == null) {
pstmtUpdate_tDBOutput_1.setNull(21, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(21, row27.REPURCHASABLE_CODE);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(22, row27.FREIGHT_CLASS_CODE);

                        if(row27.ITEM_FOOD_STAMP_CODE == null) {
pstmtUpdate_tDBOutput_1.setNull(23, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(23, row27.ITEM_FOOD_STAMP_CODE);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(24, row27.MFG_SUGGESTED_RETAIL);

                        pstmtUpdate_tDBOutput_1.setBigDecimal(25, row27.MFG_SUGG_RETAIL_MULT);

                        if(row27.PRICE_CLASS == null) {
pstmtUpdate_tDBOutput_1.setNull(26, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(26, row27.PRICE_CLASS);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(27, row27.ITEM_COST_LINK);

                        if(row27.SAME_RETAIL_LINK == null) {
pstmtUpdate_tDBOutput_1.setNull(28, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(28, row27.SAME_RETAIL_LINK);
}

                        if(row27.PRODUCT_PRE_PRICE_IND == null) {
pstmtUpdate_tDBOutput_1.setNull(29, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(29, row27.PRODUCT_PRE_PRICE_IND);
}

                        if(row27.ITEM_PRICE_REQUIRED_IND == null) {
pstmtUpdate_tDBOutput_1.setNull(30, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(30, row27.ITEM_PRICE_REQUIRED_IND);
}

                        if(row27.TRIAL_SIZE_INDICATOR == null) {
pstmtUpdate_tDBOutput_1.setNull(31, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(31, row27.TRIAL_SIZE_INDICATOR);
}

                        if(row27.TEST_ITEM_INDICATOR == null) {
pstmtUpdate_tDBOutput_1.setNull(32, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(32, row27.TEST_ITEM_INDICATOR);
}

                        if(row27.EXPENSE_ITEM_INDICATOR == null) {
pstmtUpdate_tDBOutput_1.setNull(33, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(33, row27.EXPENSE_ITEM_INDICATOR);
}

                        if(row27.CRW_ITEM_INDICATOR == null) {
pstmtUpdate_tDBOutput_1.setNull(34, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(34, row27.CRW_ITEM_INDICATOR);
}

                        if(row27.CRW_ITEM_NUMBER == null) {
pstmtUpdate_tDBOutput_1.setNull(35, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(35, row27.CRW_ITEM_NUMBER);
}

                        if(row27.ITEM_DIFFT_RETAIL_LINK == null) {
pstmtUpdate_tDBOutput_1.setNull(36, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(36, row27.ITEM_DIFFT_RETAIL_LINK);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(37, row27.CENTS_OFF_RETAIL_PRICE);

                        pstmtUpdate_tDBOutput_1.setBigDecimal(38, row27.CENTS_OFF_RETAIL_PCT);

                        if(row27.ITEM_TEMPERATURE_CTRL_CD == null) {
pstmtUpdate_tDBOutput_1.setNull(39, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(39, row27.ITEM_TEMPERATURE_CTRL_CD);
}

                        if(row27.SPECIAL_HANDLING_CODE == null) {
pstmtUpdate_tDBOutput_1.setNull(40, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(40, row27.SPECIAL_HANDLING_CODE);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(41, row27.ITEM_EXP_DATE_CODE);

                        pstmtUpdate_tDBOutput_1.setBigDecimal(42, row27.ITEM_SHORT_DATE_MONTH);

                        if(row27.LOT_NUMBER_CODE == null) {
pstmtUpdate_tDBOutput_1.setNull(43, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(43, row27.LOT_NUMBER_CODE);
}

                        if(row27.WAREHOUSE_DEPARTMENT == null) {
pstmtUpdate_tDBOutput_1.setNull(44, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(44, row27.WAREHOUSE_DEPARTMENT);
}

                        if(row27.CONSIGNMENT_INDICATOR == null) {
pstmtUpdate_tDBOutput_1.setNull(45, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(45, row27.CONSIGNMENT_INDICATOR);
}

                        if(row27.GUARANTEED_SALE_CODE == null) {
pstmtUpdate_tDBOutput_1.setNull(46, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(46, row27.GUARANTEED_SALE_CODE);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(47, row27.GUARANTEED_RETURN_DATE);

                        if(row27.EMPLOYEE_DISCOUNT_IND == null) {
pstmtUpdate_tDBOutput_1.setNull(48, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(48, row27.EMPLOYEE_DISCOUNT_IND);
}

                        if(row27.SR_DISCOUNT_IND == null) {
pstmtUpdate_tDBOutput_1.setNull(49, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(49, row27.SR_DISCOUNT_IND);
}

                        if(row27.PROF_DISCOUNT_IND == null) {
pstmtUpdate_tDBOutput_1.setNull(50, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(50, row27.PROF_DISCOUNT_IND);
}

                        if(row27.DANGEROUS_DRUG_INDICATOR == null) {
pstmtUpdate_tDBOutput_1.setNull(51, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(51, row27.DANGEROUS_DRUG_INDICATOR);
}

                        if(row27.CONTROL_DRUG_CLASS == null) {
pstmtUpdate_tDBOutput_1.setNull(52, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(52, row27.CONTROL_DRUG_CLASS);
}

                        if(row27.CONTROL_DRUG_NUMBER == null) {
pstmtUpdate_tDBOutput_1.setNull(53, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(53, row27.CONTROL_DRUG_NUMBER);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(54, row27.AVERAGE_WHOLESALE_PRICE);

                        if(row27.ITEM_ORDER_INDICATOR == null) {
pstmtUpdate_tDBOutput_1.setNull(55, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(55, row27.ITEM_ORDER_INDICATOR);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(56, row27.ITEM_ORDER_IND_DATE);

                        if(row27.ITEM_SLCT_ORDER_METHOD == null) {
pstmtUpdate_tDBOutput_1.setNull(57, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(57, row27.ITEM_SLCT_ORDER_METHOD);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(58, row27.ITEM_SLCT_ORDER_METH_QTY);

                        if(row27.TOBACCO_TAX_CLASS == null) {
pstmtUpdate_tDBOutput_1.setNull(59, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(59, row27.TOBACCO_TAX_CLASS);
}

                        if(row27.ITEM_BASIC_DEPT_IND == null) {
pstmtUpdate_tDBOutput_1.setNull(60, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(60, row27.ITEM_BASIC_DEPT_IND);
}

                        if(row27.REPLACED_ITEM_NUMBER == null) {
pstmtUpdate_tDBOutput_1.setNull(61, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(61, row27.REPLACED_ITEM_NUMBER);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(62, row27.REPLACED_EFFECTIVE_DATE);

                        if(row27.REPLACED_BY_ITEM_NBR == null) {
pstmtUpdate_tDBOutput_1.setNull(63, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(63, row27.REPLACED_BY_ITEM_NBR);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(64, row27.REPLACED_BY_EFF_DATE);

                        if(row27.ITEM_STUS_IND == null) {
pstmtUpdate_tDBOutput_1.setNull(65, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(65, row27.ITEM_STUS_IND);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(66, row27.ITEM_STUS_EFF_DATE);

                        if(row27.ADV_ITEM_567_INDICATOR == null) {
pstmtUpdate_tDBOutput_1.setNull(67, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(67, row27.ADV_ITEM_567_INDICATOR);
}

                        if(row27.ADV_STORED_CPY_AVAIL_CDE == null) {
pstmtUpdate_tDBOutput_1.setNull(68, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(68, row27.ADV_STORED_CPY_AVAIL_CDE);
}

                        if(row27.ADV_PHOTO_AVAIL_CODE == null) {
pstmtUpdate_tDBOutput_1.setNull(69, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(69, row27.ADV_PHOTO_AVAIL_CODE);
}

                        if(row27.ADV_GB_PRINT_CDE == null) {
pstmtUpdate_tDBOutput_1.setNull(70, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(70, row27.ADV_GB_PRINT_CDE);
}

                        if(row27.REORDER_SOURCE == null) {
pstmtUpdate_tDBOutput_1.setNull(71, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(71, row27.REORDER_SOURCE);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(72, row27.ALCOHOL_PERCENT);

                        if(row27.PRICE_STICKER == null) {
pstmtUpdate_tDBOutput_1.setNull(73, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(73, row27.PRICE_STICKER);
}

                        if(row27.ITEM_TYPE == null) {
pstmtUpdate_tDBOutput_1.setNull(74, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(74, row27.ITEM_TYPE);
}

                        if(row27.SALEABLE_ITEM == null) {
pstmtUpdate_tDBOutput_1.setNull(75, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(75, row27.SALEABLE_ITEM);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(76, row27.DUTY_RATE);

                        pstmtUpdate_tDBOutput_1.setBigDecimal(77, row27.HARMONIZED_TARIFF_NBR);

                        if(row27.WALGREEN_DEPT_NBR == null) {
pstmtUpdate_tDBOutput_1.setNull(78, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(78, row27.WALGREEN_DEPT_NBR);
}

                        if(row27.SUB_DEPARTMENT_NBR == null) {
pstmtUpdate_tDBOutput_1.setNull(79, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(79, row27.SUB_DEPARTMENT_NBR);
}

                        if(row27.COUNTRY_CODE == null) {
pstmtUpdate_tDBOutput_1.setNull(80, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(80, row27.COUNTRY_CODE);
}

                        if(row27.AEROSOL_IND == null) {
pstmtUpdate_tDBOutput_1.setNull(81, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(81, row27.AEROSOL_IND);
}

                        if(row27.SCHEDULE_2_DRUG_IND == null) {
pstmtUpdate_tDBOutput_1.setNull(82, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(82, row27.SCHEDULE_2_DRUG_IND);
}

                        if(row27.ETHNIC_CODE == null) {
pstmtUpdate_tDBOutput_1.setNull(83, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(83, row27.ETHNIC_CODE);
}

                        if(row27.HAZARDOUS_IND == null) {
pstmtUpdate_tDBOutput_1.setNull(84, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(84, row27.HAZARDOUS_IND);
}

                        if(row27.ITEM_EXP_DATE_TYPE == null) {
pstmtUpdate_tDBOutput_1.setNull(85, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(85, row27.ITEM_EXP_DATE_TYPE);
}

                        if(row27.PDQ_ALLOWED_IND == null) {
pstmtUpdate_tDBOutput_1.setNull(86, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(86, row27.PDQ_ALLOWED_IND);
}

                        if(row27.ORMD_IND == null) {
pstmtUpdate_tDBOutput_1.setNull(87, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(87, row27.ORMD_IND);
}

                        if(row27.FLAMMABLE_IND == null) {
pstmtUpdate_tDBOutput_1.setNull(88, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(88, row27.FLAMMABLE_IND);
}

                        if(row27.CURRENT_BUYER_NBR == null) {
pstmtUpdate_tDBOutput_1.setNull(89, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(89, row27.CURRENT_BUYER_NBR);
}

                        if(row27.USER_STAMP == null) {
pstmtUpdate_tDBOutput_1.setNull(90, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(90, row27.USER_STAMP);
}

                        pstmtUpdate_tDBOutput_1.setBigDecimal(91, row27.TIME_STAMP);

                        pstmtUpdate_tDBOutput_1.setBigDecimal(92, row27.DATE_STAMP);


                        if(row27.ITEM_NUMBER == null) {
pstmtUpdate_tDBOutput_1.setNull(93 + count_tDBOutput_1, java.sql.Types.VARCHAR);
} else {pstmtUpdate_tDBOutput_1.setString(93 + count_tDBOutput_1, row27.ITEM_NUMBER);
}

        			
        			updatedCount_tDBOutput_1 = updatedCount_tDBOutput_1 + pstmtUpdate_tDBOutput_1.executeUpdate();
        			nb_line_tDBOutput_1++;
        			
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Updating")  + (" the record ")  + (nb_line_tDBOutput_1)  + (".") );
                } catch(java.sql.SQLException e) {
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e.getMessage());
                    whetherReject_tDBOutput_1 = true;
                    	nb_line_tDBOutput_1++;
                    	
                            row39 = new row39Struct();
                                row39.ITEM_NUMBER = row27.ITEM_NUMBER;
                                row39.ITEM_NUMBER_CK_DIGIT = row27.ITEM_NUMBER_CK_DIGIT;
                                row39.MANUFACTURER_NAME = row27.MANUFACTURER_NAME;
                                row39.MANUFACTURER_STOCK_NBR = row27.MANUFACTURER_STOCK_NBR;
                                row39.PRODUCT_BRAND_NAME = row27.PRODUCT_BRAND_NAME;
                                row39.PRODUCT_TYPE = row27.PRODUCT_TYPE;
                                row39.ITEM_DESCRIPTION = row27.ITEM_DESCRIPTION;
                                row39.ITEM_RECEIPT_DESCRIPTION = row27.ITEM_RECEIPT_DESCRIPTION;
                                row39.ITEM_MYLAR_DESCRIPTION = row27.ITEM_MYLAR_DESCRIPTION;
                                row39.ITEM_MYLAR_INDICATOR = row27.ITEM_MYLAR_INDICATOR;
                                row39.ITEM_EZ_REF_DESCRIPTION = row27.ITEM_EZ_REF_DESCRIPTION;
                                row39.ITEM_SUPPLY_SOURCE = row27.ITEM_SUPPLY_SOURCE;
                                row39.UNIT_OF_MEASURE = row27.UNIT_OF_MEASURE;
                                row39.ITEM_PURCHASED_CODE = row27.ITEM_PURCHASED_CODE;
                                row39.ITEM_QUANTITY_OF_UNIT = row27.ITEM_QUANTITY_OF_UNIT;
                                row39.RETAIL_SELL_UNIT = row27.RETAIL_SELL_UNIT;
                                row39.SKUS_PER_RETAIL_UNIT = row27.SKUS_PER_RETAIL_UNIT;
                                row39.SKU_CUBE = row27.SKU_CUBE;
                                row39.SKU_WEIGHT = row27.SKU_WEIGHT;
                                row39.MERCH_OPSTUDY_NBR = row27.MERCH_OPSTUDY_NBR;
                                row39.PROD_CATEG_CODE = row27.PROD_CATEG_CODE;
                                row39.REPURCHASABLE_CODE = row27.REPURCHASABLE_CODE;
                                row39.FREIGHT_CLASS_CODE = row27.FREIGHT_CLASS_CODE;
                                row39.ITEM_FOOD_STAMP_CODE = row27.ITEM_FOOD_STAMP_CODE;
                                row39.MFG_SUGGESTED_RETAIL = row27.MFG_SUGGESTED_RETAIL;
                                row39.MFG_SUGG_RETAIL_MULT = row27.MFG_SUGG_RETAIL_MULT;
                                row39.PRICE_CLASS = row27.PRICE_CLASS;
                                row39.ITEM_COST_LINK = row27.ITEM_COST_LINK;
                                row39.SAME_RETAIL_LINK = row27.SAME_RETAIL_LINK;
                                row39.PRODUCT_PRE_PRICE_IND = row27.PRODUCT_PRE_PRICE_IND;
                                row39.ITEM_PRICE_REQUIRED_IND = row27.ITEM_PRICE_REQUIRED_IND;
                                row39.TRIAL_SIZE_INDICATOR = row27.TRIAL_SIZE_INDICATOR;
                                row39.TEST_ITEM_INDICATOR = row27.TEST_ITEM_INDICATOR;
                                row39.EXPENSE_ITEM_INDICATOR = row27.EXPENSE_ITEM_INDICATOR;
                                row39.CRW_ITEM_INDICATOR = row27.CRW_ITEM_INDICATOR;
                                row39.CRW_ITEM_NUMBER = row27.CRW_ITEM_NUMBER;
                                row39.ITEM_DIFFT_RETAIL_LINK = row27.ITEM_DIFFT_RETAIL_LINK;
                                row39.CENTS_OFF_RETAIL_PRICE = row27.CENTS_OFF_RETAIL_PRICE;
                                row39.CENTS_OFF_RETAIL_PCT = row27.CENTS_OFF_RETAIL_PCT;
                                row39.ITEM_TEMPERATURE_CTRL_CD = row27.ITEM_TEMPERATURE_CTRL_CD;
                                row39.SPECIAL_HANDLING_CODE = row27.SPECIAL_HANDLING_CODE;
                                row39.ITEM_EXP_DATE_CODE = row27.ITEM_EXP_DATE_CODE;
                                row39.ITEM_SHORT_DATE_MONTH = row27.ITEM_SHORT_DATE_MONTH;
                                row39.LOT_NUMBER_CODE = row27.LOT_NUMBER_CODE;
                                row39.WAREHOUSE_DEPARTMENT = row27.WAREHOUSE_DEPARTMENT;
                                row39.CONSIGNMENT_INDICATOR = row27.CONSIGNMENT_INDICATOR;
                                row39.GUARANTEED_SALE_CODE = row27.GUARANTEED_SALE_CODE;
                                row39.GUARANTEED_RETURN_DATE = row27.GUARANTEED_RETURN_DATE;
                                row39.EMPLOYEE_DISCOUNT_IND = row27.EMPLOYEE_DISCOUNT_IND;
                                row39.SR_DISCOUNT_IND = row27.SR_DISCOUNT_IND;
                                row39.PROF_DISCOUNT_IND = row27.PROF_DISCOUNT_IND;
                                row39.DANGEROUS_DRUG_INDICATOR = row27.DANGEROUS_DRUG_INDICATOR;
                                row39.CONTROL_DRUG_CLASS = row27.CONTROL_DRUG_CLASS;
                                row39.CONTROL_DRUG_NUMBER = row27.CONTROL_DRUG_NUMBER;
                                row39.AVERAGE_WHOLESALE_PRICE = row27.AVERAGE_WHOLESALE_PRICE;
                                row39.ITEM_ORDER_INDICATOR = row27.ITEM_ORDER_INDICATOR;
                                row39.ITEM_ORDER_IND_DATE = row27.ITEM_ORDER_IND_DATE;
                                row39.ITEM_SLCT_ORDER_METHOD = row27.ITEM_SLCT_ORDER_METHOD;
                                row39.ITEM_SLCT_ORDER_METH_QTY = row27.ITEM_SLCT_ORDER_METH_QTY;
                                row39.TOBACCO_TAX_CLASS = row27.TOBACCO_TAX_CLASS;
                                row39.ITEM_BASIC_DEPT_IND = row27.ITEM_BASIC_DEPT_IND;
                                row39.REPLACED_ITEM_NUMBER = row27.REPLACED_ITEM_NUMBER;
                                row39.REPLACED_EFFECTIVE_DATE = row27.REPLACED_EFFECTIVE_DATE;
                                row39.REPLACED_BY_ITEM_NBR = row27.REPLACED_BY_ITEM_NBR;
                                row39.REPLACED_BY_EFF_DATE = row27.REPLACED_BY_EFF_DATE;
                                row39.ITEM_STUS_IND = row27.ITEM_STUS_IND;
                                row39.ITEM_STUS_EFF_DATE = row27.ITEM_STUS_EFF_DATE;
                                row39.ADV_ITEM_567_INDICATOR = row27.ADV_ITEM_567_INDICATOR;
                                row39.ADV_STORED_CPY_AVAIL_CDE = row27.ADV_STORED_CPY_AVAIL_CDE;
                                row39.ADV_PHOTO_AVAIL_CODE = row27.ADV_PHOTO_AVAIL_CODE;
                                row39.ADV_GB_PRINT_CDE = row27.ADV_GB_PRINT_CDE;
                                row39.REORDER_SOURCE = row27.REORDER_SOURCE;
                                row39.ALCOHOL_PERCENT = row27.ALCOHOL_PERCENT;
                                row39.PRICE_STICKER = row27.PRICE_STICKER;
                                row39.ITEM_TYPE = row27.ITEM_TYPE;
                                row39.SALEABLE_ITEM = row27.SALEABLE_ITEM;
                                row39.DUTY_RATE = row27.DUTY_RATE;
                                row39.HARMONIZED_TARIFF_NBR = row27.HARMONIZED_TARIFF_NBR;
                                row39.WALGREEN_DEPT_NBR = row27.WALGREEN_DEPT_NBR;
                                row39.SUB_DEPARTMENT_NBR = row27.SUB_DEPARTMENT_NBR;
                                row39.COUNTRY_CODE = row27.COUNTRY_CODE;
                                row39.AEROSOL_IND = row27.AEROSOL_IND;
                                row39.SCHEDULE_2_DRUG_IND = row27.SCHEDULE_2_DRUG_IND;
                                row39.ETHNIC_CODE = row27.ETHNIC_CODE;
                                row39.HAZARDOUS_IND = row27.HAZARDOUS_IND;
                                row39.ITEM_EXP_DATE_TYPE = row27.ITEM_EXP_DATE_TYPE;
                                row39.PDQ_ALLOWED_IND = row27.PDQ_ALLOWED_IND;
                                row39.ORMD_IND = row27.ORMD_IND;
                                row39.FLAMMABLE_IND = row27.FLAMMABLE_IND;
                                row39.CURRENT_BUYER_NBR = row27.CURRENT_BUYER_NBR;
                                row39.USER_STAMP = row27.USER_STAMP;
                                row39.TIME_STAMP = row27.TIME_STAMP;
                                row39.DATE_STAMP = row27.DATE_STAMP;
                            rejectedCount_tDBOutput_1 = rejectedCount_tDBOutput_1 + 1;
                            row39.errorCode = ((java.sql.SQLException)e).getSQLState();
                            row39.errorMessage = e.getMessage() + " - Line: " + tos_count_tDBOutput_1;
                }
    		} else {
    			try {
    			
                        if(row27.ITEM_NUMBER == null) {
pstmtInsert_tDBOutput_1.setNull(1, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(1, row27.ITEM_NUMBER);
}

                        if(row27.ITEM_NUMBER_CK_DIGIT == null) {
pstmtInsert_tDBOutput_1.setNull(2, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(2, row27.ITEM_NUMBER_CK_DIGIT);
}

                        if(row27.MANUFACTURER_NAME == null) {
pstmtInsert_tDBOutput_1.setNull(3, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(3, row27.MANUFACTURER_NAME);
}

                        if(row27.MANUFACTURER_STOCK_NBR == null) {
pstmtInsert_tDBOutput_1.setNull(4, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(4, row27.MANUFACTURER_STOCK_NBR);
}

                        if(row27.PRODUCT_BRAND_NAME == null) {
pstmtInsert_tDBOutput_1.setNull(5, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(5, row27.PRODUCT_BRAND_NAME);
}

                        if(row27.PRODUCT_TYPE == null) {
pstmtInsert_tDBOutput_1.setNull(6, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(6, row27.PRODUCT_TYPE);
}

                        if(row27.ITEM_DESCRIPTION == null) {
pstmtInsert_tDBOutput_1.setNull(7, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(7, row27.ITEM_DESCRIPTION);
}

                        if(row27.ITEM_RECEIPT_DESCRIPTION == null) {
pstmtInsert_tDBOutput_1.setNull(8, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(8, row27.ITEM_RECEIPT_DESCRIPTION);
}

                        if(row27.ITEM_MYLAR_DESCRIPTION == null) {
pstmtInsert_tDBOutput_1.setNull(9, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(9, row27.ITEM_MYLAR_DESCRIPTION);
}

                        if(row27.ITEM_MYLAR_INDICATOR == null) {
pstmtInsert_tDBOutput_1.setNull(10, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(10, row27.ITEM_MYLAR_INDICATOR);
}

                        if(row27.ITEM_EZ_REF_DESCRIPTION == null) {
pstmtInsert_tDBOutput_1.setNull(11, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(11, row27.ITEM_EZ_REF_DESCRIPTION);
}

                        if(row27.ITEM_SUPPLY_SOURCE == null) {
pstmtInsert_tDBOutput_1.setNull(12, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(12, row27.ITEM_SUPPLY_SOURCE);
}

                        if(row27.UNIT_OF_MEASURE == null) {
pstmtInsert_tDBOutput_1.setNull(13, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(13, row27.UNIT_OF_MEASURE);
}

                        if(row27.ITEM_PURCHASED_CODE == null) {
pstmtInsert_tDBOutput_1.setNull(14, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(14, row27.ITEM_PURCHASED_CODE);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(15, row27.ITEM_QUANTITY_OF_UNIT);

                        if(row27.RETAIL_SELL_UNIT == null) {
pstmtInsert_tDBOutput_1.setNull(16, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(16, row27.RETAIL_SELL_UNIT);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(17, row27.SKUS_PER_RETAIL_UNIT);

                        pstmtInsert_tDBOutput_1.setBigDecimal(18, row27.SKU_CUBE);

                        pstmtInsert_tDBOutput_1.setBigDecimal(19, row27.SKU_WEIGHT);

                        if(row27.MERCH_OPSTUDY_NBR == null) {
pstmtInsert_tDBOutput_1.setNull(20, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(20, row27.MERCH_OPSTUDY_NBR);
}

                        if(row27.PROD_CATEG_CODE == null) {
pstmtInsert_tDBOutput_1.setNull(21, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(21, row27.PROD_CATEG_CODE);
}

                        if(row27.REPURCHASABLE_CODE == null) {
pstmtInsert_tDBOutput_1.setNull(22, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(22, row27.REPURCHASABLE_CODE);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(23, row27.FREIGHT_CLASS_CODE);

                        if(row27.ITEM_FOOD_STAMP_CODE == null) {
pstmtInsert_tDBOutput_1.setNull(24, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(24, row27.ITEM_FOOD_STAMP_CODE);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(25, row27.MFG_SUGGESTED_RETAIL);

                        pstmtInsert_tDBOutput_1.setBigDecimal(26, row27.MFG_SUGG_RETAIL_MULT);

                        if(row27.PRICE_CLASS == null) {
pstmtInsert_tDBOutput_1.setNull(27, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(27, row27.PRICE_CLASS);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(28, row27.ITEM_COST_LINK);

                        if(row27.SAME_RETAIL_LINK == null) {
pstmtInsert_tDBOutput_1.setNull(29, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(29, row27.SAME_RETAIL_LINK);
}

                        if(row27.PRODUCT_PRE_PRICE_IND == null) {
pstmtInsert_tDBOutput_1.setNull(30, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(30, row27.PRODUCT_PRE_PRICE_IND);
}

                        if(row27.ITEM_PRICE_REQUIRED_IND == null) {
pstmtInsert_tDBOutput_1.setNull(31, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(31, row27.ITEM_PRICE_REQUIRED_IND);
}

                        if(row27.TRIAL_SIZE_INDICATOR == null) {
pstmtInsert_tDBOutput_1.setNull(32, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(32, row27.TRIAL_SIZE_INDICATOR);
}

                        if(row27.TEST_ITEM_INDICATOR == null) {
pstmtInsert_tDBOutput_1.setNull(33, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(33, row27.TEST_ITEM_INDICATOR);
}

                        if(row27.EXPENSE_ITEM_INDICATOR == null) {
pstmtInsert_tDBOutput_1.setNull(34, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(34, row27.EXPENSE_ITEM_INDICATOR);
}

                        if(row27.CRW_ITEM_INDICATOR == null) {
pstmtInsert_tDBOutput_1.setNull(35, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(35, row27.CRW_ITEM_INDICATOR);
}

                        if(row27.CRW_ITEM_NUMBER == null) {
pstmtInsert_tDBOutput_1.setNull(36, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(36, row27.CRW_ITEM_NUMBER);
}

                        if(row27.ITEM_DIFFT_RETAIL_LINK == null) {
pstmtInsert_tDBOutput_1.setNull(37, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(37, row27.ITEM_DIFFT_RETAIL_LINK);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(38, row27.CENTS_OFF_RETAIL_PRICE);

                        pstmtInsert_tDBOutput_1.setBigDecimal(39, row27.CENTS_OFF_RETAIL_PCT);

                        if(row27.ITEM_TEMPERATURE_CTRL_CD == null) {
pstmtInsert_tDBOutput_1.setNull(40, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(40, row27.ITEM_TEMPERATURE_CTRL_CD);
}

                        if(row27.SPECIAL_HANDLING_CODE == null) {
pstmtInsert_tDBOutput_1.setNull(41, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(41, row27.SPECIAL_HANDLING_CODE);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(42, row27.ITEM_EXP_DATE_CODE);

                        pstmtInsert_tDBOutput_1.setBigDecimal(43, row27.ITEM_SHORT_DATE_MONTH);

                        if(row27.LOT_NUMBER_CODE == null) {
pstmtInsert_tDBOutput_1.setNull(44, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(44, row27.LOT_NUMBER_CODE);
}

                        if(row27.WAREHOUSE_DEPARTMENT == null) {
pstmtInsert_tDBOutput_1.setNull(45, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(45, row27.WAREHOUSE_DEPARTMENT);
}

                        if(row27.CONSIGNMENT_INDICATOR == null) {
pstmtInsert_tDBOutput_1.setNull(46, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(46, row27.CONSIGNMENT_INDICATOR);
}

                        if(row27.GUARANTEED_SALE_CODE == null) {
pstmtInsert_tDBOutput_1.setNull(47, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(47, row27.GUARANTEED_SALE_CODE);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(48, row27.GUARANTEED_RETURN_DATE);

                        if(row27.EMPLOYEE_DISCOUNT_IND == null) {
pstmtInsert_tDBOutput_1.setNull(49, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(49, row27.EMPLOYEE_DISCOUNT_IND);
}

                        if(row27.SR_DISCOUNT_IND == null) {
pstmtInsert_tDBOutput_1.setNull(50, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(50, row27.SR_DISCOUNT_IND);
}

                        if(row27.PROF_DISCOUNT_IND == null) {
pstmtInsert_tDBOutput_1.setNull(51, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(51, row27.PROF_DISCOUNT_IND);
}

                        if(row27.DANGEROUS_DRUG_INDICATOR == null) {
pstmtInsert_tDBOutput_1.setNull(52, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(52, row27.DANGEROUS_DRUG_INDICATOR);
}

                        if(row27.CONTROL_DRUG_CLASS == null) {
pstmtInsert_tDBOutput_1.setNull(53, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(53, row27.CONTROL_DRUG_CLASS);
}

                        if(row27.CONTROL_DRUG_NUMBER == null) {
pstmtInsert_tDBOutput_1.setNull(54, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(54, row27.CONTROL_DRUG_NUMBER);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(55, row27.AVERAGE_WHOLESALE_PRICE);

                        if(row27.ITEM_ORDER_INDICATOR == null) {
pstmtInsert_tDBOutput_1.setNull(56, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(56, row27.ITEM_ORDER_INDICATOR);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(57, row27.ITEM_ORDER_IND_DATE);

                        if(row27.ITEM_SLCT_ORDER_METHOD == null) {
pstmtInsert_tDBOutput_1.setNull(58, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(58, row27.ITEM_SLCT_ORDER_METHOD);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(59, row27.ITEM_SLCT_ORDER_METH_QTY);

                        if(row27.TOBACCO_TAX_CLASS == null) {
pstmtInsert_tDBOutput_1.setNull(60, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(60, row27.TOBACCO_TAX_CLASS);
}

                        if(row27.ITEM_BASIC_DEPT_IND == null) {
pstmtInsert_tDBOutput_1.setNull(61, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(61, row27.ITEM_BASIC_DEPT_IND);
}

                        if(row27.REPLACED_ITEM_NUMBER == null) {
pstmtInsert_tDBOutput_1.setNull(62, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(62, row27.REPLACED_ITEM_NUMBER);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(63, row27.REPLACED_EFFECTIVE_DATE);

                        if(row27.REPLACED_BY_ITEM_NBR == null) {
pstmtInsert_tDBOutput_1.setNull(64, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(64, row27.REPLACED_BY_ITEM_NBR);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(65, row27.REPLACED_BY_EFF_DATE);

                        if(row27.ITEM_STUS_IND == null) {
pstmtInsert_tDBOutput_1.setNull(66, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(66, row27.ITEM_STUS_IND);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(67, row27.ITEM_STUS_EFF_DATE);

                        if(row27.ADV_ITEM_567_INDICATOR == null) {
pstmtInsert_tDBOutput_1.setNull(68, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(68, row27.ADV_ITEM_567_INDICATOR);
}

                        if(row27.ADV_STORED_CPY_AVAIL_CDE == null) {
pstmtInsert_tDBOutput_1.setNull(69, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(69, row27.ADV_STORED_CPY_AVAIL_CDE);
}

                        if(row27.ADV_PHOTO_AVAIL_CODE == null) {
pstmtInsert_tDBOutput_1.setNull(70, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(70, row27.ADV_PHOTO_AVAIL_CODE);
}

                        if(row27.ADV_GB_PRINT_CDE == null) {
pstmtInsert_tDBOutput_1.setNull(71, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(71, row27.ADV_GB_PRINT_CDE);
}

                        if(row27.REORDER_SOURCE == null) {
pstmtInsert_tDBOutput_1.setNull(72, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(72, row27.REORDER_SOURCE);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(73, row27.ALCOHOL_PERCENT);

                        if(row27.PRICE_STICKER == null) {
pstmtInsert_tDBOutput_1.setNull(74, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(74, row27.PRICE_STICKER);
}

                        if(row27.ITEM_TYPE == null) {
pstmtInsert_tDBOutput_1.setNull(75, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(75, row27.ITEM_TYPE);
}

                        if(row27.SALEABLE_ITEM == null) {
pstmtInsert_tDBOutput_1.setNull(76, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(76, row27.SALEABLE_ITEM);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(77, row27.DUTY_RATE);

                        pstmtInsert_tDBOutput_1.setBigDecimal(78, row27.HARMONIZED_TARIFF_NBR);

                        if(row27.WALGREEN_DEPT_NBR == null) {
pstmtInsert_tDBOutput_1.setNull(79, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(79, row27.WALGREEN_DEPT_NBR);
}

                        if(row27.SUB_DEPARTMENT_NBR == null) {
pstmtInsert_tDBOutput_1.setNull(80, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(80, row27.SUB_DEPARTMENT_NBR);
}

                        if(row27.COUNTRY_CODE == null) {
pstmtInsert_tDBOutput_1.setNull(81, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(81, row27.COUNTRY_CODE);
}

                        if(row27.AEROSOL_IND == null) {
pstmtInsert_tDBOutput_1.setNull(82, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(82, row27.AEROSOL_IND);
}

                        if(row27.SCHEDULE_2_DRUG_IND == null) {
pstmtInsert_tDBOutput_1.setNull(83, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(83, row27.SCHEDULE_2_DRUG_IND);
}

                        if(row27.ETHNIC_CODE == null) {
pstmtInsert_tDBOutput_1.setNull(84, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(84, row27.ETHNIC_CODE);
}

                        if(row27.HAZARDOUS_IND == null) {
pstmtInsert_tDBOutput_1.setNull(85, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(85, row27.HAZARDOUS_IND);
}

                        if(row27.ITEM_EXP_DATE_TYPE == null) {
pstmtInsert_tDBOutput_1.setNull(86, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(86, row27.ITEM_EXP_DATE_TYPE);
}

                        if(row27.PDQ_ALLOWED_IND == null) {
pstmtInsert_tDBOutput_1.setNull(87, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(87, row27.PDQ_ALLOWED_IND);
}

                        if(row27.ORMD_IND == null) {
pstmtInsert_tDBOutput_1.setNull(88, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(88, row27.ORMD_IND);
}

                        if(row27.FLAMMABLE_IND == null) {
pstmtInsert_tDBOutput_1.setNull(89, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(89, row27.FLAMMABLE_IND);
}

                        if(row27.CURRENT_BUYER_NBR == null) {
pstmtInsert_tDBOutput_1.setNull(90, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(90, row27.CURRENT_BUYER_NBR);
}

                        if(row27.USER_STAMP == null) {
pstmtInsert_tDBOutput_1.setNull(91, java.sql.Types.VARCHAR);
} else {pstmtInsert_tDBOutput_1.setString(91, row27.USER_STAMP);
}

                        pstmtInsert_tDBOutput_1.setBigDecimal(92, row27.TIME_STAMP);

                        pstmtInsert_tDBOutput_1.setBigDecimal(93, row27.DATE_STAMP);

                    insertedCount_tDBOutput_1 = insertedCount_tDBOutput_1 + pstmtInsert_tDBOutput_1.executeUpdate();
                    nb_line_tDBOutput_1++;
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Inserting")  + (" the record ")  + (nb_line_tDBOutput_1)  + (".") );
                } catch(java.sql.SQLException e) {
globalMap.put("tDBOutput_1_ERROR_MESSAGE",e.getMessage());
                    whetherReject_tDBOutput_1 = true;
                		nb_line_tDBOutput_1++;
                    	
                            row39 = new row39Struct();
                                row39.ITEM_NUMBER = row27.ITEM_NUMBER;
                                row39.ITEM_NUMBER_CK_DIGIT = row27.ITEM_NUMBER_CK_DIGIT;
                                row39.MANUFACTURER_NAME = row27.MANUFACTURER_NAME;
                                row39.MANUFACTURER_STOCK_NBR = row27.MANUFACTURER_STOCK_NBR;
                                row39.PRODUCT_BRAND_NAME = row27.PRODUCT_BRAND_NAME;
                                row39.PRODUCT_TYPE = row27.PRODUCT_TYPE;
                                row39.ITEM_DESCRIPTION = row27.ITEM_DESCRIPTION;
                                row39.ITEM_RECEIPT_DESCRIPTION = row27.ITEM_RECEIPT_DESCRIPTION;
                                row39.ITEM_MYLAR_DESCRIPTION = row27.ITEM_MYLAR_DESCRIPTION;
                                row39.ITEM_MYLAR_INDICATOR = row27.ITEM_MYLAR_INDICATOR;
                                row39.ITEM_EZ_REF_DESCRIPTION = row27.ITEM_EZ_REF_DESCRIPTION;
                                row39.ITEM_SUPPLY_SOURCE = row27.ITEM_SUPPLY_SOURCE;
                                row39.UNIT_OF_MEASURE = row27.UNIT_OF_MEASURE;
                                row39.ITEM_PURCHASED_CODE = row27.ITEM_PURCHASED_CODE;
                                row39.ITEM_QUANTITY_OF_UNIT = row27.ITEM_QUANTITY_OF_UNIT;
                                row39.RETAIL_SELL_UNIT = row27.RETAIL_SELL_UNIT;
                                row39.SKUS_PER_RETAIL_UNIT = row27.SKUS_PER_RETAIL_UNIT;
                                row39.SKU_CUBE = row27.SKU_CUBE;
                                row39.SKU_WEIGHT = row27.SKU_WEIGHT;
                                row39.MERCH_OPSTUDY_NBR = row27.MERCH_OPSTUDY_NBR;
                                row39.PROD_CATEG_CODE = row27.PROD_CATEG_CODE;
                                row39.REPURCHASABLE_CODE = row27.REPURCHASABLE_CODE;
                                row39.FREIGHT_CLASS_CODE = row27.FREIGHT_CLASS_CODE;
                                row39.ITEM_FOOD_STAMP_CODE = row27.ITEM_FOOD_STAMP_CODE;
                                row39.MFG_SUGGESTED_RETAIL = row27.MFG_SUGGESTED_RETAIL;
                                row39.MFG_SUGG_RETAIL_MULT = row27.MFG_SUGG_RETAIL_MULT;
                                row39.PRICE_CLASS = row27.PRICE_CLASS;
                                row39.ITEM_COST_LINK = row27.ITEM_COST_LINK;
                                row39.SAME_RETAIL_LINK = row27.SAME_RETAIL_LINK;
                                row39.PRODUCT_PRE_PRICE_IND = row27.PRODUCT_PRE_PRICE_IND;
                                row39.ITEM_PRICE_REQUIRED_IND = row27.ITEM_PRICE_REQUIRED_IND;
                                row39.TRIAL_SIZE_INDICATOR = row27.TRIAL_SIZE_INDICATOR;
                                row39.TEST_ITEM_INDICATOR = row27.TEST_ITEM_INDICATOR;
                                row39.EXPENSE_ITEM_INDICATOR = row27.EXPENSE_ITEM_INDICATOR;
                                row39.CRW_ITEM_INDICATOR = row27.CRW_ITEM_INDICATOR;
                                row39.CRW_ITEM_NUMBER = row27.CRW_ITEM_NUMBER;
                                row39.ITEM_DIFFT_RETAIL_LINK = row27.ITEM_DIFFT_RETAIL_LINK;
                                row39.CENTS_OFF_RETAIL_PRICE = row27.CENTS_OFF_RETAIL_PRICE;
                                row39.CENTS_OFF_RETAIL_PCT = row27.CENTS_OFF_RETAIL_PCT;
                                row39.ITEM_TEMPERATURE_CTRL_CD = row27.ITEM_TEMPERATURE_CTRL_CD;
                                row39.SPECIAL_HANDLING_CODE = row27.SPECIAL_HANDLING_CODE;
                                row39.ITEM_EXP_DATE_CODE = row27.ITEM_EXP_DATE_CODE;
                                row39.ITEM_SHORT_DATE_MONTH = row27.ITEM_SHORT_DATE_MONTH;
                                row39.LOT_NUMBER_CODE = row27.LOT_NUMBER_CODE;
                                row39.WAREHOUSE_DEPARTMENT = row27.WAREHOUSE_DEPARTMENT;
                                row39.CONSIGNMENT_INDICATOR = row27.CONSIGNMENT_INDICATOR;
                                row39.GUARANTEED_SALE_CODE = row27.GUARANTEED_SALE_CODE;
                                row39.GUARANTEED_RETURN_DATE = row27.GUARANTEED_RETURN_DATE;
                                row39.EMPLOYEE_DISCOUNT_IND = row27.EMPLOYEE_DISCOUNT_IND;
                                row39.SR_DISCOUNT_IND = row27.SR_DISCOUNT_IND;
                                row39.PROF_DISCOUNT_IND = row27.PROF_DISCOUNT_IND;
                                row39.DANGEROUS_DRUG_INDICATOR = row27.DANGEROUS_DRUG_INDICATOR;
                                row39.CONTROL_DRUG_CLASS = row27.CONTROL_DRUG_CLASS;
                                row39.CONTROL_DRUG_NUMBER = row27.CONTROL_DRUG_NUMBER;
                                row39.AVERAGE_WHOLESALE_PRICE = row27.AVERAGE_WHOLESALE_PRICE;
                                row39.ITEM_ORDER_INDICATOR = row27.ITEM_ORDER_INDICATOR;
                                row39.ITEM_ORDER_IND_DATE = row27.ITEM_ORDER_IND_DATE;
                                row39.ITEM_SLCT_ORDER_METHOD = row27.ITEM_SLCT_ORDER_METHOD;
                                row39.ITEM_SLCT_ORDER_METH_QTY = row27.ITEM_SLCT_ORDER_METH_QTY;
                                row39.TOBACCO_TAX_CLASS = row27.TOBACCO_TAX_CLASS;
                                row39.ITEM_BASIC_DEPT_IND = row27.ITEM_BASIC_DEPT_IND;
                                row39.REPLACED_ITEM_NUMBER = row27.REPLACED_ITEM_NUMBER;
                                row39.REPLACED_EFFECTIVE_DATE = row27.REPLACED_EFFECTIVE_DATE;
                                row39.REPLACED_BY_ITEM_NBR = row27.REPLACED_BY_ITEM_NBR;
                                row39.REPLACED_BY_EFF_DATE = row27.REPLACED_BY_EFF_DATE;
                                row39.ITEM_STUS_IND = row27.ITEM_STUS_IND;
                                row39.ITEM_STUS_EFF_DATE = row27.ITEM_STUS_EFF_DATE;
                                row39.ADV_ITEM_567_INDICATOR = row27.ADV_ITEM_567_INDICATOR;
                                row39.ADV_STORED_CPY_AVAIL_CDE = row27.ADV_STORED_CPY_AVAIL_CDE;
                                row39.ADV_PHOTO_AVAIL_CODE = row27.ADV_PHOTO_AVAIL_CODE;
                                row39.ADV_GB_PRINT_CDE = row27.ADV_GB_PRINT_CDE;
                                row39.REORDER_SOURCE = row27.REORDER_SOURCE;
                                row39.ALCOHOL_PERCENT = row27.ALCOHOL_PERCENT;
                                row39.PRICE_STICKER = row27.PRICE_STICKER;
                                row39.ITEM_TYPE = row27.ITEM_TYPE;
                                row39.SALEABLE_ITEM = row27.SALEABLE_ITEM;
                                row39.DUTY_RATE = row27.DUTY_RATE;
                                row39.HARMONIZED_TARIFF_NBR = row27.HARMONIZED_TARIFF_NBR;
                                row39.WALGREEN_DEPT_NBR = row27.WALGREEN_DEPT_NBR;
                                row39.SUB_DEPARTMENT_NBR = row27.SUB_DEPARTMENT_NBR;
                                row39.COUNTRY_CODE = row27.COUNTRY_CODE;
                                row39.AEROSOL_IND = row27.AEROSOL_IND;
                                row39.SCHEDULE_2_DRUG_IND = row27.SCHEDULE_2_DRUG_IND;
                                row39.ETHNIC_CODE = row27.ETHNIC_CODE;
                                row39.HAZARDOUS_IND = row27.HAZARDOUS_IND;
                                row39.ITEM_EXP_DATE_TYPE = row27.ITEM_EXP_DATE_TYPE;
                                row39.PDQ_ALLOWED_IND = row27.PDQ_ALLOWED_IND;
                                row39.ORMD_IND = row27.ORMD_IND;
                                row39.FLAMMABLE_IND = row27.FLAMMABLE_IND;
                                row39.CURRENT_BUYER_NBR = row27.CURRENT_BUYER_NBR;
                                row39.USER_STAMP = row27.USER_STAMP;
                                row39.TIME_STAMP = row27.TIME_STAMP;
                                row39.DATE_STAMP = row27.DATE_STAMP;
                            rejectedCount_tDBOutput_1 = rejectedCount_tDBOutput_1 + 1;
                            row39.errorCode = ((java.sql.SQLException)e).getSQLState();
                            row39.errorMessage = e.getMessage() + " - Line: " + tos_count_tDBOutput_1;
                }
    		}

    		
            if(!whetherReject_tDBOutput_1) {
            }

 


	tos_count_tDBOutput_1++;

/**
 * [tDBOutput_1 main ] stop
 */
	
	/**
	 * [tDBOutput_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_begin ] stop
 */
// Start of branch "row39"
if(row39 != null) { 



	
	/**
	 * [tFilterColumns_1 main ] start
	 */

	

	
	
	currentComponent="tFilterColumns_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row39","tDBOutput_1","__UNIQUE_NAME__<br>it005p","tAS400Output","tFilterColumns_1","tFilterColumns_1","tFilterColumns"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row39 - " + (row39==null? "": row39.toLogString()));
    			}
    		
	

	row40.ITEM_NUMBER = row39.ITEM_NUMBER;

	
	row40.ITEM_NUMBER_CK_DIGIT = row39.ITEM_NUMBER_CK_DIGIT;

	
	row40.MANUFACTURER_NAME = row39.MANUFACTURER_NAME;

	
	row40.MANUFACTURER_STOCK_NBR = row39.MANUFACTURER_STOCK_NBR;

	
	row40.PRODUCT_BRAND_NAME = row39.PRODUCT_BRAND_NAME;

	
	row40.PRODUCT_TYPE = row39.PRODUCT_TYPE;

	
	row40.ITEM_DESCRIPTION = row39.ITEM_DESCRIPTION;

	
	row40.ITEM_RECEIPT_DESCRIPTION = row39.ITEM_RECEIPT_DESCRIPTION;

	
	row40.ITEM_MYLAR_DESCRIPTION = row39.ITEM_MYLAR_DESCRIPTION;

	
	row40.ITEM_MYLAR_INDICATOR = row39.ITEM_MYLAR_INDICATOR;

	
	row40.ITEM_EZ_REF_DESCRIPTION = row39.ITEM_EZ_REF_DESCRIPTION;

	
	row40.ITEM_SUPPLY_SOURCE = row39.ITEM_SUPPLY_SOURCE;

	
	row40.UNIT_OF_MEASURE = row39.UNIT_OF_MEASURE;

	
	row40.ITEM_PURCHASED_CODE = row39.ITEM_PURCHASED_CODE;

	
	row40.ITEM_QUANTITY_OF_UNIT = row39.ITEM_QUANTITY_OF_UNIT;

	
	row40.RETAIL_SELL_UNIT = row39.RETAIL_SELL_UNIT;

	
	row40.SKUS_PER_RETAIL_UNIT = row39.SKUS_PER_RETAIL_UNIT;

	
	row40.SKU_CUBE = row39.SKU_CUBE;

	
	row40.SKU_WEIGHT = row39.SKU_WEIGHT;

	
	row40.MERCH_OPSTUDY_NBR = row39.MERCH_OPSTUDY_NBR;

	
	row40.PROD_CATEG_CODE = row39.PROD_CATEG_CODE;

	
	row40.REPURCHASABLE_CODE = row39.REPURCHASABLE_CODE;

	
	row40.FREIGHT_CLASS_CODE = row39.FREIGHT_CLASS_CODE;

	
	row40.ITEM_FOOD_STAMP_CODE = row39.ITEM_FOOD_STAMP_CODE;

	
	row40.MFG_SUGGESTED_RETAIL = row39.MFG_SUGGESTED_RETAIL;

	
	row40.MFG_SUGG_RETAIL_MULT = row39.MFG_SUGG_RETAIL_MULT;

	
	row40.PRICE_CLASS = row39.PRICE_CLASS;

	
	row40.ITEM_COST_LINK = row39.ITEM_COST_LINK;

	
	row40.SAME_RETAIL_LINK = row39.SAME_RETAIL_LINK;

	
	row40.PRODUCT_PRE_PRICE_IND = row39.PRODUCT_PRE_PRICE_IND;

	
	row40.ITEM_PRICE_REQUIRED_IND = row39.ITEM_PRICE_REQUIRED_IND;

	
	row40.TRIAL_SIZE_INDICATOR = row39.TRIAL_SIZE_INDICATOR;

	
	row40.TEST_ITEM_INDICATOR = row39.TEST_ITEM_INDICATOR;

	
	row40.EXPENSE_ITEM_INDICATOR = row39.EXPENSE_ITEM_INDICATOR;

	
	row40.CRW_ITEM_INDICATOR = row39.CRW_ITEM_INDICATOR;

	
	row40.CRW_ITEM_NUMBER = row39.CRW_ITEM_NUMBER;

	
	row40.ITEM_DIFFT_RETAIL_LINK = row39.ITEM_DIFFT_RETAIL_LINK;

	
	row40.CENTS_OFF_RETAIL_PRICE = row39.CENTS_OFF_RETAIL_PRICE;

	
	row40.CENTS_OFF_RETAIL_PCT = row39.CENTS_OFF_RETAIL_PCT;

	
	row40.ITEM_TEMPERATURE_CTRL_CD = row39.ITEM_TEMPERATURE_CTRL_CD;

	
	row40.SPECIAL_HANDLING_CODE = row39.SPECIAL_HANDLING_CODE;

	
	row40.ITEM_EXP_DATE_CODE = row39.ITEM_EXP_DATE_CODE;

	
	row40.ITEM_SHORT_DATE_MONTH = row39.ITEM_SHORT_DATE_MONTH;

	
	row40.LOT_NUMBER_CODE = row39.LOT_NUMBER_CODE;

	
	row40.WAREHOUSE_DEPARTMENT = row39.WAREHOUSE_DEPARTMENT;

	
	row40.CONSIGNMENT_INDICATOR = row39.CONSIGNMENT_INDICATOR;

	
	row40.GUARANTEED_SALE_CODE = row39.GUARANTEED_SALE_CODE;

	
	row40.GUARANTEED_RETURN_DATE = row39.GUARANTEED_RETURN_DATE;

	
	row40.EMPLOYEE_DISCOUNT_IND = row39.EMPLOYEE_DISCOUNT_IND;

	
	row40.SR_DISCOUNT_IND = row39.SR_DISCOUNT_IND;

	
	row40.PROF_DISCOUNT_IND = row39.PROF_DISCOUNT_IND;

	
	row40.DANGEROUS_DRUG_INDICATOR = row39.DANGEROUS_DRUG_INDICATOR;

	
	row40.CONTROL_DRUG_CLASS = row39.CONTROL_DRUG_CLASS;

	
	row40.CONTROL_DRUG_NUMBER = row39.CONTROL_DRUG_NUMBER;

	
	row40.AVERAGE_WHOLESALE_PRICE = row39.AVERAGE_WHOLESALE_PRICE;

	
	row40.ITEM_ORDER_INDICATOR = row39.ITEM_ORDER_INDICATOR;

	
	row40.ITEM_ORDER_IND_DATE = row39.ITEM_ORDER_IND_DATE;

	
	row40.ITEM_SLCT_ORDER_METHOD = row39.ITEM_SLCT_ORDER_METHOD;

	
	row40.ITEM_SLCT_ORDER_METH_QTY = row39.ITEM_SLCT_ORDER_METH_QTY;

	
	row40.TOBACCO_TAX_CLASS = row39.TOBACCO_TAX_CLASS;

	
	row40.ITEM_BASIC_DEPT_IND = row39.ITEM_BASIC_DEPT_IND;

	
	row40.REPLACED_ITEM_NUMBER = row39.REPLACED_ITEM_NUMBER;

	
	row40.REPLACED_EFFECTIVE_DATE = row39.REPLACED_EFFECTIVE_DATE;

	
	row40.REPLACED_BY_ITEM_NBR = row39.REPLACED_BY_ITEM_NBR;

	
	row40.REPLACED_BY_EFF_DATE = row39.REPLACED_BY_EFF_DATE;

	
	row40.ITEM_STUS_IND = row39.ITEM_STUS_IND;

	
	row40.ITEM_STUS_EFF_DATE = row39.ITEM_STUS_EFF_DATE;

	
	row40.ADV_ITEM_567_INDICATOR = row39.ADV_ITEM_567_INDICATOR;

	
	row40.ADV_STORED_CPY_AVAIL_CDE = row39.ADV_STORED_CPY_AVAIL_CDE;

	
	row40.ADV_PHOTO_AVAIL_CODE = row39.ADV_PHOTO_AVAIL_CODE;

	
	row40.ADV_GB_PRINT_CDE = row39.ADV_GB_PRINT_CDE;

	
	row40.REORDER_SOURCE = row39.REORDER_SOURCE;

	
	row40.ALCOHOL_PERCENT = row39.ALCOHOL_PERCENT;

	
	row40.PRICE_STICKER = row39.PRICE_STICKER;

	
	row40.ITEM_TYPE = row39.ITEM_TYPE;

	
	row40.SALEABLE_ITEM = row39.SALEABLE_ITEM;

	
	row40.DUTY_RATE = row39.DUTY_RATE;

	
	row40.HARMONIZED_TARIFF_NBR = row39.HARMONIZED_TARIFF_NBR;

	
	row40.WALGREEN_DEPT_NBR = row39.WALGREEN_DEPT_NBR;

	
	row40.SUB_DEPARTMENT_NBR = row39.SUB_DEPARTMENT_NBR;

	
	row40.COUNTRY_CODE = row39.COUNTRY_CODE;

	
	row40.AEROSOL_IND = row39.AEROSOL_IND;

	
	row40.SCHEDULE_2_DRUG_IND = row39.SCHEDULE_2_DRUG_IND;

	
	row40.ETHNIC_CODE = row39.ETHNIC_CODE;

	
	row40.HAZARDOUS_IND = row39.HAZARDOUS_IND;

	
	row40.ITEM_EXP_DATE_TYPE = row39.ITEM_EXP_DATE_TYPE;

	
	row40.PDQ_ALLOWED_IND = row39.PDQ_ALLOWED_IND;

	
	row40.ORMD_IND = row39.ORMD_IND;

	
	row40.FLAMMABLE_IND = row39.FLAMMABLE_IND;

	
	row40.CURRENT_BUYER_NBR = row39.CURRENT_BUYER_NBR;

	
	row40.USER_STAMP = row39.USER_STAMP;

	
	row40.TIME_STAMP = row39.TIME_STAMP;

	
	row40.DATE_STAMP = row39.DATE_STAMP;

	
	row40.errorCode = row39.errorCode;

	
	row40.errorMessage = row39.errorMessage;

	
    nb_line_tFilterColumns_1++;

 


	tos_count_tFilterColumns_1++;

/**
 * [tFilterColumns_1 main ] stop
 */
	
	/**
	 * [tFilterColumns_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFilterColumns_1";

	

 



/**
 * [tFilterColumns_1 process_data_begin ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 main ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	
			if(runStat.update(execStat,enableLogStash,iterateId,1,1
				
					,"row40","tFilterColumns_1","tFilterColumns_1","tFilterColumns","tFileOutputDelimited_1","tFileOutputDelimited_1","tFileOutputDelimited"
				
			)) {
				talendJobLogProcess(globalMap);
			}
			
    			if(log.isTraceEnabled()){
    				log.trace("row40 - " + (row40==null? "": row40.toLogString()));
    			}
    		


                    StringBuilder sb_tFileOutputDelimited_1 = new StringBuilder();
                            fileOutputDelimitedUtil_tFileOutputDelimited_1.putValue_0(row40,sb_tFileOutputDelimited_1,OUT_DELIM_tFileOutputDelimited_1);
                            fileOutputDelimitedUtil_tFileOutputDelimited_1.putValue_1(row40,sb_tFileOutputDelimited_1,OUT_DELIM_tFileOutputDelimited_1);
                    sb_tFileOutputDelimited_1.append(OUT_DELIM_ROWSEP_tFileOutputDelimited_1);


                    nb_line_tFileOutputDelimited_1++;
                    resourceMap.put("nb_line_tFileOutputDelimited_1", nb_line_tFileOutputDelimited_1);

                        outtFileOutputDelimited_1.write(sb_tFileOutputDelimited_1.toString());
                        log.debug("tFileOutputDelimited_1 - Writing the record " + nb_line_tFileOutputDelimited_1 + ".");




 


	tos_count_tFileOutputDelimited_1++;

/**
 * [tFileOutputDelimited_1 main ] stop
 */
	
	/**
	 * [tFileOutputDelimited_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	

 



/**
 * [tFileOutputDelimited_1 process_data_begin ] stop
 */
	
	/**
	 * [tFileOutputDelimited_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	

 



/**
 * [tFileOutputDelimited_1 process_data_end ] stop
 */



	
	/**
	 * [tFilterColumns_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tFilterColumns_1";

	

 



/**
 * [tFilterColumns_1 process_data_end ] stop
 */

} // End of branch "row39"




	
	/**
	 * [tDBOutput_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	

 



/**
 * [tDBOutput_1 process_data_end ] stop
 */

} // End of branch "row27"




	
	/**
	 * [tFileInputDelimited_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	

 



/**
 * [tFileInputDelimited_2 process_data_end ] stop
 */
	
	/**
	 * [tFileInputDelimited_2 end ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	



            }
            }finally{
                if(!((Object)(context.CONTEXT_RT_RNWL_HOME+context.CONTEXT_RT_TRACK_STATIC+"IT005P_ob_clr_dr_Delta" +context.CONTEXT_ETL_INTM_FILE_EXTENSION) instanceof java.io.InputStream)){
                	if(fid_tFileInputDelimited_2!=null){
                		fid_tFileInputDelimited_2.close();
                	}
                }
                if(fid_tFileInputDelimited_2!=null){
                	globalMap.put("tFileInputDelimited_2_NB_LINE", fid_tFileInputDelimited_2.getRowNumber());
					
						log.info("tFileInputDelimited_2 - Retrieved records count: "+ fid_tFileInputDelimited_2.getRowNumber() + ".");
					
                }
			}
			  

 
                if(log.isDebugEnabled())
            log.debug("tFileInputDelimited_2 - "  + ("Done.") );

ok_Hash.put("tFileInputDelimited_2", true);
end_Hash.put("tFileInputDelimited_2", System.currentTimeMillis());




/**
 * [tFileInputDelimited_2 end ] stop
 */

	
	/**
	 * [tDBOutput_1 end ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



        if(pstmtUpdate_tDBOutput_1 != null){
            pstmtUpdate_tDBOutput_1.close();
            resourceMap.remove("pstmtUpdate_tDBOutput_1");
        }
        if(pstmtInsert_tDBOutput_1 != null){
            pstmtInsert_tDBOutput_1.close();
            resourceMap.remove("pstmtInsert_tDBOutput_1");
        }
        if(pstmt_tDBOutput_1 != null) {
            pstmt_tDBOutput_1.close();
            resourceMap.remove("pstmt_tDBOutput_1");
        }
    resourceMap.put("statementClosed_tDBOutput_1", true);

	nb_line_deleted_tDBOutput_1=nb_line_deleted_tDBOutput_1+ deletedCount_tDBOutput_1;
	nb_line_update_tDBOutput_1=nb_line_update_tDBOutput_1 + updatedCount_tDBOutput_1;
	nb_line_inserted_tDBOutput_1=nb_line_inserted_tDBOutput_1 + insertedCount_tDBOutput_1;
	nb_line_rejected_tDBOutput_1=nb_line_rejected_tDBOutput_1 + rejectedCount_tDBOutput_1;
	
        globalMap.put("tDBOutput_1_NB_LINE",nb_line_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_UPDATED",nb_line_update_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_INSERTED",nb_line_inserted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_DELETED",nb_line_deleted_tDBOutput_1);
        globalMap.put("tDBOutput_1_NB_LINE_REJECTED", nb_line_rejected_tDBOutput_1);
    

	
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Has ")  + ("rejected")  + (" ")  + (nb_line_rejected_tDBOutput_1)  + (" record(s).") );

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row27",2,0,
			 			"tFileInputDelimited_2","<b>__UNIQUE_NAME__</b><br>IT005P_ob_clr_dr_Delta","tFileInputDelimited","tDBOutput_1","__UNIQUE_NAME__<br>it005p","tAS400Output","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tDBOutput_1 - "  + ("Done.") );

ok_Hash.put("tDBOutput_1", true);
end_Hash.put("tDBOutput_1", System.currentTimeMillis());




/**
 * [tDBOutput_1 end ] stop
 */

	
	/**
	 * [tFilterColumns_1 end ] start
	 */

	

	
	
	currentComponent="tFilterColumns_1";

	

globalMap.put("tFilterColumns_1_NB_LINE",nb_line_tFilterColumns_1);
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row39",2,0,
			 			"tDBOutput_1","__UNIQUE_NAME__<br>it005p","tAS400Output","tFilterColumns_1","tFilterColumns_1","tFilterColumns","reject")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFilterColumns_1 - "  + ("Done.") );

ok_Hash.put("tFilterColumns_1", true);
end_Hash.put("tFilterColumns_1", System.currentTimeMillis());




/**
 * [tFilterColumns_1 end ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 end ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	



		
			
					if(outtFileOutputDelimited_1!=null) {
						outtFileOutputDelimited_1.flush();
						outtFileOutputDelimited_1.close();
					}
				
				globalMap.put("tFileOutputDelimited_1_NB_LINE",nb_line_tFileOutputDelimited_1);
				globalMap.put("tFileOutputDelimited_1_FILE_NAME",fileName_tFileOutputDelimited_1);
			
		
		
		resourceMap.put("finish_tFileOutputDelimited_1", true);
	
				log.debug("tFileOutputDelimited_1 - Written records count: " + nb_line_tFileOutputDelimited_1 + " .");
			

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"row40",2,0,
			 			"tFilterColumns_1","tFilterColumns_1","tFilterColumns","tFileOutputDelimited_1","tFileOutputDelimited_1","tFileOutputDelimited","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tFileOutputDelimited_1 - "  + ("Done.") );

ok_Hash.put("tFileOutputDelimited_1", true);
end_Hash.put("tFileOutputDelimited_1", System.currentTimeMillis());




/**
 * [tFileOutputDelimited_1 end ] stop
 */









				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tFileInputDelimited_2 finally ] start
	 */

	

	
	
	currentComponent="tFileInputDelimited_2";

	

 



/**
 * [tFileInputDelimited_2 finally ] stop
 */

	
	/**
	 * [tDBOutput_1 finally ] start
	 */

	

	
	
	currentComponent="tDBOutput_1";

	



    if (resourceMap.get("statementClosed_tDBOutput_1") == null) {
                java.sql.PreparedStatement pstmtUpdateToClose_tDBOutput_1 = null;
                if ((pstmtUpdateToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmtUpdate_tDBOutput_1")) != null) {
                    pstmtUpdateToClose_tDBOutput_1.close();
                }
                java.sql.PreparedStatement pstmtInsertToClose_tDBOutput_1 = null;
                if ((pstmtInsertToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmtInsert_tDBOutput_1")) != null) {
                    pstmtInsertToClose_tDBOutput_1.close();
                }
                java.sql.PreparedStatement pstmtToClose_tDBOutput_1 = null;
                if ((pstmtToClose_tDBOutput_1 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tDBOutput_1")) != null) {
                    pstmtToClose_tDBOutput_1.close();
                }
    }
 



/**
 * [tDBOutput_1 finally ] stop
 */

	
	/**
	 * [tFilterColumns_1 finally ] start
	 */

	

	
	
	currentComponent="tFilterColumns_1";

	

 



/**
 * [tFilterColumns_1 finally ] stop
 */

	
	/**
	 * [tFileOutputDelimited_1 finally ] start
	 */

	

	
	
	currentComponent="tFileOutputDelimited_1";

	


		if(resourceMap.get("finish_tFileOutputDelimited_1") == null){ 
			
				
						java.io.Writer outtFileOutputDelimited_1 = (java.io.Writer)resourceMap.get("out_tFileOutputDelimited_1");
						if(outtFileOutputDelimited_1!=null) {
							outtFileOutputDelimited_1.flush();
							outtFileOutputDelimited_1.close();
						}
					
				
			
		}
	

 



/**
 * [tFileOutputDelimited_1 finally ] stop
 */









				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", 1);
	}
	

public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPostjob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_1", false);
		start_Hash.put("tPostjob_1", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_1";

	
		int tos_count_tPostjob_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPostjob_1", "tPostjob_1", "tPostjob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPostjob_1 begin ] stop
 */
	
	/**
	 * [tPostjob_1 main ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 


	tos_count_tPostjob_1++;

/**
 * [tPostjob_1 main ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_end ] stop
 */
	
	/**
	 * [tPostjob_1 end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 

ok_Hash.put("tPostjob_1", true);
end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk2", 0, "ok");
				}
				tDBCommit_2Process(globalMap);



/**
 * [tPostjob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPostjob_1 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}
	

public void tDBCommit_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tDBCommit_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tDBCommit_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tDBCommit_2", false);
		start_Hash.put("tDBCommit_2", System.currentTimeMillis());
		
	
	currentComponent="tDBCommit_2";

	
		int tos_count_tDBCommit_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tDBCommit_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tDBCommit_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tDBCommit_2 = new StringBuilder();
                    log4jParamters_tDBCommit_2.append("Parameters:");
                            log4jParamters_tDBCommit_2.append("CONNECTION" + " = " + "tDBConnection_1");
                        log4jParamters_tDBCommit_2.append(" | ");
                            log4jParamters_tDBCommit_2.append("CLOSE" + " = " + "true");
                        log4jParamters_tDBCommit_2.append(" | ");
                            log4jParamters_tDBCommit_2.append("UNIFIED_COMPONENTS" + " = " + "tAS400Commit");
                        log4jParamters_tDBCommit_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tDBCommit_2 - "  + (log4jParamters_tDBCommit_2) );
                    } 
                } 
            new BytesLimit65535_tDBCommit_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tDBCommit_2", "tDBCommit_2", "tAS400Commit");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tDBCommit_2 begin ] stop
 */
	
	/**
	 * [tDBCommit_2 main ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

	java.sql.Connection conn_tDBCommit_2 = (java.sql.Connection)globalMap.get("conn_tDBConnection_1");
	if(conn_tDBCommit_2 != null && !conn_tDBCommit_2.isClosed())
	{
	
		try{
	
			
	    		log.debug("tDBCommit_2 - Connection 'tDBConnection_1' starting to commit.");
			
			conn_tDBCommit_2.commit();
			
	    		log.debug("tDBCommit_2 - Connection 'tDBConnection_1' commit has succeeded.");
			
	
		}finally{
			
	    		log.debug("tDBCommit_2 - Closing the connection 'tDBConnection_1' to the database.");
			
			conn_tDBCommit_2.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_tDBConnection_1"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tDBCommit_2 - Connection 'tDBConnection_1' to the database closed.");
			
	    }
	
	}

 


	tos_count_tDBCommit_2++;

/**
 * [tDBCommit_2 main ] stop
 */
	
	/**
	 * [tDBCommit_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

 



/**
 * [tDBCommit_2 process_data_begin ] stop
 */
	
	/**
	 * [tDBCommit_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

 



/**
 * [tDBCommit_2 process_data_end ] stop
 */
	
	/**
	 * [tDBCommit_2 end ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

 
                if(log.isDebugEnabled())
            log.debug("tDBCommit_2 - "  + ("Done.") );

ok_Hash.put("tDBCommit_2", true);
end_Hash.put("tDBCommit_2", System.currentTimeMillis());




/**
 * [tDBCommit_2 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tDBCommit_2 finally ] start
	 */

	

	
	
	currentComponent="tDBCommit_2";

	

 



/**
 * [tDBCommit_2 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tDBCommit_2_SUBPROCESS_STATE", 1);
	}
	

public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [talendJobLog begin ] start
	 */

	

	
		
		ok_Hash.put("talendJobLog", false);
		start_Hash.put("talendJobLog", System.currentTimeMillis());
		
	
	currentComponent="talendJobLog";

	
		int tos_count_talendJobLog = 0;
		

	for (JobStructureCatcherUtils.JobStructureCatcherMessage jcm : talendJobLog.getMessages()) {
		org.talend.job.audit.JobContextBuilder builder_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
			.custom("process_id", jcm.pid).custom("thread_id", jcm.tid).custom("pid", pid).custom("father_pid", fatherPid).custom("root_pid", rootPid);
		org.talend.logging.audit.Context log_context_talendJobLog = null;
		
		
		if(jcm.log_type == JobStructureCatcherUtils.LogType.PERFORMANCE){
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.sourceId(jcm.sourceId).sourceLabel(jcm.sourceLabel).sourceConnectorType(jcm.sourceComponentName)
				.targetId(jcm.targetId).targetLabel(jcm.targetLabel).targetConnectorType(jcm.targetComponentName)
				.connectionName(jcm.current_connector).rows(jcm.row_count).duration(duration).build();
			auditLogger_talendJobLog.flowExecution(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBSTART) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment).build();
			auditLogger_talendJobLog.jobstart(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.JOBEND) {
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
		
			log_context_talendJobLog = builder_talendJobLog
				.timestamp(jcm.moment).duration(duration).status(jcm.status).build();
			auditLogger_talendJobLog.jobstop(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.RUNCOMPONENT) {
			log_context_talendJobLog = builder_talendJobLog.timestamp(jcm.moment)
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label).build();
			auditLogger_talendJobLog.runcomponent(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWINPUT) {//log current component input line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowInput(log_context_talendJobLog);
		} else if(jcm.log_type == JobStructureCatcherUtils.LogType.FLOWOUTPUT) {//log current component output/reject line
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.valueOf(timeMS);
			
			log_context_talendJobLog = builder_talendJobLog
				.connectorType(jcm.component_name).connectorId(jcm.component_id).connectorLabel(jcm.component_label)
				.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
				.rows(jcm.total_row_number).duration(duration).build();
			auditLogger_talendJobLog.flowOutput(log_context_talendJobLog);
		}
		
		
		
	}

 



/**
 * [talendJobLog begin ] stop
 */
	
	/**
	 * [talendJobLog main ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 


	tos_count_talendJobLog++;

/**
 * [talendJobLog main ] stop
 */
	
	/**
	 * [talendJobLog process_data_begin ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog process_data_begin ] stop
 */
	
	/**
	 * [talendJobLog process_data_end ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog process_data_end ] stop
 */
	
	/**
	 * [talendJobLog end ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 

ok_Hash.put("talendJobLog", true);
end_Hash.put("talendJobLog", System.currentTimeMillis());




/**
 * [talendJobLog end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendJobLog finally ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendJobLog_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "Default";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    protected PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    

    public static void main(String[] args){
        final IT005p_table_update_job IT005p_table_update_jobClass = new IT005p_table_update_job();

        int exitCode = IT005p_table_update_jobClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'IT005p_table_update_job' - Done.");
	        }

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }
        enableLogStash = "true".equalsIgnoreCase(System.getProperty("audit.enabled"));

	        if(!"".equals(log4jLevel)){
	        	
				
				
				if("trace".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.TRACE);
				}else if("debug".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.DEBUG);
				}else if("info".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.INFO);
				}else if("warn".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.WARN);
				}else if("error".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.ERROR);
				}else if("fatal".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.FATAL);
				}else if ("off".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.OFF);
				}
				org.apache.logging.log4j.core.config.Configurator.setLevel(org.apache.logging.log4j.LogManager.getRootLogger().getName(), log.getLevel());
				
    	    }
        	log.info("TalendJob: 'IT005p_table_update_job' - Start.");
    	
    	
    	
			if(enableLogStash) {
				java.util.Properties properties_talendJobLog = new java.util.Properties();
				properties_talendJobLog.setProperty("root.logger", "audit");
				properties_talendJobLog.setProperty("encoding", "UTF-8");
				properties_talendJobLog.setProperty("application.name", "Talend Studio");
				properties_talendJobLog.setProperty("service.name", "Talend Studio Job");
				properties_talendJobLog.setProperty("instance.name", "Talend Studio Job Instance");
				properties_talendJobLog.setProperty("propagate.appender.exceptions", "none");
				properties_talendJobLog.setProperty("log.appender", "file");
				properties_talendJobLog.setProperty("appender.file.path", "audit.json");
				properties_talendJobLog.setProperty("appender.file.maxsize", "52428800");
				properties_talendJobLog.setProperty("appender.file.maxbackup", "20");
				properties_talendJobLog.setProperty("host", "false");

				System.getProperties().stringPropertyNames().stream()
					.filter(it -> it.startsWith("audit.logger."))
					.forEach(key -> properties_talendJobLog.setProperty(key.substring("audit.logger.".length()), System.getProperty(key)));

				
				
				
				org.apache.logging.log4j.core.config.Configurator.setLevel(properties_talendJobLog.getProperty("root.logger"), org.apache.logging.log4j.Level.DEBUG);
				
				auditLogger_talendJobLog = org.talend.job.audit.JobEventAuditLoggerFactory.createJobAuditLogger(properties_talendJobLog);
			}
		

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }

        boolean inOSGi = routines.system.BundleUtils.inOSGi();

        try {
            java.util.Dictionary<String, Object> jobProperties = null;
            if (inOSGi) {
                jobProperties = routines.system.BundleUtils.getJobProperties(jobName);
    
                if (jobProperties != null && jobProperties.get("context") != null) {
                    contextStr = (String)jobProperties.get("context");
                }
            }
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = IT005p_table_update_job.class.getClassLoader().getResourceAsStream("article_backfeed_updated/it005p_table_update_job_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = IT005p_table_update_job.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                try {
                    //defaultProps is in order to keep the original context value
                    if(context != null && context.isEmpty()) {
    	                defaultProps.load(inContext);
    	                if (inOSGi && jobProperties != null) {
                             java.util.Enumeration<String> keys = jobProperties.keys();
                             while (keys.hasMoreElements()) {
                                 String propKey = keys.nextElement();
                                 if (defaultProps.containsKey(propKey)) {
                                     defaultProps.put(propKey, (String) jobProperties.get(propKey));
                                 }
                             }
    	                }
    	                context = new ContextProperties(defaultProps);
                    }
                } finally {
                    inContext.close();
                }
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("CONTEXT_ADR7_ADDITIONAL_PARAMETERS", "id_String");
                        if(context.getStringValue("CONTEXT_ADR7_ADDITIONAL_PARAMETERS") == null) {
                            context.CONTEXT_ADR7_ADDITIONAL_PARAMETERS = null;
                        } else {
                            context.CONTEXT_ADR7_ADDITIONAL_PARAMETERS=(String) context.getProperty("CONTEXT_ADR7_ADDITIONAL_PARAMETERS");
                        }
                        context.setContextType("CONTEXT_ADR7_DATABASE", "id_String");
                        if(context.getStringValue("CONTEXT_ADR7_DATABASE") == null) {
                            context.CONTEXT_ADR7_DATABASE = null;
                        } else {
                            context.CONTEXT_ADR7_DATABASE=(String) context.getProperty("CONTEXT_ADR7_DATABASE");
                        }
                        context.setContextType("CONTEXT_ADR7_LOGIN", "id_String");
                        if(context.getStringValue("CONTEXT_ADR7_LOGIN") == null) {
                            context.CONTEXT_ADR7_LOGIN = null;
                        } else {
                            context.CONTEXT_ADR7_LOGIN=(String) context.getProperty("CONTEXT_ADR7_LOGIN");
                        }
                        context.setContextType("CONTEXT_ADR7_PASSWORD", "id_Password");
                        if(context.getStringValue("CONTEXT_ADR7_PASSWORD") == null) {
                            context.CONTEXT_ADR7_PASSWORD = null;
                        } else {
                            String pwd_CONTEXT_ADR7_PASSWORD_value = context.getProperty("CONTEXT_ADR7_PASSWORD");
                            context.CONTEXT_ADR7_PASSWORD = null;
                            if(pwd_CONTEXT_ADR7_PASSWORD_value!=null) {
                                if(context_param.containsKey("CONTEXT_ADR7_PASSWORD")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.CONTEXT_ADR7_PASSWORD = pwd_CONTEXT_ADR7_PASSWORD_value;
                                } else if (!pwd_CONTEXT_ADR7_PASSWORD_value.isEmpty()) {
                                    try {
                                        context.CONTEXT_ADR7_PASSWORD = routines.system.PasswordEncryptUtil.decryptPassword(pwd_CONTEXT_ADR7_PASSWORD_value);
                                        context.put("CONTEXT_ADR7_PASSWORD",context.CONTEXT_ADR7_PASSWORD);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        }
                        context.setContextType("CONTEXT_ADR7_SERVER", "id_String");
                        if(context.getStringValue("CONTEXT_ADR7_SERVER") == null) {
                            context.CONTEXT_ADR7_SERVER = null;
                        } else {
                            context.CONTEXT_ADR7_SERVER=(String) context.getProperty("CONTEXT_ADR7_SERVER");
                        }
                        context.setContextType("ADR4_OK_CHECK", "id_String");
                        if(context.getStringValue("ADR4_OK_CHECK") == null) {
                            context.ADR4_OK_CHECK = null;
                        } else {
                            context.ADR4_OK_CHECK=(String) context.getProperty("ADR4_OK_CHECK");
                        }
                        context.setContextType("ADR7_OK_CHECK", "id_String");
                        if(context.getStringValue("ADR7_OK_CHECK") == null) {
                            context.ADR7_OK_CHECK = null;
                        } else {
                            context.ADR7_OK_CHECK=(String) context.getProperty("ADR7_OK_CHECK");
                        }
                        context.setContextType("ALLOW_IT777P_INSERT", "id_String");
                        if(context.getStringValue("ALLOW_IT777P_INSERT") == null) {
                            context.ALLOW_IT777P_INSERT = null;
                        } else {
                            context.ALLOW_IT777P_INSERT=(String) context.getProperty("ALLOW_IT777P_INSERT");
                        }
                        context.setContextType("ALLOW_ITEM_DESCRIPTION_UPDATE", "id_String");
                        if(context.getStringValue("ALLOW_ITEM_DESCRIPTION_UPDATE") == null) {
                            context.ALLOW_ITEM_DESCRIPTION_UPDATE = null;
                        } else {
                            context.ALLOW_ITEM_DESCRIPTION_UPDATE=(String) context.getProperty("ALLOW_ITEM_DESCRIPTION_UPDATE");
                        }
                        context.setContextType("ALLOW_SHIP_SUB_FLOW", "id_String");
                        if(context.getStringValue("ALLOW_SHIP_SUB_FLOW") == null) {
                            context.ALLOW_SHIP_SUB_FLOW = null;
                        } else {
                            context.ALLOW_SHIP_SUB_FLOW=(String) context.getProperty("ALLOW_SHIP_SUB_FLOW");
                        }
                        context.setContextType("ARTICLE_NUMBER", "id_String");
                        if(context.getStringValue("ARTICLE_NUMBER") == null) {
                            context.ARTICLE_NUMBER = null;
                        } else {
                            context.ARTICLE_NUMBER=(String) context.getProperty("ARTICLE_NUMBER");
                        }
                        context.setContextType("Article_Transformation_Error_Codes", "id_String");
                        if(context.getStringValue("Article_Transformation_Error_Codes") == null) {
                            context.Article_Transformation_Error_Codes = null;
                        } else {
                            context.Article_Transformation_Error_Codes=(String) context.getProperty("Article_Transformation_Error_Codes");
                        }
                        context.setContextType("CONTEXT_ADR7_BRAND_ID_FILE", "id_String");
                        if(context.getStringValue("CONTEXT_ADR7_BRAND_ID_FILE") == null) {
                            context.CONTEXT_ADR7_BRAND_ID_FILE = null;
                        } else {
                            context.CONTEXT_ADR7_BRAND_ID_FILE=(String) context.getProperty("CONTEXT_ADR7_BRAND_ID_FILE");
                        }
                        context.setContextType("CONTEXT_ADR7_SUB_DEP_FILE", "id_String");
                        if(context.getStringValue("CONTEXT_ADR7_SUB_DEP_FILE") == null) {
                            context.CONTEXT_ADR7_SUB_DEP_FILE = null;
                        } else {
                            context.CONTEXT_ADR7_SUB_DEP_FILE=(String) context.getProperty("CONTEXT_ADR7_SUB_DEP_FILE");
                        }
                        context.setContextType("CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE", "id_String");
                        if(context.getStringValue("CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE") == null) {
                            context.CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE = null;
                        } else {
                            context.CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE=(String) context.getProperty("CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE");
                        }
                        context.setContextType("CONTEXT_ARTICLE_XREF", "id_String");
                        if(context.getStringValue("CONTEXT_ARTICLE_XREF") == null) {
                            context.CONTEXT_ARTICLE_XREF = null;
                        } else {
                            context.CONTEXT_ARTICLE_XREF=(String) context.getProperty("CONTEXT_ARTICLE_XREF");
                        }
                        context.setContextType("CONTEXT_BACKFEED_SEQ_NBR", "id_BigDecimal");
                        if(context.getStringValue("CONTEXT_BACKFEED_SEQ_NBR") == null) {
                            context.CONTEXT_BACKFEED_SEQ_NBR = null;
                        } else {
                            try{
                                context.CONTEXT_BACKFEED_SEQ_NBR=routines.system.ParserUtils.parseTo_BigDecimal (context.getProperty("CONTEXT_BACKFEED_SEQ_NBR"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "CONTEXT_BACKFEED_SEQ_NBR", e.getMessage()));
                                context.CONTEXT_BACKFEED_SEQ_NBR=null;
                            }
                        }
                        context.setContextType("CONTEXT_BASIC_IND_UPD_OPSTUDY", "id_String");
                        if(context.getStringValue("CONTEXT_BASIC_IND_UPD_OPSTUDY") == null) {
                            context.CONTEXT_BASIC_IND_UPD_OPSTUDY = null;
                        } else {
                            context.CONTEXT_BASIC_IND_UPD_OPSTUDY=(String) context.getProperty("CONTEXT_BASIC_IND_UPD_OPSTUDY");
                        }
                        context.setContextType("CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA", "id_String");
                        if(context.getStringValue("CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA") == null) {
                            context.CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA = null;
                        } else {
                            context.CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA=(String) context.getProperty("CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA");
                        }
                        context.setContextType("CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL", "id_String");
                        if(context.getStringValue("CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL") == null) {
                            context.CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL = null;
                        } else {
                            context.CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL=(String) context.getProperty("CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL");
                        }
                        context.setContextType("CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG", "id_String");
                        if(context.getStringValue("CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG") == null) {
                            context.CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG = null;
                        } else {
                            context.CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG=(String) context.getProperty("CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG");
                        }
                        context.setContextType("CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT", "id_String");
                        if(context.getStringValue("CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT") == null) {
                            context.CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT = null;
                        } else {
                            context.CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT=(String) context.getProperty("CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT");
                        }
                        context.setContextType("CONTEXT_CHECKPOINT_FILE_NAME", "id_String");
                        if(context.getStringValue("CONTEXT_CHECKPOINT_FILE_NAME") == null) {
                            context.CONTEXT_CHECKPOINT_FILE_NAME = null;
                        } else {
                            context.CONTEXT_CHECKPOINT_FILE_NAME=(String) context.getProperty("CONTEXT_CHECKPOINT_FILE_NAME");
                        }
                        context.setContextType("CONTEXT_COLOR_CODE", "id_String");
                        if(context.getStringValue("CONTEXT_COLOR_CODE") == null) {
                            context.CONTEXT_COLOR_CODE = null;
                        } else {
                            context.CONTEXT_COLOR_CODE=(String) context.getProperty("CONTEXT_COLOR_CODE");
                        }
                        context.setContextType("CONTEXT_CUTOFF_TIME_MIN", "id_String");
                        if(context.getStringValue("CONTEXT_CUTOFF_TIME_MIN") == null) {
                            context.CONTEXT_CUTOFF_TIME_MIN = null;
                        } else {
                            context.CONTEXT_CUTOFF_TIME_MIN=(String) context.getProperty("CONTEXT_CUTOFF_TIME_MIN");
                        }
                        context.setContextType("CONTEXT_DC_SERVICING_IND_FILE", "id_String");
                        if(context.getStringValue("CONTEXT_DC_SERVICING_IND_FILE") == null) {
                            context.CONTEXT_DC_SERVICING_IND_FILE = null;
                        } else {
                            context.CONTEXT_DC_SERVICING_IND_FILE=(String) context.getProperty("CONTEXT_DC_SERVICING_IND_FILE");
                        }
                        context.setContextType("CONTEXT_DELETE_VOL_LIMIT", "id_Integer");
                        if(context.getStringValue("CONTEXT_DELETE_VOL_LIMIT") == null) {
                            context.CONTEXT_DELETE_VOL_LIMIT = null;
                        } else {
                            try{
                                context.CONTEXT_DELETE_VOL_LIMIT=routines.system.ParserUtils.parseTo_Integer (context.getProperty("CONTEXT_DELETE_VOL_LIMIT"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "CONTEXT_DELETE_VOL_LIMIT", e.getMessage()));
                                context.CONTEXT_DELETE_VOL_LIMIT=null;
                            }
                        }
                        context.setContextType("CONTEXT_DELTA_VOL_LIMIT", "id_Integer");
                        if(context.getStringValue("CONTEXT_DELTA_VOL_LIMIT") == null) {
                            context.CONTEXT_DELTA_VOL_LIMIT = null;
                        } else {
                            try{
                                context.CONTEXT_DELTA_VOL_LIMIT=routines.system.ParserUtils.parseTo_Integer (context.getProperty("CONTEXT_DELTA_VOL_LIMIT"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "CONTEXT_DELTA_VOL_LIMIT", e.getMessage()));
                                context.CONTEXT_DELTA_VOL_LIMIT=null;
                            }
                        }
                        context.setContextType("CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO", "id_String");
                        if(context.getStringValue("CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO") == null) {
                            context.CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO = null;
                        } else {
                            context.CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO=(String) context.getProperty("CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO");
                        }
                        context.setContextType("CONTEXT_DELTA_VOL_TARGET", "id_String");
                        if(context.getStringValue("CONTEXT_DELTA_VOL_TARGET") == null) {
                            context.CONTEXT_DELTA_VOL_TARGET = null;
                        } else {
                            context.CONTEXT_DELTA_VOL_TARGET=(String) context.getProperty("CONTEXT_DELTA_VOL_TARGET");
                        }
                        context.setContextType("CONTEXT_ERR_REPORT", "id_String");
                        if(context.getStringValue("CONTEXT_ERR_REPORT") == null) {
                            context.CONTEXT_ERR_REPORT = null;
                        } else {
                            context.CONTEXT_ERR_REPORT=(String) context.getProperty("CONTEXT_ERR_REPORT");
                        }
                        context.setContextType("CONTEXT_ETL_ARCHIVE_FILE_PATH", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_ARCHIVE_FILE_PATH") == null) {
                            context.CONTEXT_ETL_ARCHIVE_FILE_PATH = null;
                        } else {
                            context.CONTEXT_ETL_ARCHIVE_FILE_PATH=(String) context.getProperty("CONTEXT_ETL_ARCHIVE_FILE_PATH");
                        }
                        context.setContextType("CONTEXT_ETL_BSCONFIG_FILE_EXTENSION", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_BSCONFIG_FILE_EXTENSION") == null) {
                            context.CONTEXT_ETL_BSCONFIG_FILE_EXTENSION = null;
                        } else {
                            context.CONTEXT_ETL_BSCONFIG_FILE_EXTENSION=(String) context.getProperty("CONTEXT_ETL_BSCONFIG_FILE_EXTENSION");
                        }
                        context.setContextType("CONTEXT_ETL_CSV_FILE_EXTENSION", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_CSV_FILE_EXTENSION") == null) {
                            context.CONTEXT_ETL_CSV_FILE_EXTENSION = null;
                        } else {
                            context.CONTEXT_ETL_CSV_FILE_EXTENSION=(String) context.getProperty("CONTEXT_ETL_CSV_FILE_EXTENSION");
                        }
                        context.setContextType("CONTEXT_ETL_ENCODING", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_ENCODING") == null) {
                            context.CONTEXT_ETL_ENCODING = null;
                        } else {
                            context.CONTEXT_ETL_ENCODING=(String) context.getProperty("CONTEXT_ETL_ENCODING");
                        }
                        context.setContextType("CONTEXT_ETL_EXCEL_FILE_EXTENSION", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_EXCEL_FILE_EXTENSION") == null) {
                            context.CONTEXT_ETL_EXCEL_FILE_EXTENSION = null;
                        } else {
                            context.CONTEXT_ETL_EXCEL_FILE_EXTENSION=(String) context.getProperty("CONTEXT_ETL_EXCEL_FILE_EXTENSION");
                        }
                        context.setContextType("CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE") == null) {
                            context.CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE = null;
                        } else {
                            context.CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE=(String) context.getProperty("CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE");
                        }
                        context.setContextType("CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT") == null) {
                            context.CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT = null;
                        } else {
                            context.CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT=(String) context.getProperty("CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT");
                        }
                        context.setContextType("CONTEXT_ETL_GROUPEMAILID_FROM", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_GROUPEMAILID_FROM") == null) {
                            context.CONTEXT_ETL_GROUPEMAILID_FROM = null;
                        } else {
                            context.CONTEXT_ETL_GROUPEMAILID_FROM=(String) context.getProperty("CONTEXT_ETL_GROUPEMAILID_FROM");
                        }
                        context.setContextType("CONTEXT_ETL_GROUPEMAILID_SMTP_HOST", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_GROUPEMAILID_SMTP_HOST") == null) {
                            context.CONTEXT_ETL_GROUPEMAILID_SMTP_HOST = null;
                        } else {
                            context.CONTEXT_ETL_GROUPEMAILID_SMTP_HOST=(String) context.getProperty("CONTEXT_ETL_GROUPEMAILID_SMTP_HOST");
                        }
                        context.setContextType("CONTEXT_ETL_GROUPEMAILID_SMTP_PORT", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_GROUPEMAILID_SMTP_PORT") == null) {
                            context.CONTEXT_ETL_GROUPEMAILID_SMTP_PORT = null;
                        } else {
                            context.CONTEXT_ETL_GROUPEMAILID_SMTP_PORT=(String) context.getProperty("CONTEXT_ETL_GROUPEMAILID_SMTP_PORT");
                        }
                        context.setContextType("CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE") == null) {
                            context.CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE = null;
                        } else {
                            context.CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE=(String) context.getProperty("CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE");
                        }
                        context.setContextType("CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT") == null) {
                            context.CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT = null;
                        } else {
                            context.CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT=(String) context.getProperty("CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT");
                        }
                        context.setContextType("CONTEXT_ETL_GROUPEMAILID_TO", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_GROUPEMAILID_TO") == null) {
                            context.CONTEXT_ETL_GROUPEMAILID_TO = null;
                        } else {
                            context.CONTEXT_ETL_GROUPEMAILID_TO=(String) context.getProperty("CONTEXT_ETL_GROUPEMAILID_TO");
                        }
                        context.setContextType("CONTEXT_ETL_INPUT_FILE_EXTENSION", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_INPUT_FILE_EXTENSION") == null) {
                            context.CONTEXT_ETL_INPUT_FILE_EXTENSION = null;
                        } else {
                            context.CONTEXT_ETL_INPUT_FILE_EXTENSION=(String) context.getProperty("CONTEXT_ETL_INPUT_FILE_EXTENSION");
                        }
                        context.setContextType("CONTEXT_ETL_INPUT_ORG_PATH", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_INPUT_ORG_PATH") == null) {
                            context.CONTEXT_ETL_INPUT_ORG_PATH = null;
                        } else {
                            context.CONTEXT_ETL_INPUT_ORG_PATH=(String) context.getProperty("CONTEXT_ETL_INPUT_ORG_PATH");
                        }
                        context.setContextType("CONTEXT_ETL_INPUT_PATH", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_INPUT_PATH") == null) {
                            context.CONTEXT_ETL_INPUT_PATH = null;
                        } else {
                            context.CONTEXT_ETL_INPUT_PATH=(String) context.getProperty("CONTEXT_ETL_INPUT_PATH");
                        }
                        context.setContextType("CONTEXT_ETL_INTM_FIELD_SEPARATOR", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_INTM_FIELD_SEPARATOR") == null) {
                            context.CONTEXT_ETL_INTM_FIELD_SEPARATOR = null;
                        } else {
                            context.CONTEXT_ETL_INTM_FIELD_SEPARATOR=(String) context.getProperty("CONTEXT_ETL_INTM_FIELD_SEPARATOR");
                        }
                        context.setContextType("CONTEXT_ETL_INTM_FILE_ENCODING", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_INTM_FILE_ENCODING") == null) {
                            context.CONTEXT_ETL_INTM_FILE_ENCODING = null;
                        } else {
                            context.CONTEXT_ETL_INTM_FILE_ENCODING=(String) context.getProperty("CONTEXT_ETL_INTM_FILE_ENCODING");
                        }
                        context.setContextType("CONTEXT_ETL_INTM_FILE_EXTENSION", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_INTM_FILE_EXTENSION") == null) {
                            context.CONTEXT_ETL_INTM_FILE_EXTENSION = null;
                        } else {
                            context.CONTEXT_ETL_INTM_FILE_EXTENSION=(String) context.getProperty("CONTEXT_ETL_INTM_FILE_EXTENSION");
                        }
                        context.setContextType("CONTEXT_ETL_INTM_FILE_PATH", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_INTM_FILE_PATH") == null) {
                            context.CONTEXT_ETL_INTM_FILE_PATH = null;
                        } else {
                            context.CONTEXT_ETL_INTM_FILE_PATH=(String) context.getProperty("CONTEXT_ETL_INTM_FILE_PATH");
                        }
                        context.setContextType("CONTEXT_ETL_JOB_NAME", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_JOB_NAME") == null) {
                            context.CONTEXT_ETL_JOB_NAME = null;
                        } else {
                            context.CONTEXT_ETL_JOB_NAME=(String) context.getProperty("CONTEXT_ETL_JOB_NAME");
                        }
                        context.setContextType("CONTEXT_ETL_LOG_FILE_NAME", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_LOG_FILE_NAME") == null) {
                            context.CONTEXT_ETL_LOG_FILE_NAME = null;
                        } else {
                            context.CONTEXT_ETL_LOG_FILE_NAME=(String) context.getProperty("CONTEXT_ETL_LOG_FILE_NAME");
                        }
                        context.setContextType("CONTEXT_ETL_LOG_FILE_PATH", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_LOG_FILE_PATH") == null) {
                            context.CONTEXT_ETL_LOG_FILE_PATH = null;
                        } else {
                            context.CONTEXT_ETL_LOG_FILE_PATH=(String) context.getProperty("CONTEXT_ETL_LOG_FILE_PATH");
                        }
                        context.setContextType("CONTEXT_ETL_LOG_PATH", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_LOG_PATH") == null) {
                            context.CONTEXT_ETL_LOG_PATH = null;
                        } else {
                            context.CONTEXT_ETL_LOG_PATH=(String) context.getProperty("CONTEXT_ETL_LOG_PATH");
                        }
                        context.setContextType("CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR") == null) {
                            context.CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR = null;
                        } else {
                            context.CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR=(String) context.getProperty("CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR");
                        }
                        context.setContextType("CONTEXT_ETL_OUTPUT_FILE_ENCODING", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_OUTPUT_FILE_ENCODING") == null) {
                            context.CONTEXT_ETL_OUTPUT_FILE_ENCODING = null;
                        } else {
                            context.CONTEXT_ETL_OUTPUT_FILE_ENCODING=(String) context.getProperty("CONTEXT_ETL_OUTPUT_FILE_ENCODING");
                        }
                        context.setContextType("CONTEXT_ETL_OUTPUT_FILE_EXTENSION", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_OUTPUT_FILE_EXTENSION") == null) {
                            context.CONTEXT_ETL_OUTPUT_FILE_EXTENSION = null;
                        } else {
                            context.CONTEXT_ETL_OUTPUT_FILE_EXTENSION=(String) context.getProperty("CONTEXT_ETL_OUTPUT_FILE_EXTENSION");
                        }
                        context.setContextType("CONTEXT_ETL_OUTPUT_FILE_PATH", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_OUTPUT_FILE_PATH") == null) {
                            context.CONTEXT_ETL_OUTPUT_FILE_PATH = null;
                        } else {
                            context.CONTEXT_ETL_OUTPUT_FILE_PATH=(String) context.getProperty("CONTEXT_ETL_OUTPUT_FILE_PATH");
                        }
                        context.setContextType("CONTEXT_ETL_REJECT_FILE_PATH", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_REJECT_FILE_PATH") == null) {
                            context.CONTEXT_ETL_REJECT_FILE_PATH = null;
                        } else {
                            context.CONTEXT_ETL_REJECT_FILE_PATH=(String) context.getProperty("CONTEXT_ETL_REJECT_FILE_PATH");
                        }
                        context.setContextType("CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION") == null) {
                            context.CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION = null;
                        } else {
                            context.CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION=(String) context.getProperty("CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION");
                        }
                        context.setContextType("CONTEXT_ETL_TARGET_FILE_PATH", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_TARGET_FILE_PATH") == null) {
                            context.CONTEXT_ETL_TARGET_FILE_PATH = null;
                        } else {
                            context.CONTEXT_ETL_TARGET_FILE_PATH=(String) context.getProperty("CONTEXT_ETL_TARGET_FILE_PATH");
                        }
                        context.setContextType("CONTEXT_ETL_TEAM_NAME", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_TEAM_NAME") == null) {
                            context.CONTEXT_ETL_TEAM_NAME = null;
                        } else {
                            context.CONTEXT_ETL_TEAM_NAME=(String) context.getProperty("CONTEXT_ETL_TEAM_NAME");
                        }
                        context.setContextType("CONTEXT_ETL_XREF_JOB_NAME", "id_String");
                        if(context.getStringValue("CONTEXT_ETL_XREF_JOB_NAME") == null) {
                            context.CONTEXT_ETL_XREF_JOB_NAME = null;
                        } else {
                            context.CONTEXT_ETL_XREF_JOB_NAME=(String) context.getProperty("CONTEXT_ETL_XREF_JOB_NAME");
                        }
                        context.setContextType("CONTEXT_EXCEPTION_FLAG", "id_String");
                        if(context.getStringValue("CONTEXT_EXCEPTION_FLAG") == null) {
                            context.CONTEXT_EXCEPTION_FLAG = null;
                        } else {
                            context.CONTEXT_EXCEPTION_FLAG=(String) context.getProperty("CONTEXT_EXCEPTION_FLAG");
                        }
                        context.setContextType("CONTEXT_EXISTING_CASE_GTIN", "id_String");
                        if(context.getStringValue("CONTEXT_EXISTING_CASE_GTIN") == null) {
                            context.CONTEXT_EXISTING_CASE_GTIN = null;
                        } else {
                            context.CONTEXT_EXISTING_CASE_GTIN=(String) context.getProperty("CONTEXT_EXISTING_CASE_GTIN");
                        }
                        context.setContextType("CONTEXT_EXISTING_UPC_LIST", "id_String");
                        if(context.getStringValue("CONTEXT_EXISTING_UPC_LIST") == null) {
                            context.CONTEXT_EXISTING_UPC_LIST = null;
                        } else {
                            context.CONTEXT_EXISTING_UPC_LIST=(String) context.getProperty("CONTEXT_EXISTING_UPC_LIST");
                        }
                        context.setContextType("CONTEXT_FILE_PATH", "id_String");
                        if(context.getStringValue("CONTEXT_FILE_PATH") == null) {
                            context.CONTEXT_FILE_PATH = null;
                        } else {
                            context.CONTEXT_FILE_PATH=(String) context.getProperty("CONTEXT_FILE_PATH");
                        }
                        context.setContextType("CONTEXT_GA072P_ENABLE_FLAG", "id_String");
                        if(context.getStringValue("CONTEXT_GA072P_ENABLE_FLAG") == null) {
                            context.CONTEXT_GA072P_ENABLE_FLAG = null;
                        } else {
                            context.CONTEXT_GA072P_ENABLE_FLAG=(String) context.getProperty("CONTEXT_GA072P_ENABLE_FLAG");
                        }
                        context.setContextType("CONTEXT_HALLMARK_PERSISTENT_FILE_NAME", "id_String");
                        if(context.getStringValue("CONTEXT_HALLMARK_PERSISTENT_FILE_NAME") == null) {
                            context.CONTEXT_HALLMARK_PERSISTENT_FILE_NAME = null;
                        } else {
                            context.CONTEXT_HALLMARK_PERSISTENT_FILE_NAME=(String) context.getProperty("CONTEXT_HALLMARK_PERSISTENT_FILE_NAME");
                        }
                        context.setContextType("CONTEXT_IT028P_SOM_ITEMLIST", "id_String");
                        if(context.getStringValue("CONTEXT_IT028P_SOM_ITEMLIST") == null) {
                            context.CONTEXT_IT028P_SOM_ITEMLIST = null;
                        } else {
                            context.CONTEXT_IT028P_SOM_ITEMLIST=(String) context.getProperty("CONTEXT_IT028P_SOM_ITEMLIST");
                        }
                        context.setContextType("CONTEXT_KEYSTOREPWD", "id_String");
                        if(context.getStringValue("CONTEXT_KEYSTOREPWD") == null) {
                            context.CONTEXT_KEYSTOREPWD = null;
                        } else {
                            context.CONTEXT_KEYSTOREPWD=(String) context.getProperty("CONTEXT_KEYSTOREPWD");
                        }
                        context.setContextType("CONTEXT_LEGACY_SAP_CNTRY_MAPPING", "id_String");
                        if(context.getStringValue("CONTEXT_LEGACY_SAP_CNTRY_MAPPING") == null) {
                            context.CONTEXT_LEGACY_SAP_CNTRY_MAPPING = null;
                        } else {
                            context.CONTEXT_LEGACY_SAP_CNTRY_MAPPING=(String) context.getProperty("CONTEXT_LEGACY_SAP_CNTRY_MAPPING");
                        }
                        context.setContextType("CONTEXT_LEGAL_UOM_XREF", "id_String");
                        if(context.getStringValue("CONTEXT_LEGAL_UOM_XREF") == null) {
                            context.CONTEXT_LEGAL_UOM_XREF = null;
                        } else {
                            context.CONTEXT_LEGAL_UOM_XREF=(String) context.getProperty("CONTEXT_LEGAL_UOM_XREF");
                        }
                        context.setContextType("CONTEXT_LISTING_TYPE", "id_String");
                        if(context.getStringValue("CONTEXT_LISTING_TYPE") == null) {
                            context.CONTEXT_LISTING_TYPE = null;
                        } else {
                            context.CONTEXT_LISTING_TYPE=(String) context.getProperty("CONTEXT_LISTING_TYPE");
                        }
                        context.setContextType("CONTEXT_MARA_ADDITIONALSEG", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_ADDITIONALSEG") == null) {
                            context.CONTEXT_MARA_ADDITIONALSEG = null;
                        } else {
                            context.CONTEXT_MARA_ADDITIONALSEG=(String) context.getProperty("CONTEXT_MARA_ADDITIONALSEG");
                        }
                        context.setContextType("CONTEXT_MARA_BASIC_EXTENSION", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_BASIC_EXTENSION") == null) {
                            context.CONTEXT_MARA_BASIC_EXTENSION = null;
                        } else {
                            context.CONTEXT_MARA_BASIC_EXTENSION=(String) context.getProperty("CONTEXT_MARA_BASIC_EXTENSION");
                        }
                        context.setContextType("CONTEXT_MARA_BOMMAT", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_BOMMAT") == null) {
                            context.CONTEXT_MARA_BOMMAT = null;
                        } else {
                            context.CONTEXT_MARA_BOMMAT=(String) context.getProperty("CONTEXT_MARA_BOMMAT");
                        }
                        context.setContextType("CONTEXT_MARA_DR_DESC", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_DR_DESC") == null) {
                            context.CONTEXT_MARA_DR_DESC = null;
                        } else {
                            context.CONTEXT_MARA_DR_DESC=(String) context.getProperty("CONTEXT_MARA_DR_DESC");
                        }
                        context.setContextType("CONTEXT_MARA_EXTRACTSEG", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_EXTRACTSEG") == null) {
                            context.CONTEXT_MARA_EXTRACTSEG = null;
                        } else {
                            context.CONTEXT_MARA_EXTRACTSEG=(String) context.getProperty("CONTEXT_MARA_EXTRACTSEG");
                        }
                        context.setContextType("CONTEXT_MARA_GTIN_UPC_REL", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_GTIN_UPC_REL") == null) {
                            context.CONTEXT_MARA_GTIN_UPC_REL = null;
                        } else {
                            context.CONTEXT_MARA_GTIN_UPC_REL=(String) context.getProperty("CONTEXT_MARA_GTIN_UPC_REL");
                        }
                        context.setContextType("CONTEXT_MARA_HIERARCHYNODE", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_HIERARCHYNODE") == null) {
                            context.CONTEXT_MARA_HIERARCHYNODE = null;
                        } else {
                            context.CONTEXT_MARA_HIERARCHYNODE=(String) context.getProperty("CONTEXT_MARA_HIERARCHYNODE");
                        }
                        context.setContextType("CONTEXT_MARA_HTSCLASS", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_HTSCLASS") == null) {
                            context.CONTEXT_MARA_HTSCLASS = null;
                        } else {
                            context.CONTEXT_MARA_HTSCLASS=(String) context.getProperty("CONTEXT_MARA_HTSCLASS");
                        }
                        context.setContextType("CONTEXT_MARA_LEGACY_ITEM", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_LEGACY_ITEM") == null) {
                            context.CONTEXT_MARA_LEGACY_ITEM = null;
                        } else {
                            context.CONTEXT_MARA_LEGACY_ITEM=(String) context.getProperty("CONTEXT_MARA_LEGACY_ITEM");
                        }
                        context.setContextType("CONTEXT_MARA_LEGACY_ITEM_VENDOR", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_LEGACY_ITEM_VENDOR") == null) {
                            context.CONTEXT_MARA_LEGACY_ITEM_VENDOR = null;
                        } else {
                            context.CONTEXT_MARA_LEGACY_ITEM_VENDOR=(String) context.getProperty("CONTEXT_MARA_LEGACY_ITEM_VENDOR");
                        }
                        context.setContextType("CONTEXT_MARA_LEGACYSEG", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_LEGACYSEG") == null) {
                            context.CONTEXT_MARA_LEGACYSEG = null;
                        } else {
                            context.CONTEXT_MARA_LEGACYSEG=(String) context.getProperty("CONTEXT_MARA_LEGACYSEG");
                        }
                        context.setContextType("CONTEXT_MARA_LEGALUOM", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_LEGALUOM") == null) {
                            context.CONTEXT_MARA_LEGALUOM = null;
                        } else {
                            context.CONTEXT_MARA_LEGALUOM=(String) context.getProperty("CONTEXT_MARA_LEGALUOM");
                        }
                        context.setContextType("CONTEXT_MARA_MAIN_ARTICLE", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_MAIN_ARTICLE") == null) {
                            context.CONTEXT_MARA_MAIN_ARTICLE = null;
                        } else {
                            context.CONTEXT_MARA_MAIN_ARTICLE=(String) context.getProperty("CONTEXT_MARA_MAIN_ARTICLE");
                        }
                        context.setContextType("CONTEXT_MARA_MAMSEG", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_MAMSEG") == null) {
                            context.CONTEXT_MARA_MAMSEG = null;
                        } else {
                            context.CONTEXT_MARA_MAMSEG=(String) context.getProperty("CONTEXT_MARA_MAMSEG");
                        }
                        context.setContextType("CONTEXT_MARA_MARASEG", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_MARASEG") == null) {
                            context.CONTEXT_MARA_MARASEG = null;
                        } else {
                            context.CONTEXT_MARA_MARASEG=(String) context.getProperty("CONTEXT_MARA_MARASEG");
                        }
                        context.setContextType("CONTEXT_MARA_MARMSEG", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_MARMSEG") == null) {
                            context.CONTEXT_MARA_MARMSEG = null;
                        } else {
                            context.CONTEXT_MARA_MARMSEG=(String) context.getProperty("CONTEXT_MARA_MARMSEG");
                        }
                        context.setContextType("CONTEXT_MARA_MATDESC", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_MATDESC") == null) {
                            context.CONTEXT_MARA_MATDESC = null;
                        } else {
                            context.CONTEXT_MARA_MATDESC=(String) context.getProperty("CONTEXT_MARA_MATDESC");
                        }
                        context.setContextType("CONTEXT_MARA_MAW_SEG", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_MAW_SEG") == null) {
                            context.CONTEXT_MARA_MAW_SEG = null;
                        } else {
                            context.CONTEXT_MARA_MAW_SEG=(String) context.getProperty("CONTEXT_MARA_MAW_SEG");
                        }
                        context.setContextType("CONTEXT_MARA_MAWSEG", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_MAWSEG") == null) {
                            context.CONTEXT_MARA_MAWSEG = null;
                        } else {
                            context.CONTEXT_MARA_MAWSEG=(String) context.getProperty("CONTEXT_MARA_MAWSEG");
                        }
                        context.setContextType("CONTEXT_MARA_MEANSEG", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_MEANSEG") == null) {
                            context.CONTEXT_MARA_MEANSEG = null;
                        } else {
                            context.CONTEXT_MARA_MEANSEG=(String) context.getProperty("CONTEXT_MARA_MEANSEG");
                        }
                        context.setContextType("CONTEXT_MARA_MLEASEG", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_MLEASEG") == null) {
                            context.CONTEXT_MARA_MLEASEG = null;
                        } else {
                            context.CONTEXT_MARA_MLEASEG=(String) context.getProperty("CONTEXT_MARA_MLEASEG");
                        }
                        context.setContextType("CONTEXT_MARA_MVKERT", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_MVKERT") == null) {
                            context.CONTEXT_MARA_MVKERT = null;
                        } else {
                            context.CONTEXT_MARA_MVKERT=(String) context.getProperty("CONTEXT_MARA_MVKERT");
                        }
                        context.setContextType("CONTEXT_MARA_PURSUB", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_PURSUB") == null) {
                            context.CONTEXT_MARA_PURSUB = null;
                        } else {
                            context.CONTEXT_MARA_PURSUB=(String) context.getProperty("CONTEXT_MARA_PURSUB");
                        }
                        context.setContextType("CONTEXT_MARA_SEASONCODE", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_SEASONCODE") == null) {
                            context.CONTEXT_MARA_SEASONCODE = null;
                        } else {
                            context.CONTEXT_MARA_SEASONCODE=(String) context.getProperty("CONTEXT_MARA_SEASONCODE");
                        }
                        }

                private void processContext_1() {
                        context.setContextType("CONTEXT_MARA_SHIPSUB", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_SHIPSUB") == null) {
                            context.CONTEXT_MARA_SHIPSUB = null;
                        } else {
                            context.CONTEXT_MARA_SHIPSUB=(String) context.getProperty("CONTEXT_MARA_SHIPSUB");
                        }
                        context.setContextType("CONTEXT_MARA_VARIANT_ARTICLE", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_VARIANT_ARTICLE") == null) {
                            context.CONTEXT_MARA_VARIANT_ARTICLE = null;
                        } else {
                            context.CONTEXT_MARA_VARIANT_ARTICLE=(String) context.getProperty("CONTEXT_MARA_VARIANT_ARTICLE");
                        }
                        context.setContextType("CONTEXT_MARA_WLK2EXTRTSEG", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_WLK2EXTRTSEG") == null) {
                            context.CONTEXT_MARA_WLK2EXTRTSEG = null;
                        } else {
                            context.CONTEXT_MARA_WLK2EXTRTSEG=(String) context.getProperty("CONTEXT_MARA_WLK2EXTRTSEG");
                        }
                        context.setContextType("CONTEXT_MARA_WLK2SEG", "id_String");
                        if(context.getStringValue("CONTEXT_MARA_WLK2SEG") == null) {
                            context.CONTEXT_MARA_WLK2SEG = null;
                        } else {
                            context.CONTEXT_MARA_WLK2SEG=(String) context.getProperty("CONTEXT_MARA_WLK2SEG");
                        }
                        context.setContextType("CONTEXT_MDM_KEYSTORE", "id_String");
                        if(context.getStringValue("CONTEXT_MDM_KEYSTORE") == null) {
                            context.CONTEXT_MDM_KEYSTORE = null;
                        } else {
                            context.CONTEXT_MDM_KEYSTORE=(String) context.getProperty("CONTEXT_MDM_KEYSTORE");
                        }
                        context.setContextType("CONTEXT_MDM_TRUSTSTORE", "id_String");
                        if(context.getStringValue("CONTEXT_MDM_TRUSTSTORE") == null) {
                            context.CONTEXT_MDM_TRUSTSTORE = null;
                        } else {
                            context.CONTEXT_MDM_TRUSTSTORE=(String) context.getProperty("CONTEXT_MDM_TRUSTSTORE");
                        }
                        context.setContextType("CONTEXT_MISSING_UPC_EMAIL_TO", "id_String");
                        if(context.getStringValue("CONTEXT_MISSING_UPC_EMAIL_TO") == null) {
                            context.CONTEXT_MISSING_UPC_EMAIL_TO = null;
                        } else {
                            context.CONTEXT_MISSING_UPC_EMAIL_TO=(String) context.getProperty("CONTEXT_MISSING_UPC_EMAIL_TO");
                        }
                        context.setContextType("CONTEXT_MISSING_UPC_REPLY_TO", "id_String");
                        if(context.getStringValue("CONTEXT_MISSING_UPC_REPLY_TO") == null) {
                            context.CONTEXT_MISSING_UPC_REPLY_TO = null;
                        } else {
                            context.CONTEXT_MISSING_UPC_REPLY_TO=(String) context.getProperty("CONTEXT_MISSING_UPC_REPLY_TO");
                        }
                        context.setContextType("CONTEXT_MYLAR_MERCH_OPSTUDY", "id_String");
                        if(context.getStringValue("CONTEXT_MYLAR_MERCH_OPSTUDY") == null) {
                            context.CONTEXT_MYLAR_MERCH_OPSTUDY = null;
                        } else {
                            context.CONTEXT_MYLAR_MERCH_OPSTUDY=(String) context.getProperty("CONTEXT_MYLAR_MERCH_OPSTUDY");
                        }
                        context.setContextType("CONTEXT_NEW_UOM_WIC_REQ_FLAG", "id_String");
                        if(context.getStringValue("CONTEXT_NEW_UOM_WIC_REQ_FLAG") == null) {
                            context.CONTEXT_NEW_UOM_WIC_REQ_FLAG = null;
                        } else {
                            context.CONTEXT_NEW_UOM_WIC_REQ_FLAG=(String) context.getProperty("CONTEXT_NEW_UOM_WIC_REQ_FLAG");
                        }
                        context.setContextType("CONTEXT_OB_CLR_PERSISTENT_FILE", "id_String");
                        if(context.getStringValue("CONTEXT_OB_CLR_PERSISTENT_FILE") == null) {
                            context.CONTEXT_OB_CLR_PERSISTENT_FILE = null;
                        } else {
                            context.CONTEXT_OB_CLR_PERSISTENT_FILE=(String) context.getProperty("CONTEXT_OB_CLR_PERSISTENT_FILE");
                        }
                        context.setContextType("CONTEXT_OB_CLR_XREF", "id_String");
                        if(context.getStringValue("CONTEXT_OB_CLR_XREF") == null) {
                            context.CONTEXT_OB_CLR_XREF = null;
                        } else {
                            context.CONTEXT_OB_CLR_XREF=(String) context.getProperty("CONTEXT_OB_CLR_XREF");
                        }
                        context.setContextType("CONTEXT_ORMD_IND", "id_String");
                        if(context.getStringValue("CONTEXT_ORMD_IND") == null) {
                            context.CONTEXT_ORMD_IND = null;
                        } else {
                            context.CONTEXT_ORMD_IND=(String) context.getProperty("CONTEXT_ORMD_IND");
                        }
                        context.setContextType("CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT", "id_String");
                        if(context.getStringValue("CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT") == null) {
                            context.CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT = null;
                        } else {
                            context.CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT=(String) context.getProperty("CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT");
                        }
                        context.setContextType("CONTEXT_PARKING_EXCEPT_LIST", "id_String");
                        if(context.getStringValue("CONTEXT_PARKING_EXCEPT_LIST") == null) {
                            context.CONTEXT_PARKING_EXCEPT_LIST = null;
                        } else {
                            context.CONTEXT_PARKING_EXCEPT_LIST=(String) context.getProperty("CONTEXT_PARKING_EXCEPT_LIST");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_ADR4_MD039P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_ADR4_MD039P") == null) {
                            context.CONTEXT_PIR_PARKED_ADR4_MD039P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_ADR4_MD039P=(String) context.getProperty("CONTEXT_PIR_PARKED_ADR4_MD039P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT002P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT002P") == null) {
                            context.CONTEXT_PIR_PARKED_IT002P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT002P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT002P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT007P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT007P") == null) {
                            context.CONTEXT_PIR_PARKED_IT007P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT007P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT007P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT008P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT008P") == null) {
                            context.CONTEXT_PIR_PARKED_IT008P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT008P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT008P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT011P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT011P") == null) {
                            context.CONTEXT_PIR_PARKED_IT011P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT011P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT011P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT015P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT015P") == null) {
                            context.CONTEXT_PIR_PARKED_IT015P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT015P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT015P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT029P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT029P") == null) {
                            context.CONTEXT_PIR_PARKED_IT029P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT029P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT029P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT088P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT088P") == null) {
                            context.CONTEXT_PIR_PARKED_IT088P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT088P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT088P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT107P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT107P") == null) {
                            context.CONTEXT_PIR_PARKED_IT107P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT107P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT107P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT108P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT108P") == null) {
                            context.CONTEXT_PIR_PARKED_IT108P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT108P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT108P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT185P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT185P") == null) {
                            context.CONTEXT_PIR_PARKED_IT185P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT185P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT185P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT186P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT186P") == null) {
                            context.CONTEXT_PIR_PARKED_IT186P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT186P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT186P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT282P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT282P") == null) {
                            context.CONTEXT_PIR_PARKED_IT282P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT282P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT282P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT402P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT402P") == null) {
                            context.CONTEXT_PIR_PARKED_IT402P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT402P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT402P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT517P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT517P") == null) {
                            context.CONTEXT_PIR_PARKED_IT517P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT517P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT517P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT839P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT839P") == null) {
                            context.CONTEXT_PIR_PARKED_IT839P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT839P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT839P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_IT981P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_IT981P") == null) {
                            context.CONTEXT_PIR_PARKED_IT981P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_IT981P=(String) context.getProperty("CONTEXT_PIR_PARKED_IT981P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_MD039P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_MD039P") == null) {
                            context.CONTEXT_PIR_PARKED_MD039P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_MD039P=(String) context.getProperty("CONTEXT_PIR_PARKED_MD039P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_MD041P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_MD041P") == null) {
                            context.CONTEXT_PIR_PARKED_MD041P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_MD041P=(String) context.getProperty("CONTEXT_PIR_PARKED_MD041P");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_MD041P_ADR4", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_MD041P_ADR4") == null) {
                            context.CONTEXT_PIR_PARKED_MD041P_ADR4 = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_MD041P_ADR4=(String) context.getProperty("CONTEXT_PIR_PARKED_MD041P_ADR4");
                        }
                        context.setContextType("CONTEXT_PIR_PARKED_MD639P", "id_String");
                        if(context.getStringValue("CONTEXT_PIR_PARKED_MD639P") == null) {
                            context.CONTEXT_PIR_PARKED_MD639P = null;
                        } else {
                            context.CONTEXT_PIR_PARKED_MD639P=(String) context.getProperty("CONTEXT_PIR_PARKED_MD639P");
                        }
                        context.setContextType("CONTEXT_PLN_MERGE", "id_String");
                        if(context.getStringValue("CONTEXT_PLN_MERGE") == null) {
                            context.CONTEXT_PLN_MERGE = null;
                        } else {
                            context.CONTEXT_PLN_MERGE=(String) context.getProperty("CONTEXT_PLN_MERGE");
                        }
                        context.setContextType("CONTEXT_PLN_SM_TRACKING_FILE", "id_String");
                        if(context.getStringValue("CONTEXT_PLN_SM_TRACKING_FILE") == null) {
                            context.CONTEXT_PLN_SM_TRACKING_FILE = null;
                        } else {
                            context.CONTEXT_PLN_SM_TRACKING_FILE=(String) context.getProperty("CONTEXT_PLN_SM_TRACKING_FILE");
                        }
                        context.setContextType("CONTEXT_PLN_SPLIT", "id_String");
                        if(context.getStringValue("CONTEXT_PLN_SPLIT") == null) {
                            context.CONTEXT_PLN_SPLIT = null;
                        } else {
                            context.CONTEXT_PLN_SPLIT=(String) context.getProperty("CONTEXT_PLN_SPLIT");
                        }
                        context.setContextType("CONTEXT_QUICKWIC_ARTICLE_STATUS", "id_String");
                        if(context.getStringValue("CONTEXT_QUICKWIC_ARTICLE_STATUS") == null) {
                            context.CONTEXT_QUICKWIC_ARTICLE_STATUS = null;
                        } else {
                            context.CONTEXT_QUICKWIC_ARTICLE_STATUS=(String) context.getProperty("CONTEXT_QUICKWIC_ARTICLE_STATUS");
                        }
                        context.setContextType("CONTEXT_RACK_MYLAR", "id_String");
                        if(context.getStringValue("CONTEXT_RACK_MYLAR") == null) {
                            context.CONTEXT_RACK_MYLAR = null;
                        } else {
                            context.CONTEXT_RACK_MYLAR=(String) context.getProperty("CONTEXT_RACK_MYLAR");
                        }
                        context.setContextType("CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG", "id_String");
                        if(context.getStringValue("CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG") == null) {
                            context.CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG = null;
                        } else {
                            context.CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG=(String) context.getProperty("CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG");
                        }
                        context.setContextType("CONTEXT_RT_CONTROL_FOLDER", "id_String");
                        if(context.getStringValue("CONTEXT_RT_CONTROL_FOLDER") == null) {
                            context.CONTEXT_RT_CONTROL_FOLDER = null;
                        } else {
                            context.CONTEXT_RT_CONTROL_FOLDER=(String) context.getProperty("CONTEXT_RT_CONTROL_FOLDER");
                        }
                        context.setContextType("CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH", "id_String");
                        if(context.getStringValue("CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH") == null) {
                            context.CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH = null;
                        } else {
                            context.CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH=(String) context.getProperty("CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH");
                        }
                        context.setContextType("CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH", "id_String");
                        if(context.getStringValue("CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH") == null) {
                            context.CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH = null;
                        } else {
                            context.CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH=(String) context.getProperty("CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH");
                        }
                        context.setContextType("CONTEXT_RT_R4B_PARKED_PIR_FILEPATH", "id_String");
                        if(context.getStringValue("CONTEXT_RT_R4B_PARKED_PIR_FILEPATH") == null) {
                            context.CONTEXT_RT_R4B_PARKED_PIR_FILEPATH = null;
                        } else {
                            context.CONTEXT_RT_R4B_PARKED_PIR_FILEPATH=(String) context.getProperty("CONTEXT_RT_R4B_PARKED_PIR_FILEPATH");
                        }
                        context.setContextType("CONTEXT_RT_R4B_PARKED_XREF_FILEPATH", "id_String");
                        if(context.getStringValue("CONTEXT_RT_R4B_PARKED_XREF_FILEPATH") == null) {
                            context.CONTEXT_RT_R4B_PARKED_XREF_FILEPATH = null;
                        } else {
                            context.CONTEXT_RT_R4B_PARKED_XREF_FILEPATH=(String) context.getProperty("CONTEXT_RT_R4B_PARKED_XREF_FILEPATH");
                        }
                        context.setContextType("CONTEXT_RT_RNWL_HOME", "id_String");
                        if(context.getStringValue("CONTEXT_RT_RNWL_HOME") == null) {
                            context.CONTEXT_RT_RNWL_HOME = null;
                        } else {
                            context.CONTEXT_RT_RNWL_HOME=(String) context.getProperty("CONTEXT_RT_RNWL_HOME");
                        }
                        context.setContextType("CONTEXT_RT_SOURCE", "id_String");
                        if(context.getStringValue("CONTEXT_RT_SOURCE") == null) {
                            context.CONTEXT_RT_SOURCE = null;
                        } else {
                            context.CONTEXT_RT_SOURCE=(String) context.getProperty("CONTEXT_RT_SOURCE");
                        }
                        context.setContextType("CONTEXT_RT_TRACK", "id_String");
                        if(context.getStringValue("CONTEXT_RT_TRACK") == null) {
                            context.CONTEXT_RT_TRACK = null;
                        } else {
                            context.CONTEXT_RT_TRACK=(String) context.getProperty("CONTEXT_RT_TRACK");
                        }
                        context.setContextType("CONTEXT_RT_TRACK_DYNAMIC", "id_String");
                        if(context.getStringValue("CONTEXT_RT_TRACK_DYNAMIC") == null) {
                            context.CONTEXT_RT_TRACK_DYNAMIC = null;
                        } else {
                            context.CONTEXT_RT_TRACK_DYNAMIC=(String) context.getProperty("CONTEXT_RT_TRACK_DYNAMIC");
                        }
                        context.setContextType("CONTEXT_RT_TRACK_LOAD", "id_String");
                        if(context.getStringValue("CONTEXT_RT_TRACK_LOAD") == null) {
                            context.CONTEXT_RT_TRACK_LOAD = null;
                        } else {
                            context.CONTEXT_RT_TRACK_LOAD=(String) context.getProperty("CONTEXT_RT_TRACK_LOAD");
                        }
                        context.setContextType("CONTEXT_RT_TRACK_SAG", "id_String");
                        if(context.getStringValue("CONTEXT_RT_TRACK_SAG") == null) {
                            context.CONTEXT_RT_TRACK_SAG = null;
                        } else {
                            context.CONTEXT_RT_TRACK_SAG=(String) context.getProperty("CONTEXT_RT_TRACK_SAG");
                        }
                        context.setContextType("CONTEXT_RT_TRACK_STATIC", "id_String");
                        if(context.getStringValue("CONTEXT_RT_TRACK_STATIC") == null) {
                            context.CONTEXT_RT_TRACK_STATIC = null;
                        } else {
                            context.CONTEXT_RT_TRACK_STATIC=(String) context.getProperty("CONTEXT_RT_TRACK_STATIC");
                        }
                        context.setContextType("CONTEXT_RT_TRACK_XREF", "id_String");
                        if(context.getStringValue("CONTEXT_RT_TRACK_XREF") == null) {
                            context.CONTEXT_RT_TRACK_XREF = null;
                        } else {
                            context.CONTEXT_RT_TRACK_XREF=(String) context.getProperty("CONTEXT_RT_TRACK_XREF");
                        }
                        context.setContextType("CONTEXT_RT_TRACK_XREF_UPDATE", "id_String");
                        if(context.getStringValue("CONTEXT_RT_TRACK_XREF_UPDATE") == null) {
                            context.CONTEXT_RT_TRACK_XREF_UPDATE = null;
                        } else {
                            context.CONTEXT_RT_TRACK_XREF_UPDATE=(String) context.getProperty("CONTEXT_RT_TRACK_XREF_UPDATE");
                        }
                        context.setContextType("CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE", "id_String");
                        if(context.getStringValue("CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE") == null) {
                            context.CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE = null;
                        } else {
                            context.CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE=(String) context.getProperty("CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE");
                        }
                        context.setContextType("CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM", "id_String");
                        if(context.getStringValue("CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM") == null) {
                            context.CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM = null;
                        } else {
                            context.CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM=(String) context.getProperty("CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM");
                        }
                        context.setContextType("CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME", "id_String");
                        if(context.getStringValue("CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME") == null) {
                            context.CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME = null;
                        } else {
                            context.CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME=(String) context.getProperty("CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME");
                        }
                        context.setContextType("CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM", "id_String");
                        if(context.getStringValue("CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM") == null) {
                            context.CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM = null;
                        } else {
                            context.CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM=(String) context.getProperty("CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM");
                        }
                        context.setContextType("CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM", "id_String");
                        if(context.getStringValue("CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM") == null) {
                            context.CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM = null;
                        } else {
                            context.CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM=(String) context.getProperty("CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM");
                        }
                        context.setContextType("CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM", "id_String");
                        if(context.getStringValue("CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM") == null) {
                            context.CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM = null;
                        } else {
                            context.CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM=(String) context.getProperty("CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM");
                        }
                        context.setContextType("CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM", "id_String");
                        if(context.getStringValue("CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM") == null) {
                            context.CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM = null;
                        } else {
                            context.CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM=(String) context.getProperty("CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM");
                        }
                        context.setContextType("CONTEXT_SAG_EXTRACT_JOB_NAME", "id_String");
                        if(context.getStringValue("CONTEXT_SAG_EXTRACT_JOB_NAME") == null) {
                            context.CONTEXT_SAG_EXTRACT_JOB_NAME = null;
                        } else {
                            context.CONTEXT_SAG_EXTRACT_JOB_NAME=(String) context.getProperty("CONTEXT_SAG_EXTRACT_JOB_NAME");
                        }
                        context.setContextType("CONTEXT_SAG_EXTRACT_LOG_FILE_NAME", "id_String");
                        if(context.getStringValue("CONTEXT_SAG_EXTRACT_LOG_FILE_NAME") == null) {
                            context.CONTEXT_SAG_EXTRACT_LOG_FILE_NAME = null;
                        } else {
                            context.CONTEXT_SAG_EXTRACT_LOG_FILE_NAME=(String) context.getProperty("CONTEXT_SAG_EXTRACT_LOG_FILE_NAME");
                        }
                        context.setContextType("CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL", "id_String");
                        if(context.getStringValue("CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL") == null) {
                            context.CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL = null;
                        } else {
                            context.CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL=(String) context.getProperty("CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL");
                        }
                        context.setContextType("CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE", "id_String");
                        if(context.getStringValue("CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE") == null) {
                            context.CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE = null;
                        } else {
                            context.CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE=(String) context.getProperty("CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE");
                        }
                        context.setContextType("CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD", "id_String");
                        if(context.getStringValue("CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD") == null) {
                            context.CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD = null;
                        } else {
                            context.CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD=(String) context.getProperty("CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD");
                        }
                        context.setContextType("CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT", "id_String");
                        if(context.getStringValue("CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT") == null) {
                            context.CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT = null;
                        } else {
                            context.CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT=(String) context.getProperty("CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT");
                        }
                        context.setContextType("CONTEXT_SAP_LEGACY_UOM_XREF", "id_String");
                        if(context.getStringValue("CONTEXT_SAP_LEGACY_UOM_XREF") == null) {
                            context.CONTEXT_SAP_LEGACY_UOM_XREF = null;
                        } else {
                            context.CONTEXT_SAP_LEGACY_UOM_XREF=(String) context.getProperty("CONTEXT_SAP_LEGACY_UOM_XREF");
                        }
                        context.setContextType("CONTEXT_SAP_XREF_FOLDER_NAME", "id_String");
                        if(context.getStringValue("CONTEXT_SAP_XREF_FOLDER_NAME") == null) {
                            context.CONTEXT_SAP_XREF_FOLDER_NAME = null;
                        } else {
                            context.CONTEXT_SAP_XREF_FOLDER_NAME=(String) context.getProperty("CONTEXT_SAP_XREF_FOLDER_NAME");
                        }
                        context.setContextType("CONTEXT_SEASON_CODE_EXCEPTION_TO", "id_String");
                        if(context.getStringValue("CONTEXT_SEASON_CODE_EXCEPTION_TO") == null) {
                            context.CONTEXT_SEASON_CODE_EXCEPTION_TO = null;
                        } else {
                            context.CONTEXT_SEASON_CODE_EXCEPTION_TO=(String) context.getProperty("CONTEXT_SEASON_CODE_EXCEPTION_TO");
                        }
                        context.setContextType("CONTEXT_SEASON_DEFAULT_VALUE", "id_String");
                        if(context.getStringValue("CONTEXT_SEASON_DEFAULT_VALUE") == null) {
                            context.CONTEXT_SEASON_DEFAULT_VALUE = null;
                        } else {
                            context.CONTEXT_SEASON_DEFAULT_VALUE=(String) context.getProperty("CONTEXT_SEASON_DEFAULT_VALUE");
                        }
                        context.setContextType("CONTEXT_SEASONCODE_EXCEL", "id_String");
                        if(context.getStringValue("CONTEXT_SEASONCODE_EXCEL") == null) {
                            context.CONTEXT_SEASONCODE_EXCEL = null;
                        } else {
                            context.CONTEXT_SEASONCODE_EXCEL=(String) context.getProperty("CONTEXT_SEASONCODE_EXCEL");
                        }
                        context.setContextType("CONTEXT_SIGNAL_FILE_PATH", "id_String");
                        if(context.getStringValue("CONTEXT_SIGNAL_FILE_PATH") == null) {
                            context.CONTEXT_SIGNAL_FILE_PATH = null;
                        } else {
                            context.CONTEXT_SIGNAL_FILE_PATH=(String) context.getProperty("CONTEXT_SIGNAL_FILE_PATH");
                        }
                        context.setContextType("CONTEXT_SITE_XREF", "id_String");
                        if(context.getStringValue("CONTEXT_SITE_XREF") == null) {
                            context.CONTEXT_SITE_XREF = null;
                        } else {
                            context.CONTEXT_SITE_XREF=(String) context.getProperty("CONTEXT_SITE_XREF");
                        }
                        context.setContextType("CONTEXT_SOURCE_ARTICLE_FOLDER_NAME", "id_String");
                        if(context.getStringValue("CONTEXT_SOURCE_ARTICLE_FOLDER_NAME") == null) {
                            context.CONTEXT_SOURCE_ARTICLE_FOLDER_NAME = null;
                        } else {
                            context.CONTEXT_SOURCE_ARTICLE_FOLDER_NAME=(String) context.getProperty("CONTEXT_SOURCE_ARTICLE_FOLDER_NAME");
                        }
                        context.setContextType("CONTEXT_STIBO_CF_PERSISTENT_FILE", "id_String");
                        if(context.getStringValue("CONTEXT_STIBO_CF_PERSISTENT_FILE") == null) {
                            context.CONTEXT_STIBO_CF_PERSISTENT_FILE = null;
                        } else {
                            context.CONTEXT_STIBO_CF_PERSISTENT_FILE=(String) context.getProperty("CONTEXT_STIBO_CF_PERSISTENT_FILE");
                        }
                        context.setContextType("CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE", "id_String");
                        if(context.getStringValue("CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE") == null) {
                            context.CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE = null;
                        } else {
                            context.CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE=(String) context.getProperty("CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE");
                        }
                        context.setContextType("CONTEXT_STIBO_PERSISTENT_FILE", "id_String");
                        if(context.getStringValue("CONTEXT_STIBO_PERSISTENT_FILE") == null) {
                            context.CONTEXT_STIBO_PERSISTENT_FILE = null;
                        } else {
                            context.CONTEXT_STIBO_PERSISTENT_FILE=(String) context.getProperty("CONTEXT_STIBO_PERSISTENT_FILE");
                        }
                        context.setContextType("CONTEXT_STIBO_SOM_PERSISTENT_FILE", "id_String");
                        if(context.getStringValue("CONTEXT_STIBO_SOM_PERSISTENT_FILE") == null) {
                            context.CONTEXT_STIBO_SOM_PERSISTENT_FILE = null;
                        } else {
                            context.CONTEXT_STIBO_SOM_PERSISTENT_FILE=(String) context.getProperty("CONTEXT_STIBO_SOM_PERSISTENT_FILE");
                        }
                        context.setContextType("CONTEXT_TALEND_ARTICLE_XREF", "id_String");
                        if(context.getStringValue("CONTEXT_TALEND_ARTICLE_XREF") == null) {
                            context.CONTEXT_TALEND_ARTICLE_XREF = null;
                        } else {
                            context.CONTEXT_TALEND_ARTICLE_XREF=(String) context.getProperty("CONTEXT_TALEND_ARTICLE_XREF");
                        }
                        context.setContextType("CONTEXT_TALEND_VENDOR_XREF", "id_String");
                        if(context.getStringValue("CONTEXT_TALEND_VENDOR_XREF") == null) {
                            context.CONTEXT_TALEND_VENDOR_XREF = null;
                        } else {
                            context.CONTEXT_TALEND_VENDOR_XREF=(String) context.getProperty("CONTEXT_TALEND_VENDOR_XREF");
                        }
                        context.setContextType("CONTEXT_TEMP_CONTROL", "id_String");
                        if(context.getStringValue("CONTEXT_TEMP_CONTROL") == null) {
                            context.CONTEXT_TEMP_CONTROL = null;
                        } else {
                            context.CONTEXT_TEMP_CONTROL=(String) context.getProperty("CONTEXT_TEMP_CONTROL");
                        }
                        context.setContextType("CONTEXT_TEMP_MERCH_OPSTUDY", "id_String");
                        if(context.getStringValue("CONTEXT_TEMP_MERCH_OPSTUDY") == null) {
                            context.CONTEXT_TEMP_MERCH_OPSTUDY = null;
                        } else {
                            context.CONTEXT_TEMP_MERCH_OPSTUDY=(String) context.getProperty("CONTEXT_TEMP_MERCH_OPSTUDY");
                        }
                        context.setContextType("CONTEXT_TRUSTSTOREPWD", "id_String");
                        if(context.getStringValue("CONTEXT_TRUSTSTOREPWD") == null) {
                            context.CONTEXT_TRUSTSTOREPWD = null;
                        } else {
                            context.CONTEXT_TRUSTSTOREPWD=(String) context.getProperty("CONTEXT_TRUSTSTOREPWD");
                        }
                        context.setContextType("CONTEXT_UPC_DELETE_FLAG", "id_String");
                        if(context.getStringValue("CONTEXT_UPC_DELETE_FLAG") == null) {
                            context.CONTEXT_UPC_DELETE_FLAG = null;
                        } else {
                            context.CONTEXT_UPC_DELETE_FLAG=(String) context.getProperty("CONTEXT_UPC_DELETE_FLAG");
                        }
                        context.setContextType("CONTEXT_VALID_ARTTYPE_STIBOCHECK", "id_String");
                        if(context.getStringValue("CONTEXT_VALID_ARTTYPE_STIBOCHECK") == null) {
                            context.CONTEXT_VALID_ARTTYPE_STIBOCHECK = null;
                        } else {
                            context.CONTEXT_VALID_ARTTYPE_STIBOCHECK=(String) context.getProperty("CONTEXT_VALID_ARTTYPE_STIBOCHECK");
                        }
                        context.setContextType("CONTEXT_VALID_ITEMS_LOAD_ADR4", "id_String");
                        if(context.getStringValue("CONTEXT_VALID_ITEMS_LOAD_ADR4") == null) {
                            context.CONTEXT_VALID_ITEMS_LOAD_ADR4 = null;
                        } else {
                            context.CONTEXT_VALID_ITEMS_LOAD_ADR4=(String) context.getProperty("CONTEXT_VALID_ITEMS_LOAD_ADR4");
                        }
                        context.setContextType("CONTEXT_VALID_ITEMS_LOAD_ADR7", "id_String");
                        if(context.getStringValue("CONTEXT_VALID_ITEMS_LOAD_ADR7") == null) {
                            context.CONTEXT_VALID_ITEMS_LOAD_ADR7 = null;
                        } else {
                            context.CONTEXT_VALID_ITEMS_LOAD_ADR7=(String) context.getProperty("CONTEXT_VALID_ITEMS_LOAD_ADR7");
                        }
                        context.setContextType("CONTEXT_VALIDATION_REP_FROM", "id_String");
                        if(context.getStringValue("CONTEXT_VALIDATION_REP_FROM") == null) {
                            context.CONTEXT_VALIDATION_REP_FROM = null;
                        } else {
                            context.CONTEXT_VALIDATION_REP_FROM=(String) context.getProperty("CONTEXT_VALIDATION_REP_FROM");
                        }
                        context.setContextType("CONTEXT_VALIDATION_REP_TO", "id_String");
                        if(context.getStringValue("CONTEXT_VALIDATION_REP_TO") == null) {
                            context.CONTEXT_VALIDATION_REP_TO = null;
                        } else {
                            context.CONTEXT_VALIDATION_REP_TO=(String) context.getProperty("CONTEXT_VALIDATION_REP_TO");
                        }
                        context.setContextType("CONTEXT_VALIDATION_REPORTNAME", "id_String");
                        if(context.getStringValue("CONTEXT_VALIDATION_REPORTNAME") == null) {
                            context.CONTEXT_VALIDATION_REPORTNAME = null;
                        } else {
                            context.CONTEXT_VALIDATION_REPORTNAME=(String) context.getProperty("CONTEXT_VALIDATION_REPORTNAME");
                        }
                        context.setContextType("CONTEXT_VENDOR_VOG", "id_String");
                        if(context.getStringValue("CONTEXT_VENDOR_VOG") == null) {
                            context.CONTEXT_VENDOR_VOG = null;
                        } else {
                            context.CONTEXT_VENDOR_VOG=(String) context.getProperty("CONTEXT_VENDOR_VOG");
                        }
                        context.setContextType("CONTEXT_VENDOR_XREF", "id_String");
                        if(context.getStringValue("CONTEXT_VENDOR_XREF") == null) {
                            context.CONTEXT_VENDOR_XREF = null;
                        } else {
                            context.CONTEXT_VENDOR_XREF=(String) context.getProperty("CONTEXT_VENDOR_XREF");
                        }
                        context.setContextType("CURR_DT", "id_BigDecimal");
                        if(context.getStringValue("CURR_DT") == null) {
                            context.CURR_DT = null;
                        } else {
                            try{
                                context.CURR_DT=routines.system.ParserUtils.parseTo_BigDecimal (context.getProperty("CURR_DT"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "CURR_DT", e.getMessage()));
                                context.CURR_DT=null;
                            }
                        }
                        context.setContextType("JMS_ARTICLE_QUEUE_INPUT_FILE_NAME", "id_String");
                        if(context.getStringValue("JMS_ARTICLE_QUEUE_INPUT_FILE_NAME") == null) {
                            context.JMS_ARTICLE_QUEUE_INPUT_FILE_NAME = null;
                        } else {
                            context.JMS_ARTICLE_QUEUE_INPUT_FILE_NAME=(String) context.getProperty("JMS_ARTICLE_QUEUE_INPUT_FILE_NAME");
                        }
                        context.setContextType("JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM", "id_String");
                        if(context.getStringValue("JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM") == null) {
                            context.JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM = null;
                        } else {
                            context.JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM=(String) context.getProperty("JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM");
                        }
                        context.setContextType("JMS_ARTICLE_QUEUE_MESSAGE_COUNT", "id_String");
                        if(context.getStringValue("JMS_ARTICLE_QUEUE_MESSAGE_COUNT") == null) {
                            context.JMS_ARTICLE_QUEUE_MESSAGE_COUNT = null;
                        } else {
                            context.JMS_ARTICLE_QUEUE_MESSAGE_COUNT=(String) context.getProperty("JMS_ARTICLE_QUEUE_MESSAGE_COUNT");
                        }
                        context.setContextType("NewWIC", "id_String");
                        if(context.getStringValue("NewWIC") == null) {
                            context.NewWIC = null;
                        } else {
                            context.NewWIC=(String) context.getProperty("NewWIC");
                        }
                        }

                private void processContext_2() {
                        context.setContextType("OB_CLR_XREF_TARGET", "id_String");
                        if(context.getStringValue("OB_CLR_XREF_TARGET") == null) {
                            context.OB_CLR_XREF_TARGET = null;
                        } else {
                            context.OB_CLR_XREF_TARGET=(String) context.getProperty("OB_CLR_XREF_TARGET");
                        }
                        context.setContextType("PROCESS_CATEGORY", "id_String");
                        if(context.getStringValue("PROCESS_CATEGORY") == null) {
                            context.PROCESS_CATEGORY = null;
                        } else {
                            context.PROCESS_CATEGORY=(String) context.getProperty("PROCESS_CATEGORY");
                        }
                        context.setContextType("PROCESSED_FLAG", "id_String");
                        if(context.getStringValue("PROCESSED_FLAG") == null) {
                            context.PROCESSED_FLAG = null;
                        } else {
                            context.PROCESSED_FLAG=(String) context.getProperty("PROCESSED_FLAG");
                        }
                        context.setContextType("PROGRAM_LIB_NAME", "id_String");
                        if(context.getStringValue("PROGRAM_LIB_NAME") == null) {
                            context.PROGRAM_LIB_NAME = null;
                        } else {
                            context.PROGRAM_LIB_NAME=(String) context.getProperty("PROGRAM_LIB_NAME");
                        }
                        context.setContextType("RUN_DAY", "id_String");
                        if(context.getStringValue("RUN_DAY") == null) {
                            context.RUN_DAY = null;
                        } else {
                            context.RUN_DAY=(String) context.getProperty("RUN_DAY");
                        }
                        context.setContextType("SAF_OVERRIDE_FILE", "id_String");
                        if(context.getStringValue("SAF_OVERRIDE_FILE") == null) {
                            context.SAF_OVERRIDE_FILE = null;
                        } else {
                            context.SAF_OVERRIDE_FILE=(String) context.getProperty("SAF_OVERRIDE_FILE");
                        }
                        context.setContextType("SHIP_SUB_OPSTUDY", "id_String");
                        if(context.getStringValue("SHIP_SUB_OPSTUDY") == null) {
                            context.SHIP_SUB_OPSTUDY = null;
                        } else {
                            context.SHIP_SUB_OPSTUDY=(String) context.getProperty("SHIP_SUB_OPSTUDY");
                        }
                        context.setContextType("UOM", "id_String");
                        if(context.getStringValue("UOM") == null) {
                            context.UOM = null;
                        } else {
                            context.UOM=(String) context.getProperty("UOM");
                        }
                        context.setContextType("UPC", "id_String");
                        if(context.getStringValue("UPC") == null) {
                            context.UPC = null;
                        } else {
                            context.UPC=(String) context.getProperty("UPC");
                        }
                        context.setContextType("UPC_LENGTH_DIGIT", "id_Integer");
                        if(context.getStringValue("UPC_LENGTH_DIGIT") == null) {
                            context.UPC_LENGTH_DIGIT = null;
                        } else {
                            try{
                                context.UPC_LENGTH_DIGIT=routines.system.ParserUtils.parseTo_Integer (context.getProperty("UPC_LENGTH_DIGIT"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "UPC_LENGTH_DIGIT", e.getMessage()));
                                context.UPC_LENGTH_DIGIT=null;
                            }
                        }
                        context.setContextType("USER_STAMP", "id_String");
                        if(context.getStringValue("USER_STAMP") == null) {
                            context.USER_STAMP = null;
                        } else {
                            context.USER_STAMP=(String) context.getProperty("USER_STAMP");
                        }
                        context.setContextType("WICRequiredFlag", "id_String");
                        if(context.getStringValue("WICRequiredFlag") == null) {
                            context.WICRequiredFlag = null;
                        } else {
                            context.WICRequiredFlag=(String) context.getProperty("WICRequiredFlag");
                        }
                } 
                public void processAllContext() {
                        processContext_0();
                        processContext_1();
                        processContext_2();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("CONTEXT_ADR7_ADDITIONAL_PARAMETERS")) {
                context.CONTEXT_ADR7_ADDITIONAL_PARAMETERS = (String) parentContextMap.get("CONTEXT_ADR7_ADDITIONAL_PARAMETERS");
            }if (parentContextMap.containsKey("CONTEXT_ADR7_DATABASE")) {
                context.CONTEXT_ADR7_DATABASE = (String) parentContextMap.get("CONTEXT_ADR7_DATABASE");
            }if (parentContextMap.containsKey("CONTEXT_ADR7_LOGIN")) {
                context.CONTEXT_ADR7_LOGIN = (String) parentContextMap.get("CONTEXT_ADR7_LOGIN");
            }if (parentContextMap.containsKey("CONTEXT_ADR7_PASSWORD")) {
                context.CONTEXT_ADR7_PASSWORD = (java.lang.String) parentContextMap.get("CONTEXT_ADR7_PASSWORD");
            }if (parentContextMap.containsKey("CONTEXT_ADR7_SERVER")) {
                context.CONTEXT_ADR7_SERVER = (String) parentContextMap.get("CONTEXT_ADR7_SERVER");
            }if (parentContextMap.containsKey("ADR4_OK_CHECK")) {
                context.ADR4_OK_CHECK = (String) parentContextMap.get("ADR4_OK_CHECK");
            }if (parentContextMap.containsKey("ADR7_OK_CHECK")) {
                context.ADR7_OK_CHECK = (String) parentContextMap.get("ADR7_OK_CHECK");
            }if (parentContextMap.containsKey("ALLOW_IT777P_INSERT")) {
                context.ALLOW_IT777P_INSERT = (String) parentContextMap.get("ALLOW_IT777P_INSERT");
            }if (parentContextMap.containsKey("ALLOW_ITEM_DESCRIPTION_UPDATE")) {
                context.ALLOW_ITEM_DESCRIPTION_UPDATE = (String) parentContextMap.get("ALLOW_ITEM_DESCRIPTION_UPDATE");
            }if (parentContextMap.containsKey("ALLOW_SHIP_SUB_FLOW")) {
                context.ALLOW_SHIP_SUB_FLOW = (String) parentContextMap.get("ALLOW_SHIP_SUB_FLOW");
            }if (parentContextMap.containsKey("ARTICLE_NUMBER")) {
                context.ARTICLE_NUMBER = (String) parentContextMap.get("ARTICLE_NUMBER");
            }if (parentContextMap.containsKey("Article_Transformation_Error_Codes")) {
                context.Article_Transformation_Error_Codes = (String) parentContextMap.get("Article_Transformation_Error_Codes");
            }if (parentContextMap.containsKey("CONTEXT_ADR7_BRAND_ID_FILE")) {
                context.CONTEXT_ADR7_BRAND_ID_FILE = (String) parentContextMap.get("CONTEXT_ADR7_BRAND_ID_FILE");
            }if (parentContextMap.containsKey("CONTEXT_ADR7_SUB_DEP_FILE")) {
                context.CONTEXT_ADR7_SUB_DEP_FILE = (String) parentContextMap.get("CONTEXT_ADR7_SUB_DEP_FILE");
            }if (parentContextMap.containsKey("CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE")) {
                context.CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE = (String) parentContextMap.get("CONTEXT_AMI_ARD4_ADR7_DB_CONNECTIVITY_FILE");
            }if (parentContextMap.containsKey("CONTEXT_ARTICLE_XREF")) {
                context.CONTEXT_ARTICLE_XREF = (String) parentContextMap.get("CONTEXT_ARTICLE_XREF");
            }if (parentContextMap.containsKey("CONTEXT_BACKFEED_SEQ_NBR")) {
                context.CONTEXT_BACKFEED_SEQ_NBR = (BigDecimal) parentContextMap.get("CONTEXT_BACKFEED_SEQ_NBR");
            }if (parentContextMap.containsKey("CONTEXT_BASIC_IND_UPD_OPSTUDY")) {
                context.CONTEXT_BASIC_IND_UPD_OPSTUDY = (String) parentContextMap.get("CONTEXT_BASIC_IND_UPD_OPSTUDY");
            }if (parentContextMap.containsKey("CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA")) {
                context.CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA = (String) parentContextMap.get("CONTEXT_BUYER_SELLER_CONFIG_FILE_DELTA");
            }if (parentContextMap.containsKey("CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL")) {
                context.CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL = (String) parentContextMap.get("CONTEXT_BUYER_SELLER_CONFIG_FILE_FULL");
            }if (parentContextMap.containsKey("CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG")) {
                context.CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG = (String) parentContextMap.get("CONTEXT_CENTRAL_RFC_DC_HANDLING_ENABLE_FLAG");
            }if (parentContextMap.containsKey("CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT")) {
                context.CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT = (String) parentContextMap.get("CONTEXT_CENTRAL_RFC_DETAILS_PERSISTENT");
            }if (parentContextMap.containsKey("CONTEXT_CHECKPOINT_FILE_NAME")) {
                context.CONTEXT_CHECKPOINT_FILE_NAME = (String) parentContextMap.get("CONTEXT_CHECKPOINT_FILE_NAME");
            }if (parentContextMap.containsKey("CONTEXT_COLOR_CODE")) {
                context.CONTEXT_COLOR_CODE = (String) parentContextMap.get("CONTEXT_COLOR_CODE");
            }if (parentContextMap.containsKey("CONTEXT_CUTOFF_TIME_MIN")) {
                context.CONTEXT_CUTOFF_TIME_MIN = (String) parentContextMap.get("CONTEXT_CUTOFF_TIME_MIN");
            }if (parentContextMap.containsKey("CONTEXT_DC_SERVICING_IND_FILE")) {
                context.CONTEXT_DC_SERVICING_IND_FILE = (String) parentContextMap.get("CONTEXT_DC_SERVICING_IND_FILE");
            }if (parentContextMap.containsKey("CONTEXT_DELETE_VOL_LIMIT")) {
                context.CONTEXT_DELETE_VOL_LIMIT = (Integer) parentContextMap.get("CONTEXT_DELETE_VOL_LIMIT");
            }if (parentContextMap.containsKey("CONTEXT_DELTA_VOL_LIMIT")) {
                context.CONTEXT_DELTA_VOL_LIMIT = (Integer) parentContextMap.get("CONTEXT_DELTA_VOL_LIMIT");
            }if (parentContextMap.containsKey("CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO")) {
                context.CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO = (String) parentContextMap.get("CONTEXT_DELTA_VOL_LIMIT_EMAIL_TO");
            }if (parentContextMap.containsKey("CONTEXT_DELTA_VOL_TARGET")) {
                context.CONTEXT_DELTA_VOL_TARGET = (String) parentContextMap.get("CONTEXT_DELTA_VOL_TARGET");
            }if (parentContextMap.containsKey("CONTEXT_ERR_REPORT")) {
                context.CONTEXT_ERR_REPORT = (String) parentContextMap.get("CONTEXT_ERR_REPORT");
            }if (parentContextMap.containsKey("CONTEXT_ETL_ARCHIVE_FILE_PATH")) {
                context.CONTEXT_ETL_ARCHIVE_FILE_PATH = (String) parentContextMap.get("CONTEXT_ETL_ARCHIVE_FILE_PATH");
            }if (parentContextMap.containsKey("CONTEXT_ETL_BSCONFIG_FILE_EXTENSION")) {
                context.CONTEXT_ETL_BSCONFIG_FILE_EXTENSION = (String) parentContextMap.get("CONTEXT_ETL_BSCONFIG_FILE_EXTENSION");
            }if (parentContextMap.containsKey("CONTEXT_ETL_CSV_FILE_EXTENSION")) {
                context.CONTEXT_ETL_CSV_FILE_EXTENSION = (String) parentContextMap.get("CONTEXT_ETL_CSV_FILE_EXTENSION");
            }if (parentContextMap.containsKey("CONTEXT_ETL_ENCODING")) {
                context.CONTEXT_ETL_ENCODING = (String) parentContextMap.get("CONTEXT_ETL_ENCODING");
            }if (parentContextMap.containsKey("CONTEXT_ETL_EXCEL_FILE_EXTENSION")) {
                context.CONTEXT_ETL_EXCEL_FILE_EXTENSION = (String) parentContextMap.get("CONTEXT_ETL_EXCEL_FILE_EXTENSION");
            }if (parentContextMap.containsKey("CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE")) {
                context.CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE = (String) parentContextMap.get("CONTEXT_ETL_GROUPEMAILID_FAILURE_MESSAGE");
            }if (parentContextMap.containsKey("CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT")) {
                context.CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT = (String) parentContextMap.get("CONTEXT_ETL_GROUPEMAILID_FAILURE_SUBJECT");
            }if (parentContextMap.containsKey("CONTEXT_ETL_GROUPEMAILID_FROM")) {
                context.CONTEXT_ETL_GROUPEMAILID_FROM = (String) parentContextMap.get("CONTEXT_ETL_GROUPEMAILID_FROM");
            }if (parentContextMap.containsKey("CONTEXT_ETL_GROUPEMAILID_SMTP_HOST")) {
                context.CONTEXT_ETL_GROUPEMAILID_SMTP_HOST = (String) parentContextMap.get("CONTEXT_ETL_GROUPEMAILID_SMTP_HOST");
            }if (parentContextMap.containsKey("CONTEXT_ETL_GROUPEMAILID_SMTP_PORT")) {
                context.CONTEXT_ETL_GROUPEMAILID_SMTP_PORT = (String) parentContextMap.get("CONTEXT_ETL_GROUPEMAILID_SMTP_PORT");
            }if (parentContextMap.containsKey("CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE")) {
                context.CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE = (String) parentContextMap.get("CONTEXT_ETL_GROUPEMAILID_SUCCESS_MESSAGE");
            }if (parentContextMap.containsKey("CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT")) {
                context.CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT = (String) parentContextMap.get("CONTEXT_ETL_GROUPEMAILID_SUCCESS_SUBJECT");
            }if (parentContextMap.containsKey("CONTEXT_ETL_GROUPEMAILID_TO")) {
                context.CONTEXT_ETL_GROUPEMAILID_TO = (String) parentContextMap.get("CONTEXT_ETL_GROUPEMAILID_TO");
            }if (parentContextMap.containsKey("CONTEXT_ETL_INPUT_FILE_EXTENSION")) {
                context.CONTEXT_ETL_INPUT_FILE_EXTENSION = (String) parentContextMap.get("CONTEXT_ETL_INPUT_FILE_EXTENSION");
            }if (parentContextMap.containsKey("CONTEXT_ETL_INPUT_ORG_PATH")) {
                context.CONTEXT_ETL_INPUT_ORG_PATH = (String) parentContextMap.get("CONTEXT_ETL_INPUT_ORG_PATH");
            }if (parentContextMap.containsKey("CONTEXT_ETL_INPUT_PATH")) {
                context.CONTEXT_ETL_INPUT_PATH = (String) parentContextMap.get("CONTEXT_ETL_INPUT_PATH");
            }if (parentContextMap.containsKey("CONTEXT_ETL_INTM_FIELD_SEPARATOR")) {
                context.CONTEXT_ETL_INTM_FIELD_SEPARATOR = (String) parentContextMap.get("CONTEXT_ETL_INTM_FIELD_SEPARATOR");
            }if (parentContextMap.containsKey("CONTEXT_ETL_INTM_FILE_ENCODING")) {
                context.CONTEXT_ETL_INTM_FILE_ENCODING = (String) parentContextMap.get("CONTEXT_ETL_INTM_FILE_ENCODING");
            }if (parentContextMap.containsKey("CONTEXT_ETL_INTM_FILE_EXTENSION")) {
                context.CONTEXT_ETL_INTM_FILE_EXTENSION = (String) parentContextMap.get("CONTEXT_ETL_INTM_FILE_EXTENSION");
            }if (parentContextMap.containsKey("CONTEXT_ETL_INTM_FILE_PATH")) {
                context.CONTEXT_ETL_INTM_FILE_PATH = (String) parentContextMap.get("CONTEXT_ETL_INTM_FILE_PATH");
            }if (parentContextMap.containsKey("CONTEXT_ETL_JOB_NAME")) {
                context.CONTEXT_ETL_JOB_NAME = (String) parentContextMap.get("CONTEXT_ETL_JOB_NAME");
            }if (parentContextMap.containsKey("CONTEXT_ETL_LOG_FILE_NAME")) {
                context.CONTEXT_ETL_LOG_FILE_NAME = (String) parentContextMap.get("CONTEXT_ETL_LOG_FILE_NAME");
            }if (parentContextMap.containsKey("CONTEXT_ETL_LOG_FILE_PATH")) {
                context.CONTEXT_ETL_LOG_FILE_PATH = (String) parentContextMap.get("CONTEXT_ETL_LOG_FILE_PATH");
            }if (parentContextMap.containsKey("CONTEXT_ETL_LOG_PATH")) {
                context.CONTEXT_ETL_LOG_PATH = (String) parentContextMap.get("CONTEXT_ETL_LOG_PATH");
            }if (parentContextMap.containsKey("CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR")) {
                context.CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR = (String) parentContextMap.get("CONTEXT_ETL_OUTPUT_FIELD_SEPARATOR");
            }if (parentContextMap.containsKey("CONTEXT_ETL_OUTPUT_FILE_ENCODING")) {
                context.CONTEXT_ETL_OUTPUT_FILE_ENCODING = (String) parentContextMap.get("CONTEXT_ETL_OUTPUT_FILE_ENCODING");
            }if (parentContextMap.containsKey("CONTEXT_ETL_OUTPUT_FILE_EXTENSION")) {
                context.CONTEXT_ETL_OUTPUT_FILE_EXTENSION = (String) parentContextMap.get("CONTEXT_ETL_OUTPUT_FILE_EXTENSION");
            }if (parentContextMap.containsKey("CONTEXT_ETL_OUTPUT_FILE_PATH")) {
                context.CONTEXT_ETL_OUTPUT_FILE_PATH = (String) parentContextMap.get("CONTEXT_ETL_OUTPUT_FILE_PATH");
            }if (parentContextMap.containsKey("CONTEXT_ETL_REJECT_FILE_PATH")) {
                context.CONTEXT_ETL_REJECT_FILE_PATH = (String) parentContextMap.get("CONTEXT_ETL_REJECT_FILE_PATH");
            }if (parentContextMap.containsKey("CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION")) {
                context.CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION = (String) parentContextMap.get("CONTEXT_ETL_SAG_SOURCE_FILE_EXTENSION");
            }if (parentContextMap.containsKey("CONTEXT_ETL_TARGET_FILE_PATH")) {
                context.CONTEXT_ETL_TARGET_FILE_PATH = (String) parentContextMap.get("CONTEXT_ETL_TARGET_FILE_PATH");
            }if (parentContextMap.containsKey("CONTEXT_ETL_TEAM_NAME")) {
                context.CONTEXT_ETL_TEAM_NAME = (String) parentContextMap.get("CONTEXT_ETL_TEAM_NAME");
            }if (parentContextMap.containsKey("CONTEXT_ETL_XREF_JOB_NAME")) {
                context.CONTEXT_ETL_XREF_JOB_NAME = (String) parentContextMap.get("CONTEXT_ETL_XREF_JOB_NAME");
            }if (parentContextMap.containsKey("CONTEXT_EXCEPTION_FLAG")) {
                context.CONTEXT_EXCEPTION_FLAG = (String) parentContextMap.get("CONTEXT_EXCEPTION_FLAG");
            }if (parentContextMap.containsKey("CONTEXT_EXISTING_CASE_GTIN")) {
                context.CONTEXT_EXISTING_CASE_GTIN = (String) parentContextMap.get("CONTEXT_EXISTING_CASE_GTIN");
            }if (parentContextMap.containsKey("CONTEXT_EXISTING_UPC_LIST")) {
                context.CONTEXT_EXISTING_UPC_LIST = (String) parentContextMap.get("CONTEXT_EXISTING_UPC_LIST");
            }if (parentContextMap.containsKey("CONTEXT_FILE_PATH")) {
                context.CONTEXT_FILE_PATH = (String) parentContextMap.get("CONTEXT_FILE_PATH");
            }if (parentContextMap.containsKey("CONTEXT_GA072P_ENABLE_FLAG")) {
                context.CONTEXT_GA072P_ENABLE_FLAG = (String) parentContextMap.get("CONTEXT_GA072P_ENABLE_FLAG");
            }if (parentContextMap.containsKey("CONTEXT_HALLMARK_PERSISTENT_FILE_NAME")) {
                context.CONTEXT_HALLMARK_PERSISTENT_FILE_NAME = (String) parentContextMap.get("CONTEXT_HALLMARK_PERSISTENT_FILE_NAME");
            }if (parentContextMap.containsKey("CONTEXT_IT028P_SOM_ITEMLIST")) {
                context.CONTEXT_IT028P_SOM_ITEMLIST = (String) parentContextMap.get("CONTEXT_IT028P_SOM_ITEMLIST");
            }if (parentContextMap.containsKey("CONTEXT_KEYSTOREPWD")) {
                context.CONTEXT_KEYSTOREPWD = (String) parentContextMap.get("CONTEXT_KEYSTOREPWD");
            }if (parentContextMap.containsKey("CONTEXT_LEGACY_SAP_CNTRY_MAPPING")) {
                context.CONTEXT_LEGACY_SAP_CNTRY_MAPPING = (String) parentContextMap.get("CONTEXT_LEGACY_SAP_CNTRY_MAPPING");
            }if (parentContextMap.containsKey("CONTEXT_LEGAL_UOM_XREF")) {
                context.CONTEXT_LEGAL_UOM_XREF = (String) parentContextMap.get("CONTEXT_LEGAL_UOM_XREF");
            }if (parentContextMap.containsKey("CONTEXT_LISTING_TYPE")) {
                context.CONTEXT_LISTING_TYPE = (String) parentContextMap.get("CONTEXT_LISTING_TYPE");
            }if (parentContextMap.containsKey("CONTEXT_MARA_ADDITIONALSEG")) {
                context.CONTEXT_MARA_ADDITIONALSEG = (String) parentContextMap.get("CONTEXT_MARA_ADDITIONALSEG");
            }if (parentContextMap.containsKey("CONTEXT_MARA_BASIC_EXTENSION")) {
                context.CONTEXT_MARA_BASIC_EXTENSION = (String) parentContextMap.get("CONTEXT_MARA_BASIC_EXTENSION");
            }if (parentContextMap.containsKey("CONTEXT_MARA_BOMMAT")) {
                context.CONTEXT_MARA_BOMMAT = (String) parentContextMap.get("CONTEXT_MARA_BOMMAT");
            }if (parentContextMap.containsKey("CONTEXT_MARA_DR_DESC")) {
                context.CONTEXT_MARA_DR_DESC = (String) parentContextMap.get("CONTEXT_MARA_DR_DESC");
            }if (parentContextMap.containsKey("CONTEXT_MARA_EXTRACTSEG")) {
                context.CONTEXT_MARA_EXTRACTSEG = (String) parentContextMap.get("CONTEXT_MARA_EXTRACTSEG");
            }if (parentContextMap.containsKey("CONTEXT_MARA_GTIN_UPC_REL")) {
                context.CONTEXT_MARA_GTIN_UPC_REL = (String) parentContextMap.get("CONTEXT_MARA_GTIN_UPC_REL");
            }if (parentContextMap.containsKey("CONTEXT_MARA_HIERARCHYNODE")) {
                context.CONTEXT_MARA_HIERARCHYNODE = (String) parentContextMap.get("CONTEXT_MARA_HIERARCHYNODE");
            }if (parentContextMap.containsKey("CONTEXT_MARA_HTSCLASS")) {
                context.CONTEXT_MARA_HTSCLASS = (String) parentContextMap.get("CONTEXT_MARA_HTSCLASS");
            }if (parentContextMap.containsKey("CONTEXT_MARA_LEGACY_ITEM")) {
                context.CONTEXT_MARA_LEGACY_ITEM = (String) parentContextMap.get("CONTEXT_MARA_LEGACY_ITEM");
            }if (parentContextMap.containsKey("CONTEXT_MARA_LEGACY_ITEM_VENDOR")) {
                context.CONTEXT_MARA_LEGACY_ITEM_VENDOR = (String) parentContextMap.get("CONTEXT_MARA_LEGACY_ITEM_VENDOR");
            }if (parentContextMap.containsKey("CONTEXT_MARA_LEGACYSEG")) {
                context.CONTEXT_MARA_LEGACYSEG = (String) parentContextMap.get("CONTEXT_MARA_LEGACYSEG");
            }if (parentContextMap.containsKey("CONTEXT_MARA_LEGALUOM")) {
                context.CONTEXT_MARA_LEGALUOM = (String) parentContextMap.get("CONTEXT_MARA_LEGALUOM");
            }if (parentContextMap.containsKey("CONTEXT_MARA_MAIN_ARTICLE")) {
                context.CONTEXT_MARA_MAIN_ARTICLE = (String) parentContextMap.get("CONTEXT_MARA_MAIN_ARTICLE");
            }if (parentContextMap.containsKey("CONTEXT_MARA_MAMSEG")) {
                context.CONTEXT_MARA_MAMSEG = (String) parentContextMap.get("CONTEXT_MARA_MAMSEG");
            }if (parentContextMap.containsKey("CONTEXT_MARA_MARASEG")) {
                context.CONTEXT_MARA_MARASEG = (String) parentContextMap.get("CONTEXT_MARA_MARASEG");
            }if (parentContextMap.containsKey("CONTEXT_MARA_MARMSEG")) {
                context.CONTEXT_MARA_MARMSEG = (String) parentContextMap.get("CONTEXT_MARA_MARMSEG");
            }if (parentContextMap.containsKey("CONTEXT_MARA_MATDESC")) {
                context.CONTEXT_MARA_MATDESC = (String) parentContextMap.get("CONTEXT_MARA_MATDESC");
            }if (parentContextMap.containsKey("CONTEXT_MARA_MAW_SEG")) {
                context.CONTEXT_MARA_MAW_SEG = (String) parentContextMap.get("CONTEXT_MARA_MAW_SEG");
            }if (parentContextMap.containsKey("CONTEXT_MARA_MAWSEG")) {
                context.CONTEXT_MARA_MAWSEG = (String) parentContextMap.get("CONTEXT_MARA_MAWSEG");
            }if (parentContextMap.containsKey("CONTEXT_MARA_MEANSEG")) {
                context.CONTEXT_MARA_MEANSEG = (String) parentContextMap.get("CONTEXT_MARA_MEANSEG");
            }if (parentContextMap.containsKey("CONTEXT_MARA_MLEASEG")) {
                context.CONTEXT_MARA_MLEASEG = (String) parentContextMap.get("CONTEXT_MARA_MLEASEG");
            }if (parentContextMap.containsKey("CONTEXT_MARA_MVKERT")) {
                context.CONTEXT_MARA_MVKERT = (String) parentContextMap.get("CONTEXT_MARA_MVKERT");
            }if (parentContextMap.containsKey("CONTEXT_MARA_PURSUB")) {
                context.CONTEXT_MARA_PURSUB = (String) parentContextMap.get("CONTEXT_MARA_PURSUB");
            }if (parentContextMap.containsKey("CONTEXT_MARA_SEASONCODE")) {
                context.CONTEXT_MARA_SEASONCODE = (String) parentContextMap.get("CONTEXT_MARA_SEASONCODE");
            }if (parentContextMap.containsKey("CONTEXT_MARA_SHIPSUB")) {
                context.CONTEXT_MARA_SHIPSUB = (String) parentContextMap.get("CONTEXT_MARA_SHIPSUB");
            }if (parentContextMap.containsKey("CONTEXT_MARA_VARIANT_ARTICLE")) {
                context.CONTEXT_MARA_VARIANT_ARTICLE = (String) parentContextMap.get("CONTEXT_MARA_VARIANT_ARTICLE");
            }if (parentContextMap.containsKey("CONTEXT_MARA_WLK2EXTRTSEG")) {
                context.CONTEXT_MARA_WLK2EXTRTSEG = (String) parentContextMap.get("CONTEXT_MARA_WLK2EXTRTSEG");
            }if (parentContextMap.containsKey("CONTEXT_MARA_WLK2SEG")) {
                context.CONTEXT_MARA_WLK2SEG = (String) parentContextMap.get("CONTEXT_MARA_WLK2SEG");
            }if (parentContextMap.containsKey("CONTEXT_MDM_KEYSTORE")) {
                context.CONTEXT_MDM_KEYSTORE = (String) parentContextMap.get("CONTEXT_MDM_KEYSTORE");
            }if (parentContextMap.containsKey("CONTEXT_MDM_TRUSTSTORE")) {
                context.CONTEXT_MDM_TRUSTSTORE = (String) parentContextMap.get("CONTEXT_MDM_TRUSTSTORE");
            }if (parentContextMap.containsKey("CONTEXT_MISSING_UPC_EMAIL_TO")) {
                context.CONTEXT_MISSING_UPC_EMAIL_TO = (String) parentContextMap.get("CONTEXT_MISSING_UPC_EMAIL_TO");
            }if (parentContextMap.containsKey("CONTEXT_MISSING_UPC_REPLY_TO")) {
                context.CONTEXT_MISSING_UPC_REPLY_TO = (String) parentContextMap.get("CONTEXT_MISSING_UPC_REPLY_TO");
            }if (parentContextMap.containsKey("CONTEXT_MYLAR_MERCH_OPSTUDY")) {
                context.CONTEXT_MYLAR_MERCH_OPSTUDY = (String) parentContextMap.get("CONTEXT_MYLAR_MERCH_OPSTUDY");
            }if (parentContextMap.containsKey("CONTEXT_NEW_UOM_WIC_REQ_FLAG")) {
                context.CONTEXT_NEW_UOM_WIC_REQ_FLAG = (String) parentContextMap.get("CONTEXT_NEW_UOM_WIC_REQ_FLAG");
            }if (parentContextMap.containsKey("CONTEXT_OB_CLR_PERSISTENT_FILE")) {
                context.CONTEXT_OB_CLR_PERSISTENT_FILE = (String) parentContextMap.get("CONTEXT_OB_CLR_PERSISTENT_FILE");
            }if (parentContextMap.containsKey("CONTEXT_OB_CLR_XREF")) {
                context.CONTEXT_OB_CLR_XREF = (String) parentContextMap.get("CONTEXT_OB_CLR_XREF");
            }if (parentContextMap.containsKey("CONTEXT_ORMD_IND")) {
                context.CONTEXT_ORMD_IND = (String) parentContextMap.get("CONTEXT_ORMD_IND");
            }if (parentContextMap.containsKey("CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT")) {
                context.CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT = (String) parentContextMap.get("CONTEXT_PACKAGING_ATTRIBUTE_PERSISTENT");
            }if (parentContextMap.containsKey("CONTEXT_PARKING_EXCEPT_LIST")) {
                context.CONTEXT_PARKING_EXCEPT_LIST = (String) parentContextMap.get("CONTEXT_PARKING_EXCEPT_LIST");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_ADR4_MD039P")) {
                context.CONTEXT_PIR_PARKED_ADR4_MD039P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_ADR4_MD039P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT002P")) {
                context.CONTEXT_PIR_PARKED_IT002P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT002P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT007P")) {
                context.CONTEXT_PIR_PARKED_IT007P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT007P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT008P")) {
                context.CONTEXT_PIR_PARKED_IT008P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT008P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT011P")) {
                context.CONTEXT_PIR_PARKED_IT011P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT011P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT015P")) {
                context.CONTEXT_PIR_PARKED_IT015P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT015P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT029P")) {
                context.CONTEXT_PIR_PARKED_IT029P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT029P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT088P")) {
                context.CONTEXT_PIR_PARKED_IT088P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT088P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT107P")) {
                context.CONTEXT_PIR_PARKED_IT107P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT107P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT108P")) {
                context.CONTEXT_PIR_PARKED_IT108P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT108P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT185P")) {
                context.CONTEXT_PIR_PARKED_IT185P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT185P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT186P")) {
                context.CONTEXT_PIR_PARKED_IT186P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT186P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT282P")) {
                context.CONTEXT_PIR_PARKED_IT282P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT282P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT402P")) {
                context.CONTEXT_PIR_PARKED_IT402P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT402P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT517P")) {
                context.CONTEXT_PIR_PARKED_IT517P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT517P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT839P")) {
                context.CONTEXT_PIR_PARKED_IT839P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT839P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_IT981P")) {
                context.CONTEXT_PIR_PARKED_IT981P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_IT981P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_MD039P")) {
                context.CONTEXT_PIR_PARKED_MD039P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_MD039P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_MD041P")) {
                context.CONTEXT_PIR_PARKED_MD041P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_MD041P");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_MD041P_ADR4")) {
                context.CONTEXT_PIR_PARKED_MD041P_ADR4 = (String) parentContextMap.get("CONTEXT_PIR_PARKED_MD041P_ADR4");
            }if (parentContextMap.containsKey("CONTEXT_PIR_PARKED_MD639P")) {
                context.CONTEXT_PIR_PARKED_MD639P = (String) parentContextMap.get("CONTEXT_PIR_PARKED_MD639P");
            }if (parentContextMap.containsKey("CONTEXT_PLN_MERGE")) {
                context.CONTEXT_PLN_MERGE = (String) parentContextMap.get("CONTEXT_PLN_MERGE");
            }if (parentContextMap.containsKey("CONTEXT_PLN_SM_TRACKING_FILE")) {
                context.CONTEXT_PLN_SM_TRACKING_FILE = (String) parentContextMap.get("CONTEXT_PLN_SM_TRACKING_FILE");
            }if (parentContextMap.containsKey("CONTEXT_PLN_SPLIT")) {
                context.CONTEXT_PLN_SPLIT = (String) parentContextMap.get("CONTEXT_PLN_SPLIT");
            }if (parentContextMap.containsKey("CONTEXT_QUICKWIC_ARTICLE_STATUS")) {
                context.CONTEXT_QUICKWIC_ARTICLE_STATUS = (String) parentContextMap.get("CONTEXT_QUICKWIC_ARTICLE_STATUS");
            }if (parentContextMap.containsKey("CONTEXT_RACK_MYLAR")) {
                context.CONTEXT_RACK_MYLAR = (String) parentContextMap.get("CONTEXT_RACK_MYLAR");
            }if (parentContextMap.containsKey("CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG")) {
                context.CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG = (String) parentContextMap.get("CONTEXT_RACK_MYLAR_SIGN_TYPE_FLAG");
            }if (parentContextMap.containsKey("CONTEXT_RT_CONTROL_FOLDER")) {
                context.CONTEXT_RT_CONTROL_FOLDER = (String) parentContextMap.get("CONTEXT_RT_CONTROL_FOLDER");
            }if (parentContextMap.containsKey("CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH")) {
                context.CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH = (String) parentContextMap.get("CONTEXT_RT_R4B_ADR4_PARKED_PIR_FILEPATH");
            }if (parentContextMap.containsKey("CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH")) {
                context.CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH = (String) parentContextMap.get("CONTEXT_RT_R4B_ADR4_PARKING_FILEPATH");
            }if (parentContextMap.containsKey("CONTEXT_RT_R4B_PARKED_PIR_FILEPATH")) {
                context.CONTEXT_RT_R4B_PARKED_PIR_FILEPATH = (String) parentContextMap.get("CONTEXT_RT_R4B_PARKED_PIR_FILEPATH");
            }if (parentContextMap.containsKey("CONTEXT_RT_R4B_PARKED_XREF_FILEPATH")) {
                context.CONTEXT_RT_R4B_PARKED_XREF_FILEPATH = (String) parentContextMap.get("CONTEXT_RT_R4B_PARKED_XREF_FILEPATH");
            }if (parentContextMap.containsKey("CONTEXT_RT_RNWL_HOME")) {
                context.CONTEXT_RT_RNWL_HOME = (String) parentContextMap.get("CONTEXT_RT_RNWL_HOME");
            }if (parentContextMap.containsKey("CONTEXT_RT_SOURCE")) {
                context.CONTEXT_RT_SOURCE = (String) parentContextMap.get("CONTEXT_RT_SOURCE");
            }if (parentContextMap.containsKey("CONTEXT_RT_TRACK")) {
                context.CONTEXT_RT_TRACK = (String) parentContextMap.get("CONTEXT_RT_TRACK");
            }if (parentContextMap.containsKey("CONTEXT_RT_TRACK_DYNAMIC")) {
                context.CONTEXT_RT_TRACK_DYNAMIC = (String) parentContextMap.get("CONTEXT_RT_TRACK_DYNAMIC");
            }if (parentContextMap.containsKey("CONTEXT_RT_TRACK_LOAD")) {
                context.CONTEXT_RT_TRACK_LOAD = (String) parentContextMap.get("CONTEXT_RT_TRACK_LOAD");
            }if (parentContextMap.containsKey("CONTEXT_RT_TRACK_SAG")) {
                context.CONTEXT_RT_TRACK_SAG = (String) parentContextMap.get("CONTEXT_RT_TRACK_SAG");
            }if (parentContextMap.containsKey("CONTEXT_RT_TRACK_STATIC")) {
                context.CONTEXT_RT_TRACK_STATIC = (String) parentContextMap.get("CONTEXT_RT_TRACK_STATIC");
            }if (parentContextMap.containsKey("CONTEXT_RT_TRACK_XREF")) {
                context.CONTEXT_RT_TRACK_XREF = (String) parentContextMap.get("CONTEXT_RT_TRACK_XREF");
            }if (parentContextMap.containsKey("CONTEXT_RT_TRACK_XREF_UPDATE")) {
                context.CONTEXT_RT_TRACK_XREF_UPDATE = (String) parentContextMap.get("CONTEXT_RT_TRACK_XREF_UPDATE");
            }if (parentContextMap.containsKey("CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE")) {
                context.CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE = (String) parentContextMap.get("CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE");
            }if (parentContextMap.containsKey("CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM")) {
                context.CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM = (String) parentContextMap.get("CONTEXT_SAG_ARTICLE_JMS_CONN_CONTEXT_PROVIDE_LTM");
            }if (parentContextMap.containsKey("CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME")) {
                context.CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME = (String) parentContextMap.get("CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME");
            }if (parentContextMap.containsKey("CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM")) {
                context.CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM = (String) parentContextMap.get("CONTEXT_SAG_ARTICLE_JMS_CONN_JNDI_NAME_LTM");
            }if (parentContextMap.containsKey("CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM")) {
                context.CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM = (String) parentContextMap.get("CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM");
            }if (parentContextMap.containsKey("CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM")) {
                context.CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM = (String) parentContextMap.get("CONTEXT_SAG_ARTICLE_JMS_CONN_MSG_FROM_LTM");
            }if (parentContextMap.containsKey("CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM")) {
                context.CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM = (String) parentContextMap.get("CONTEXT_SAG_ARTICLE_JMS_CONN_SERVER_URL_LTM");
            }if (parentContextMap.containsKey("CONTEXT_SAG_EXTRACT_JOB_NAME")) {
                context.CONTEXT_SAG_EXTRACT_JOB_NAME = (String) parentContextMap.get("CONTEXT_SAG_EXTRACT_JOB_NAME");
            }if (parentContextMap.containsKey("CONTEXT_SAG_EXTRACT_LOG_FILE_NAME")) {
                context.CONTEXT_SAG_EXTRACT_LOG_FILE_NAME = (String) parentContextMap.get("CONTEXT_SAG_EXTRACT_LOG_FILE_NAME");
            }if (parentContextMap.containsKey("CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL")) {
                context.CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL = (String) parentContextMap.get("CONTEXT_SAG_JARTICLE_MS_CONN_SERVER_URL");
            }if (parentContextMap.containsKey("CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE")) {
                context.CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE = (String) parentContextMap.get("CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE");
            }if (parentContextMap.containsKey("CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD")) {
                context.CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD = (String) parentContextMap.get("CONTEXT_SAP_ARTICLE_XREF_DELETE_FILE_UPD");
            }if (parentContextMap.containsKey("CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT")) {
                context.CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT = (String) parentContextMap.get("CONTEXT_SAP_BACKFEED_ARTICLE_LIST_PERSISTENT");
            }if (parentContextMap.containsKey("CONTEXT_SAP_LEGACY_UOM_XREF")) {
                context.CONTEXT_SAP_LEGACY_UOM_XREF = (String) parentContextMap.get("CONTEXT_SAP_LEGACY_UOM_XREF");
            }if (parentContextMap.containsKey("CONTEXT_SAP_XREF_FOLDER_NAME")) {
                context.CONTEXT_SAP_XREF_FOLDER_NAME = (String) parentContextMap.get("CONTEXT_SAP_XREF_FOLDER_NAME");
            }if (parentContextMap.containsKey("CONTEXT_SEASON_CODE_EXCEPTION_TO")) {
                context.CONTEXT_SEASON_CODE_EXCEPTION_TO = (String) parentContextMap.get("CONTEXT_SEASON_CODE_EXCEPTION_TO");
            }if (parentContextMap.containsKey("CONTEXT_SEASON_DEFAULT_VALUE")) {
                context.CONTEXT_SEASON_DEFAULT_VALUE = (String) parentContextMap.get("CONTEXT_SEASON_DEFAULT_VALUE");
            }if (parentContextMap.containsKey("CONTEXT_SEASONCODE_EXCEL")) {
                context.CONTEXT_SEASONCODE_EXCEL = (String) parentContextMap.get("CONTEXT_SEASONCODE_EXCEL");
            }if (parentContextMap.containsKey("CONTEXT_SIGNAL_FILE_PATH")) {
                context.CONTEXT_SIGNAL_FILE_PATH = (String) parentContextMap.get("CONTEXT_SIGNAL_FILE_PATH");
            }if (parentContextMap.containsKey("CONTEXT_SITE_XREF")) {
                context.CONTEXT_SITE_XREF = (String) parentContextMap.get("CONTEXT_SITE_XREF");
            }if (parentContextMap.containsKey("CONTEXT_SOURCE_ARTICLE_FOLDER_NAME")) {
                context.CONTEXT_SOURCE_ARTICLE_FOLDER_NAME = (String) parentContextMap.get("CONTEXT_SOURCE_ARTICLE_FOLDER_NAME");
            }if (parentContextMap.containsKey("CONTEXT_STIBO_CF_PERSISTENT_FILE")) {
                context.CONTEXT_STIBO_CF_PERSISTENT_FILE = (String) parentContextMap.get("CONTEXT_STIBO_CF_PERSISTENT_FILE");
            }if (parentContextMap.containsKey("CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE")) {
                context.CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE = (String) parentContextMap.get("CONTEXT_STIBO_EXTENDED_PERSISTENT_FILE");
            }if (parentContextMap.containsKey("CONTEXT_STIBO_PERSISTENT_FILE")) {
                context.CONTEXT_STIBO_PERSISTENT_FILE = (String) parentContextMap.get("CONTEXT_STIBO_PERSISTENT_FILE");
            }if (parentContextMap.containsKey("CONTEXT_STIBO_SOM_PERSISTENT_FILE")) {
                context.CONTEXT_STIBO_SOM_PERSISTENT_FILE = (String) parentContextMap.get("CONTEXT_STIBO_SOM_PERSISTENT_FILE");
            }if (parentContextMap.containsKey("CONTEXT_TALEND_ARTICLE_XREF")) {
                context.CONTEXT_TALEND_ARTICLE_XREF = (String) parentContextMap.get("CONTEXT_TALEND_ARTICLE_XREF");
            }if (parentContextMap.containsKey("CONTEXT_TALEND_VENDOR_XREF")) {
                context.CONTEXT_TALEND_VENDOR_XREF = (String) parentContextMap.get("CONTEXT_TALEND_VENDOR_XREF");
            }if (parentContextMap.containsKey("CONTEXT_TEMP_CONTROL")) {
                context.CONTEXT_TEMP_CONTROL = (String) parentContextMap.get("CONTEXT_TEMP_CONTROL");
            }if (parentContextMap.containsKey("CONTEXT_TEMP_MERCH_OPSTUDY")) {
                context.CONTEXT_TEMP_MERCH_OPSTUDY = (String) parentContextMap.get("CONTEXT_TEMP_MERCH_OPSTUDY");
            }if (parentContextMap.containsKey("CONTEXT_TRUSTSTOREPWD")) {
                context.CONTEXT_TRUSTSTOREPWD = (String) parentContextMap.get("CONTEXT_TRUSTSTOREPWD");
            }if (parentContextMap.containsKey("CONTEXT_UPC_DELETE_FLAG")) {
                context.CONTEXT_UPC_DELETE_FLAG = (String) parentContextMap.get("CONTEXT_UPC_DELETE_FLAG");
            }if (parentContextMap.containsKey("CONTEXT_VALID_ARTTYPE_STIBOCHECK")) {
                context.CONTEXT_VALID_ARTTYPE_STIBOCHECK = (String) parentContextMap.get("CONTEXT_VALID_ARTTYPE_STIBOCHECK");
            }if (parentContextMap.containsKey("CONTEXT_VALID_ITEMS_LOAD_ADR4")) {
                context.CONTEXT_VALID_ITEMS_LOAD_ADR4 = (String) parentContextMap.get("CONTEXT_VALID_ITEMS_LOAD_ADR4");
            }if (parentContextMap.containsKey("CONTEXT_VALID_ITEMS_LOAD_ADR7")) {
                context.CONTEXT_VALID_ITEMS_LOAD_ADR7 = (String) parentContextMap.get("CONTEXT_VALID_ITEMS_LOAD_ADR7");
            }if (parentContextMap.containsKey("CONTEXT_VALIDATION_REP_FROM")) {
                context.CONTEXT_VALIDATION_REP_FROM = (String) parentContextMap.get("CONTEXT_VALIDATION_REP_FROM");
            }if (parentContextMap.containsKey("CONTEXT_VALIDATION_REP_TO")) {
                context.CONTEXT_VALIDATION_REP_TO = (String) parentContextMap.get("CONTEXT_VALIDATION_REP_TO");
            }if (parentContextMap.containsKey("CONTEXT_VALIDATION_REPORTNAME")) {
                context.CONTEXT_VALIDATION_REPORTNAME = (String) parentContextMap.get("CONTEXT_VALIDATION_REPORTNAME");
            }if (parentContextMap.containsKey("CONTEXT_VENDOR_VOG")) {
                context.CONTEXT_VENDOR_VOG = (String) parentContextMap.get("CONTEXT_VENDOR_VOG");
            }if (parentContextMap.containsKey("CONTEXT_VENDOR_XREF")) {
                context.CONTEXT_VENDOR_XREF = (String) parentContextMap.get("CONTEXT_VENDOR_XREF");
            }if (parentContextMap.containsKey("CURR_DT")) {
                context.CURR_DT = (BigDecimal) parentContextMap.get("CURR_DT");
            }if (parentContextMap.containsKey("JMS_ARTICLE_QUEUE_INPUT_FILE_NAME")) {
                context.JMS_ARTICLE_QUEUE_INPUT_FILE_NAME = (String) parentContextMap.get("JMS_ARTICLE_QUEUE_INPUT_FILE_NAME");
            }if (parentContextMap.containsKey("JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM")) {
                context.JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM = (String) parentContextMap.get("JMS_ARTICLE_QUEUE_INPUT_FILE_NAME_LTM");
            }if (parentContextMap.containsKey("JMS_ARTICLE_QUEUE_MESSAGE_COUNT")) {
                context.JMS_ARTICLE_QUEUE_MESSAGE_COUNT = (String) parentContextMap.get("JMS_ARTICLE_QUEUE_MESSAGE_COUNT");
            }if (parentContextMap.containsKey("NewWIC")) {
                context.NewWIC = (String) parentContextMap.get("NewWIC");
            }if (parentContextMap.containsKey("OB_CLR_XREF_TARGET")) {
                context.OB_CLR_XREF_TARGET = (String) parentContextMap.get("OB_CLR_XREF_TARGET");
            }if (parentContextMap.containsKey("PROCESS_CATEGORY")) {
                context.PROCESS_CATEGORY = (String) parentContextMap.get("PROCESS_CATEGORY");
            }if (parentContextMap.containsKey("PROCESSED_FLAG")) {
                context.PROCESSED_FLAG = (String) parentContextMap.get("PROCESSED_FLAG");
            }if (parentContextMap.containsKey("PROGRAM_LIB_NAME")) {
                context.PROGRAM_LIB_NAME = (String) parentContextMap.get("PROGRAM_LIB_NAME");
            }if (parentContextMap.containsKey("RUN_DAY")) {
                context.RUN_DAY = (String) parentContextMap.get("RUN_DAY");
            }if (parentContextMap.containsKey("SAF_OVERRIDE_FILE")) {
                context.SAF_OVERRIDE_FILE = (String) parentContextMap.get("SAF_OVERRIDE_FILE");
            }if (parentContextMap.containsKey("SHIP_SUB_OPSTUDY")) {
                context.SHIP_SUB_OPSTUDY = (String) parentContextMap.get("SHIP_SUB_OPSTUDY");
            }if (parentContextMap.containsKey("UOM")) {
                context.UOM = (String) parentContextMap.get("UOM");
            }if (parentContextMap.containsKey("UPC")) {
                context.UPC = (String) parentContextMap.get("UPC");
            }if (parentContextMap.containsKey("UPC_LENGTH_DIGIT")) {
                context.UPC_LENGTH_DIGIT = (Integer) parentContextMap.get("UPC_LENGTH_DIGIT");
            }if (parentContextMap.containsKey("USER_STAMP")) {
                context.USER_STAMP = (String) parentContextMap.get("USER_STAMP");
            }if (parentContextMap.containsKey("WICRequiredFlag")) {
                context.WICRequiredFlag = (String) parentContextMap.get("WICRequiredFlag");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("CONTEXT_ADR7_PASSWORD");
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();

try {
errorCode = null;Implicit_Context_RegexProcess(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_Implicit_Context_Regex) {
globalMap.put("Implicit_Context_Regex_SUBPROCESS_STATE", -1);

e_Implicit_Context_Regex.printStackTrace();

}

this.globalResumeTicket = true;//to run tPreJob

try {
errorCode = null;tPrejob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_1) {
globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

e_tPrejob_1.printStackTrace();

}



		if(enableLogStash) {
	        talendJobLog.addJobStartMessage();
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }

this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tFileInputDelimited_2Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tFileInputDelimited_2) {
globalMap.put("tFileInputDelimited_2_SUBPROCESS_STATE", -1);

e_tFileInputDelimited_2.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_1) {
globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

e_tPostjob_1.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : IT005p_table_update_job");
        }
		if(enableLogStash) {
	        talendJobLog.addJobEndMessage(startTime, end, status);
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;


    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tDBConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tDBConnection_1", globalMap.get("conn_tDBConnection_1"));






        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--audit.enabled") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     780441 characters generated by Talend Big Data Platform 
 *     on the April 10, 2025 4:06:35 PM IST
 ************************************************************************************************/