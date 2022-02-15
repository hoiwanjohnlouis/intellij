package com.hwtechservicesllc.staging2022.fields;

import com.hwtechservicesllc.staging2022.datatypes.FIXTag;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag2AdvID {
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final FIXTag fixTag = FIXTag.ADV_ID;
    private final String tag2AdvIDValue;

    public Tag2AdvID(final String tag2AdvIDValue) {
        this.tag2AdvIDValue = tag2AdvIDValue;
    }

    public String getTag2AdvIDValue() {
        return tag2AdvIDValue;
    }
    public String getTag2AdvIDDescription() {
        return fixTag.getFIXTagDescription();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append(":[")
                .append(getTag2AdvIDDescription())
                .append("]");
        return sb.toString();
    }

}
