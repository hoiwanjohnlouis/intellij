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
import com.hwtsllc.fixengine2022.fix42.enums.Enum380BusinessRejectReason;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  380
 *  BusinessRejectReason
 *  int
 *  <p>
 *  Code to identify reason for a Business Message Reject message.
 *  <p></p>
 *  Valid values:
 *  <p>     0 - Other
 *  <p>     1 - Unknown ID
 *  <p>     2 - Unknown Security
 *  <p>     3 - Unknown Message Type
 *  <p>     4 - Application not available
 *  <p></p>
 *  <p>     5 - Conditionally required field missing
 *  <p>     6 - Not Authorized
 *  <p>     7 - DeliverTo firm not available at this time
 *  <p>     18 - Invalid price increment
 */
public class Tag380EnuBusinessRejectReason extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum380BusinessRejectReason dataValue;

    public final static Enum380BusinessRejectReason TESTA_ENU_BUSINESS_REJECT_REASON
            = Enum380BusinessRejectReason.DELIVERTO_FIRM_NOT_AVAILABLE;
    public final static Enum380BusinessRejectReason TESTB_ENU_BUSINESS_REJECT_REASON
            = Enum380BusinessRejectReason.REQUIRED_FIELD_MISSING;

    public Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason dataValue) {
        setFixType(FIX42.FIX380_ENU_BUSINESS_REJECT_REASON);
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
        Tag380EnuBusinessRejectReason tagData;

        tagData = new Tag380EnuBusinessRejectReason(TESTA_ENU_BUSINESS_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag380EnuBusinessRejectReason(TESTB_ENU_BUSINESS_REJECT_REASON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum380BusinessRejectReason oneEnum : Enum380BusinessRejectReason.values()) {
            System.out.println( new Tag380EnuBusinessRejectReason(oneEnum).toVerboseString() );
        }
    }
}
