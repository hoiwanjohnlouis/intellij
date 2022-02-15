package com.hwtechservicesllc.staging2022.fields;

import com.hwtechservicesllc.staging2022.datatypes.FIXTag;
//import com.hwtechservicesllc.staging2022.datatypes.FieldType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag1Account {

    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final FIXTag fixTag = FIXTag.ACCOUNT;
    private final String tag1AccountValue;

    public Tag1Account(final String tag1AccountValue) {
        this.tag1AccountValue = tag1AccountValue;
    }

    public String getTag1AccountValue() {
        return tag1AccountValue;
    }
    public String getTag1AccountDescription() {
        return fixTag.getFIXTagDescription();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
            .append(":[")
            .append(getTag1AccountValue())
            .append("]");
        return sb.toString();
    }

}
