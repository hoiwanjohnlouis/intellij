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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  864
 *  NoEvents
 *  NumInGroup
 *  <p></p>
 *  Number of  repeating EventType entries.
 */
public class Tag864NumNoEvents extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyNumInGroupType dataValue;

    public final static int TESTA_NUM_NO_EVENTS
            = 864;
    public final static int TESTB_NUM_NO_EVENTS
            = 64;

    public Tag864NumNoEvents(MyNumInGroupType dataValue) {
        setFixType( FIX44.FIX864_NUM_NO_EVENTS );
        this.dataValue = dataValue;
    }

    public int getDataValue() {
        return this.dataValue.getDataValue();
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
                ;
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
        Tag864NumNoEvents tagData;

        tagData = new Tag864NumNoEvents(new MyNumInGroupType( TESTA_NUM_NO_EVENTS ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag864NumNoEvents(new MyNumInGroupType( TESTB_NUM_NO_EVENTS ) );
        System.out.println(tagData.toVerboseString());
    }
}
