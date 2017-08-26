package library.service.business.books.domain.states

import contracts.ValueTypeContract
import library.service.business.books.domain.states.BookState.Borrowed
import library.service.business.books.domain.types.Borrower
import java.time.OffsetDateTime

internal class BorrowedTest : ValueTypeContract<Borrowed>() {

    override fun instanceExampleOne(): Borrowed = Borrowed(Borrower("Someone"), OffsetDateTime.now())
    override fun instanceExampleTwo(): Borrowed = Borrowed(Borrower("Someone Else"), OffsetDateTime.now())

}