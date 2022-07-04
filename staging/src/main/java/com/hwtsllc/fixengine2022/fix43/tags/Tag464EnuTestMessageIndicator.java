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
import com.hwtsllc.fixengine2022.fix43.enums.Enum464TestMessageIndicator;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  464
 *  TestMessageIndicator
 *  Boolean
 *  <p>
 *  Indicates whether or not this FIX Session is a "test" vs. "production" connection.
 *  <p>
 *  Useful for preventing "accidents".
 *  <p>
 *  Valid values:
 *  <p>    N - False (Production)
 *  <p>    Y - True (Test)
 */
public class Tag464EnuTestMessageIndicator extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum464TestMessageIndicator dataValue;

    public final static Enum464TestMessageIndicator TESTA_ENU_TEST_MESSAGE_INDICATOR
            = Enum464TestMessageIndicator.NO ;
    public final static Enum464TestMessageIndicator TESTB_ENU_TEST_MESSAGE_INDICATOR
            = Enum464TestMessageIndicator.YES;

    public Tag464EnuTestMessageIndicator( Enum464TestMessageIndicator dataValue) {
        setFixType(FIX43.FIX464_ENU_TEST_MESSAGE_INDICATOR );
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
        Tag464EnuTestMessageIndicator tagData;

        tagData = new Tag464EnuTestMessageIndicator( TESTA_ENU_TEST_MESSAGE_INDICATOR );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag464EnuTestMessageIndicator( TESTB_ENU_TEST_MESSAGE_INDICATOR );
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum464TestMessageIndicator oneEnum : Enum464TestMessageIndicator.values()) {
            System.out.println( new Tag464EnuTestMessageIndicator(oneEnum).toVerboseString() );
        }
    }
}
