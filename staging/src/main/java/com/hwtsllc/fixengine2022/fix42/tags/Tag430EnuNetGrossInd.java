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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum430NetGrossInd;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  430
 *  NetGrossInd
 *  int
 *  <p>
 *  Code to represent whether value is net (inclusive of tax) or gross.
 *  <p></p>
 *  Valid values:
 *  <p>    1-2 msg types
 *  <p>    1 - Net
 *  <p>    2 - Gross
 */
public class Tag430EnuNetGrossInd extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum430NetGrossInd dataValue;

    public final static Enum430NetGrossInd TESTA_ENU_NET_GROSS_IND
            = Enum430NetGrossInd.GROSS;
    public final static Enum430NetGrossInd TESTB_ENU_NET_GROSS_IND
            = Enum430NetGrossInd.NET;

    public Tag430EnuNetGrossInd(Enum430NetGrossInd dataValue) {
        setFixType(FIX42.FIX430_ENU_NET_GROSS_IND);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toEnumDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag430EnuNetGrossInd tagData;

        tagData = new Tag430EnuNetGrossInd(TESTA_ENU_NET_GROSS_IND);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag430EnuNetGrossInd(TESTB_ENU_NET_GROSS_IND);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum430NetGrossInd oneEnum : Enum430NetGrossInd.values()) {
            System.out.println( new Tag430EnuNetGrossInd(oneEnum).toVerboseString() );
        }
    }
}
