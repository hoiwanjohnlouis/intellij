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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum77PositionEffect;

public class Tag77PositionEffect extends TagTypeAbstract {
    private final Enum77PositionEffect dataValue;

    public final static Enum77PositionEffect TESTA_POSITION_EFFECT = Enum77PositionEffect.OPEN;
    public final static Enum77PositionEffect TESTB_POSITION_EFFECT = Enum77PositionEffect.FIFO;

    public Tag77PositionEffect(Enum77PositionEffect dataValue) {
        setFixType(FIXType.FIX77_OPEN_CLOSE);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag77PositionEffect tagData = new Tag77PositionEffect(TESTA_POSITION_EFFECT);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}