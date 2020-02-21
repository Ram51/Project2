package com.cuberootz.vms.dataAccess.util;

import java.util.EnumMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cuberootz.vms.dataAccess.entity.VmsProperties;
import com.cuberootz.vms.dataAccess.repo.VmsPropertyRepository;
@Component
public class VmsGlobalProperties {

	@Autowired
	private VmsPropertyRepository propertyRepo;

	private static EnumMap<propertyEnum, String> propertyMap = new EnumMap<propertyEnum, String>(propertyEnum.class);

	public static enum propertyEnum {
		DEVICE_INSTRUCTION_URL("DEVICE_INSTRUCTION_URL"),
		BUILD_TIME("BUILD_TIME"),
		DOCUMENT_REPOSITORY_PATH("DOCUMENT_REPOSITORY_PATH"),
		GH_Rain_Sensor("GH_Rain_Sensor"),
		GH_Relative_Humidity("GH_Relative_Humidity"),
		GH_CO2("GH_CO2"),
		GH_Luminescence("GH_Luminescence"),
		GH_Temperature("GH_Temperature"),
		INSTRUCTION_SCHEDULER_STATUS("INSTRUCTION_SCHEDULER_STATUS"),
		INSTRUCTION_USER_ID("INSTRUCTION_USER_ID"),
		INSTRUCTION_PASSWORD("INSTRUCTION_PASSWORD"),
		INSTRUCTION_CUSTOMER_CODE("INSTRUCTION_CUSTOMER_CODE"),
		INSTRUCTION_DELAY("INSTRUCTION_DELAY"),
		INSTRUCTION_TIME_FORMAT("INSTRUCTION_TIME_FORMAT"),
		PAGE_SIZE("PAGE_SIZE");
		

		private final String value;

		propertyEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	@com.cuberootz.vms.dataAccess.util.PostConstruct
	public void init() {
		loadProperties();
	}

	public static EnumMap<propertyEnum, String> getPropertyMap() {
		return propertyMap;
	}

	public VmsGlobalProperties() {
		
	}

	public void loadProperties() {
		List<VmsProperties> properties = propertyRepo.findAll();
		for (VmsProperties property : properties) {
			String key = property.getKey();
			propertyMap.put(propertyEnum.valueOf(key), property.getValue());
		}
	}
}
