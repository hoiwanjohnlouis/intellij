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
import com.hwtsllc.fixengine2022.fix44.enums.Enum906CollAsgnRejectReason;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  906
 *  CollAsgnRejectReason
 *  int
 *  <p></p>
 *  Collateral Assignment Reject Reason
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unknown deal (order or trade)
 *  <p>    1 - Unknown or invalid instrument
 *  <p>    2 - Unauthorized transaction
 *  <p>    3 - Insufficient collateral
 *  <p>    4 - Invalid type of collateral
 *  <p></p>
 *  <p>    5 - Excessive substitution
 *  <p></p>
 *  <p>    99 - Other
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public class Tag906EnuCollAsgnRejectReason extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum906CollAsgnRejectReason dataValue;

    public final static Enum906CollAsgnRejectReason TESTA_ENU_COLL_ASGN_REJECT_REASON
            = Enum906CollAsgnRejectReason.INSUFFICIENT_COLLATERAL;
    public final static Enum906CollAsgnRejectReason TESTB_ENU_COLL_ASGN_REJECT_REASON
            = Enum906CollAsgnRejectReason.INVALID_INSTRUMENT;

    public Tag906EnuCollAsgnRejectReason(Enum906CollAsgnRejectReason dataValue) {
        setFixType(FIX44.FIX906_ENU_COLL_ASGN_REJECT_REASON);
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
        Tag906EnuCollAsgnRejectReason tagData;

        tagData = new Tag906EnuCollAsgnRejectReason(TESTA_ENU_COLL_ASGN_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag906EnuCollAsgnRejectReason(TESTB_ENU_COLL_ASGN_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum906CollAsgnRejectReason oneEnum : Enum906CollAsgnRejectReason.values()) {
            System.out.println( new Tag906EnuCollAsgnRejectReason(oneEnum).toVerboseString() );
        }
    }
}
