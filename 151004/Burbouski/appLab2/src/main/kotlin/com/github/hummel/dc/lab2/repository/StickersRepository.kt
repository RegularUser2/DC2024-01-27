package com.github.hummel.dc.lab2.repository

import com.github.hummel.dc.lab2.bean.Sticker

interface StickersRepository {
	suspend fun create(item: Sticker): Long?

	suspend fun getById(id: Long): Sticker?

	suspend fun getAll(): List<Sticker?>

	suspend fun update(item: Sticker): Boolean

	suspend fun deleteById(id: Long): Boolean
}