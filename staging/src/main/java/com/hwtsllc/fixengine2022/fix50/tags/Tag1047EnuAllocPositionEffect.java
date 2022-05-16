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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumPositionEffect;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  77 (Same for TAGS 77, 564, 1047, )
 *  PositionEffect
 *  char
 *  <p>
 *  Indicates whether the resulting position after a trade
 *  should be an opening position or closing position.
 *  <p>
 *  Used for omnibus accounting - where accounts are held
 *  on a gross basis instead of being netted together.
 *  <p></p>
 *  564
 *  LegPositionEffect
 *  char
 *  <p>
 *  PositionEffect for leg of a multileg
 *  <p>
 *  See PositionEffect (77) field for description
 *  <p></p>
 *  1047
 *  AllocPositionEffect
 *  char
 *  <p>
 *  Indicates whether the resulting position after a trade should be an opening position or closing position.
 *  <p>
 *  Used for omnibus accounting - where accounts are held on a gross basis instead of being netted together.
 *  <p></p>
 *  Valid values:
 *  <p>    C - Close
 *  <p>    F - FIFO
 *  <p>    O - Open
 *  <p>    R - Rolled
 */
public class Tag1047EnuAllocPositionEffect extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumPositionEffect dataValue;

    public final static MyEnumPositionEffect TESTA_ENU_ALLOC_POSITION_EFFECT
            = MyEnumPositionEffect.ROLLED;
    public final static MyEnumPositionEffect TESTB_ENU_ALLOC_POSITION_EFFECT
            = MyEnumPositionEffect.OPEN;

    public Tag1047EnuAllocPositionEffect(MyEnumPositionEffect dataValue) {
        setFixType(FIX50.FIX1047_ENU_ALLOC_POSITION_EFFECT);
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
        return getID()
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
                .concat("]");
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
        Tag1047EnuAllocPositionEffect tagData;

        tagData = new Tag1047EnuAllocPositionEffect(TESTA_ENU_ALLOC_POSITION_EFFECT);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.getEnumName());
        System.out.println("ID:" + tagData.getID());
        System.out.println("Name:" + tagData.getName());
        System.out.println("Description:" + tagData.getDescription());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());

        tagData = new Tag1047EnuAllocPositionEffect(TESTB_ENU_ALLOC_POSITION_EFFECT);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.getEnumName());
        System.out.println("ID:" + tagData.getID());
        System.out.println("Name:" + tagData.getName());
        System.out.println("Description:" + tagData.getDescription());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());
    }
}
