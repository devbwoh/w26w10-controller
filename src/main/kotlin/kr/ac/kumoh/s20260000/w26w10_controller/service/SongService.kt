package kr.ac.kumoh.s20260000.w26w10_controller.service

import kr.ac.kumoh.s20260000.w26w10_controller.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService(
    private val repository: SongRepository
) {
    fun findAllSongs() = repository.findAll()
}