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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.FIX41Abstract;
import com.hwtsllc.fixengine2022.fix41.enums.Bool208NotifyBrokerOfCredit;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  208
 *  NotifyBrokerOfCredit
 *  Boolean
 *  <p>
 *  Indicates whether or not details should be communicated to BrokerOfCredit (i.e. step-in broker).
 *  <p></p>
 *  Valid values:
 *  <p>    N - Details should not be communicated
 *  <p>    Y - Details should be communicated
 */
public class Tag208BoolNotifyBrokerOfCredit extends FIX41Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Bool208NotifyBrokerOfCredit dataValue;

    public final static Bool208NotifyBrokerOfCredit TESTA_BOOL_NOTIFY_BROKER_OF_CREDIT
            = Bool208NotifyBrokerOfCredit.NO;
    public final static Bool208NotifyBrokerOfCredit TESTB_BOOL_NOTIFY_BROKER_OF_CREDIT
            = Bool208NotifyBrokerOfCredit.YES;

    public Tag208BoolNotifyBrokerOfCredit(Bool208NotifyBrokerOfCredit dataValue) {
        setFixType(FIX41.FIX208_BOOL_NOTIFY_BROKER_OF_CREDIT);
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
     * standard wrapper to return a string describing the data
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
        System.out.println( new Tag208BoolNotifyBrokerOfCredit(TESTA_BOOL_NOTIFY_BROKER_OF_CREDIT).toVerboseString() );
        System.out.println( new Tag208BoolNotifyBrokerOfCredit(TESTB_BOOL_NOTIFY_BROKER_OF_CREDIT).toVerboseString() );

        // loop around the ENUM and display
        for (Bool208NotifyBrokerOfCredit oneEnum : Bool208NotifyBrokerOfCredit.values()) {
            System.out.println( new Tag208BoolNotifyBrokerOfCredit(oneEnum).toVerboseString() );
        }
    }
}
