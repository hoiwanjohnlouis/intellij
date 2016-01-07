package com.hwtechservicesllc.stocks.interfaces;

import com.hwtechservicesllc.stocks.enums.FieldType;

/**
 * Copyright 01/06/2016 HW Tech Services, LLC
 * <p>
 * Login   KimSoYeon
 * <p>
 * Package com.hwtechservicesllc.stocks.fields
 * Project intellijPrototyping
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/
public interface IDescription {
    public FieldType getDescription();
    public void setDescription(FieldType description);
}
