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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.enums.fix42.Enum401SideValueInd;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  401
 *  SideValueInd
 *  int
 *  <p>
 *  Code to identify which "SideValue" the value refers to.
 *  <p>
 *  SideValue1 and SideValue2 are used as opposed to Buy or Sell
 *  so that the basket can be quoted either way as Buy or Sell.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Side Value 1
 *  <p>    2 - Side Value 2
 */
public class Tag401EnuSideValueInd extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum401SideValueInd dataValue;

    public final static Enum401SideValueInd TESTA_ENU_SIDE_VALUE_IND
            = Enum401SideValueInd.SIDE_VALUE_1;
    public final static Enum401SideValueInd TESTB_ENU_SIDE_VALUE_IND
            = Enum401SideValueInd.SIDE_VALUE_2;

    public Tag401EnuSideValueInd(Enum401SideValueInd dataValue) {
        setFixType(FIX42.FIX401_ENU_SIDE_VALUE_IND);
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
        return dataValue.toFIXDescriptionString();
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
        Tag401EnuSideValueInd tagData;

        tagData = new Tag401EnuSideValueInd(TESTA_ENU_SIDE_VALUE_IND);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag401EnuSideValueInd(TESTB_ENU_SIDE_VALUE_IND);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum401SideValueInd oneEnum : Enum401SideValueInd.values()) {
            System.out.println( new Tag401EnuSideValueInd(oneEnum).toVerboseString() );
        }
    }
}
