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
import com.hwtsllc.fixengine2022.fix44.enums.Enum706PosQtyStatus;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  706
 *  PosQtyStatus
 *  String
 *  <p></p>
 *  Status of this position.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Submitted
 *  <p>    1 - Accepted
 *  <p>    2 - Rejected
 */
public class Tag706EnuPosQtyStatus extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum706PosQtyStatus dataValue;

    public final static Enum706PosQtyStatus TESTA_ENU_POS_QTY_STATUS
            = Enum706PosQtyStatus.SUBMITTED;
    public final static Enum706PosQtyStatus TESTB_ENU_POS_QTY_STATUS
            = Enum706PosQtyStatus.REJECTED;

    public Tag706EnuPosQtyStatus(Enum706PosQtyStatus dataValue) {
        setFixType(FIX44.FIX706_ENU_POS_QTY_STATUS);
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
        Tag706EnuPosQtyStatus tagData;

        tagData = new Tag706EnuPosQtyStatus(TESTA_ENU_POS_QTY_STATUS);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag706EnuPosQtyStatus(TESTB_ENU_POS_QTY_STATUS);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum706PosQtyStatus oneEnum : Enum706PosQtyStatus.values()) {
            System.out.println( new Tag706EnuPosQtyStatus(oneEnum).toVerboseString() );
        }
    }
}
