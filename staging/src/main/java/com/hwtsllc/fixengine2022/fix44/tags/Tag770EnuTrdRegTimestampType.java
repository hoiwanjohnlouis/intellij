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
import com.hwtsllc.fixengine2022.fix44.enums.Enum770TrdRegTimestampType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  770
 *  TrdRegTimestampType
 *  Traded / Regulatory timestamp type.
 *  Note of Applicability:
 *      values are required in US futures markets by the CFTC to
 *      support computerized trade reconstruction.
 *      (see Volume : "Glossary" for value definitions)
 *  Valid values:
 *      1 - Execution Time
 *      2 - Time In
 *      3 - Time Out
 *      4 - Broker Receipt
 *      5 - Broker Execution
 *      6 - Desk Receipt
 */
public class Tag770EnuTrdRegTimestampType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum770TrdRegTimestampType dataValue;

    public final static Enum770TrdRegTimestampType TESTA_ENU_TRD_REG_TIMESTAMP_TYPE
            = Enum770TrdRegTimestampType.TIME_IN;
    public final static Enum770TrdRegTimestampType TESTB_ENU_TRD_REG_TIMESTAMP_TYPE
            = Enum770TrdRegTimestampType.BROKER_RECEIPT;

    public Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType dataValue) {
        setFixType(FIX44.FIX770_ENU_TRD_REG_TIMESTAMP_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
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
        Tag770EnuTrdRegTimestampType tagData;

        tagData = new Tag770EnuTrdRegTimestampType(TESTA_ENU_TRD_REG_TIMESTAMP_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag770EnuTrdRegTimestampType(TESTB_ENU_TRD_REG_TIMESTAMP_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
