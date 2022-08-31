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
import com.hwtsllc.fixengine2022.fix44.enums.Enum709PosTransType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  709
 *  PosTransType
 *  int
 *  <p></p>
 *  Identifies the type of position transaction
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Exercise
 *  <p>    2 - Do Not Exercise
 *  <p>    3 - Position Adjustment
 *  <p>    4 - Position Change Submission or Margin Disposition
 *  <p>    5 - Pledge
 *  <p></p>
 *  <p>    6 - Large Trader Submission
 */
public class Tag709EnuPosTransType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum709PosTransType dataValue;

    public final static Enum709PosTransType TESTA_ENU_POS_TRANS_TYPE
            = Enum709PosTransType.DO_NOT_EXERCISE;
    public final static Enum709PosTransType TESTB_ENU_POS_TRANS_TYPE
            = Enum709PosTransType.MARGIN_DISPOSITION;

    public Tag709EnuPosTransType(Enum709PosTransType dataValue) {
        setFixType(FIX44.FIX709_ENU_POS_TRANS_TYPE);
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
        Tag709EnuPosTransType tagData;

        tagData = new Tag709EnuPosTransType(TESTA_ENU_POS_TRANS_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag709EnuPosTransType(TESTB_ENU_POS_TRANS_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum709PosTransType oneEnum : Enum709PosTransType.values()) {
            System.out.println( new Tag709EnuPosTransType(oneEnum).toVerboseString() );
        }
    }
}
