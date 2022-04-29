/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum723PosMaintResult;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 * 723
 * PosMaintResult
 * Result of Position Maintenance Request.
 * 4000+ Reserved and available for bi-laterally agreed upon user-defined values
 * Valid values:
 * 0 - Successful Completion - no warnings or errors
 * 1 - Rejected
 * 99 - Other
 * <p>
 * or any value conforming to the data type Reserved100Plus
 */
public class Tag723EnuPosMaintResult extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum723PosMaintResult dataValue;

    public final static Enum723PosMaintResult TESTA_ENU_POS_MAINT_RESULT
            = Enum723PosMaintResult.OTHER;
    public final static Enum723PosMaintResult TESTB_ENU_POS_MAINT_STATUS
            = Enum723PosMaintResult.SUCCESSFUL;

    public Tag723EnuPosMaintResult(Enum723PosMaintResult dataValue) {
        setFixType(FIX44.FIX723_ENU_POS_MAINT_RESULT);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag723EnuPosMaintResult tagData;

        tagData = new Tag723EnuPosMaintResult(TESTA_ENU_POS_MAINT_RESULT);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag723EnuPosMaintResult(TESTB_ENU_POS_MAINT_STATUS);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}