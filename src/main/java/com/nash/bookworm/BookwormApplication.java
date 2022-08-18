package com.nash.bookworm;

import com.nash.bookworm.dto.BookDto;
import com.nash.bookworm.dto.DiscountDto;
import com.nash.bookworm.dto.ReviewDto;
import com.nash.bookworm.entities.Author;
import com.nash.bookworm.entities.Book;
import com.nash.bookworm.entities.Category;
import com.nash.bookworm.entities.Discount;
import com.nash.bookworm.repo.ReviewRepo;
import com.nash.bookworm.services.*;
import com.nash.bookworm.services.impl.CategoryServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class BookwormApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookwormApplication.class, args);
    }

    @Bean
    CommandLineRunner run(BookService bookService, CategoryService categoryService, AuthorService authorService, ReviewService reviewService, DiscountService discountService) {
        return args -> {
//            reviewRepo.deleteAll();

//            Category
//            categoryService.saveCategory(new Category(null, "Mystery", "Mystery novels, also called detective fiction, follow a detective solving a case from start to finish"));
//            categoryService.saveCategory(new Category(null, "Thriller", "Thriller novels are dark, mysterious, and suspenseful plot-driven stories."));
//            categoryService.saveCategory(new Category(null, "Horror", "Horror novels are meant to scare, startle, shock, and even repulse readers."));
//            categoryService.saveCategory(new Category(null, "Historical", "Historical fiction novels take place in the past."));
//            categoryService.saveCategory(new Category(null, "Romance", "Romantic fiction centers around love stories between two people."));
//            categoryService.saveCategory(new Category(null, "Science Fiction", "Sci-fi novels are speculative stories with imagined elements that don’t exist in the real world."));
//            categoryService.saveCategory(new Category(null, "Fantasy", "Fantasy novels are speculative fiction stories with imaginary characters set in imaginary universes."));
//            categoryService.saveCategory(new Category(null, "Magical", "Magical realism novels depict the world truthfully, plus add magical elements."));

//            Author
//            authorService.saveAuthor(new Author(null, "Isaac Asimov", "Asimov was born sometime between October 4, 1919 and January 2, 1920 in Petrovichi in Smolensk Oblast, RSFSR (now Russia), the son of a Jewish family of millers. Although his exact date of birth is uncertain, Asimov himself celebrated it on January 2...."));
//            authorService.saveAuthor(new Author(null, "Robert Silverberg", "15 January 1935 -"));
//            authorService.saveAuthor(new Author(null, "Martin H. Greenberg", "Martin Harry Greenberg (March 1, 1941 – June 25, 2011) was an American academic and anthologist in many genres, including mysteries and horror, but especially in speculative fiction. In all, he compiled 1,298 anthologies and commissioned over 8,200 original short stories..."));
//            authorService.saveAuthor(new Author(null, "Arthur C. Clarke", "Sir Arthur Charles Clarke CBE FRAS was a British science fiction writer, science writer and futurist, inventor, undersea explorer, and television series host."));
//            authorService.saveAuthor(new Author(null, "Andre Norton", "Andre Norton was born Alice Mary Norton in Cleveland, Ohio, the daughter of rug company owner and his wife. She began writing while she was in high school, and she was the editor of a literary page in the school's paper..."));
//            authorService.saveAuthor(new Author(null, "Carolyn Keene", "Carolyn Keene is the pseudonym of the authors of both the Nancy Drew Mystery Stories (and a spin-off called River Heights) and The Dana Girls Mystery Stories, both produced by the Stratemeyer Syndicate."));
//            authorService.saveAuthor(new Author(null, "Franklin W. Dixon", "A pseudonym for a series of ghostwriters hired by the Stratemeyer Syndicate to write The Hardy Boys and Ted Scott Flying Stories, along with some Nancy Drew crossover stories. Leslie McFarlane is the most well known of these writers having written the first Hardy Boys book along with twenty others."));
//            authorService.saveAuthor(new Author(null, "Edgar Allan Poe", "Edgar Allan Poe was an American writer, poet, editor and literary critic, considered part of the American Romantic Movement. Best known for his tales of mystery and the macabre, Poe was one of the earliest American practitioners of the short story and is considered the inventor of the detective-fiction genre."));
//            authorService.saveAuthor(new Author(null, "Bram Stoker", "Abraham Stoker was an Irish author who is celebrated for his 1897 Gothic horror novel Dracula."));
//            authorService.saveAuthor(new Author(null, "Jules Verne", "Jules Verne was a French author who helped pioneer the science-fiction genre."));
//            authorService.saveAuthor(new Author(null, "Jane Austen", "Jane Austen was an English writer. Although Austen was widely read in her lifetime, she published her works anonymously."));
//            authorService.saveAuthor(new Author(null, "William Shakespeare", "William Shakespeare was an English poet and playwright, widely regarded as the greatest writer in the English language and the world's pre-eminent dramatist."));
//            authorService.saveAuthor(new Author(null, "Rowling", "Joanne Jo Murray, OBE (née Rowling), better known under the pen name J. K. Rowling, is a British author best known as the creator of the Harry Potter fantasy series, the idea for which was conceived whilst on a train trip from Manchester to London in 1990."));
//            authorService.saveAuthor(new Author(null, "Diana Gabaldon", "Diana J. Gabaldon is an American author, known for the Outlander series of novels. Her books merge multiple genres, featuring elements of historical fiction, romance, mystery, adventure and science fiction/fantasy."));
//            authorService.saveAuthor(new Author(null, "Colleen Hoover", "Colleen Hoover is an author of young adult fiction and romance novels. Many of her works have been self-published before being picked up by a publishing house."));
//            authorService.saveAuthor(new Author(null, "Patrick Rothfuss", "bio"));
//            authorService.saveAuthor(new Author(null, "Scott Lynch", "Scott Lynch is an American fantasy author who wrote the Gentleman Bastard Sequence series of novels."));
//            authorService.saveAuthor(new Author(null, "name", "bio"));

//            Book
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Science Fiction"), authorService.getAuthorByName("Isaac Asimov"), "I, Robot", "I, Robot is a fixup novel of science fiction short stories or essays by American writer Isaac Asimov. The stories originally appeared in the American magazines Super Science Stories and Astounding Science Fiction between 1940 and 1950 and were then compiled into a book for stand-alone publication by Gnome Press in 1950, in an initial edition of 5,000 copies. The stories are woven together by a framing narrative in which the fictional Dr. Susan Calvin tells each story to a reporter (who serves as the narrator) in the 21st century. Although the stories can be read separately, they share a theme of the interaction of humans, robots, and morality, and when combined they tell a larger story of Asimov's fictional history of robotics.", 8, "https://covers.openlibrary.org/b/id/12385229-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Science Fiction"), authorService.getAuthorByName("Isaac Asimov"), "Foundation", "", 8, "https://covers.openlibrary.org/b/id/6501822-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Science Fiction"), authorService.getAuthorByName("Isaac Asimov"), "Second foundation", "After years of struggle, the Foundation lay in ruins -- destroyed by the mutant mind power of the Mule. But it was rumored that there was a Second Foundation hidden somewhere at the end of the Galaxy, established to preserve the knowledge of mankind through the long centuries of barbarism. The Mule had failed to find it the first time -- but now he was certain he knew where it lay.", 34, "https://covers.openlibrary.org/b/id/9261324-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Science Fiction"), authorService.getAuthorByName("Isaac Asimov"), "The End of Eternity", "Humanity has found the ultimate way to fix its own mistakes, make them never happen. In this book, a group of men that lives outside of time, the \"Eternals\", modify time. Harlan Andrews, a low ranking technician, is loyal to the idea that unites all Eternals: it is better to change time to help the many, even if it means hurting the few. That is, until he learns that the woman he has fallen in love with, Noys, will be eliminated in a soon to occur time change. So, violating the principals he had always held to as an Eternal, Harlan saves his lover. But soon, he finds that he is part of a much larger conspiracy.", 7, "https://covers.openlibrary.org/b/id/6622699-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Science Fiction"), authorService.getAuthorByName("Isaac Asimov"), "The Caves of Steel", "It was bad enough when Lije Baley, a simple plainclothes cop, was ordered to solve a totally baffling mystery - the murder of a prominent Spacer. It was worse when he found that the smug, self-satisfied Spacers were behind the pressure to provide an impossibly quick solution.", 8, "https://covers.openlibrary.org/b/id/6621014-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Science Fiction"), authorService.getAuthorByName("Robert Silverberg"), "The science fiction hall of fame", "\"The greatest science fiction stories of all time chosen by the members of the Science Fiction Writers of America.\"", 6, "https://covers.openlibrary.org/b/id/524132-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Science Fiction"), authorService.getAuthorByName("Robert Silverberg"), "Legends", "Tales from some of the most celebrated writers of modern fantasy fiction. Each story is set in the unique universe that brought its author success and acclaim.", 7, "https://covers.openlibrary.org/b/id/11667742-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Science Fiction"), authorService.getAuthorByName("Martin H. Greenberg"), "Vampires", "", 13, "https://covers.openlibrary.org/b/id/12800969-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Science Fiction"), authorService.getAuthorByName("Martin H. Greenberg"), "After the king", "", 9, "https://covers.openlibrary.org/b/id/12804495-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Science Fiction"), authorService.getAuthorByName("Arthur C. Clarke"), "A Space Odyssey", "A novel that proposes an idea about how the human race might have begun and where it might be headed...given a little help from out there. A colaboration of ideas with director Stanley Kubrick in the late 1960's it begins at \"the dawn of man\" and then leaps to the year 2001 where a mission to Saturn (Jupiter in the film) is mounted to try and answer questions raised by the discovery of an ancient artifact dug up on the moon. Though not particularly fast paced, the science is good, and there are a few hair raising events. There are also interesting speculations about the future, such as the space shuttle, and a device eerily similar to an iPad. Leaving plenty of room for contemplation and the appreciation for the inevitable trials of space travel, this is one of the truly landmark pieces of hard science fiction.", 13, "https://covers.openlibrary.org/b/id/8757210-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Science Fiction"), authorService.getAuthorByName("Andre Norton"), "Ride Proud, Rebel!", "", 9, "https://covers.openlibrary.org/b/id/12002768-M.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Mystery"), authorService.getAuthorByName("Edgar Allan Poe"), "The gold bug", "The discovery of a message in code on a shoreline formerly infested with pirates sends William Legrand and his friends on a hunt for buried treasure.", 7, "https://covers.openlibrary.org/b/id/11777143-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Mystery"), authorService.getAuthorByName("Edgar Allan Poe"), "The Works of Edgar Allan Poe in Five Volumes", "", 14, "https://covers.openlibrary.org/b/olid/OL33006635M-M.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Mystery"), authorService.getAuthorByName("Franklin W. Dixon"), "The Shore Road Mystery", "When the Hardy boys eagerly agree to assist their friend Jack Dodd and his father in locating a family treasure, the two young detectives are unaware of the baffling complications that will arise. The only clue to the long-lost treasure is a cryptic message written by a Pilgrim ancestor. But when Mr. Dodd and Jack are accused of stealing cars and then mysteriously disappear, Frank and Joe are confronted with a triple mystery. Have their friends run away to avoid the law? Or are they secretly hunting for the treasure? Or have they been kidnapped? Despite mounting evidence and the bitter suspicions of the townspeople, the Hardys are convinced that the Dodds are the victims of a sinister plot. Clues that Frank and Joe uncover, with the aid of their jolly, plump friend, Chet Morton, lead to the secret hideout of a ruthless gang of criminals. ", 5, "https://covers.openlibrary.org/b/olid/OL5930118M-M.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Mystery"), authorService.getAuthorByName("Franklin W. Dixon"), "Hunting for Hidden Gold", "Timber wolves, a Rocky Mountain blizzard, and a mine cave-in are only a few of the perils Frank and Joe Hardy encounter during their search for the principal members of a notorious gang responsible for a payroll robbery. In the old Montana mining camp of Lucky Lode, the young detectives puzzle over a series of mysterious events. A piano-playing ghost haunts the long-abandoned dance hall. Eerie blue lights flash from the hilltop cemetery in the dark of night. Strange men arrange a meeting at Shadow of the Bear. A suspect disappears through a curtain of frozen ice. How are these events related to the men who kidnapped the boys in Chicago? Who booby-trapped the helicopter which flew the young detectives to the ghost town?", 6, "https://covers.openlibrary.org/b/olid/OL7539883M-M.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Mystery"), authorService.getAuthorByName("Carolyn Keene"), "The bungalow mystery", "While trying to help a friend out of a difficulty, teenage detective Nancy Drew has a perilous experience in and around a deserted bungalow.", 6, "https://covers.openlibrary.org/b/olid/OL23267230M-M.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Mystery"), authorService.getAuthorByName("Carolyn Keene"), "The secret of shadow ranch", "This cool paperback blank journal features one of the most memorable cover images from the classic Nancy Drew Mystery Stories series.", 12, "https://covers.openlibrary.org/b/olid/OL20939113M-M.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Thriller"), authorService.getAuthorByName("Bram Stoker"), "The New Annotated Dracula", "It tells the story of Dracula's attempt to move from Transylvania to England so he may find new blood and spread undead curse, and the battle between Dracula and a small group of men and women led by Professor Abraham Van Helsing.", 20, "https://covers.openlibrary.org/b/id/12750397-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Thriller"), authorService.getAuthorByName("Jules Verne"), "20,000 leagues under the sea", "Recounts the adventures of a French marine biologist and his two companions as they travel as prisoners aboard the Nautilus, the fabulous electric submarine of the deranged Captain Nemo.", 59, "https://covers.openlibrary.org/b/id/10726202-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Historical"), authorService.getAuthorByName("Jane Austen"), "Pride and Prejudice", "\"It is a truth universally acknowledged, that a single man in possession of a good fortune must be in want of a wife.\" So begins Pride and Prejudice, Jane Austen's perfect comedy of manners--one of the most popular novels of all time--that features splendid", 5, "https://covers.openlibrary.org/b/id/12748004-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Historical"), authorService.getAuthorByName("William Shakespeare"), "Macbeth", "Presents the play with supporting material, explanation of words and phrases, actors' and directors' views, study questions, etc.", 14, "https://covers.openlibrary.org/b/id/12322611-L.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Magical"), authorService.getAuthorByName("Rowling"), "Harry Potter", "When the Chamber of Secrets is opened again at the Hogswart School for Witchcraft and Wizardry, second-year student Harry Potter finds himself in danger from a dark power that has once more been released on the school.", 17, "https://covers.openlibrary.org/b/id/8234423-M.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Romance"), authorService.getAuthorByName("Diana Gabaldon"), "Outlander", "Outlander is a historical fantasy novel by Diana Gabaldon first published in 1991. Initially set around the time of the Second World War, it focuses on nurse Claire Beauchamp, who travels through time to 18th-century Scotland, where she finds adventure and romance with the dashing Jamie Fraser.", 15, "https://upload.wikimedia.org/wikipedia/en/0/0b/Outlander-1991_1st_Edition_cover.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Romance"), authorService.getAuthorByName("Colleen Hoover"), "Ugly Love", " From Colleen Hoover, the #1 Sunday Times bestselling author of It Ends with Us, a heart-wrenching love story that proves attraction at first sight can be messy.", 24, "https://images-na.ssl-images-amazon.com/images/I/41g9RfNVZBL._SY291_BO1,204,203,200_QL40_FMwebp_.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Fantasy"), authorService.getAuthorByName("Patrick Rothfuss"), "The Name of the Wind", "The Name of the Wind, also referred to as The Kingkiller Chronicle: Day One, is a heroic fantasy novel written by American author Patrick Rothfuss. It is the first book in the ongoing fantasy trilogy The Kingkiller Chronicle, followed by The Wise Man's Fear. It was published on March 27, 2007, by DAW Books.", 27, "https://images-na.ssl-images-amazon.com/images/I/51JThzjy3gL._SY291_BO1,204,203,200_QL40_FMwebp_.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Fantasy"), authorService.getAuthorByName("Patrick Rothfuss"), "The Wise Man's Fear", "The Wise Man's Fear is a fantasy novel written by American author Patrick Rothfuss and the second volume in The Kingkiller Chronicle. It was published on March 1, 2011, by DAW Books. It is the sequel to 2007's The Name of the Wind.", 23, "https://images-na.ssl-images-amazon.com/images/I/51-ckcKhlAL._SY291_BO1,204,203,200_QL40_FMwebp_.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Fantasy"), authorService.getAuthorByName("Patrick Rothfuss"), "The Slow Regard of Silent Things", "The Slow Regard of Silent Things is a fantasy novella and one of the companion tales in The Kingkiller Chronicle series written by American author Patrick Rothfuss. It includes illustrations by Nate Taylor and was first published by DAW Books in the United States on October 28, 2014.", 24, "https://images-na.ssl-images-amazon.com/images/I/51P3p+cz-uL._SY344_BO1,204,203,200_.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Fantasy"), authorService.getAuthorByName("Patrick Rothfuss"), "The Winds of Winter", "The Winds of Winter is the planned sixth novel in the epic fantasy series A Song of Ice and Fire by American writer George R. R. Martin. Martin believes the last two volumes of the series will total over 3,000 manuscript pages.", 18, ""));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Fantasy"), authorService.getAuthorByName("Scott Lynch"), "The Lies of Locke Lamora", "The Lies of Locke Lamora is a 2006 fantasy novel by American writer Scott Lynch, the first book of the Gentleman Bastard series. Elite con artists calling themselves the \"Gentleman Bastards\" rob the rich of the city of Camorr, based on late medieval Venice but on an unnamed world.", 17, "https://images-na.ssl-images-amazon.com/images/I/51BNSb3ASOL._SY291_BO1,204,203,200_QL40_FMwebp_.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Horror"), authorService.getAuthorByName("Bram Stoker"), "Dracula", "Dracula is a novel by Bram Stoker, published in 1897. As an epistolary novel, the narrative is related through letters, diary entries, and newspaper articles. It has no single protagonist, but opens with solicitor Jonathan Harker taking a business trip to stay at the castle of a Transylvanian noble, Count Dracula.", 22, "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1387151694l/17245.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Horror"), authorService.getAuthorByName("Bram Stoker"), "Dracula's Guest", "Dracula's Guest is a short story by Bram Stoker, first published in the short story collection Dracula's Guest and Other Weird Stories. It was written as the first chapter for Stoker's 1897 novel Dracula, but was deleted prior to publication as the original publishers felt it was superfluous to the story.", 23, "https://images-na.ssl-images-amazon.com/images/I/51sfc9l-E1L._SX218_BO1,204,203,200_QL40_FMwebp_.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("Horror"), authorService.getAuthorByName("Bram Stoker"), "Powers of Darkness", "Powers of Darkness is an incredible literary discovery: In 1900, Icelandic publisher and writer Valdimar Asmundsson set out to translate Bram Stoker’s world-famous 1897 novel Dracula. Called Makt Myrkranna (literally, \"Powers of Darkness\"), this Icelandic edition included an original preface written by Stoker himself. ", 43, "https://m.media-amazon.com/images/I/51lH1HV8RiL.jpg"));
//            bookService.saveBook(new BookDto(null, categoryService.getCategoryByName("category"), authorService.getAuthorByName("name"), "", "", 3, ""));

//            Review
//            reviewService.saveReview(new ReviewDto(null, 1L, "Amazing Story! You will love it", "Such an incredible complex story! I have to buy it because there was a waiting list of 30+ at the local library for this book. Thrilled that I made the purchase", new Date(122, 2, 12), 5));
//            reviewService.saveReview(new ReviewDto(null, 1L, "Awesome Book!", "Never regret buying this book!", new Date(122, 7, 12), 5));
//            reviewService.saveReview(new ReviewDto(null, 1L, "Recommend for you!", "You should not miss an awesome book like this", new Date(122, 4, 12), 5));
//            reviewService.saveReview(new ReviewDto(null, 1L, "Perfect!", "Best story I have read!", new Date(122, 5, 12), 4));
//            reviewService.saveReview(new ReviewDto(null, 1L, "Normal", "Normal", new Date(122, 4, 12), 3));
//            reviewService.saveReview(new ReviewDto(null, 1L, "Recommend!", "Not very interesting, but it is ok.", new Date(122, 6, 12), 4));
//            reviewService.saveReview(new ReviewDto(null, 2L, "Recommend!", "Not very interesting, but it is ok.", new Date(122, 6, 12), 4));
//            reviewService.saveReview(new ReviewDto(null, 3L, "Nice book", "Ok!", new Date(122, 6, 23), 4));
//            reviewService.saveReview(new ReviewDto(null, 3L, "Recommend!", "Not very interesting, but it is ok.", new Date(122, 6, 12), 4));
//            reviewService.saveReview(new ReviewDto(null, 3L, "Amazing!", "Love this book very much", new Date(122, 6, 12), 5));
//            reviewService.saveReview(new ReviewDto(null, 4L, "Amazing!", "Love this book very much", new Date(122, 6, 12), 5));
//            reviewService.saveReview(new ReviewDto(null, 4L, "Nice book", "Ok!", new Date(122, 7, 23), 4));
//            reviewService.saveReview(new ReviewDto(null, 5L, "Amazing!", "Best book I have read last year.", new Date(122, 6, 12), 5));
//            reviewService.saveReview(new ReviewDto(null, 5L, "OK!", "Ok!", new Date(122, 7, 11), 4));
//            reviewService.saveReview(new ReviewDto(null, 6L, "Boring", "Very boring, I do not like it", new Date(122, 6, 12), 2));
//            reviewService.saveReview(new ReviewDto(null, 7L, "Amazing!", "Best book I have read last year.", new Date(122, 6, 12), 5));
//            reviewService.saveReview(new ReviewDto(null, 7L, "Perfect!", "Best story I have read!", new Date(122, 7, 12), 5));
//            reviewService.saveReview(new ReviewDto(null, 7L, "Normal", "Not very interesting", new Date(122, 6, 12), 3));
//            reviewService.saveReview(new ReviewDto(null, 7L, "Bad story", "I don't like this", new Date(122, 6, 12), 1));
//            reviewService.saveReview(new ReviewDto(null, 8L, "Amazing!", "Best book I have read last year.", new Date(122, 6, 12), 5));
//            reviewService.saveReview(new ReviewDto(null, 8L, "Awesome Book!", "Best story I have read!", new Date(122, 8, 12), 5));
//            reviewService.saveReview(new ReviewDto(null, 8L, "Recommend for you!", "I have never read amazing story like this", new Date(122, 8, 12), 5));
//            reviewService.saveReview(new ReviewDto(null, 9L, "Amazing Story! You will love it", "Such an incredible complex story! I have to buy it because there was a waiting list of 30+ at the local library for this book. Thrilled that I made the purchase", new Date(122, 2, 12), 5));
//            reviewService.saveReview(new ReviewDto(null, 10L, "Amazing Story! You will love it", "Such an incredible complex story! I have to buy it because there was a waiting list of 30+ at the local library for this book. Thrilled that I made the purchase", new Date(122, 2, 12), 4));
//            reviewService.saveReview(new ReviewDto(null, 11L, "Amazing Story! You will love it", "Such an incredible complex story! I have to buy it because there was a waiting list of 30+ at the local library for this book. Thrilled that I made the purchase", new Date(122, 2, 12), 4));
//            reviewService.saveReview(new ReviewDto(null, 12L, "Amazing Story! You will love it", "Such an incredible complex story! I have to buy it because there was a waiting list of 30+ at the local library for this book. Thrilled that I made the purchase", new Date(122, 2, 12), 4));
//            reviewService.saveReview(new ReviewDto(null, 13L, "Amazing Story! You will love it", "Such an incredible complex story! I have to buy it because there was a waiting list of 30+ at the local library for this book. Thrilled that I made the purchase", new Date(122, 2, 12), 4));
//            reviewService.saveReview(new ReviewDto(null, 14L, "Amazing Story! You will love it", "Such an incredible complex story! I have to buy it because there was a waiting list of 30+ at the local library for this book. Thrilled that I made the purchase", new Date(122, 2, 12), 4));
//            reviewService.saveReview(new ReviewDto(null, 15L, "Amazing Story! You will love it", "Such an incredible complex story! I have to buy it because there was a waiting list of 30+ at the local library for this book. Thrilled that I made the purchase", new Date(122, 2, 12), 4));
//            reviewService.saveReview(new ReviewDto(null, 15L, "Awesome Book!", "Best story I have read!", new Date(122, 8, 12), 5));
//            reviewService.saveReview(new ReviewDto(null, 16L, "Normal", "Not very interesting", new Date(122, 6, 12), 3));
//            reviewService.saveReview(new ReviewDto(null, 17L, "Normal", "Not very interesting", new Date(122, 6, 12), 4));
//            reviewService.saveReview(new ReviewDto(null, 18L, "Normal", "Not very interesting", new Date(122, 6, 12), 4));
//
//            Discount
//            discountService.saveDiscount(new DiscountDto(null, 1L, new Date(122, 4, 12), new Date(125, 1, 12), 6));
//            discountService.saveDiscount(new DiscountDto(null, 3L, new Date(122, 4, 12), new Date(125, 1, 12), 30));
//            discountService.saveDiscount(new DiscountDto(null, 8L, new Date(122, 4, 12), new Date(125, 1, 12), 10));
//            discountService.saveDiscount(new DiscountDto(null, 10L, new Date(122, 4, 13), new Date(125, 1, 12), 11));
        };
    }
}
