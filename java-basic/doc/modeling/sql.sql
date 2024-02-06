create table moamoa.categories
(
    id   int auto_increment
        primary key,
    name varchar(20) not null
);

create table moamoa.files
(
    id         bigint auto_increment
        primary key,
    user_id    bigint                                not null,
    type       varchar(50)                           not null,
    name       varchar(255)                          not null,
    created_at timestamp default current_timestamp() not null
);

create table moamoa.users
(
    id               bigint auto_increment
        primary key,
    token            varchar(254) null,
    name             varchar(32)  not null,
    email            varchar(50)  not null,
    phone            varchar(32)  null,
    nick             varchar(32)  null,
    prof_img         varchar(32)  null,
    address          varchar(254) null,
    detailed_address varchar(254) null,
    created_at       datetime(6)  null,
    updated_at       datetime(6)  null,
    activate         bit          null,
    deleted_at       datetime(6)  null,
    password         varchar(128) null,
    kakao            varchar(254) null,
    naver            varchar(254) null
);

create table moamoa.auth
(
    created_at    datetime(6)  null,
    id            bigint auto_increment
        primary key,
    updated_at    datetime(6)  null,
    user_id       bigint       null,
    access_token  varchar(255) not null,
    refresh_token varchar(255) not null,
    token_type    varchar(255) not null,
    constraint UK_ox9lr2lxr8h7undhmflx4xqky
        unique (user_id),
    constraint FKpv45mvdt7km1gvrtn5f9rsvd7
        foreign key (user_id) references moamoa.users (id)
);

create table moamoa.block_users
(
    created_at datetime(6) null,
    id         bigint auto_increment
        primary key,
    target_id  bigint      null,
    updated_at datetime(6) null,
    user_id    bigint      null,
    constraint FKhnvt2usc128s7363g4642oq2a
        foreign key (user_id) references moamoa.users (id),
    constraint FKppusvqt5eavhvrkxeqowyk28b
        foreign key (target_id) references moamoa.users (id)
);

create table moamoa.my_categories
(
    id      bigint auto_increment
        primary key,
    user_id bigint not null,
    cate_id int    null,
    constraint FK_users_TO_my_categories_1
        foreign key (user_id) references moamoa.users (id)
);

create table moamoa.products
(
    activate     bit                                        null,
    category_id  tinyint                                    not null
        check (`category_id` between 0 and 11),
    max_count    int                                        not null,
    sell_count   int                                        null,
    sell_price   int                                        not null,
    view_count   int                                        null,
    created_at   datetime(6)                                null,
    deleted_at   datetime(6)                                null,
    finished_at  datetime(6)                                not null,
    id           bigint auto_increment
        primary key,
    seller_id    bigint                                     null,
    updated_at   datetime(6)                                null,
    choice_send  varchar(32)                                not null,
    title        varchar(100)                               not null,
    description  varchar(254)                               not null,
    detail_area  varchar(254)                               not null,
    selling_area varchar(254)                               not null,
    status       enum ('COMPLETED', 'IN_PROGRESS', 'READY') null,
    constraint FKbgw3lyxhsml3kfqnfr45o0vbj
        foreign key (seller_id) references moamoa.users (id)
);

create table moamoa.announces
(
    is_lock    bit          not null,
    created_at datetime(6)  null,
    id         bigint auto_increment
        primary key,
    product_id bigint       not null,
    updated_at datetime(6)  null,
    contents   varchar(255) not null,
    constraint FK2bark6a16fd9wn0b7d2jjkukh
        foreign key (product_id) references moamoa.products (id)
);

create table moamoa.chat_rooms
(
    created_at datetime(6) null,
    id         bigint auto_increment
        primary key,
    product_id bigint      null,
    seller_id  bigint      null,
    updated_at datetime(6) null,
    user_id    bigint      null,
    constraint FKc3j4hkkph4fy04l2t23kcl8os
        foreign key (seller_id) references moamoa.users (id),
    constraint FKo52t6lfonn86xk7t8vapqkniv
        foreign key (product_id) references moamoa.products (id),
    constraint FKsmng5d9b3wobj381j9x2otndu
        foreign key (user_id) references moamoa.users (id)
);

create table moamoa.chat_messages
(
    read_or_not  bit          not null,
    chat_room_id bigint       null,
    created_at   datetime(6)  null,
    id           bigint auto_increment
        primary key,
    sender_id    bigint       null,
    updated_at   datetime(6)  null,
    message      varchar(254) not null,
    constraint FKbcsxusjp1v4rd8879fhvq8ssb
        foreign key (chat_room_id) references moamoa.chat_rooms (id),
    constraint FKgiqeap8ays4lf684x7m0r2729
        foreign key (sender_id) references moamoa.users (id)
);

create table moamoa.notice
(
    read_or_not  bit          not null,
    created_at   datetime(6)  null,
    id           bigint auto_increment
        primary key,
    receiver_id  bigint       not null,
    reference_id bigint       not null,
    sender_id    bigint       not null,
    type         varchar(8)   not null,
    updated_at   datetime(6)  null,
    message      varchar(255) not null,
    constraint FK95ak74dd4rnasa4fqxa2yge1h
        foreign key (sender_id) references moamoa.users (id),
    constraint FKkwiu4kvujc7kdv4lui790erqc
        foreign key (receiver_id) references moamoa.users (id),
    constraint FKo1xkupykrwhqi7pt7ujarbewt
        foreign key (reference_id) references moamoa.products (id)
);

create table moamoa.parties
(
    count      int          not null,
    buyer_id   bigint       not null,
    created_at datetime(6)  null,
    id         bigint auto_increment
        primary key,
    product_id bigint       not null,
    updated_at datetime(6)  null,
    address    varchar(254) not null,
    constraint FK3iuviuknx46dr5tvdsbd9xbvk
        foreign key (buyer_id) references moamoa.users (id),
    constraint FKntadn3ai09pea0iv412ok0h40
        foreign key (product_id) references moamoa.products (id)
);

create table moamoa.product_images
(
    file_size         bigint       null,
    id                bigint auto_increment
        primary key,
    product_id        bigint       null,
    upload_time_stamp datetime(6)  null,
    content_type      varchar(255) null,
    file_name         varchar(255) null,
    constraint FKqnq71xsohugpqwf3c9gxmsuy
        foreign key (product_id) references moamoa.products (id)
);

create table moamoa.wish_lists
(
    created_at datetime(6) null,
    id         bigint auto_increment
        primary key,
    product_id bigint      not null,
    updated_at datetime(6) null,
    user_id    bigint      not null,
    constraint UK_p7qibt9x3985mgfghgjcqppbm
        unique (user_id),
    constraint FK3kbccdqnejdlic97xr5xbfjcf
        foreign key (user_id) references moamoa.users (id),
    constraint FK4qono9ul297stprxj4y1eeqkn
        foreign key (product_id) references moamoa.products (id)
);

