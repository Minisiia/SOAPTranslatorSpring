CREATE DATABASE translation_db;

USE translation_db;

CREATE TABLE translations (
                              id INT AUTO_INCREMENT PRIMARY KEY,
                              ukrainian_word VARCHAR(255) NOT NULL,
                              english_word VARCHAR(255) NOT NULL
);


INSERT INTO translations (ukrainian_word, english_word) VALUES
                                                            ('привіт', 'hello'),
                                                            ('доброго ранку', 'good morning'),
                                                            ('добрий день', 'good day'),
                                                            ('добрий вечір', 'good evening'),
                                                            ('спасибі', 'thank you'),
                                                            ('будь ласка', 'please'),
                                                            ('вибачте', 'sorry'),
                                                            ('так', 'yes'),
                                                            ('ні', 'no'),
                                                            ('як справи?', 'how are you?'),
                                                            ('до побачення', 'goodbye'),
                                                            ('чудово', 'great'),
                                                            ('розумію', 'I understand'),
                                                            ('не розумію', 'I don’t understand'),
                                                            ('як вас звати?', 'what is your name?'),
                                                            ('моє ім\'я', 'my name is'),
                                                            ('як ся маєте?', 'how do you do?'),
                                                            ('як ся маєте?', 'how do you do?'),
                                                            ('радий з вами познайомитися', 'nice to meet you'),
                                                            ('бувайте здорові', 'take care');
