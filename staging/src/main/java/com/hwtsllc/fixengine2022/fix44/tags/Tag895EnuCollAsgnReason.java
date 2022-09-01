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
import com.hwtsllc.fixengine2022.fix44.enums.Enum895CollAsgnReason;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  895
 *  CollAsgnReason
 *  int
 *  <p></p>
 *  Reason for Collateral Assignment
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Initial
 *  <p>    1 - Scheduled
 *  <p>    2 - Time Warning
 *  <p>    3 - Margin Deficiency
 *  <p>    4 - Margin Excess
 *  <p></p>
 *  <p>    5 - Forward Collateral Demand
 *  <p>    6 - Event of default
 *  <p>    7 - Adverse tax event
 */
public class Tag895EnuCollAsgnReason extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum895CollAsgnReason dataValue;

    public final static Enum895CollAsgnReason TESTA_ENU_COLL_ASGN_REASON
            = Enum895CollAsgnReason.FORWARD_COLLATERAL_DEMAND;
    public final static Enum895CollAsgnReason TESTB_ENU_COLL_ASGN_REASON
            = Enum895CollAsgnReason.MARGIN_DEFICIENCY;

    public Tag895EnuCollAsgnReason(Enum895CollAsgnReason dataValue) {
        setFixType(FIX44.FIX895_ENU_COLL_ASGN_REASON);
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
        Tag895EnuCollAsgnReason tagData;

        tagData = new Tag895EnuCollAsgnReason(TESTA_ENU_COLL_ASGN_REASON);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag895EnuCollAsgnReason(TESTB_ENU_COLL_ASGN_REASON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum895CollAsgnReason oneEnum : Enum895CollAsgnReason.values()) {
            System.out.println( new Tag895EnuCollAsgnReason(oneEnum).toVerboseString() );
        }
    }
}
