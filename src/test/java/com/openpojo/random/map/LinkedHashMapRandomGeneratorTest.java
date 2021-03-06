/*
 * Copyright (c) 2010-2017 Osman Shoukry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.openpojo.random.map;

import java.util.LinkedHashMap;
import java.util.Map;

import com.openpojo.random.ParameterizableRandomGenerator;
import com.openpojo.random.map.support.SimpleType1;
import com.openpojo.random.map.support.SimpleType2;
import com.openpojo.random.map.util.BaseMapRandomGeneratorTest;

/**
 * @author oshoukry
 */
public class LinkedHashMapRandomGeneratorTest extends BaseMapRandomGeneratorTest {

  protected LinkedHashMapRandomGenerator getInstance() {
    return LinkedHashMapRandomGenerator.getInstance();
  }


  protected Class<? extends ParameterizableRandomGenerator> getGeneratorClass() {
    return LinkedHashMapRandomGenerator.class;
  }

  protected Class<? extends Map> getExpectedTypeClass() {
    return LinkedHashMap.class;
  }

  protected Class<? extends Map> getGeneratedTypeClass() {
    return LinkedHashMap.class;
  }

  @Override
  protected Class<?> getGenericType1() {
    return SimpleType1.class;
  }

  @Override
  protected Class<?> getGenericType2() {
    return SimpleType2.class;
  }

}
