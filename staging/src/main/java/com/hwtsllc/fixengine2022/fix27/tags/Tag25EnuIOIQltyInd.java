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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum25IOIQltyInd;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  25
 *  IOIQltyInd
 *  char
 *  <p></p>
 *  Relative quality of indication
 *  <p></p>
 *  Valid values:
 *  <p>    H - High
 *  <p>    L - Low
 *  <p>    M - Medium
 */
public class Tag25EnuIOIQltyInd extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum25IOIQltyInd dataValue;

    public final static Enum25IOIQltyInd TESTA_ENU_IOI_QLTY_IND
            = Enum25IOIQltyInd.LOW;
    public final static Enum25IOIQltyInd TESTB_ENU_IOI_QLTY_IND
            = Enum25IOIQltyInd.HIGH;

    public Tag25EnuIOIQltyInd(Enum25IOIQltyInd dataValue) {
        setFixType(FIX27.FIX25_ENU_IOI_QLTY_IND);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toEnumNameString();
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
        System.out.println( new Tag25EnuIOIQltyInd(TESTA_ENU_IOI_QLTY_IND).toVerboseString() );
        System.out.println( new Tag25EnuIOIQltyInd(TESTB_ENU_IOI_QLTY_IND).toVerboseString() );

        // loop around the ENUM and display
        for (Enum25IOIQltyInd oneEnum : Enum25IOIQltyInd.values()) {
            System.out.println( new Tag25EnuIOIQltyInd(oneEnum).toVerboseString() );
        }
    }
}
