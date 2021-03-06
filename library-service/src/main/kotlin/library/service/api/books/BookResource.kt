package library.service.api.books

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY
import library.service.business.books.domain.BookRecord
import org.springframework.hateoas.ResourceSupport
import org.springframework.hateoas.core.Relation

/** Representation of a [BookRecord] as a REST resource. */
@JsonInclude(NON_EMPTY)
@Relation(value = "book", collectionRelation = "books")
data class BookResource(
        var isbn: String? = null,
        var title: String? = null,
        var borrowed: BorrowedState? = null
) : ResourceSupport() {

    data class BorrowedState(
            var by: String? = null,
            var on: String? = null
    )

}