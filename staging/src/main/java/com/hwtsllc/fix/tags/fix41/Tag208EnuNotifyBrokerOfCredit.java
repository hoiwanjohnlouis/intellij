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

package com.hwtsllc.fix.tags.fix41;

import com.hwtsllc.fix.datatypes.FIX41;
import com.hwtsllc.fix.datatypes.FIX41Abstract;
import com.hwtsllc.fix.enums.fix41.Enum208NotifyBrokerOfCredit;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  208
 *  NotifyBrokerOfCredit
 *  Boolean
 *  <p></p>
 *  Indicates if details should be communicated to BrokerOfCredit (i.e. step-in broker).
 *  <p></p>
 *  Valid values:
 *  <p>    N - Details should not be communicated
 *  <p>    Y - Details should be communicated
 */
public class Tag208EnuNotifyBrokerOfCredit extends FIX41Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum208NotifyBrokerOfCredit dataValue;

    public final static Enum208NotifyBrokerOfCredit TESTA_ENU_NOTIFY_BROKER_OF_CREDIT
            = Enum208NotifyBrokerOfCredit.NO;
    public final static Enum208NotifyBrokerOfCredit TESTB_ENU_NOTIFY_BROKER_OF_CREDIT
            = Enum208NotifyBrokerOfCredit.YES;

    public Tag208EnuNotifyBrokerOfCredit(Enum208NotifyBrokerOfCredit dataValue) {
        setFixType(FIX41.FIX208_ENU_NOTIFY_BROKER_OF_CREDIT);
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
        System.out.println( new Tag208EnuNotifyBrokerOfCredit(TESTA_ENU_NOTIFY_BROKER_OF_CREDIT).toVerboseString() );
        System.out.println( new Tag208EnuNotifyBrokerOfCredit(TESTB_ENU_NOTIFY_BROKER_OF_CREDIT).toVerboseString() );

        // loop around the ENUM and display
        for (Enum208NotifyBrokerOfCredit oneEnum : Enum208NotifyBrokerOfCredit.values()) {
            System.out.println( new Tag208EnuNotifyBrokerOfCredit(oneEnum).toVerboseString() );
        }
    }
}
