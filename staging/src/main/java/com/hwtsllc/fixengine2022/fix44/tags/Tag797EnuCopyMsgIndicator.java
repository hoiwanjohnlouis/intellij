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
import com.hwtsllc.fixengine2022.fix44.enums.Enum797CopyMsgIndicator;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  797
 *  CopyMsgIndicator
 *  Boolean
 *  <p></p>
 *  Indicates whether this message is a drop copy of another message.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Regular Message
 *  <p>    Y - Drop Copy Message
 */
public class Tag797EnuCopyMsgIndicator extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum797CopyMsgIndicator dataValue;

    public final static Enum797CopyMsgIndicator TESTA_ENU_COPY_MSG_INDICATOR
            = Enum797CopyMsgIndicator.NO ;
    public final static Enum797CopyMsgIndicator TESTB_ENU_COPY_MSG_INDICATOR
            = Enum797CopyMsgIndicator.YES;

    public Tag797EnuCopyMsgIndicator( Enum797CopyMsgIndicator dataValue) {
        setFixType(FIX44.FIX797_ENU_COPY_MSG_INDICATOR );
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return this.dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toEnumDescriptionString();
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
        Tag797EnuCopyMsgIndicator tagData;

        tagData = new Tag797EnuCopyMsgIndicator( TESTA_ENU_COPY_MSG_INDICATOR );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag797EnuCopyMsgIndicator( TESTB_ENU_COPY_MSG_INDICATOR );
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum797CopyMsgIndicator oneEnum : Enum797CopyMsgIndicator.values()) {
            System.out.println( new Tag797EnuCopyMsgIndicator(oneEnum).toVerboseString() );
        }
    }
}
