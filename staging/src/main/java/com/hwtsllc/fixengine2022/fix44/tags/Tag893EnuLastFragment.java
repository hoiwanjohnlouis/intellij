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
import com.hwtsllc.fixengine2022.fix44.enums.Enum893LastFragment;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  893
 *  LastFragment
 *  Boolean
 *  <p></p>
 *  Indicates whether this message is the last in a sequence of messages
 *  for those messages that support fragmentation, such as Allocation Instruction,
 *  Mass Quote, Security List, Derivative Security List
 *  <p></p>
 *  Valid values:
 *  <p>    N - Not Last Fragment
 *  <p>    Y - Last Fragment
 */
public class Tag893EnuLastFragment extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum893LastFragment dataValue;

    public final static Enum893LastFragment TESTA_ENU_LAST_FRAGMENT
            = Enum893LastFragment.NO ;
    public final static Enum893LastFragment TESTB_ENU_LAST_FRAGMENT
            = Enum893LastFragment.YES;

    public Tag893EnuLastFragment( Enum893LastFragment dataValue) {
        setFixType(FIX44.FIX893_ENU_LAST_FRAGMENT );
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
        Tag893EnuLastFragment tagData;

        tagData = new Tag893EnuLastFragment( TESTA_ENU_LAST_FRAGMENT );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag893EnuLastFragment( TESTB_ENU_LAST_FRAGMENT );
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        // loop around the ENUM and process
        for ( Enum893LastFragment oneEnum : Enum893LastFragment.values()) {
            System.out.println( new Tag893EnuLastFragment(oneEnum).toVerboseString() );
        }
    }
}
