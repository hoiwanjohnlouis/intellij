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

package com.hwtsllc.fix.tags.fix27;

import com.hwtsllc.fix.datatypes.FIX27;
import com.hwtsllc.fix.datatypes.FIX27Abstract;
import com.hwtsllc.fix.enums.fix27.Enum97PossResend;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  97
 *  PossResend
 *  Boolean
 *  <p>
 *  Indicates that message may contain information that has been sent under another sequence number.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Original Transmission
 *  <p>    Y - Possible Resend
 */
public class Tag97EnuPossResend extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum97PossResend dataValue;

    public final static Enum97PossResend TESTA_ENU_POSS_RESEND
            = Enum97PossResend.NO;
    public final static Enum97PossResend TESTB_ENU_POSS_RESEND
            = Enum97PossResend.YES;

    public Tag97EnuPossResend(Enum97PossResend dataValue) {
        setFixType(FIX27.FIX97_ENU_POSS_RESEND);
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
        System.out.println( new Tag97EnuPossResend(TESTA_ENU_POSS_RESEND).toVerboseString() );
        System.out.println( new Tag97EnuPossResend(TESTB_ENU_POSS_RESEND).toVerboseString() );

        // loop around the ENUM and display
        for (Enum97PossResend oneEnum : Enum97PossResend.values()) {
            System.out.println( new Tag97EnuPossResend(oneEnum).toVerboseString() );
        }
    }
}