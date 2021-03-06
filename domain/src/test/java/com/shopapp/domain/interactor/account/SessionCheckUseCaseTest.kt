package com.shopapp.domain.interactor.account

import com.nhaarman.mockito_kotlin.verify
import com.shopapp.domain.repository.AuthRepository
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class SessionCheckUseCaseTest {

    private lateinit var useCase: SessionCheckUseCase

    @Mock
    private lateinit var authRepository: AuthRepository

    @Before
    fun setUpTest() {
        useCase = SessionCheckUseCase(authRepository)
    }

    @Test
    fun shouldDelegateCallToRepository() {
        useCase.buildUseCaseSingle(Unit)
        verify(authRepository).isLoggedIn()
    }

}