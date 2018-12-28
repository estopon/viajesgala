
package com.viajesgala.wpjson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TermsV2 {

    private CategoryV2 category = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public CategoryV2 getCategory() {
		return category;
	}

	public void setCategory(CategoryV2 category) {
		this.category = category;
	}

	public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
