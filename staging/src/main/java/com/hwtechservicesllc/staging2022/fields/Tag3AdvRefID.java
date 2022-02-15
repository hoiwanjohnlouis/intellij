package com.hwtechservicesllc.staging2022.fields;

import com.hwtechservicesllc.staging2022.datatypes.FIXTag;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag3AdvRefID {
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final FIXTag fixTag = FIXTag.ADV_REF_ID;
}
