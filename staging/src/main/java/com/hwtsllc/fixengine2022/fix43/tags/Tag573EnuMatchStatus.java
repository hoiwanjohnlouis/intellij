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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.fix43.enums.Enum573MatchStatus;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  573
 *  MatchStatus
 *  char
 *  <p></p>
 *  The status of this trade with respect to matching or comparison.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Compared, matched or affirmed
 *  <p>    1 - Uncompared, unmatched, or unaffired
 *  <p>    2 - Advisory or alert
 */
public class Tag573EnuMatchStatus extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum573MatchStatus dataValue;

    public final static Enum573MatchStatus TESTA_ENU_MATCH_STATUS
            = Enum573MatchStatus.COMPARED_MATCHED_AFFIRMED;
    public final static Enum573MatchStatus TESTB_ENU_MATCH_STATUS
            = Enum573MatchStatus.ADVISORY;

    public Tag573EnuMatchStatus(Enum573MatchStatus dataValue) {
        setFixType(FIX43.FIX573_ENU_MATCH_STATUS);
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
        Tag573EnuMatchStatus tagData;

        tagData = new Tag573EnuMatchStatus(TESTA_ENU_MATCH_STATUS);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag573EnuMatchStatus(TESTB_ENU_MATCH_STATUS);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum573MatchStatus oneEnum : Enum573MatchStatus.values()) {
            System.out.println( new Tag573EnuMatchStatus(oneEnum).toVerboseString() );
        }
    }
}
