/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.gtav, R.string.headphone_1, 20, R.string.dog_description_1),
    Dog(R.drawable.apex, R.string.headphone_2, 16, R.string.dog_description_2),
    Dog(R.drawable.cod, R.string.dog_name_3, 22, R.string.dog_description_3),
    Dog(R.drawable.forza, R.string.dog_name_4, 18, R.string.dog_description_4),
    Dog(R.drawable.mafia, R.string.dog_name_5, 28, R.string.dog_description_5),
    Dog(R.drawable.metro, R.string.dog_name_6, 14, R.string.dog_description_6),
    Dog(R.drawable.stray, R.string.dog_name_7, 23, R.string.dog_description_7),
    Dog(R.drawable.valorant, R.string.dog_name_8, 17, R.string.dog_description_8),
    Dog(R.drawable.battlefield, R.string.dog_name_9, 14, R.string.dog_description_9)
)